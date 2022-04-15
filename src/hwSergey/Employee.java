package hwSergey;

public class Employee {
    String name;
    String gender;
    int age;
    double salary;
    Employee(String name, int age, String gender, double salary){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary; //это конструктор
    }

    boolean isSameName(Employee employee) {
        if (name.equals(employee.name)) {
            return true;
        }else {
            return false;
        }
    }
}




