package hwSergey.hw7_1;

//Ќеобходимо создать класс Employee со следующими методами:
//getBaseSalary - получить базовую ставку
//setBaseSalary
//getName - получить им€
//setName
//getSalary - получить зарплату

public class Employee7 extends EmployeeUtils {


    private String name;//пол€

    private int  baseSalary;


    public Employee7(String name, int baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;//конструктор
    }
    public String getObject(){
        return this.name + " " + this.baseSalary;
    }

    public String getName() {//сетеры, геттеры дл€ доступа к пол€м,тк они private
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
