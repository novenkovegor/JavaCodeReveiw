package hwSergey.hw7_2;

import hwSergey.hw7_2.Month;

public class MonthUtils {

private static Month[] MONTH_ARRAY = {
        new Month("January", 31, 24),
        new Month("February", 28, 22),
        new Month("March", 31, 25),
        new Month("April", 30, 23)
    };

public static Month[] getMonthArray(){    //этот метод возвращает константу и в случае, если пользов испортит значение, то весь массив будет перезаписан
    return MONTH_ARRAY;
}

    public static Month[] getMonthArray1() { // возвращает вновь созданнный массив, а константа остается неизменной и при создании нового массива все останется в порядке
        return new Month[]{
                new Month("January", 31, 24),
                new Month("February", 28, 22),
                new Month("March", 31, 25),
                new Month("April", 30, 23)
        };
    }
        //чтобы не возникало такой проблемы создаем два метода-который возвращает месяц по индексу и возвращающий размер массива(кол-во месяцев)
      public static Month getMonth(int index) {
            return MONTH_ARRAY[index];
      }
    public static int getMonthSize() {
        return MONTH_ARRAY.length;
    }



}
