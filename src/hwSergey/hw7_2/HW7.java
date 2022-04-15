package hwSergey.hw7_2;

import hwSergey.hw7_1.Director;
import hwSergey.hw7_1.EmployeeUtils;
import hwSergey.hw7_1.Manager;
import hwSergey.hw7_1.Worker;
import hwSergey.hw7_2.Employee7_2;
import hwSergey.hw7_2.Month;

public class HW7 {
    public static void main(String[] args) {




         Worker worker7_1 = new  Worker("Alex", 3500);
         Worker worker7_2 = new  Worker("Serg", 3500);
         Worker worker7_3 = new  Worker("Vova", 4000);
         Worker worker7_4 = new  Worker("Greg", 6000);
         Worker worker7_5 = new  Worker("Petr", 1900);

         Worker[] arrWorkers = new  Worker[]{worker7_1,worker7_2, worker7_3, worker7_4, worker7_5};

        System.out.println(EmployeeUtils.findWorker(arrWorkers, "Vova"));
        EmployeeUtils.findWorkerBySubName(arrWorkers, "Vo");
        System.out.println(EmployeeUtils.salarySum(arrWorkers));
        System.out.println(EmployeeUtils.minSalary(arrWorkers));
        System.out.println(EmployeeUtils.maxSalary(arrWorkers));


        Manager manager1 = new Manager("Petra",9000, 9);
        Manager manager2 = new Manager("Pit",8800, 13);
        Manager manager3 = new Manager("Pa",5800, 3);
        System.out.println(manager1.getSalary());

        Manager[] arrManagers = new Manager[]{manager1, manager2, manager3};

        System.out.println(EmployeeUtils.minSubordinates(arrManagers));
        System.out.println(EmployeeUtils.maxSubordinates(arrManagers));

        System.out.println(EmployeeUtils.maxBaseSalary(arrManagers));
        System.out.println(EmployeeUtils.minBaseSalary(arrManagers));
        System.out.println(EmployeeUtils.minSalary(arrManagers));
        System.out.println(EmployeeUtils.maxSalary(arrManagers));
        System.out.println(EmployeeUtils.maxDifSalaryBaseSalary(arrManagers));
        System.out.println(EmployeeUtils.minDifSalaryBaseSalary(arrManagers));




        Director director = new Director("Ted", 100000, 100);

        Employee7_2 employee7_2 = new Employee7_2("Helen", 60, 'Æ', 5900);
        Month[] arrOfJanFebr = new Month[]{
                new Month("January", 31, 24),
                new Month("February", 28, 22)
        };

        System.out.println(employee7_2.getSalary(arrOfJanFebr));

        hwSergey.hw7_2.Manager manager = new hwSergey.hw7_2.Manager("Ira", 45, 'Æ', 5600, 5);
        System.out.println(manager.getSalary(arrOfJanFebr));








}
}
