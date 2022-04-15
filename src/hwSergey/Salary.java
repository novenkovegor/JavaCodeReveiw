package hwSergey;

public class Salary {

    public double getSum(Employee[] employeesArray){
        double res = 0;
        for (int i = 0; i < employeesArray.length; i++){
            res= res + employeesArray[i].salary;
        }
        return res;
    }

}
