public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        int salary = 15_000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + salary;
            i++;
        }
        System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей");

        System.out.println("Задача 2");

        int number = 0;
        while (number < 10) {
            number = number + 1;
            System.out.print(number + " ");
        }
        System.out.println();
        for (int number1 = 10; number1 >= 1; number1--) {
            System.out.print(number1 + " ");
        }

        System.out.println();

        System.out.println("Задача 3");

        int population = 12_000_000;
        int years = 1;
        int populationInYear = ((17 - 8) * population) / 1000;
        for (; years <= 10; years++) {
            population = population + populationInYear;
            System.out.println("Год " + years + " численность составляет " + population);
        }

        System.out.println("Задача 4");

        int cash = 15_000;
        int month = 0;
        int cashTotal = 0;
        for (; cashTotal < 12_000_000; month++) {
            cashTotal = cashTotal + (cashTotal * 7) / 100;
            cashTotal = cashTotal + cash;

            System.out.println("Месяц " + month + " сумма накоплений - " + cashTotal);
        }

        System.out.println("Задача 5");

        int cash1 = 15_000;
        int month1 = 0;
        int cashTotal1 = 0;
        for (; cashTotal1 < 12_000_000; ) {
            cashTotal1 = cashTotal1 + (cashTotal1 * 7) / 100;
            cashTotal1 = cashTotal1 + cash1;
            month1++;
            if (month1 % 6 == 0) {
                System.out.println("Месяц " + month1 + " сумма накоплений - " + cashTotal1);
            }
        }

        System.out.println("Задача 6");

        int cash2 = 15_000;
        int month2 = 1;
        int year = 9;
        int monthsInTheYear = 12;
        int cashTotal2 = 0;

        for (; month2 <= (monthsInTheYear * year); month2++) {

            cashTotal2 = cashTotal2 + (cashTotal2 * 7) / 100;
            cashTotal2 = cashTotal2 + cash2;
            if (month2 % 6 == 0) {
                System.out.println("За " + month2 + " месяцев накопилось " + cashTotal2 + " рублей");
            }
        }

        System.out.println("Задача 7");

        int fridaysDate = 1;

        do {
            System.out.println("Сегодня пятница " + fridaysDate + " число");
            fridaysDate = fridaysDate + 6;
        } while (fridaysDate < 31);

        System.out.println("Задача 8");

        int cometaYear = 0;
        int ourYear = 2025;
        int begining = ourYear - 200;
        int ending = ourYear + 100;
        do {
            cometaYear = cometaYear + 79;
            if (cometaYear > begining && cometaYear < ending) {
                System.out.println(cometaYear);
            }
        } while (cometaYear < ending);
    }
}


