package hwSergey.hw7_2;

public class Employee7_2 {
//Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день.
// Все поля сделать приватными и для каждого поля добавить методы set и get.
// Класс должен иметь метод - getSalary(Month[] monthArray),
// метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.

    private String name;
    private int age;
    private char gender;
    private double salary;

    public Employee7_2(String name, int age, char gender, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    public  double getSalary(Month[] monthArray){
        double result = 0;
        for (int i = 0; i < monthArray.length; i++) {
            result += monthArray[i].getWorkDays() * getSalary();
        }
        return result;
    }





}
