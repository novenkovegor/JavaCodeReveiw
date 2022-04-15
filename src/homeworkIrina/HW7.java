package homeworkIrina;

import java.util.Arrays;

public class HW7 {

    //18.Написать метод,
    // который принимает на вход массив int, и возвращает среднее значение.
    // Проверить работу метода тестом, если параметр - массив catsAges
    public static double getAvarage1(int[] a){
        int sum1 = 0;
        for(int i = 0; i < a.length; i++){
            sum1 = sum1 + a[i];
        }System.out.println(sum1 / a.length+"18");
        return sum1 / a.length;
    }


//21. Создать метод, который принимает на вход массив int,  и возвращает минимальное значение,
// максимальное значение и среднее значение всех чисел массива.
// Проверить работу метода на массиве из задания 20.
    public static int getMinValueOfArray(int[] x) {
        int min = 0;
        for (int i = 0; i < x.length; i++) {
            if (min > x[i]) {
                min = x[i];
            }
        }   return min;
    }

    public static int getMaxValueOfArray(int[] x) {
        int max = 0;
        for (int i = 0; i < x.length; i++) {
            if (max < x[i]) {
                max = x[i];

            }
        }  return max;
    }
    public static int getAverageValueOfArray(int[] x){
        int sum = 0;
        for(int i = 0; i < x.length; i++){
            sum = sum + x[i];
        }
        return sum / x.length;
    }


