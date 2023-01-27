import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HomeWork3_2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        RandList(list);
        System.out.println("Исходный массив");
        PrintList(list);
        System.out.println();
        List<Integer> listNew = NewListArr(list);
        if (listNew.size() == 0) {
            System.out.println("В исходном массиве все числа четные");
        }
        else{
            System.out.println("Массив без четных чисел");
            PrintList(listNew);
        }
    }

    public static void RandList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int rand = random.nextInt(100);
            list.add(rand);
        }
    }

    public static void PrintList(List<Integer> list) {
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

    public static List<Integer> NewListArr(List<Integer> list) {
        List<Integer> listNew = new ArrayList<>();
        for (Integer integer : list) {
            if (integer % 2 != 0) {
                listNew.add(integer);
            }
        }
        return listNew;
    }
}
