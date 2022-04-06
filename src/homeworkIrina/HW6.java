package homeworkIrina;

public class HW6 {
    //10.�������� �����, ������� ���������
    // �� ���� ��������� start,  end, step, � �������� ������������������
    // ����������  �����, ������� � ����� start, � ����� step.
    // ����� ������ �� ����� - ����� end.
    public static void print10(double end, double start, double step){
        for ( double i = start; i < end; i += step){
            System.out.println(i + "-----10-----");
        }
    }

    //11.�������� �����, ������� ��������� ��������  � ��������
    // ������������������ ������ ����� �� ����. ����� ������������������ = l.
    public static void print0toL(int l) {
        int end = 0;
        for (int i = 0; end < l; i+=2) {
                    System.out.println(i + "----11-----");
                    end++;
                }
            }

//12/�������� �����, ������� ��������� ����� ����� n, � ������� ��� ������� ����� 2 �� 1 �� n ������������
//    public static void print12(int n) {
//        int end = 0;
//        for (int i = 0; end < n; i) {
//            if(i ){
//                System.out.println(i + "----12-----");
//            }
//        }
//
//    }
    //16.�������� �����, ������� ��������� ��������� n, m, , � �������� ������������������
    // �������� ����� ������� � ����� n, � ����� m,  ����� ������������������  l.
    public static void print16(int n, int m, int l){
        int end1 = 0;
        for (int i = n; end1 < l;i += m){
            if(i % 2 != 0){
                System.out.println(i+ "----16-----");
                end1++;
            }
        }
    }

    //17.������������ � ������������ ������������������ �� �������:
    //n + 1 = n + 2
    public static void print17(int n) {
        for (int i = n; ; i += 2) { //�����������
            System.out.println(i);
        }
    }
    //18.�������� �����, ������� ��������� ��������� , n, � �������� ������������������ �����,
    // ������� � ����� n, �� ������� ��� n + 1 ����� ������������������:
    //n + 1 = 2n
    //����� ������������������ l .
    public static void print18(int n, int l ) {
        for ( int i = n; i < l; i *= 2) {
            System.out.println(i);
        }
    }


    public static void main(String[] args) {

       print0toL(10);
        print16(6,9,8);
        print10(7.9,1.0,2.0);
      //  print17(2);
        System.out.println("----");
        print18(1,8);
        //1.����������� ������������������ ����� �� 0 �� 9 ������������.

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        //2.����������� ������������������ ����� �� 10 ������������� �� 0 ������������.
        for (int i = 9; i >= 0; i--) {
            System.out.println(i);
        }
        //3.����������� ������������������ ����� �� 50 �� 55 ������������ � ����� 2.
        for (int i = 50; i < 56; i += 2) {
            System.out.println(i);
        }
        //4.����������� ������������������ �����, ������� 7, � ���������� (327, 300)
        for (int i = 327; i >= 300; i--) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }

        // 5.����������� ������������������ ����� � ���������� [12, 13] � ����� 0.1
        for (double i = 12; i < 14; i += 0.1) {
            System.out.println( i);
        }
        //6.����������� ������������������ ������ ����� �� 215 �� 237 ������������
        for (int i = 215; i < 238; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        //7. ����������� ������������������ �����,
        // ������� 7, � ���������� �� 7 ������������� �� 14 �������������.
        int a = 0;
        for (int i = 8; i < 14; i++) {

            if (i % 7 == 0) {
                System.out.println(i);
                a = 1;
            }
        }
        if (a == 0) {
            System.out.println("����� ����� ���");
        }
        //8.����������� ������������������ ������� ���������� � ������������
        // �������� ���� ������ short � ������������� ������������ ��������� short.
        // ����� � ������������������ ������ ���� ������ 15001.

        for (short i = Short.MIN_VALUE; i < Short.MAX_VALUE; i++) {
            if (i % 15001 == 0) {
                System.out.println(i);
            }
        }

        //9.����������� ������������������ ����� � ���������� �� -10 �� 34 ������������.
        // �����, ������� 11, ������ ���� ����������� ����� ������.
        // �����, ������� 12, ������ ���� ����������� ������� ������.
        // � ���� ���������� ����������� ������ ZERO.
        System.out.println("___________9_______________");
        for (int i = -10; i < 35; i++) {

            if (i % 11 == 0) {
                System.out.println("\u001B[34m" + i + "\u001B[0m");

            }
            if (i % 12 == 0) {
                System.out.println("\u001B[31m" + i + "\u001B[0m");
            }
            if (i == 0) {
                System.out.println("ZERO");
            }
        }


        //13.������� ������������������ 012345678900112233445566778899000�
        // �� ����� 9999 ������������.
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("" + i + i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("" + i + i + i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("" + i + i + i + i);
        }
       // 14.������������ ������������������ �����:
        //0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5
        for (int i = 0; i >= -5; i--){
            System.out.println(i * -1);
            System.out.println(i);
        }

        //15.����������� ������������������ �����: 0, 3, 5, 6, 9, 10, 12, 15, 18, 20, 21, 24, 25
        for (int i = 0; i < 26; i ++){
            if (i % 5 == 0 || i % 3 ==0){
                System.out.println(i);
            }
        }


        //19/������������ ������������������ ����� �������������  ���������� �����, � ������� �������
        // ����� ������ ������ (�������) � ������ ������ (�������) �� ��������� 3.
        //20



        String bottles = " bottles of beer";
        String bottle = " bottle of beer";
        String wall = " on the wall";
        String take = "Take one down and pass it around";
        String commaSpace = ", ";
        String dot = ".";
        String go = "Go to the store and buy some more";
        String noMoreC = "No more";
        String noMoreL = "no more";
        String ln = "\n";













    }
}


//







