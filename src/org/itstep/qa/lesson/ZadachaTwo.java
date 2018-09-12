package org.itstep.qa.lesson;
import java.util.Scanner;
public class ZadachaTwo {
    public static void main(String[] args) {
        //пользователь вводит некую дату. Отобразить у каких месяцев данная дата встречается.
        // Реализовать с наименее возможным количеством проверок.
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите дату");
        int d = scanner.nextInt();
        switch (d){
            case 28:{
                System.out.println("февраль");
            }
            case 30:{
                System.out.println("апрель, июнь, сентябрь, ноябрь");
            }
            case 31:{
                System.out.println("январь, март, май, июль, август, октябрь, декабрь");
                break;
            }
            default:{
                System.out.println("январь, февраль, март, апрель, май, июнь, июль, август, сентябрь, октябрь, ноябрь, декабрь");
            }
        }
    }
}
