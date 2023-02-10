import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HomeWork6_laptop2 {
    public static void main(String[] args) {
        HomeWork6_laptop1 lap1 = new HomeWork6_laptop1("Lenovo", "1,85 kg", "white", "8 Gb", 27999);
        HomeWork6_laptop1 lap2 = new HomeWork6_laptop1("ASUS", "1,9 kg", "black", "4 Gb", 22999);
        HomeWork6_laptop1 lap3 = new HomeWork6_laptop1("HP", "1,8 kg", "grey", "2 Gb", 24999);
        HomeWork6_laptop1 lap4 = new HomeWork6_laptop1("Apple", "1,3 kg", "gold", "8 Gb", 21999);
        ArrayList<HomeWork6_laptop1> lapList = new ArrayList<>();
        lapList.add(lap1);
        lapList.add(lap2);
        lapList.add(lap3);
        lapList.add(lap4);
        List<String> arLst = Arrays.asList(lap1.name, lap2.name, lap3.name, lap4.name);
        arLst.sort(null);
        Print1();
        for (String lapAr : arLst) {
            for (HomeWork6_laptop1 lap : lapList) {
                lap.PrintABC(lapAr);
            }
        }
        String encoding = System.getProperty("console.encoding", "cp866");
        Scanner iScanner = new Scanner(System.in, encoding);
        while (true){
            System.out.print("Отфильтровать по: 1 - цене, 2 - ОЗУ, 3 - Цвет, 4 - Вес, q - выход" + ": ");
            String act = iScanner.nextLine();
            if(act.equals("1")){
                System.out.println("| --- |" + " ---- |");
                System.out.println();
                System.out.println("| Имя |" + " Цена |");
                System.out.println();
                for (HomeWork6_laptop1 lap : lapList) {
                    lap.PrintPrice();
                }
            }
            else if(act.equals("2")){
                System.out.println("| --- |" + " ---- |");
                System.out.println();
                System.out.println("| Имя |" + " ОЗУ |");
                System.out.println();
                for (HomeWork6_laptop1 lap : lapList) {
                    lap.PrintMemory();
                }
            }
            else if(act.equals("3")){
                System.out.println("| --- |" + " ---- |");
                System.out.println();
                System.out.println("| Имя |" + " Цвет |");
                System.out.println();
                for (HomeWork6_laptop1 lap : lapList) {
                    lap.PrintColor();
                }
            }
            else if(act.equals("4")){
                System.out.println("| --- |" + " ---- |");
                System.out.println();
                System.out.println("| Имя |" + " Вес |");
                System.out.println();
                for (HomeWork6_laptop1 lap : lapList) {
                    lap.PrintWeight();
                }
            }
            else if (act.equals("q")) {
                System.out.println("До свидания");
                break;
            }
            else{
                System.out.println("Вы ввели некорректное значение. Повторите попытку!");
            }
        }
        iScanner.close();
    }

    public static void Print1() {
        System.out.println("| --- | " + "--- |" + "----- |" + " --- |" +  " ---- |");
        System.out.println("| Имя |" + " Вес |" + " Цвет |" + " ОЗУ | " + "Цена |");
    }
}
