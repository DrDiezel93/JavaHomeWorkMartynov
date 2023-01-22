import java.util.Scanner;

public class HomeWork1_3 {
    public static void main(String[] args) {
        String encoding = System.getProperty("console.encoding", "cp866");
        Scanner iScanner = new Scanner(System.in, encoding);
        Scanner iScanner2 = new Scanner(System.in, encoding);
        boolean temp2 = true;
        while (temp2) {
            System.out.println();
            System.out.printf("Введите 1-е число: ");
            int number1 = iScanner.nextInt();
            System.out.printf("Введите 2-е число: ");
            int number2 = iScanner.nextInt();
            boolean temp = true;
            while (temp) {
                System.out.println();
                System.out.print("Введите действие (+ - * /) или q - для выхода из программы: ");
                String act = iScanner2.nextLine();
                if (act.equals("+")) {
                    Sum(number1, number2);
                    temp = false;
                }
                else if (act.equals("-")) {
                    Sub(number1, number2);
                    temp = false;
                }
                else if (act.equals("*")) {
                    Mult(number1, number2);
                    temp = false;
                }
                else if (act.equals("/")) {
                    Div(number1, number2);
                    temp = false;
                }
                else if (act.equals("q")){
                    System.out.println("До свидания");
                    temp = false;
                    temp2 = false;
                } 
                else System.out.println("Вы ввели неккоретное значение. Повторите попытку!");
            }
        }
        iScanner2.close();
        iScanner.close();
    }
    
    public static void Sum(Integer num1, Integer num2) {
        int sum = num1 + num2;
        System.out.printf("%d + %d = %d", num1, num2, sum);
    }
    public static void Sub(Integer num1, Integer num2) {
        int sub = num1 - num2;
        System.out.printf("%d - %d = %d", num1, num2, sub);
    }
    public static void Mult(Integer num1, Integer num2) {
        int mult = num1 * num2;
        System.out.printf("%d * %d = %d", num1, num2, mult);
    }
    public static void Div(Integer num1, Integer num2) {
        double num1d = num1 + 0.0;
        double div = num1d / num2;
        System.out.printf("%d / %d = %f", num1, num2, div);
    }
}
