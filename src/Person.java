public class Person {

    //Constructor is a block of code that initializes the newly created object
    //default constructor - doesn't have anything inside this method - This is supplied by java if not mentioned
    Person(){

    }
    //Over Loaded constructors - These are user defined constructors which is used to set some values to the properties of the object when it is created.
    //constructor should be same as the class name  (Example : person(String pname,String pgender,String pcolor,int pheight,int page,int pweight) will not work )
    Person(String pname,String pgender,String pcolor,int pheight,int page,int pweight){ //These are the values that will be passed while creating this object.
        name=pname; //Setting the pname from the main class to the instance variable name
        gender=pgender;  //Setting the pgender from the main class to the instance variable gender
        color=pcolor; //Setting the pcolor from the main class to the instance variable color
        height=pheight;  //Setting the pheight from the main class to the instance variable height
        age=page; //Setting the page from the main class to the instance variable age
        weight=pweight; //Setting the pweight from the main class to the instance variable weight
        //This constructor method is used to set all the values for the properties of Person while creating the object

    }

    int height;
    int age;
    String name;
    String gender;
    int weight;
    String color;

    public void run(){
        System.out.println("I can run ");
    }
    public void walk(){
        System.out.println("I can walk ");
    }
    public void sleep(){
        System.out.println("I can sleep ");
    }
    public void talk(){
        System.out.println("I can talk ");
    }
    public void eat (){
        System.out.println("I can eat ");
    }

    //Static method that can be called without requiring an object
    static void staticmethod(){
        System.out.println("Am a static method ");
    }

    //to print out the values of the person
    public void printPerson(){
        System.out.printf("Name is %s ,age is %d,gender is %s,weight is %d,color is %s,height is %d\n",name,age,gender,weight,color,height);
    }
}

