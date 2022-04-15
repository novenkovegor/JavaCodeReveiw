package hwSergey.hw7_1;

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

        Employee7_2 employee7_2 = new Employee7_2("Helen", 60, 'Ж', 5900);
        Month[] arrOfJanFebr = new Month[]{
                new Month("January", 31, 24),
                new Month("February", 28, 22)
        };

        System.out.println(employee7_2.getSalary(arrOfJanFebr));

        Worker[] workers = {worker7_1, manager1, director};//полиморфизм 8 лекция
        System.out.println(EmployeeUtils.salarySum(workers) + " ---");//посчитает сумму всех, независимо от класса

        Worker worker7_6 = manager1;
        Worker worker7_7 = director;
        Worker[] workers1 = {worker7_6, worker7_7, worker7_1};//можно сузить высшие классы до родительского
        System.out.println(worker7_1.getSalary()); //все равно методы считают зп в зависимости от класса
        System.out.println(worker7_6.getSalary());
        Manager[] arrManagers1 = new Manager[]{manager1, director};

        System.out.println(EmployeeUtils.minSubordinates(arrManagers1).getName());









}
}
