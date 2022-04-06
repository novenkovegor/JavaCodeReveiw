package hwSergey;

import java.util.Arrays;

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
        for (int i = 0;i < array2.length; i++){
            if(max < array2[i]){
                max = array2[i];
            }
            System.out.println(max);
            System.out.println("-----");
            System.out.println(array2[i]-1);
        }
        //4/необходимо вывести среднее арифметическое всех значений массива.
        int[] array3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int average = 0;
        int sum1 = 0;
        for(int i = 0; i < array3.length; i++){
            sum1 += array3[i];
            average = sum1 / array3.length;
        }
        System.out.println(average);

        //5/необходимо вывести сумму элементов массива.
        int[][] arrays4 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        System.out.println(Arrays.toString(arrays4));//выводит 4 ссылки на одномерные массивы
        System.out.println(Arrays.deepToString(arrays4));//ыводит все элементы 2х мерного массива
        int sum2 = 0;
        for(int i = 0; i < arrays4.length;i++ ){ //идет по 1 массиву двум массива,[0][] индекс,
            for(int j =0; j < arrays4[i].length; j++){ // заходит в столбик j, [0][0],[0][1],
                // идет по первой строчке в каждую ячейку, затем выходит из вложенного цикла
        // меняет значение i +1, снова заходит в строчку и меняет j до конца строчки.
                sum2 = sum2 + Math.abs(arrays4[i][j]);
            }
        }
        System.out.println(sum2);

        //6/необходимо вывести максимальное значение массива.
        int max1 = 0;
        for(int i = 0; i < arrays4.length; i++){
            for(int j = 0; j < arrays4[i].length; j++){
                if(max1 < arrays4[i][j]){
                    max1 = arrays4[i][j];
                    //System.out.println("---" + i + j);//печатает все индексы двумерного массива

                }
            }
        }
        System.out.println(max1);



        //7/необходимо вывести количество элементов в массиве.
        int length = 0;

        for(int i = 0;i < arrays4.length; i++){
            for (int j = 0; j < arrays4[i].length; j++){
                length++;
            }
        }
        System.out.println(length);

//
//        //8/индексы мин и макс значений
//        if (arrays4[i][j] == max1){
//
//        }
//        else i=i+1;







        }







































    }














































