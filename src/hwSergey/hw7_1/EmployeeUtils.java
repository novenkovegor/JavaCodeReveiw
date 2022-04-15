package hwSergey.hw7_1;

//поиск сотрудника в массиве по его имени
//поиск сотрудника в массиве по вхождению указанной строки в его имени
//подсчет зарплатного бюджета для всех сотрудников в массиве
//поиск наименьшей зарплаты в массиве
//поиск наибольшей зарплаты в массиве
//поиск наименьшего количества подчиненных в массиве менеджеров
//поиск наибольшего количества подчиненных в массиве менеджеров
//поиск наибольшей надбавки (разнице между базовой зарплатой и выплатой) в массиве менеджеров
//поиск наименьшей надбавки (разнице между базовой ставки и зарплатой) в массиве менеджеров

public class EmployeeUtils {

    public static Worker findWorker(Worker[] workers, String nameOfWorker) {

        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getName().equals(nameOfWorker)) {
                return workers[i];
            }
        }
        return null;
    }


    public static Worker findWorkerBySubName(Worker[] workers, String subName) {

        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getName().contains(subName)) {
                System.out.println(workers[i].getName() + " содержит " + subName);
                return workers[i];
            }
        }
        return null;
    }
    public static int salarySum(Worker[] workers) {
        int sum = 0;
        for (int i = 0; i < workers.length; i++) {
            sum += workers[i].getSalary();
        }
        return sum;
    }
    //поиск наименьшей зарплаты в массиве
    public static int minSalary(Worker[] workers) {
        int min = 0;
        for (int i = 0; i < workers.length; i++) {
            if(min == 0 || min > workers[i].getSalary()){ //чтобы не получить ноль
                min = workers[i].getSalary();
            }
        }
        return min;
    }
    public static int maxSalary(Worker[] workers) {
        int max = 0;
        for (int i = 0; i < workers.length; i++) {
            if(max < workers[i].getSalary()){
                max = workers[i].getSalary();
            }
        }
        return max;
    }
    //поиск наименьшего количества подчиненных в массиве менеджеров
    public static Manager minSubordinates(Manager[] arrManagers) {
        Manager min = null;
        for (int i = 0; i < arrManagers.length; i++) {
            if(min == null|| min.getNumberOfSubordinates() > arrManagers[i].getNumberOfSubordinates()){ //чтобы не получить ноль
                min = arrManagers[i];
            }
        }
        return min;
    }public static int minSalary(Manager[] arrManagers) {
     int minSalaryManager = 0;
     for (int i = 0; i < arrManagers.length; i++) {
         if(minSalaryManager == 0 || minSalaryManager > arrManagers[i].getSalary()){ //чтобы не получить ноль
             minSalaryManager = arrManagers[i].getSalary();
         }
     }
     return minSalaryManager;
 }
    public static int maxSalary(Manager[] arrManagers) {
        int maxSalaryManager = 0;
        for (int i = 0; i < arrManagers.length; i++) {
            if(maxSalaryManager < arrManagers[i].getSalary()){
                maxSalaryManager = arrManagers[i].getSalary();
            }
        }
        return maxSalaryManager;
    }
    public static int maxSubordinates(Manager[] arrManagers) {
        int max = 0;
        for (int i = 0; i < arrManagers.length; i++) {
            if( max < arrManagers[i].getNumberOfSubordinates()){
                max = arrManagers[i].getNumberOfSubordinates();
            }
        }
        return max;
    }
 //   поиск наибольшей надбавки (разнице между базовой зарплатой и выплатой) в массиве менеджеров
//поиск наименьшей надбавки (разнице между базовой ставки и зарплатой) в массиве менеджеров

    public static int minBaseSalary(Manager[] arrManagers) {
        int minBaseSalaryManager = 0;
        for (int i = 0; i < arrManagers.length; i++) {
            if(minBaseSalaryManager == 0 || minBaseSalaryManager > arrManagers[i].getSalary()){ //чтобы не получить ноль
                minBaseSalaryManager = arrManagers[i].getBaseSalary();
            }
        }
        return minBaseSalaryManager;
    }
    public static int maxBaseSalary(Manager[] arrManagers) {
        int maxBaseSalaryManager = 0;
        for (int i = 0; i < arrManagers.length; i++) {
            if(maxBaseSalaryManager < arrManagers[i].getBaseSalary()){
                maxBaseSalaryManager = arrManagers[i].getBaseSalary();
            }
        }
        return maxBaseSalaryManager;
    }
    public static int maxDifSalaryBaseSalary(Manager[] arrManagers) {
        int dif = Math.abs(EmployeeUtils.maxSalary(arrManagers) - EmployeeUtils.minBaseSalary(arrManagers));
         return dif;
     }
    public static int minDifSalaryBaseSalary(Manager[] arrManagers) {
        int dif1 = Math.abs(EmployeeUtils.minSalary(arrManagers) - EmployeeUtils.maxBaseSalary(arrManagers));
        return dif1;
    }
 }














