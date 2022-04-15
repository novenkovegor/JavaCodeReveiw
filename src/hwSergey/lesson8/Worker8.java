package hwSergey.lesson8;

public class Worker8 extends Person8 {

    private int salary;

    public Worker8(String name, int age, char gender) {
        super(name, age, gender);
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String getName() {
        if (getGender() == 'Ì'){
            return "Mr. " + super.getName();
        } else{
            return "Mrs. " + super.getName();
        }
    }
}
