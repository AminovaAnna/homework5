public class Main {
    public static void main(String[] args) {
        {
            int clientOS = 0;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Неверное значение"); //задача1
        }
    }
        System.out.println();

        {
            int clientOS = 3;
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
            int year = 2003;
            if (year >= 1584  ) {

            }

        }


    }
}