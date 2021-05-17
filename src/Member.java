class Member {
    String name;
    int age;
    String number;
    String address;
    int salary;

    public void printSalary(){
        System.out.println(salary);
    }

}
class Employee extends Member{
    String specialization;
}

class Manager extends Member{
    String department;
}

class Ans{
    public static void main(String[]args) {
        Employee e = new Employee();
        e.name = "rebecca";
        e.age = 25;
        e.number = "0274968998";
        e.address = "abcdef";
        e.salary = 500000;
        e.specialization = "blah";
    }
    {
        Manager m = new Manager();
        m.name = "john";
        m.age = 78;
        m.number="043872139";
        m.address = "khgi";
        m.salary= 76543;
        m.specialization = "boss";
    }
}