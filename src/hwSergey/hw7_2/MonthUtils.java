package hwSergey.hw7_2;

import hwSergey.hw7_2.Month;

public class MonthUtils {

private static Month[] MONTH_ARRAY = {
        new Month("January", 31, 24),
        new Month("February", 28, 22),
        new Month("March", 31, 25),
        new Month("April", 30, 23)
    };

public static Month[] getMonthArray(){    //���� ����� ���������� ��������� � � ������, ���� ������� �������� ��������, �� ���� ������ ����� �����������
    return MONTH_ARRAY;
}

    public static Month[] getMonthArray1() { // ���������� ����� ���������� ������, � ��������� �������� ���������� � ��� �������� ������ ������� ��� ��������� � �������
        return new Month[]{
                new Month("January", 31, 24),
                new Month("February", 28, 22),
                new Month("March", 31, 25),
                new Month("April", 30, 23)
        };
    }
        //����� �� ��������� ����� �������� ������� ��� ������-������� ���������� ����� �� ������� � ������������ ������ �������(���-�� �������)
      public static Month getMonth(int index) {
            return MONTH_ARRAY[index];
      }
    public static int getMonthSize() {
        return MONTH_ARRAY.length;
    }



}
