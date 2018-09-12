package org.itstep.qa.lesson;
import java.util.Scanner;
public class ZadachaOne {
    public static void main(String[] args) {
        //пользователь вводит название месяца (все слово в нижнем регистре).
        //Вывести количество дней этого месяца. февраль всегда равен 28.
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        switch (str) {
            case "январь": {
                System.out.println("в январе 31 день");
                break;
            }
            case "февраль": {
                System.out.println("в феврале 28 день");
                break;
            }
            case "март": {
                System.out.println("в марте 31 день");
                break;
            }
            case "апрель": {
                System.out.println("в апреле 30 дней");
                break;
            }
            case "май": {
                System.out.println("в мае 31 день");
                break;
            }
            case "июнь": {
                System.out.println("в июне 30 дней");
                break;
            }
            case "июль": {
                System.out.println("в июле 31 день");
                break;
            }
            case "август": {
                System.out.println("в августе 31 день");
                break;
            }
            case "сентябрь": {
                System.out.println("в сентябре 30 дней");
                break;
            }
            case "октябрь": {
                System.out.println("в октябре 31 день");
                break;
            }
            case "ноябрь": {
                System.out.println("в ноябре 30 дней");
                break;
            }
            case "декабрь": {
                System.out.println("в декабре 30 дней");
                break;
            }
            default: {
                System.out.println("совпадений" + "не найдено");

            }
        }
    }
}
