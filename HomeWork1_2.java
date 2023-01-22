/**
 * Вывести все простые числа от 1 до 1000 
 */
public class HomeWork1_2 {
    public static void main(String[] args) {
        int i, number, count;
        for (number = 1; number <= 1000; number++) {
            count = 0;
            for (i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0 && number != 1) {
                System.out.print(number + " ");
            }
        }
    }   
}
