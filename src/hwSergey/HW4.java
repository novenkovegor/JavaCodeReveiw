package hwSergey;

import java.util.Arrays;
import java.util.Locale;

public class HW4 {
    public static void main(String[] args) {
        //1/необходимо вывести сумму всех значений массива.
        int sum = 0;
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            System.out.println(i);//печать всех индексов массива
        }
        System.out.println(array);//выведет ссылку на массив
        System.out.println(array.toString());//метод выводит строку элементов одномерного массива
        System.out.println(sum);


        //2/необходимо вывести минимальное значение массива.
        int[] array1 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int min = array1[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array1[i]) {
                min = array1[i];
                System.out.println("---" + i);//печать индекса мин значения в одномерном массиве
            }
            System.out.println(min);
        }
        //3/необходимо вывести максимальное значение массива.

        int[] array2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int max = array2[0];
        for (int i = 0; i < array2.length; i++) {
            if (max < array2[i]) {
                max = array2[i];
            }
            System.out.println(max);
            System.out.println("-----");
            System.out.println(array2[i] - 1);
        }
        //4/необходимо вывести среднее арифметическое всех значений массива.
        int[] array3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int average = 0;
        int sum1 = 0;
        for (int i = 0; i < array3.length; i++) {
            sum1 += array3[i];
            average = sum1 / array3.length;
        }
        System.out.println(average);

        //5/необходимо вывести сумму элементов массива.
        int[][] arrays4 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        System.out.println(Arrays.toString(arrays4));//выводит 4 ссылки на одномерные массивы
        System.out.println(Arrays.deepToString(arrays4));//ыводит все элементы 2х мерного массива
        int sum2 = 0;
        for (int i = 0; i < arrays4.length; i++) { //идет по 1 массиву двум массива,[0][] индекс,
            for (int j = 0; j < arrays4[i].length; j++) { // заходит в столбик j, [0][0],[0][1],
                // идет по первой строчке в каждую ячейку, затем выходит из вложенного цикла
                // меняет значение i +1, снова заходит в строчку и меняет j до конца строчки.
                sum2 = sum2 + Math.abs(arrays4[i][j]);
            }
        }
        System.out.println(sum2);

        //6/необходимо вывести максимальное значение массива.
        int max1 = 0;
        for (int i = 0; i < arrays4.length; i++) {
            for (int j = 0; j < arrays4[i].length; j++) {
                if (max1 < arrays4[i][j]) {
                    max1 = arrays4[i][j];
                    //System.out.println("---" + i + j);//печатает все индексы двумерного массива

                }
            }
        }
        System.out.println(max1);


        //7/необходимо вывести количество элементов в массиве.
        int length = 0;

        for (int i = 0; i < arrays4.length; i++) {
            for (int j = 0; j < arrays4[i].length; j++) {
                length++;
            }
        }
        System.out.println(length);


//        int[][] arrays = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//
//        int[][] arr2 = new int[4][];
//        arr2[0] = new int[]{1, 2, 3, 4, 5};
//        arr2[1] = new int[]{6, 7, 8, 9};
//        arr2[2] = new int[]{-1, -2, -3, -4};
//        arr2[3] = new int[]{-5, -6};
//        System.out.println(arr2);
//        System.out.println(" " + arr2[0] + " " + arr2[0][0] + " " + arr2[0][1] + " " + arr2[0][2] + " " + arr2[0][3] + " " + arr2[0][4]);
//
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(Arrays.toString(arr2[0]));
//        System.out.println(arr2[0][0]);
//        System.out.println(Arrays.deepToString(arr2));
//        // Необходимо вывести сумму элементов массива.
//        // Необходимо вывести максимальное значение массива.
//
//        int sum1 = 0;
//        int
//                max1 = arrays[0][0],
//                min1 = arrays[0][0],
//                length = 0;
//
//
//        for (int i = 0; i < arrays.length; i++) {
//
//            for (int j = 0; j < arrays[i].length; j++) {
//                sum1 += Math.abs(arrays[i][j]);
//                if (max1 < arrays[i][j])
//                    max1 = arrays[i][j];
//
//                if (min1 > arrays[i][j])
//                    min1 = arrays[i][j];
//                length ++;
//            }
//
//        }
//        System.out.println("SUM =" + sum1);
//        System.out.println("MAX =" + max1);
//        System.out.println("MIN =" + min1);
//        System.out.println("length =" + length);
//        System.out.println("AVR =" + sum1 / length);

        //4.2 String

        //1.
        String s = "Перестановочный алгоритм быстрого действия";
        //необходимо вывести все буквы “о” из этой строки.
        //Для указанной строки ответ будет “ооооо” (или в столбик)
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'о') {
                System.out.println(s.charAt(i));
            }
        }

        //2.
        String s1 = "Перевыборы выбранного президента";
        //необходимо подсчитать количество букв “е” в строке.
        //Для указанной строки ответ будет 4.
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if(s.charAt(i) == 'е') {
                count= count + 1;
            }
        }
        System.out.println(count);


        //3.
        String s2 = "Посмотрите как Рите нравится ритм";
        //необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
        //Для указанной строки ответ будет 6, 15, 29.
        s2 = s2.toLowerCase();
        int index = s2.indexOf("рит");
        while (index != -1) {
            System.out.println(index);

            index = s2.indexOf("рит", index + 1);
        }




        //4.Дан массив:
        String[][] array4 = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        //необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.
        int counter = 0;
        for(int i = 0; i < array4.length; i++){
            for(int j = 0; j < array4[i].length; j++){
                if(!array4[i][j].contains("е")){
                    counter++;
                }
            }
        }
        System.out.println(counter);





    }

}































































































