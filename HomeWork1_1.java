import java.util.Scanner;

/**
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */

public class HomeWork1_1 {
    public static void main(String[] args) {
        String encoding = System.getProperty("console.encoding", "cp866");
        Scanner iScanner = new Scanner(System.in, encoding);
        System.out.printf("Введите целое положительное число: ");
        int number = iScanner.nextInt();
        iScanner.close();       
        SumNumbN(number);
        System.out.println();
        MultNumbN(number);
    }
    public static void SumNumbN(Integer numb) {
        int count = 1;
        int result = 1;
        while (count < numb) {
            result = result + count + 1;
            count++;
        }
        System.out.printf("Сумма чисел от 1 до %d = %d", numb, result);
    }
    public static void MultNumbN(Integer numb) {
        long count = 1;
        long result = 1;
        while (count < numb) {
            result = result * (count + 1);
            count++;
        }
        System.out.printf("Произведение чисел от 1 до %d = %d", numb, result);
    }
}
