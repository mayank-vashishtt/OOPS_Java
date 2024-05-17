class oop1{

    // here we are stating on the oops concept in java  
    // in the class there is method and attributes

    // so oops run on a principle of abstaraction 
    // and there is 3 pillars in oops 
    // i.e. encapsulation , inheritance , polymorphism 


    // what is abstraction 
    // the concept to hide details 
    // representing code in terms of idea (anything for which we store information)

    //encapsulation 
    // holding the content together 
    // protecting them from external environment

    // object 
    // real instance of a class 
    // it occupies memory 
    // each object is independent of other object 

    // than there is a heap space 

    // Access Modifiers
    // 4 types -- public, private, protected, default 
    
    // security decrease down the table below 

    // private 
    // accessiable in the same class only 

    // default  
    // accessiable in same class, same folder and child class in the same folder 

    // protected 
    // accessiable in same class, same folder and child class in the same folder and in different folder '
    
    // public 
    // anywhere



    // construtor 
    // there are 2 types of constructor, one is deafult and other is parameterized or custom 


    // default constructor 
    // if we dont create our own constructor then java provides us the deafult one 
    // student s1 = new student(); 
    // only available if we dont have any custom constructor ()

    // custom construtor
    // intialises the object with default values of every attribute and then it starts executing the code written inside the constructor ()
    // student s2 = new student("mayank", 1);


    // inheritance is all about forming hierarchy
    // if user is the parent class of the student then we use extends user in the class student 
    // java doesnt support multiple inheritance

    // child class 
    // gets all the attribute and behviour from the parent class via extends 

    // if the student class has a custom constructor then by default it will not be able to call the custom constuctor of its parent 
    // we have to call the custom constructor of parent eplicitly using super() keyword

    // user can be student, mentor, instructor 
    // this is polymorphism 
    // user n(reference) = new (student/mentor/instructor)(); object
    // object of any child class can be stored in the reference of their parent 


    // Polymorphism
    // compile time  -- method overloading 
    // run time  -- method overriding 

    // method signature -- method name + data type of parameters
    // in one class, we cant more than one method with signature 

    // method overloading 
    // method are known to be overloaded when they have same name but differnt arguemnt (of args / datatypes/ ordering)

    // method overriding 
    // if the parent and child class have a method with the same signature and same return type 

    // runtime poly
    // which method is goig to be called will be dependent upon the object we created 



    // class is the attributes and behaviour of an entity 
    //  it is a real entity 

    // intereface is the blueprint of entities 
    // blueprint of behaviours 
    // a list of behaviours that must be implemented by a class in order to be considered belonging to that category 

    // use 'implements' keyword 
    // bank bank = new icic/hdfc();
    

    // abstract class 
    /*
     * 
     * // Abstract class representing a generic shape
abstract class Shape {
    // Abstract method for calculating area (no implementation)
    public abstract double calculateArea();
    
    // Abstract method for calculating perimeter (no implementation)
    public abstract double calculatePerimeter();
    
    // Concrete method to display information about the shape
    public void displayInfo() {
        System.out.println("This is a " + this.getClass().getSimpleName());
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}

// Concrete subclass representing a circle
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of abstract method to calculate area
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Implementation of abstract method to calculate perimeter (circumference)
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Concrete subclass representing a rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of abstract method to calculate area
    @Override
    public double calculateArea() {
        return length * width;
    }

    // Implementation of abstract method to calculate perimeter
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects of Circle and Rectangle
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        
        // Displaying information about the shapes
        circle.displayInfo();
        System.out.println(); // Add a line break
        rectangle.displayInfo();
    }
}

     */


    //  Static keyword 
    // can only access the static attribute of a class 

    // final keyword()
    // once intialized , then can't change
      
























     








    public static void main(String[] args) {
        
    }
}