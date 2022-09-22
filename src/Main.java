public class Main {
    public static int checkYear(int year) {
        if (year%4==0 && year%100!=0 || year%400==0) {
            System.out.println(year+" год является високосным");
        } else {
            System.out.println(year+" год не является високосным");
        }
        return year;
    }

    public static int checkSoft(int aclientOS, int yearProduction) {
        if (aclientOS == 0 && yearProduction >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (aclientOS == 0 && yearProduction < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (aclientOS == 1 && yearProduction >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (aclientOS == 1 && yearProduction < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (aclientOS < 0 || aclientOS > 1) {
            System.out.println("Ошибка");
        }
        return aclientOS;
    }

    public static int checkDelivery(int deliveryDistance) {
        int day=1;
        if (deliveryDistance > 20) {
            day++;
        }
        if (deliveryDistance > 60) {
            day++;
        }
        System.out.println("На доставку потребуется " + day + " дней");
        return deliveryDistance;
    }

    public static void main(String[] args) {

        System.out.println("Задание 1");
        int year=2003;
        int result=checkYear(year);

        System.out.println("Задание 2");
        var clientOS=0;
        var yearProduction=2022;
        int bresult=checkSoft(clientOS,yearProduction);

        System.out.println("Задание 3");
        var deliveryDistance=10;
        var cresult=checkDelivery(deliveryDistance);
    }
}