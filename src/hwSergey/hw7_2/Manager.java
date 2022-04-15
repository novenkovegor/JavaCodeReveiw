package hwSergey.hw7_2;

public class Manager {
    //Необходимо создать класс Manager с полями: имя, возраст, пол, ЗП в день и количество подчиненных.
    // Все поля сделать приватными и для каждого поля добавить методы set и get.
    // Класс должен иметь метод - getSalary(Month[] monthArray), метод возвращает зарплату за те месяцы которые были
    // переданы в качестве аргумента.
    //К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.
    private String name;
    private int age;
    private char gender;
    private double salary;
    private int countOfSubordinates;

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

    public void setCountOfSubordinates(int countOfSubordinates) {
        this.countOfSubordinates = countOfSubordinates;
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

    public int getCountOfSubordinates() {
        return countOfSubordinates;
    }

    public Manager(String name, int age, char gender, double salary, int countOfSubordinates) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.countOfSubordinates = countOfSubordinates;
    }

    public double getSalary(Month[] monthArray){
        int result = 0;
        for(int i = 0; i < monthArray.length; i++){
            result += monthArray[i].getWorkDays() * getSalary();
        }
        return  result;
    }
}
