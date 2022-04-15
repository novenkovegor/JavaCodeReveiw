package hwSergey.hw7_1;

public class Director extends Manager {
    public Director(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }

    public int getSalary(){
        if (getNumberOfSubordinates() == 0){
            return getBaseSalary();
        } else {
            return getBaseSalary() * getNumberOfSubordinates() / 100 * 9;
        }

    }
}
