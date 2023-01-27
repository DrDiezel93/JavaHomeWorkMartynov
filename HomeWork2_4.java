import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;

public class HomeWork2_4 {
    public static void main(String[] args) throws IOException {
        String encoding = System.getProperty("console.encoding", "cp866");
        Logger logger = Logger.getLogger(HomeWork2_4.class.getName());
        FileHandler fh = new FileHandler("log.log");
        logger.addHandler(fh);
        logger.setUseParentHandlers(false);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        Scanner iScanner = new Scanner(System.in, encoding);
        Scanner iScanner2 = new Scanner(System.in, encoding);
        boolean temp2 = true;
        try {
            while (temp2) {
                System.out.println();
                System.out.printf("Введите 1-е число: ");
                int number1 = iScanner.nextInt();
                logger.info("Successful user input");
                System.out.printf("Введите 2-е число: ");
                int number2 = iScanner.nextInt();
                logger.info("Successful user input");
                boolean temp = true;
                while (temp) {
                    System.out.println();
                    System.out.print("Введите действие (+ - * /) или q - для выхода из программы: ");
                    String act = iScanner2.nextLine();
                    logger.info("Successful user input");
                    switch (act) {
                        case "+":
                            Sum(number1, number2);
                            logger.info("Successful operation");
                            temp = false;
                            break;
                        case "-":
                            Sub(number1, number2);
                            logger.info("Successful operation");
                            temp = false;
                            break;
                        case "*":
                            Mult(number1, number2);
                            logger.info("Successful operation");
                            temp = false;
                            break;
                        case "/":
                            Div(number1, number2);
                            logger.info("Successful operation");
                            temp = false;
                            break;
                        case "q":
                            System.out.println("До свидания");
                            logger.info("Successful operation");
                            temp = false;
                            temp2 = false;
                            break;
                        default:
                            System.out.println("Вы ввели неккоретное значение. Повторите попытку!");
                            logger.log(Level.WARNING, "Incorrect data entry");
                    }
                }
            }
        } catch (Exception e) {
            logger.log(Level.WARNING, "Incorrect data entry");
        }
        iScanner2.close();
        iScanner.close();
        System.out.println("Программа завершена"); 
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