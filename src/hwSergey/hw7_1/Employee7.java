package hwSergey.hw7_1;

//���������� ������� ����� Employee �� ���������� ��������:
//getBaseSalary - �������� ������� ������
//setBaseSalary
//getName - �������� ���
//setName
//getSalary - �������� ��������

public class Employee7 extends EmployeeUtils {


    private String name;//����

    private int  baseSalary;


    public Employee7(String name, int baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;//�����������
    }
    public String getObject(){
        return this.name + " " + this.baseSalary;
    }

    public String getName() {//������, ������� ��� ������� � �����,�� ��� private
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }
































}
