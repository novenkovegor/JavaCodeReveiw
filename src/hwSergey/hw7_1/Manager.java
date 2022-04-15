package hwSergey.hw7_1;
//Ќеобходимо создать класс Manager в который нужно добавить следующие методы:
//getNumberOfSubordinates - получить количество подчиненных
//setNumberOfSubordinates
//
// в классе, метод getSalary будет возвращать значение по формуле
// - <базова€ ставка> * (<количество подчиненных> / 100 * 3). ≈сли количество подчиненных 0,
// то результат как у обычного рабочего.

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










