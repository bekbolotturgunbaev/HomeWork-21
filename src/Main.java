import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Week week = Week.valueOf(name.toUpperCase());
        switch (week) {
            case MONDAY -> {
                System.out.print("Дуйшомбу ");
                week.day();
            }case TUESDAY -> {
                System.out.print("Шейшемби ");
                week.day();
            }case WEDNESDAY -> {
                System.out.print("Шаршемби ");
                week.day();
            }case THURSDAY -> {
                System.out.print("Бейшемби ");
                week.day();
            }case FRIDAY -> {
                System.out.print("Жума ");
                week.day();
            }case SATURDAY -> {
                System.out.print("Ишемби ");
                week.day();
            }case SUNDAY -> {
                System.out.print("Жекшемби ");
                week.day();
            }default -> System.out.println("Сиз берген кун жок");
        }
    }


}
