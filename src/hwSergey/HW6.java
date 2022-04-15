package hwSergey;

import javax.print.attribute.standard.JobName;

public class HW6 {

    // https://www.codewars.com/kata/577bd8d4ae2807c64b00045b/train/java задача 3 из 6.2



    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        boolean isFighterIsAttacker = firstAttacker.equals(fighter1.name);

        while (fighter1.health > 0 && fighter2.health > 0) {
            if (isFighterIsAttacker) {
                fighter2.health = fighter2.health - fighter1.damagePerAttack;
            } else {
                fighter1.health = fighter1.health - fighter2.damagePerAttack;
            }
            isFighterIsAttacker = !isFighterIsAttacker;
        }

        if (fighter1.health <= 0){
            return fighter2.name;
        } else {
            return fighter2.name;
        }


    }




    public static void main(String[] args) {
        Person person1 = new Person("Sergey", 45, "male");//создание обьекта
        person1.name = "Anna";
        person1.age = 30;
        person1.gender = "female";

        Person person2 = new Person("Anna", 34, "female");//создание обьекта
        person2.name = "Sergey";
        person2.age = 31;
        person2.gender = "male";

        Person[] personArray = {person1, person2};
        Person personMin = person1.getMinAge(personArray);

        System.out.println(personMin.getName());


       person1.printOject();//вызов метода из класса Person(из шаблона)
       person2.printOject();

       person1.getName();
       person2.getName();


        Employee[] employeesArray = new Employee[3];

       Employee employee1 = new Employee("Olga", 45, "female", 10000.50);//создали новый обьект и передаем
        // параметры конструктора
//        employee1.name = "Olga";
//        employee1.age = 45;
//        employee1.gender = "female";
//        employee1.salary = 100000.50;

        Employee employee2 = new Employee("Anton",30,"male",150000.00);
//        employee2.name = "Anton";
//        employee2.age = 30;
//        employee2.gender = "male";
//        employee2.salary = 150000.00;
        Employee employee3 = new Employee("Jane", 67, "female", 504500.00);
         employeesArray[0] = employee1;
         employeesArray[1] = employee2;
         employeesArray[2] = employee3;

         Salary salary = new Salary();
        System.out.println(salary.getSum(employeesArray));//сумма зарплат всех сотрудников из массива
        // переданного в качестве аргумента вызова метода. задача 2 из 6.1


        System.out.println(employee1.isSameName(employee3));// у сотрудника у которого был вызван метод и
        // сотрудника который был передан как параметр, одинаковое имя. задача 3 из 6.1

        Fighter fighter1 = new Fighter();
        Fighter fighter2 = new Fighter();
        fighter1.getFighter("Jon", 10, 8);
        fighter2.getFighter("Jin", 10, 9);






















    }




}
