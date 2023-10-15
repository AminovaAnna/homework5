public class Main {
    public static void main(String[] args) {
        {
            int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Введены некорректные данные");
        } //задача1
        }

        System.out.println( );
        {
            int clientOS = 1;
            int yearProd = 2015;
            if (clientOS == 0 && yearProd < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS == 0 && yearProd >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == 1 && yearProd < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else if (clientOS == 1 && yearProd >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Введены некорректные данные");   //задача2
            }
        }
        System.out.println();

        {
            int year = 1000;
            if (year >= 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }    //задача3
            System.out.println( );

        }
        {
            int deliveryDistance = 200;
            int days = 1;
            if (deliveryDistance > 100) {
                System.out.println("Доставки нет");
            } else {
                if (deliveryDistance > 20) {
                    days++;
                }
                if (deliveryDistance > 60) {
                    days++;
                }
                System.out.println("Потребуется дней: " + days);
            }//задача4
            System.out.println();
        }
        {
            int monthNumber = 5;
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень");
                    break;
                default:
                    System.out.println("Неизвестный месяц");
            }  //задача5

        }

    }
}