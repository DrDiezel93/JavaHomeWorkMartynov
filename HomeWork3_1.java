import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork3_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите количество элементов в массиве: ");
            int sizeArray = iScanner.nextInt();
            System.out.println();
            int [] arr = new int [sizeArray];
            int [] rand_arr = RandomArray(arr);
            System.out.println("Исходный массив, заполненный случайными числами: ");
            PrintArr(rand_arr);
            System.out.println();
            System.out.println();
            int [] sort_arr = mergeSort(rand_arr);
            System.out.println("Отсортированный массив: ");
            PrintArr(sort_arr);
        iScanner.close();
    }
    public static int [] RandomArray(int[] arr) {
        Random random = new Random();
        int min = -20; 
        int max = 20;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(max - min) + min;
        }
        return arr;
    }
    public static void PrintArr(int[] arr) {
        for (var i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int[] mergeSort(int[] sortArr) {
        int[] buffer1 = Arrays.copyOf(sortArr, sortArr.length);
        int[] buffer2 = new int[sortArr.length];
        int[] result = mergeSortInner(buffer1, buffer2, 0, sortArr.length);
        return result;
    }

    public static int[] mergeSortInner(int[] buffer1, int[] buffer2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
}
