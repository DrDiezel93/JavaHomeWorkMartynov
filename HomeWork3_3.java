import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HomeWork3_3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        RandList(list);
        System.out.println("Исходный список");
        PrintList(list);
        MinElementList(list);
        MaxElementList(list);
        AverageElementsList(list);
    }
    
    public static void RandList(List<Integer> list) {
        for (int i = 0; i < 9; i++) {
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

    public static void MinElementList(List<Integer> list) {
        int minElement = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (minElement > list.get(i)) {
                minElement = list.get(i);
            }
        }
        System.out.println("Минимальное значение в исходном списке: " + minElement);
    }

    public static void MaxElementList(List<Integer> list) {
        int maxElement = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (maxElement < list.get(i)) {
                maxElement = list.get(i);
            }
        }
        System.out.println("Максимальное значение в исходном списке: " + maxElement);
    }

    public static void AverageElementsList(List<Integer> list) {
        double sumAver = 0;
        for (Integer integer : list) {
            double intDoub = integer;
            sumAver = sumAver + intDoub/(list.size());
        }
        System.out.println("Среднее арифметическое элементов списка: " + sumAver);
    }
}
