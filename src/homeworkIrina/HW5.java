package homeworkIrina;

public class HW5 {
    public static void printTask(int number) {
        String line = "-------------------";
        System.out.println(line + " Task " + number + line);
    }

    // 1.C������ ����� � ��������� verifyEquals(expectedResult, actualResult)

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

    // 2.�������� �����, ������� ��������� �� ���� ����� �� 1 �� 7  � ���������� ���� ������.

    public static String determineTheDay(int a) {
        String days = " ";
        if (a < 1 || a > 7) {
            days = "������� ����� �� 1 �� 7!";
            System.out.println(days);
            return days;
        } else if (a == 1) {
            days = "������ ���� ������ - �����������.";
            return days;
        } else if (a == 2) {
            days = "������ ���� ������ - �������.";
            return days;
        } else if (a == 3) {
            days = "������ ���� ������ - �����.";
            return days;
        } else if (a == 4) {
            days = "��������� ���� ������ - �������.";
            return days;
        } else if (a == 5) {
            days = "����� ���� ������ - �������.";
            return days;
        } else if (a == 6) {
            days = "������ ���� ������ - �������.";
            return days;
        } else if (a == 7) {
            days = "������� ���� ������ - �����������.";
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

    // 5. �������� �������� ���������� �������� �������� �� 5 ����������� ����������� ���� ����.

    public static String averageCat(double t1, double t2, double t3, double t4, double t5) {
        double average;
        String average1;
        if ((t1 < 36.5 || t1 > 41.0) || (t2 < 36.5 || t2 > 41.0) || (t3 < 36.5 || t3 > 41.0) || (t4 < 36.5 || t4 > 41.0) || (t5 < 36.5 || t5 > 41.0)) {
            average1 = "����� �������.";
            System.out.println(average1);
            return average1;
        } else {
            average = ((t1 + t2 + t3 + t4 + t5) / 5);
            average1 = String.format("%.2f", average);
//            int average2 = (int) average;
//            String average2a = String.valueOf(average2);
//            int average3 = (int) ((average - average2) * 10);
//            String average4 = String.valueOf(average3);
//            average1 = ("������� ����������� ���� �� 5 ���� ���������: " + average2a + "." + average4);
            System.out.println(average1);
            return average1;
        }
    }



    // 6.�������� �����, ������� ��������� �� ���� ���������� ����� (��������, 10.75),
    // � ���������� ������ �10 ��� 75 ���.

    public static String convertNumberToString(double num) {
        int num1 = (int) num;
        String num1a = String.valueOf(num1);
        int num2 = (int) Math.round((num - num1) * 100);
        String num2a = String.valueOf(num2);
        System.out.println(num1a + " ��� " + num2a + " ���");
        return num1a + " ��� " + num2a + " ���";
    }

    //7.�������� �����, ������� ��������� �� ���� ���������� ����� � ���������� ������ �10 �� 75 ��.

    public static String convertNumberToString1(double num) {
       String numall = Double.toString(num);
        String num1a = numall.substring(0, numall.indexOf("."));
        String num2a = numall.substring(numall.indexOf(".") + 1);
        System.out.println(num1a + " �� " + num2a + " ��");
        return num1a + " �� " + num2a + " ��";
    }

    // 8.�������� �����, ������� ��������� �� ���� 2 ��������� -  ���� � ���������� ������
    // (����� ���� ��� ������, ��� ���������� � ������).
    // �������� ���������� ����� ������� � ���� ����������� �����.

    public static String summaPokupki(double price, double amount) {

        double itogo = price * amount;
        System.out.println(String.format("%.2f",itogo));
        return String.format("%.2f",itogo);
    }

    // 9.�������� �����, ������� ��������� �� ���� ����������� ���������, � �������� ���.
    //��������:
    //
    //������
    //���� �� 1 ��       50 ��� 13 ���
    //���������� ������    3 �� 400 ��
    //_______________________________________
    //����� � ������      170 ��� 44 ���
    //
    //���
    //
    //����
    //���� �� 1 ��    30 ��� 50 ���
    //���������� ������    5 ��
    //_______________________________________
    //����� � ������      152 ��� 50 ���

    public static String printChek(double amountOfApples, double priceOfApples) {
        String produkt = "������              ";
        String cenaZa1 = "���� �� 1 ��      ";
        String kolichestvoTovara = "���������� ������    ";
        String line = "______________________________";
        String summaKOplate = "����� � ������  ";

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
                + summaKOplate + "" + itogoRubStr + " ��� " + itogoKopStr + " ���");
        return produkt + "\n"
                + cenaZa1 + "     " + priceOfApplesStr + "\n"
                + kolichestvoTovara + "  " + amountOfApplesStr + "\n"
                + line + "\n"
                + summaKOplate + "" + itogoRubStr + " ��� " + itogoKopStr + " ���";

    }

    //10. �������� �����, ������� ��������� �� ���� ���������� ����� ������ � ����
    // � ��������� ������ ���� ������, � ���������� ���������� ����� � �����.

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
        System.out.println("������� �� " + hourInADayStr + " ����� � ���� "
                + workDaysInMounthStr + " ������� ���� � �����, " + "\n"
                + "��� ������ ����� " + oneHourPriceRubStr + " ��� "
                + oneHourPriceKopStr + " ��� � ��� " + "\n"
                + "���������� ����� �������� - "
                + zpRubStr + " ��� " + zpKopStr + " ���.");
        return "������� �� " + hourInADayStr + " ����� � ���� "
                + workDaysInMounthStr + " ������� ���� � �����, " + "\n"
                + "��� ������ ����� " + oneHourPriceRubStr + " ��� "
                + oneHourPriceKopStr + " ��� � ��� " + "\n"
                + "���������� ����� �������� - "
                + zpRubStr + " ��� " + zpKopStr + " ���.";
    }

