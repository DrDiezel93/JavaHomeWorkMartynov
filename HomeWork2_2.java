import java.util.Random;
import java.util.Scanner;

public class HomeWork2_2 {
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
            int [] sort_arr = BubbleSort(rand_arr);
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
    public static int [] BubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - 1; j++){
                if (arr [j] > arr [j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    } 
}
