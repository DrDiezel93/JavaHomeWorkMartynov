import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HomeWork5_1 {
    public static void main(String[] args) {
        String encoding = System.getProperty("console.encoding", "cp866");
        Scanner iScanner = new Scanner(System.in, encoding);
        Scanner iScanner2 = new Scanner(System.in, encoding);
        Scanner iScanner3 = new Scanner(System.in, encoding);
        System.out.println("Добро пожаловать в телефонный справочник");
        Map<String, String> phone_book = new HashMap<>();
        while (true) {
            System.out.println("Выберите действие:\n 1 - Напечатать все контакты\n 2 - Добавить новый контакт\n 3 - Найти контакт\n q - Выйти из программы");
            System.out.println();
            String act = iScanner.nextLine();
            System.out.println();
            if (act.equals("1")){
                if (phone_book.isEmpty()){
                    System.out.println("Ваш список контактов пуст");
                }
                else PrintPhoneBook(phone_book);
            System.out.println();
            }
            else if (act.equals("2")){
                System.out.print("Введите фамилию: ");
                String names = iScanner2.next();
                System.out.print("Введите номер телефона: ");
                String number = iScanner2.next();
                phone_book.put(number, names);
                System.out.println();
            }
            else if (act.equals("3")){
                if (phone_book.isEmpty()){
                    System.out.println("Ваш список контактов пуст");
                }
                else{
                    System.out.print("Введите фамилию: ");
                    String name = iScanner3.next();
                    SearchContact(phone_book, name);
                }
                System.out.println();
            }
            else if (act.equals("q")){
                System.out.println("До свидания");
                break;
            }
            else System.out.println("Вы ввели некорректное значение");
        }
        iScanner.close();
        iScanner2.close();
        iScanner3.close();
    }

    public static void PrintPhoneBook(Map<String, String> phb) {
        for (var item : phb.entrySet()) {
            System.out.printf("Name: %s  Number: %s \n", item.getValue(), item.getKey());
        }
    }

    public static void SearchContact(Map<String, String> phb, String nam) {
        for (var item : phb.entrySet()){
            if (item.getValue().equals(nam))
                System.out.printf("Name: %s  Number: %s \n", item.getValue(), item.getKey());
        }
    }
}