    // 11.�������� �����, ������� ��������� �� ���� ����������� ��������� � �������� ������
    // ��������� ������ �������� �����������.
    //��������:
    //
    //�������� ����� �������� 		70000 ��� 00 ���
    //
    //����������� ��������� ��� ���������� �����������, ��������:
    //
    //���� 2022
    //�������� ����� �������� 		70000 ��� 00 ���
    //���������� ���� �������� 		128059 ��� 00 ���

    public static String printVedomost(String sotrudnik, double zpVedomost) {

        int zpVedomostRub = (int) zpVedomost;
        String zpVedomostRubStr = String.valueOf(zpVedomostRub);
        int zpVedomostKop = ((int) ((zpVedomost - zpVedomostRub) * 100));
        String zpVedomostKopStr = String.valueOf(zpVedomostKop);

        System.out.println(sotrudnik + "        " + zpVedomostRubStr + " ��� "
                + zpVedomostKopStr + "���");
        return sotrudnik + "        " + zpVedomostRubStr + " ��� "
                + zpVedomostKopStr + "���";
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

    //13.�������� �����, ������� ��������� �� ���� ��� �������� � ���������� ���� ���������� �����.
    // ���������� ����� �������������� �� �������: ����� ���� �����,
    // ���� ��������� ������ 9,����� ��������� ����� ���� �����.
    //��������:
    //��� �������� 1999
    //1 + 9 + 9 + 9 = 28
    //2 + 8 = 10
    //1 + 0 = 1
    //���������� ����� - 1

    public static String countHappyNum(int year) {

        int yearNum4 = year % 10;//���������� 4 �� ����� � ����
        int yearNum3 = year % 100 / 10;
        int yearNum2 = year / 100 % 10;
        int yearNum1 = year / 1000;
        int happyNum4 = yearNum1 + yearNum2 + yearNum3 + yearNum4;
        String happyNumStr = String.valueOf(happyNum4);
        int sumHappyNum1 = happyNum4 % 10;
        int sumHappyNum2 = (happyNum4 - sumHappyNum1) / 10;
        int happyNum2 = sumHappyNum1 + sumHappyNum2;
        String happyNum2Str = String.valueOf(happyNum2);
        int num2OfHappyNum2 = happyNum2 % 10;
        int num1OfHappyNum2 = (happyNum2 - num2OfHappyNum2)/ 10;
        int happyNum22 = num1OfHappyNum2 + num2OfHappyNum2;
        String happyNum22Str = String.valueOf(happyNum22);

        if (happyNum4 > 9) {

            if (happyNum2 > 9) {

                if (happyNum22 > 9) {
                    System.out.println("���� ���������� ����� - " + happyNum2Str);
                    return "���� ���������� ����� - " + happyNum2Str;
                }
                System.out.println("���� ���������� ����� - " + happyNum22Str);
                return "���� ���������� ����� - " + happyNum22Str;
            }
            System.out.println("���� ���������� ����� - " + happyNum2Str);
            return "���� ���������� ����� - " + happyNum2Str;
        }
        System.out.println("���� ���������� ����� - " + happyNumStr);
        return "���� ���������� ����� - " + happyNumStr;

    }

    //�) ���� 3 �����. ���������� ���������� ������� ����� ������� ��������� � �������� (median) ���������.
    //���� ������� ������ 2, ���������� �������� ���������: �������� �������� � ���������� �� ������� � �� � �.
    //����� �������� ���������: �������� �������� =  �, ������� =  � �.
    //b) ��������� ��� �� �� ����� � ������� ������� ������ Math, ��� �������� �� ������������

    public static String  diffBetweenAverageAndMedian(int a, int b, int c){

        int average = (a + b + c) / 3;
        String averageStr = String.valueOf(average);
        int max = Math.max(Math.max(a,b), c);
        int min = Math.min(Math.min(a,b), c);
        int median = a + b + c - (min + max);
        String medianStr = String.valueOf(median);
        int differ = average - median;
        String differStr = String.valueOf(differ);
        if (differ < 0){
            differ =(-1) * differ;
        }

        if (differ > 2) {
            System.out.println("������� �������� " + averageStr + " ���������� �� ������� " + medianStr + " �� " + differStr);
            return "������� �������� " + averageStr + " ���������� �� ������� " + medianStr + " �� " + differStr;
        } else {
            System.out.println("������� �������� = " + averageStr + ", ������� = " + medianStr + ".");
            return "������� �������� = " + averageStr + ", ������� = " + medianStr + ".";
        }
    }

    //15.�������� �����, ������� ���������� ������ ������ Math, ��������� �� ���� ����� � ������ (��������, 10.75)
    // � ��������� ����� � ������ ����������. ����� ���������� ����� ����� � ������ � ���� ������, �������� �10 ��� 00 ���.

    public static String  roundPay(double a){
        int a2 = (int)a;
        String a2Str = String.valueOf(a2);
        double b2 = (a - a2) * 100;
        String b2okr = String.format("%.0f", b2);

        System.out.println(a2Str + " ��� " +  b2okr  + "���.");
        return a2Str + " ��� " +  b2okr  + "���.";
    }

    //16.��������� � ������� ������� ������ Math
    //a = 3
    //b = 4
    //c = 20
    //
    //((a * b + c) * ab)
    //������� �������� � ����������� � ������� �������.
    public static double okruglToBig(int a, int b, int c){
        double s = Math.sqrt((a * b + c) * (Math.pow(a, b))) / Math.PI;
        s = Math.ceil(s);

        System.out.println(s);
        return s;
    }
// //17.x=1,  if y>0;
    public static void primer(int y){
        int x;
        if (y > 0 ){
            System.out.println(x = 1);
        }
    }
    // + 5, if  ����� ����� 80 � 90
    public static void task17p2(double score){
        if (score >= 80 && score <= 90) {
            System.out.println(score + 5);
        }
    }
    // //���������� ��� ! item = ! (i <10)||(v >= 50)
    public static boolean task17p3(int i, int v){
        boolean item = (i >= 10)&&(v < 50);//&& � || �������������� ��� ���������
        return item;
    }
    ////print true if x is odd positive
    public static void task17p4(int x){
        if (x % 2 != 0 && x >= 0){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    //print true x both x and y positive
    public static void task17p5(int x, int y){
        if (x >= 0 && y >= 0 ){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    //if x y same (-/+)
    public static void task17p6(int x, int y){
        if (x >= 0 && y >= 0 || x < 0 && y <0 ){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }



    //18.�������� �����, ������� � ������� ������� ������ Math ����������� ����� ������� ���������������� ���������� �����.
    // ����� ���������� ������������� ����������� ����� �������� � ������� �� �����:
    //������ � � ������� � = ��
    //
    //����� ����� ���� � �������� �� 0 �� 1 �������������.
    //������� ����� ����� ���� �� 0 �� 10 ������������
    public static double roundPow(int pow) {
//        min = 0;
//        max = 1;
//        stMin = 0;
//        stMax = 10;
//        int diapason = max + min + 1;
//        int diapasonStep = stMax + stMin + 1;
//        double roundNum = (Math.random() * diapason);
//        long roundNum1 = Math.round(roundNum);
//        String roundNumStr = String.valueOf(roundNum1);
//        double roundSt = (Math.random() * diapasonStep);
//        long roundSt1 = Math.round(roundSt);
//        String roundStStr = String.valueOf(roundSt1);
//        double result = Math.pow(roundNum, roundSt);
//        long result1 = Math.round(result);
//        String res1 = String.valueOf(result1);
//        System.out.println("����� " + roundNumStr + " � ������� " + roundStStr + " = " + res1);
//        return "����� " + roundNumStr + " � ������� " + roundStStr + " = " + res1;
        if( pow >= 0 && pow <= 10){
           // return Math.pow(Math.random(), pow * 1.0);
            System.out.println(Math.pow(Math.random(), pow * 1.0));
            return Math.pow(Math.random(), pow);
        }else{
            System.out.println("error");
            return Double.MIN_VALUE;
        }
    }

    //19/�������� �����, ������� ���������� ��������� ����� � �������� �� 1 �� 99 ������������.

    public static double rnd() {
        int num1 = (int)(Math.random() * 99) +1;
        System.out.println(num1);
        return num1;
        }

    // 20. int year, boolean isLeapYear;
    //��������� ������� ������,���� ��� ���������� � �� ������, ���� ���. ����������- %4 = 0.
    public static boolean leap(int year) {
        boolean isLeapYear;
//        int a = year % 4;
//        if ( a == 0 ){
//            System.out.println("true");
//            return true;
//        } else {
//            System.out.println("false");
//            return false;
//        }
        //2 �������
//        if(year % 4 == 0){
//            if(year % 100 == 0){
//                if(year % 400 == 0){
//                    isLeapYear = true;
//                }else{
//                    isLeapYear = false;
//                }
//            }else{
//                isLeapYear = true;
//            }
//        }else{
//            isLeapYear = false;
//        }
//        return isLeapYear;
//
        return (year % 100 == 0 && year % 400 == 0 || year % 4 == 0 && year % 100 > 0);
    }

    public static void main(String[] args) {

        String test = ("\u001B[34m" + "-------------------- test--------------------" + "\u001B[0m");

        printTask(2);
        determineTheDay(2);
        determineTheDay(0);
        //test: 2, 0, 8;
        System.out.println(test);
        verifyEquals(determineTheDay(2), "������ ���� ������ - �������.");
        verifyEquals(determineTheDay(0 ),"������� ����� �� 1 �� 7!");
        verifyEquals(determineTheDay(8), "������� ����� �� 1 �� 7!");

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
        verifyEquals(averageCat(38.0, 38.9, 38.7, 39.7, 38.0), "������� ����������� ���� �� 5 ���� ���������: 38.6");
        verifyEquals(averageCat(0.9, 60.0, 38.9, 39.3, 37.8), "����� �������.");

        printTask(6);
        convertNumberToString(70.7);
        //test: 70.7;
        System.out.println(test);
        verifyEquals(convertNumberToString(70.7),"70 ��� 70 ���");


        printTask(7);
        convertNumberToString1(56.8);
        //test: 56.8 ;
        System.out.println(test);
        verifyEquals(convertNumberToString1(56.8), "56 �� 8 ��");


        printTask(8);
        summaPokupki(3.78, 2.900);
        summaPokupki(0.5,100.05);
        //test: 0.5, 100.05
        System.out.println(test);
     verifyEquals(summaPokupki(0.5,100.05), "50.03");

        printTask(9);
        printChek(78.8, 67.0);
        printChek(5.0, 90.99);

        //test : 5.0, 90.99;
        System.out.println(test);
        verifyEquals(printChek(5.0, 90.99),
                "������              \n" +
                        "���� �� 1 ��           90.99\n" +
                        "���������� ������      5.0\n" +
                        "______________________________\n" +
                        "����� � ������  454  ��� 94 ���");


        printTask(10);
        countZP(5.5, 1000.0);
        System.out.println(test);
        //test:5.5, 1000.0;
        verifyEquals(countZP(6.5, 1000.0),
                "������� �� 6.5 ����� � ���� 20 ������� ���� � �����, \n" +
                        "��� ������ ����� 1000 ��� 0 ��� � ��� \n" +
                        "���������� ����� �������� - 130000 ��� 0 ���.");


        printTask(11);
        System.out.println("���� 2022                      ");
        printVedomost("�������� ����� ��������", 70000.00);
        printVedomost("���������� ���� ��������",128059.00);
        System.out.println(test);
        //test:"Ivan Ivanovich Ivanov", 56000.0;
        verifyEquals(printVedomost("Ivan Ivanovich Ivanov", 56000.0),
                "Ivan Ivanovich Ivanov        56000 ��� 0���");

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
        verifyEquals(countHappyNum(0000), "���� ���������� ����� - 0");
        verifyEquals(countHappyNum(2020), "���� ���������� ����� - 4");
        verifyEquals(countHappyNum(1999), "���� ���������� ����� - 1");
        verifyEquals(countHappyNum(1939), "���� ���������� ����� - 4");
        verifyEquals(countHappyNum(1919), "���� ���������� ����� - 2");
        verifyEquals(countHappyNum(1935), "���� ���������� ����� - 9");

        printTask(14);
        diffBetweenAverageAndMedian(3,90, 8 );
        diffBetweenAverageAndMedian(3,6,4);
        System.out.println(test);
        //test: 1,1,1; 10,90,3; 0,0,0; -1;2;3
        verifyEquals(diffBetweenAverageAndMedian(1,1,1), "������� �������� = 1, ������� = 1.");
        verifyEquals(diffBetweenAverageAndMedian(10,90,3), "������� �������� 34 ���������� �� ������� 10 �� 24");
        verifyEquals(diffBetweenAverageAndMedian(0,0,0), "������� �������� = 0, ������� = 0.");
        verifyEquals(diffBetweenAverageAndMedian(-1,2,3), "������� �������� = 1, ������� = 2.");

        printTask(15);
        roundPay(34.99);
        roundPay(35.00);

        System.out.println(test);
        //test:78.0000
        verifyEquals(roundPay(78.000), "78 ��� 0���.");

        printTask(16);
        okruglToBig(1,2,3);
        System.out.println(test);
        //test:1,1,1; 0,0,0
        //verifyEquals(,);


        printTask(17);


        printTask(18);
        roundPow(2);

        printTask(19);
      rnd();







        printTask(20);
        leap(2009);
        System.out.println(test);
        //test:1508; 2000;
        verifyEquals(false, false);
        verifyEquals(true, true);








    }
}
