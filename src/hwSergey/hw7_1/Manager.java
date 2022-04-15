package hwSergey.hw7_1;
//���������� ������� ����� Manager � ������� ����� �������� ��������� ������:
//getNumberOfSubordinates - �������� ���������� �����������
//setNumberOfSubordinates
//
// � ������, ����� getSalary ����� ���������� �������� �� �������
// - <������� ������> * (<���������� �����������> / 100 * 3). ���� ���������� ����������� 0,
// �� ��������� ��� � �������� ��������.

import hwSergey.hw7_1.Employee7;

public class Manager extends Worker {

    private int numberOfSubordinates;

    public Manager(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getSalary() {
        if (getNumberOfSubordinates() == 0) {
            return getBaseSalary();
        } else {
            return getBaseSalary() * getNumberOfSubordinates() / 100 * 3;

        }


    }
}










