package hwSergey;

public class Person {

    String name;//поля, значение  по умолчанию
    int age;
    String gender;
    String male;
    String female;
    void printOject(){
        if (name != null) {
            System.out.println(this.name);//обход ошибок с null
        }
        System.out.println(this.age);//this нужна чтобы работать с полем класса,
        // а не путать с переменной внутри метода
    }

    Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


   String getName(){

            if (gender.equals("male")) {
               return "Mr. " + this.name;
            } else {
                return "Mrs. " + this.name;
            }
    }

    Person getMinAge(Person[] arr){
        Person min = null;
        for (int i = 0; i < arr.length; i++){
            if (min == null || min.age > arr[i].age){
                min = arr[i];
            }
        }
        return min;
    }
}
