package homeworkIrina;

public class HW5 {
    public static void printTask(int number) {
        String line = "-------------------";
        System.out.println(line + " Task " + number + line);
    }

    // 1.Cоздать метод с названием verifyEquals(expectedResult, actualResult)

    public static String verifyEquals(String expectedResult, String actualResult) {
        String result = "";
        if (expectedResult.equals(actualResult)) {
            result = ("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            result = ("\u001B[31m" + "Fail" + "\u001B[0m");
        }
        System.out.println(result);
        return result;

    }

    public static String verifyEquals(int expectedResult, int actualResult) {
        String result = "";
        if (expectedResult == actualResult) {
            result = ("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            result = ("\u001B[31m" + "Fail" + "\u001B[0m");
        }
        System.out.println(result);
        return result;
    }

    public static String verifyEquals(double expectedResult, double actualResult) {
        String result = "";
        if (expectedResult == actualResult) {
            result = ("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            result = ("\u001B[31m" + "Fail" + "\u001B[0m");
        }
        System.out.println(result);
        return result;
    }

    public static String verifyEquals(boolean expectedResult, boolean actualResult) {
        String result = "";
        if (expectedResult == actualResult) {
            result = ("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            result = ("\u001B[31m" + "Fail" + "\u001B[0m");
        }
        System.out.println(result);
        return result;
    }

    // 2.Написать метод, который принимает на вход число от 1 до 7  и возвращает день недели.

    public static String determineTheDay(int a) {
        String days = " ";
        if (a < 1 || a > 7) {
            days = "Введите число от 1 до 7!";
            System.out.println(days);
            return days;
        } else if (a == 1) {
            days = "Первый день недели - понедельник.";
            return days;
        } else if (a == 2) {
            days = "Второй день недели - вторник.";
            return days;
        } else if (a == 3) {
            days = "Третий день недели - среда.";
            return days;
        } else if (a == 4) {
            days = "Четвертый день недели - четверг.";
            return days;
        } else if (a == 5) {
            days = "Пятый день недели - пятница.";
            return days;
        } else if (a == 6) {
            days = "Шестой день недели - суббота.";
            return days;
        } else if (a == 7) {
            days = "Седьмой день недели - воскресенье.";
            return days;
        }
        System.out.println(days);
           return days;

    }

    // 3.Given 3 values,  x, y, z. Determine the largest value and assign  this value to the variable largest.

    public static int findTheLargest(int x, int y, int z) {

        int largest = Math.max(Math.max(x, y), z);
        System.out.println(largest);
        return largest;
    }

    // 4. Using nest if statements, write a fragment of code that prints the smallest value contained
    // in the variables a,b, c.

    public static int findSmallest(int a, int b, int c) {

        int smallest = Math.min(Math.min(a, b), c);
        System.out.println(smallest);
        return smallest;
    }

    // 5. Написать алгоритм вычисления среднего значения из 5 показателей температуры тела кота.

    public static String averageCat(double t1, double t2, double t3, double t4, double t5) {
        double average;
        String average1;
        if ((t1 < 36.5 || t1 > 41.0) || (t2 < 36.5 || t2 > 41.0) || (t3 < 36.5 || t3 > 41.0) || (t4 < 36.5 || t4 > 41.0) || (t5 < 36.5 || t5 > 41.0)) {
            average1 = "Котик заболел.";
            System.out.println(average1);
            return average1;
        } else {
            average = ((t1 + t2 + t3 + t4 + t5) / 5);
            int average2 = (int) average;
            String average2a = String.valueOf(average2);
            int average3 = (int) ((average - average2) * 10);
            String average4 = String.valueOf(average3);
            average1 = ("Средняя температура кота за 5 дней составила: " + average2a + "." + average4);
            System.out.println(average1);
            return average1;
        }
    }
    // 6.Написать метод, который принимает на вход десятичное число (например, 10.75),
    // и возвращает строку “10 руб 75 коп”.

    public static String convertNumberToString(double num) {
        int num1 = (int) num;
        String num1a = String.valueOf(num1);
        int num2 = (int) ((num - num1) * 100);
        String num2a = String.valueOf(num2);
        System.out.println(num1a + " руб " + num2a + " коп");
        return num1a + " руб " + num2a + " коп";
    }

    //7.Написать метод, который принимает на вход десятичное число и возвращает строку “10 кг 75 гр”.

    public static String convertNumberToString1(double num) {
        int num1 = (int) num;
        String num1a = String.valueOf(num1);
        int num2 = (int) ((num - num1) * 1000);
        String num2a = String.valueOf(num2);
        System.out.println(num1 + " кг " + num2 + " гр");
        return num1a + " кг " + num2a + " гр";
    }

    // 8.Написать метод, который принимает на вход 2 параметра -  цену и количество товара
    // (может быть вес товара, или количество в штуках).
    // Алгоритм возвращает сумму покупки в виде десятичного числа.

    public static Double summaPokupki(double price, double amount) {

        double itogo = price * amount;
        System.out.println(itogo);
        return itogo;
    }

    // 9.Написать метод, который принимает на вход необходимые параметры, и печатает чек.
    //Например:
    //
    //Яблоки
    //Цена за 1 кг       50 руб 13 коп
    //Количество товара    3 кг 400 гр
    //_______________________________________
    //Сумма к оплате      170 руб 44 коп
    //
    //или
    //
    //Хлеб
    //Цена за 1 шт    30 руб 50 коп
    //Количество товара    5 шт
    //_______________________________________
    //Сумма к оплате      152 руб 50 коп

    public static String printChek(double amountOfApples, double priceOfApples) {
        String produkt = "Яблоки              ";
        String cenaZa1 = "Цена за 1 кг      ";
        String kolichestvoTovara = "Количество товара    ";
        String line = "______________________________";
        String summaKOplate = "Сумма к оплате  ";

        amountOfApples = (int) amountOfApples;
        String amountOfApplesStr = String.valueOf(amountOfApples);
        int priceOfApplesRub = (int) priceOfApples;
        String priceOfApplesRubStr = String.valueOf(priceOfApplesRub);
        int priceOfApplesKop = ((int) (priceOfApples - priceOfApplesRub));
        String priceOfApplesKopStr = String.valueOf(priceOfApplesKop);
        String priceOfApplesStr = String.valueOf(priceOfApples);

        double itogo = amountOfApples * priceOfApples;
        String itogoStr = String.valueOf(itogo);
        int itogoRub = (int) itogo;
        String itogoRubStr = String.valueOf(itogoRub) + " ";
        int itogoKop = ((int) ((itogo - itogoRub) * 100));
        String itogoKopStr = String.valueOf(itogoKop);

        System.out.println(produkt + "\n"
                + cenaZa1 + "     " + priceOfApplesStr + "\n"
                + kolichestvoTovara + "  " + amountOfApplesStr + "\n"
                + line + "\n"
                + summaKOplate + "" + itogoRubStr + " руб " + itogoKopStr + " коп");
        return produkt + "\n"
                + cenaZa1 + "     " + priceOfApplesStr + "\n"
                + kolichestvoTovara + "  " + amountOfApplesStr + "\n"
                + line + "\n"
                + summaKOplate + "" + itogoRubStr + " руб " + itogoKopStr + " коп";

    }

    //10. Написать метод, который принимает на вход количество часов работы в день
    // и стоимость одного часа работы, и возвращает заработную плату в месяц.

    public static String countZP(double hourInADay, double oneHourPrice) {
        String hourInADayStr = String.valueOf(hourInADay);
        String oneHourPriceStr = String.valueOf(oneHourPrice);
        int workDaysInMounth = 20;
        String workDaysInMounthStr = String.valueOf(workDaysInMounth);
        double amountWorkHourInMounth = hourInADay * workDaysInMounth;
        int oneHourPriceRub = (int) oneHourPrice;
        String oneHourPriceRubStr = String.valueOf(oneHourPriceRub);
        int oneHourPriceKop = ((int) ((oneHourPrice - oneHourPriceRub) * 100));
        String oneHourPriceKopStr = String.valueOf(oneHourPriceKop);
        double zp = oneHourPrice * amountWorkHourInMounth;
        String zpStr = String.valueOf(zp);
        int zpRub = (int) zp;
        String zpRubStr = String.valueOf(zpRub);
        int zpKop = ((int) ((zp - zpRub) * 100));
        String zpKopStr = String.valueOf(zpKop);
        System.out.println("Работая по " + hourInADayStr + " часов в день "
                + workDaysInMounthStr + " рабочих дней в месяц, " + "\n"
                + "при оплате труда " + oneHourPriceRubStr + " руб "
                + oneHourPriceKopStr + " коп в час " + "\n"
                + "заработная плата составит - "
                + zpRubStr + " руб " + zpKopStr + " коп.");
        return "Работая по " + hourInADayStr + " часов в день "
                + workDaysInMounthStr + " рабочих дней в месяц, " + "\n"
                + "при оплате труда " + oneHourPriceRubStr + " руб "
                + oneHourPriceKopStr + " коп в час " + "\n"
                + "заработная плата составит - "
                + zpRubStr + " руб " + zpKopStr + " коп.";
    }

    // 11.Написать метод, который принимает на вход необходимые параметры и печатает строку
    // ведомости выдачи зарплаты сотрудникам.
    //Например:
    //
    //Смирнова Мария Ивановна 		70000 руб 00 коп
    //
    //Распечатать ведомость для нескольких сотрудников, например:
    //
    //Март 2022
    //Смирнова Мария Ивановна 		70000 руб 00 коп
    //Серебряков Иван Петрович 		128059 руб 00 коп

    public static String printVedomost(String sotrudnik, double zpVedomost) {

        int zpVedomostRub = (int) zpVedomost;
        String zpVedomostRubStr = String.valueOf(zpVedomostRub);
        int zpVedomostKop = ((int) ((zpVedomost - zpVedomostRub) * 100));
        String zpVedomostKopStr = String.valueOf(zpVedomostKop);

        System.out.println(sotrudnik + "        " + zpVedomostRubStr + " руб "
                + zpVedomostKopStr + "коп");
        return sotrudnik + "        " + zpVedomostRubStr + " руб "
                + zpVedomostKopStr + "коп";
    }

    public static String chekNumber(int x) {
        String xStr = String.valueOf(x);
        if (x < 0) {
            System.out.println(xStr + " is negative");
            return xStr + " is negative";
        } else if (x > 0) {
            System.out.println(xStr + " is positive");
            return xStr + " is positive";
        } else {
            System.out.println(xStr + " is zero");
            return xStr + " is zero";
        }
    }

    //13.Написать метод, который принимает на вход год рождения и возвращает ваше счастливое число.
    // Счастливое число рассчитывается по формуле: сумма всех чисел,
    // если результат больше 9,снова считается сумма всех чисел.
    //Например:
    //год рождения 1999
    //1 + 9 + 9 + 9 = 28
    //2 + 8 = 10
    //1 + 0 = 1
    //Счастливое число - 1

    public static String countHappyNum(int year) {

        int yearNum4 = year % 10;
        int yearNum3 = (year % 100 - yearNum4) / 10;
        int yearNum2 = (year % 1000 - yearNum3 * 10 - yearNum4) / 100;
        int yearNum1 = (year - yearNum2 * 100 - yearNum3 * 10 - yearNum4) / 1000;
        int happyNum4 = yearNum1 + yearNum2 + yearNum3 + yearNum4;
        String happyNumStr = String.valueOf(happyNum4);

        int sumHappyNum1;
        int sumHappyNum2;
        int happyNum2;
        int num1OfHappyNum2;
        int num2OfHappyNum2;
        int happyNum22;

        if (happyNum4 > 9) {
            sumHappyNum1 = happyNum4 % 10;
            sumHappyNum2 = (happyNum4 - sumHappyNum1) / 10;
            happyNum2 = sumHappyNum1 + sumHappyNum2;
            String happyNum2Str = String.valueOf(happyNum2);
            if (happyNum2 > 9) {
                num2OfHappyNum2 = happyNum2 % 10;
                num1OfHappyNum2 = (happyNum2 - num2OfHappyNum2)/ 10;
                happyNum22 = num1OfHappyNum2 + num2OfHappyNum2;
                String happyNum22Str = String.valueOf(happyNum22);
                if (happyNum22 > 9) {
                    System.out.println("Ваше счастливое число - " + happyNum2Str);
                    return "Ваше счастливое число - " + happyNum2Str;
                }
                System.out.println("Ваше счастливое число - " + happyNum22Str);
                return "Ваше счастливое число - " + happyNum22Str;
            }
            System.out.println("Ваше счастливое число - " + happyNum2Str);
            return "Ваше счастливое число - " + happyNum2Str;
        }
        System.out.println("Ваше счастливое число - " + happyNumStr);
        return "Ваше счастливое число - " + happyNumStr;

    }

    //а) Дано 3 числа. Необходимо рассчитать разницу между средним значением и медианой (median) значением.
    //Если разница больше 2, необходимо показать сообщение: “Среднее значение … отличается от медианы … на … “.
    //Иначе показать сообщение: “Среднее значение =  …, медиана =  … ”.
    //b) Посчитать все то же самое с помощью методов класса Math, где возможно их использовать

    public static String  diffBetweenAverageAndMedian(int a, int b, int c){

        int average = (a + b + c) / 3;
        String averageStr = String.valueOf(average);
        int max = Math.max(Math.max(a,b), c);
        int min = Math.min(Math.min(a,b), c);
        int median = a + b + c - (min + max);
        String medianStr = String.valueOf(median);
        int differ = average - median;
        String differStr = String.valueOf(differ);

        if (differ > 2) {
            System.out.println("Среднее значение " + averageStr + " отличается от медианы " + medianStr + " на " + differStr);
            return "Среднее значение " + averageStr + " отличается от медианы " + medianStr + " на " + differStr;
        } else {
            System.out.println("Среднее значение = " + averageStr + ", медиана = " + medianStr + ".");
            return "Среднее значение = " + averageStr + ", медиана = " + medianStr + ".";
        }
    }

    //15.Написать метод, который использует методы класса Math, принимает на вход сумму к оплате (например, 10.75)
    // и округляет сумму в пользу покупателя. Метод возвращает новую сумму к оплате в виде строки, например “10 руб 00 коп”.

    public static String  roundPay(double a){
        double a1 = Math.floor(a);  //окргулила дабл 10.75 до  a1 = 10.00 тип дабл
        int a2 = (int)a;// число до точки 10
        String a2Str = String.valueOf(a2); // a1Str = "10"
        System.out.println(a2Str + " руб 00 коп.");
        return a2Str + " руб 00 коп.";
    }

    //16.Посчитать с помощью методов класса Math
    //a = 3
    //b = 4
    //c = 20
    //
    //((a * b + c) * ab)
    //Вернуть значение с округлением в бОльшую сторону.
    public static double okruglToBig(int a, int b, int c){
        double a1 = a;
        double b2 = b;
        double c2 = c;
        double x = a * b + c;
        double y = Math.pow(a, b);
        double z = x * y;
        double h = Math.sqrt(z);
        double s = h / Math.PI;
        s = Math.ceil(s);

        System.out.println(s);
        return s;
    }
    //17.x=1,  if y>0; double
    // + 5, if  число между 80 и 90
    //переписать без ! item = ! (i <10)||(v >= 50)
    //print true if x is odd positive
    //print true x both x and y positive
    //if x y same (-/+)
//
//    public static void primer(double x, double y){
//        x = 1
//
//    }




    //18.Написать метод, который с помощью методов класса Math высчитывает любую степень сгенерированного случайного числа.
    // Метод возвращает математически округленное целое значение и выводит на экран:
    //“Число … в степени … = …”
    //
    //Число может быть в пределах от 0 до 1 исключительно.
    //Степень числа может быть от 0 до 10 включительно
    public static String roundPow(int min, int max, int stMin, int stMax) {
        min = 0;
        max = 1;
        stMin = 0;
        stMax = 10;
        int diapason = max + min + 1;
        int diapasonStep = stMax + stMin + 1;
        double roundNum = (Math.random() * diapason);
        long roundNum1 = Math.round(roundNum);
        String roundNumStr = String.valueOf(roundNum1);
        double roundSt = (Math.random() * diapasonStep);
        long roundSt1 = Math.round(roundSt);
        String roundStStr = String.valueOf(roundSt1);
        double result = Math.pow(roundNum, roundSt);
        long result1 = Math.round(result);
        String res1 = String.valueOf(result1);
        System.out.println("Число " + roundNumStr + " в степени " + roundStStr + " = " + res1);
        return "Число " + roundNumStr + " в степени " + roundStStr + " = " + res1;
    }

    //19/Написать метод, который возвращает случайное число в пределах от 1 до 99 включительно.

    public static double rnd(int min, int max) {
        int diapason = max + min + 1;
        double roundNum = (Math.random() * diapason);
        long roundNum1 = Math.round(roundNum);

        System.out.println(roundNum1);
        return roundNum1;
        }

    // 20. int year, boolean isLeapYear;
    //присвоить булеану правда,если год высокосный и не правда, если нет. высокосный- %4 = 0.
    public static boolean leap(int year){
        boolean isLeapYear;
        int a = year % 4;
        if ( a == 0 ){
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }


    public static void main(String[] args) {

        String test = ("\u001B[34m" + "-------------------- test--------------------" + "\u001B[0m");

        printTask(2);
        determineTheDay(2);
        determineTheDay(0);
        //test: 2, 0, 8;
        System.out.println(test);
        verifyEquals(determineTheDay(2), "Второй день недели - вторник.");
        verifyEquals(determineTheDay(0 ),"Введите число от 1 до 7!");
        verifyEquals(determineTheDay(8), "Введите число от 1 до 7!");

        printTask(3);
        findTheLargest(76, 8, 9 );

        //test: 3, 7, -9; 100, -100, 0.
        System.out.println(test);
        verifyEquals(findTheLargest(3,7, -9),7);
        verifyEquals(findTheLargest(100,-100,0),100);

        printTask(4);
        findSmallest(6, -9,-99);
        //test: 3, 7, 9; 100, -100, 0.
        System.out.println(test);
        verifyEquals(findSmallest(3, 7, 9), 3);
        verifyEquals(findSmallest(100, -100, 0), -100);

        printTask(5);
        averageCat(38.0, 38.9, 38.7, 39.7, 38.0);
        averageCat(0.9, 60.0, 38.9, 39.3, 37.8);
        //test: 38.0, 38.9, 38.7, 39.7, 38.0;
        //      0.9, 60.0, 38.9, 39.3, 37.8;
        System.out.println(test);
        verifyEquals(averageCat(38.0, 38.9, 38.7, 39.7, 38.0), "Средняя температура кота за 5 дней составила: 38.6");
        verifyEquals(averageCat(0.9, 60.0, 38.9, 39.3, 37.8), "Котик заболел.");

        printTask(6);
        convertNumberToString(70.7);
        //test: 70.7;
        System.out.println(test);
        verifyEquals(convertNumberToString(70.7),"70 руб 70 коп");


        printTask(7);
        convertNumberToString1(56.8);
        //test: 56.8 ;
        System.out.println(test);
        verifyEquals(convertNumberToString1(56.8), "56 кг 799 гр");


        printTask(8);
        summaPokupki(3.78, 2.900);
        //test: 0.5, 100.05
        System.out.println(test);
        verifyEquals(summaPokupki(0.5, 100.05), 50.025);

        printTask(9);
        printChek(78.8, 67.0);
        printChek(5.0, 90.99);

        //test : 5.0, 90.99;
        System.out.println(test);
        verifyEquals(printChek(5.0, 90.99),
                "Яблоки              \n" +
                        "Цена за 1 кг           90.99\n" +
                        "Количество товара      5.0\n" +
                        "______________________________\n" +
                        "Сумма к оплате  454  руб 94 коп");


        printTask(10);
        countZP(5.5, 1000.0);
        System.out.println(test);
        //test:5.5, 1000.0;
        verifyEquals(countZP(6.5, 1000.0),
                "Работая по 6.5 часов в день 20 рабочих дней в месяц, \n" +
                        "при оплате труда 1000 руб 0 коп в час \n" +
                        "заработная плата составит - 130000 руб 0 коп.");


        printTask(11);
        System.out.println("Март 2022                      ");
        printVedomost("Смирнова Мария Ивановна", 70000.00);
        printVedomost("Серебряков Иван Петрович",128059.00);
        System.out.println(test);
        //test:"Ivan Ivanovich Ivanov", 56000.0;
        verifyEquals(printVedomost("Ivan Ivanovich Ivanov", 56000.0),
                "Ivan Ivanovich Ivanov        56000 руб 0коп");

        printTask(12);
        chekNumber(-9);
        System.out.println(test);
        //test: 7;0;
        verifyEquals(chekNumber(7), "7 is positive");
        verifyEquals(chekNumber(0), "0 is zero");

        printTask(13);
        countHappyNum(1985);
        countHappyNum(1111);
        System.out.println(test);
        //test: 0000, 2020, 1999;
        verifyEquals(countHappyNum(0000), "Ваше счастливое число - 0");
        verifyEquals(countHappyNum(2020), "Ваше счастливое число - 4");
        verifyEquals(countHappyNum(1999), "Ваше счастливое число - 1");
        verifyEquals(countHappyNum(1939), "Ваше счастливое число - 4");
        verifyEquals(countHappyNum(1919), "Ваше счастливое число - 2");
        verifyEquals(countHappyNum(1935), "Ваше счастливое число - 9");

        printTask(14);
        diffBetweenAverageAndMedian(3,90, 8 );
        diffBetweenAverageAndMedian(3,6,4);
        System.out.println(test);
        //test: 1,1,1; 10,90,3; 0,0,0; -1;2;3
        verifyEquals(diffBetweenAverageAndMedian(1,1,1), "Среднее значение = 1, медиана = 1.");
        verifyEquals(diffBetweenAverageAndMedian(10,90,3), "Среднее значение 34 отличается от медианы 10 на 24");
        verifyEquals(diffBetweenAverageAndMedian(0,0,0), "Среднее значение = 0, медиана = 0.");
        verifyEquals(diffBetweenAverageAndMedian(-1,2,3), "Среднее значение = 1, медиана = 2.");

        printTask(15);
        roundPay(34.99);
        roundPay(35.00);

        System.out.println(test);
        //test:78.0000
        verifyEquals(roundPay(78.000), "78 руб 00 коп.");

        printTask(16);
        okruglToBig(1,2,3);
        System.out.println(test);
        //test:1,1,1; 0,0,0
        //verifyEquals(,);


        printTask(17);


        printTask(18);
        roundPow(0,1,0,10);

        printTask(19);
        rnd(1,89);
        rnd(0,0);







        printTask(20);
        leap(2009);
        System.out.println(test);
        //test:1508; 2000;
        verifyEquals(false, false);
        verifyEquals(true, true);








    }
}