    public static void main(String[] args){



//Создать массив catsNames, заполнить его любыми значениями (см картинку котов из презентации).
//В массиве catsNames изменить значение элемента с индексом 4 на “Рыжик”,
// а значение элемента с индексом 1 на “Черныш”.
//Создать массив catsColors и заполнить его значениями.
//Создать массив catsAges и заполнить его любыми значениями.
//Создать массив isCatRed и заполнить его соответствующими значениями

    //1.
        String[] catsName = new String[]{"Мурзик", "Мурка", "Васька", "Рыжик", "Черныш", "Дымка", "Патрик", "Зорро"};
        System.out.println(Arrays.toString(catsName));


    //2.
        catsName[4] = "Рыжик";
        catsName[1] = "Черныш";
        System.out.println(catsName[4]);
        System.out.println(catsName[1]);
     //3.
        String[] catsColor = new String[]{"Grey", "Black", "Grey", "Brown", "Red", "Grey", "Red", "Grey"};
        System.out.println(Arrays.toString(catsColor));
    //4.
        int[] catsAge = {1,2,6,3,9,15,2,3};
        System.out.println(getAvarage1(catsAge) + "18");
        System.out.println(Arrays.toString(catsAge));
    //5.
        boolean[] isCatRed = new boolean[]{false, false, false, false, true, false, true, false};
        System.out.println(Arrays.toString(isCatRed));
        System.out.println("-----------------6---------------------");
    //6.Распечатать для массивов catsNames и catsColors:
        //имя кота в коробке с номером 6
        System.out.println(catsName[5] + "   5. имя кота в коробке с номером 6");
        //имена котов из коробок с четными индексами
        for (int i = 0; i < catsName.length; i++) {
            if (i % 2 == 0) {
                System.out.println(catsName[i] + "  5.имена котов из коробок с четными индексами");

            }
        }
        System.out.println("-------------6-------------------------");

        //имена котов из коробок, чьи индексы кратны 4
        for (int i = 0; i < catsName.length; i++) {
            if (i % 4 == 0) {
                System.out.println(catsName[i] + "  имена котов из коробок, чьи индексы кратны 4");

            }
        }
        System.out.println("-----------------6---------------------");

        //цвет котов из коробок с нечетными индексами
        for (int i = 0; i < catsColor.length; i++) {
            if (i % 2 != 0) {
                System.out.println(catsColor[i] + "   цвет котов из коробок с нечетными индексами");

            }
        }
        System.out.println("----------------6----------------------");

        //цвет котов из коробок, чьи индексы кратны 3
        for (int i = 0; i < catsColor.length; i++) {
            if (i % 3 == 0) {
                System.out.println(catsColor[i] + "   цвет котов из коробок, чьи индексы кратны 3");

            }
        }
        System.out.println("----------------7----------------------");

        //7.Распечатать “Накорми кота!” для всех серых котов
        for (int i = 0; i < catsColor.length; i++) {
            if (catsColor[i] == "Grey") {
                System.out.println("Накорми кота!");

            }
        }
        System.out.println("-----------------8---------------------");

        //8.Распечатать “Отнеси кота на прививку!”, если возраст кота меньше 2 лет
        for (int i = 0; i < catsAge.length; i++) {
            if (catsAge[i] <= 2) {
                System.out.println("Отнеси кота на прививку!");

            }
        }

        System.out.println("----------------9----------------------");

        //9.Для кота в последней коробке распечатать имя, цвет, возраст
        System.out.println(catsName[catsName.length-1]);
        System.out.println(catsColor[catsColor.length-1]);
        System.out.println(catsAge[catsAge.length-1]);

        System.out.println("----------------10-------------------");

        //10.Распечатать имена всех котов, чей возраст больше 2 лет
        for (int i = 0; i < catsAge.length; i++) {
            if (catsAge[i] > 2) {
                System.out.println(catsName[i]);
            }
        }

        System.out.println("----------------11-------------------");
       //11. Распечатать “Накорми кота!” если имя кота “Рыжик” и значение isCatRed == true
        for(int i = 0; i < catsName.length; i++){
            if(catsName[i] == "Рыжик"){
                if(isCatRed[i] == true){
                    System.out.println("Накорми кота под индексом " + i);
                }
            }
        }
        System.out.println("----------------12-------------------");
        //12.Распечатать средний возраст котов из массива catsAges
        int sum = 0;
        for(int i = 0; i < catsAge.length; i++){
            sum = sum + catsAge[i];
        }System.out.println(sum / catsAge.length);

        //13.Распечатать возраст самого молодого кота
        System.out.println("----------------13-------------------");
        int min = catsAge[0];
        for (int i = 0; i < catsAge.length; i++) {
            if (min > catsAge[i]) {
                min = catsAge[i];

            }
        }
        System.out.println(min);



       //14. Распечатать возраст самого старого кота
        System.out.println("----------------14-------------------");
        int max = catsAge[0];
        for (int i = 0; i < catsAge.length; i++) {
            if (max < catsAge[i]) {
                max = catsAge[i];

            }
        }
        System.out.println(max);

        //15.Распечатать количество серых котов
        System.out.println("----------------15-------------------");

        int count = 0;
        for (int i = 0; i < catsColor.length; i++){
            if (catsColor[i] == "Grey") {
                count = count + 1;
            }
        }
        System.out.println(count);

        System.out.println("----------------16-------------------");
        //16.Распечатать имя кота, если кот находится в коробке с четным индексом и его возраст не больше 3 лет
        for (int i = 0; i < catsAge.length; i++) {
            if(i % 2 == 0) {
                if (catsAge[i] < 4) {
                    System.out.println(catsName[i]);
                }
            }
        }

        System.out.println("----------------17-------------------");
        //17.Создать массив четных положительных чисел, значения которых не больше 10.
        // (заполняем значения с помощью цикла for)

        int lenght = 0;
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                lenght++;
            }
        }
        int[] array = new int[lenght];

        for (int i = 0, j = 0; i <= 10; i++) {

            if (i % 2 == 0) {
                array[j] = i;
                j++;
            }
        }

        System.out.println(Arrays.toString(array));

        System.out.println("----------------18-------------------");
        //18.Написать метод,
        // который принимает на вход массив int, и возвращает среднее значение.
        // Проверить работу метода тестом, если параметр - массив catsAges

        getAvarage1(catsAge);

        System.out.println("----------------19-------------------");
        //19.Создать массив нечетных отрицательных чисел в промежутке от -1000 до -900
        int lenght1 = 0;
        for (int i = -900; i > -1001; i--) {
            if (i % 2 != 0) {
                lenght1++;
            }
        }
        int[] b = new int[lenght1];
        for (int i = -900, j = 0; i > -1001; i--) {

            if (i % 2 != 0) {
                b[j] = i;
                j++;
            }
        }
        System.out.println(Arrays.toString(b));

        System.out.println("----------------20-------------------");
        //20.Создать массив из 10 случайных положительных целых чисел
        int numOdd = 0;
        int[] array20 = new int[10];
        for (int i = 0; i < array20.length; i++) {
            array20[i] = Math.abs((int) (Math.random() * Integer.MAX_VALUE));// почему умножение на 10 или на 100 или без
            System.out.println(array20[i]);

            if (array20[i] % 2 != 0) {
                numOdd++;
            }
        }
        int n = 10;
        int[] arrOdd = new int [numOdd];
        int[] arrEven = new int [n - numOdd];

       for(int i = 0, j = 0; i < n || j < numOdd; i++ ){
           if(array20[i] % 2 != 0){
               arrOdd[j]=array[i];
               j++;
           }
       }
        for(int i = 0, j = 0; i < n || j < (n-numOdd); i++ ){
            if(array20[i] % 2 == 0){
                arrEven[j]=array[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(arrEven));
        System.out.println(Arrays.toString(arrOdd));













        System.out.println("----------------21-------------------");

        getMinValueOfArray(array20);
        System.out.println(getMinValueOfArray(array20));
        getMaxValueOfArray(array20);
        System.out.println(getMaxValueOfArray(array20));
        getAverageValueOfArray(array20);
        System.out.println(getAverageValueOfArray(array20));

        System.out.println("----------------22-------------------");
        //22.Создать массив четных чисел и массив нечетных чисел из элементов массива из задания 20.










        System.out.println("----------------23-------------------");
        //23.Создать двумерный массив, который состоит из имен, возрастов, цветов котов:

        String [][] cats = {{"Мурзик", "Мурка", "Васька", "Рыжик", "Черныш", "Дымка", "Патрик", "Зорро"},
                {"1","2","6","3","9","15","2","3"},{"Grey", "Black", "Grey", "Brown", "Red", "Grey", "Red", "Grey"}};

                System.out.println(Arrays.deepToString(cats));
                //Распечатать все данные котов в коробках с четными индексами, используя двумерный массив.
        for (int i = 0; i < cats.length; i++) {
            for (int j = 0; j < cats[i].length; j++) {
                if(i % 2 == 0 ||  j % 2 == 0) {
                    System.out.print(cats[i][j] + "  ");
                }
            }
        }
        System.out.println();

        System.out.println("----------------24-------------------");
        //24.Создать двумерный массив целых случайных чисел от 1 до 10 размерности 4*8.
        int[][] array24 = new int[4][8];
        for (int i = 0; i < array24.length; i++) {
            for (int j = 0; j < array24[i].length; j++) {
                array24[i][j] = ((int) (Math.random() * 10));
            }
        }
        System.out.println(Arrays.deepToString(array24));

        System.out.println("----------------25-------------------");
        //25.Вывести сумму всех четных чисел массива из задания 24.

        int summ = 0;
        for (int i = 0; i < array24.length; i++) {
            for (int j = 0; j < array24[i].length; j++) {
                if (array24[i][j] % 2 == 0) {
                    summ += Math.abs(array24[i][j]);
                }
            }
        }
        System.out.println(summ);



























































    }
}
