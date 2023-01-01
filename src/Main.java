public class Main {
    public static void countLeapYear (short year) {
        if ((year % 400) == 0) {
            System.out.println(year + " високосный год");
        } else if ((year % 100) == 0) {
            System.out.println(year + " невисокосный год");
        } else if ((year % 4) == 0) {
            System.out.println(year + " високосный год");
        } else
            System.out.println(year + " невисокосный год");
    }
    public static void installSystem (int clientOS, int dateRelease) {
        if (clientOS == 1 && dateRelease > 2015)
            System.out.println("Установите версию приложения для iOS по ссылке");
        else if (clientOS == 1 && dateRelease <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && dateRelease > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    public static void countDays(int deliveryRange) {
              short deliveryTime;
        if (deliveryRange <= 20) {
            deliveryTime = 1;
        } else if (deliveryRange > 20 && deliveryRange <= 60) {
            deliveryTime = 2;
        } else if (deliveryRange > 60 && deliveryRange <= 100) {
            deliveryTime = 3;
        } else {
            deliveryTime = 0;

        }
        if (deliveryTime == 0) {
            System.out.println("Свыше 100 км доставки нет.");
        } else {
            System.out.println("Потребуется дней: " + deliveryTime);
        }
    }
    public static void main(String[] args) {
        short year = 1900;
        countLeapYear(year);
        int clientOS = 0;
        int dateRelease = 2016;
        installSystem(clientOS, dateRelease);
        int deliveryRange = 40;
        countDays(deliveryRange);
    }
}