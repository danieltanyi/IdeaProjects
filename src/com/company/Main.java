/*
* OOP (Object-Oriented Programing) is a methodology or a paradigm to design a program using
* classes and objects.
* Some-of the concepts of OOP includes : Object, Class, Inheritance,Polymorphism, Abstraction and Encapsulation.
*
* Object :(an instance of a class) any entity that has state and behavior for ex. chair, pen, car , table , keyboard.
* it can be physical and logical
* class : (a blueprint for creating an object )the collection of objects. it is a logical entity.
* for ex. looking at the class car, it fields can be : started, currentSpeed, currentGear and it
* methods can be : start(), stop(),brake(),changeGear() another example of a
*
* class TextBox : fields can be : text, limit, length, isFocused
*                 methods can be : setText(), clear(), enable(), disable()
*
*
* inheritance:When one object acquires the behaviors and properties of the parent object. it provides code re-usability,extensibility.
* polymorphism : when one task is perform in different ways. for ex. in Java we use method overloading and method overriding
* to achieved polymorphism
* abstraction : hiding internal details and showing functionalities. for ex. a phone call we don't know the internal processing
* encapsulation : binding and wrapping a code and data into a single unit. for ex. capsule is wrap with different medicine
*
* coupling : the level of dependency between classes. for ex. our main class is dependent to the employee class
*
* The features of Java also known as java buzzwords:simple,object-oriented, portable, platform-independent,secure, robust,interpreted
* dynamic, highly performance, distributed , multithreaded.
*
* 3 type of java comments: single line, multi line and documentation
*
*
*learning git via intelliJ:
* To set up your global username/email configuration: open the command line
* Set your username: git config --global user.name "FIRST_NAME LAST_NAME"
* set your email address: git config --global user.email "MY_NAME@EXAMPLE.COM"
*
* 1. git init ->
* 2. git add/ commit ->
* 3. git push
*  but since we are using intelliJ, right-click on project name , select git and go to commit directories
* select the files you want to commit and chose weather to commit or commit and push
*
 */


package com.company;

public class Main {

    public static void main(String[] args) {
        // creating object
       /* var textBox1 = new TextBox();
        textBox1.setText("Box 1");
        System.out.println(textBox1.text.toUpperCase());

        var textBox2 = new TextBox();
        textBox2.setText("Box 2");
        System.out.println(textBox2.text);

        */

        // memory allocation
      /*  var textBox1 = new TextBox();
        var textBox2 = textBox1;
        textBox2.setText("Hello World");
        System.out.println(textBox1.text);

       */

        // procedural programing:
        // creating fields
    /*    int baseSalary = 50_000;
        int extraHours = 10;
        int hourlyRate = 20;

        // we need to call the calulateWage method here
       int wage = calculateWage(baseSalary, extraHours, hourlyRate);
        System.out.println(wage);

    }
    // creating methods
    public static int calculateWage(int baseSalary, int extraHours, int hourlyRate){
        return baseSalary + (extraHours * hourlyRate);

        // now let us Encapsulate this by creating an employee class :

     */
        // now let us Encapsulate this by creating an employee class :

        var employee = new Employee(50_000, 20);
       // employee.baseSalary =50_000; trying to explore getter and setter
        // System.out.println(Employee.numberOfEmployee);
        Employee.printNumberOfEmployees();
        int wage = employee.calculateWage(10);
        System.out.println(wage);



       // var browser = new Browser();
        /*
        *  Questions and Answers :
        * 1. What is the difference between a class and an object?
        * ans: A class is a blueprint or template for creating an object. An object is an instance of a class
        * 2. what does instantiating mean?
        * ans: creating an instance of a class: new Customer()
        * 3. what is the difference between stack and heap memory? How are they managed?
        * ans: Stack are use for storing primitive types(numbers,boolean and character)and variables that stores references
        * to an objects in the heap. Variables stored in the stack are immediately cleared when they go out of scope
        * (e.g when a method finish execution). Objects stored in the heaps get remove later on when there are no longer references.
        * This is done by Java garbage collector.
        * 4. what are the problems of procedural code? How does object-oriented programming help solve these problems?
        * ans:Big classes with several unrelated methods focusing on different concerns and responsibilities. These methods often
        * have several parameters. You often see the same group of parameters repeated across these methods. All you see is
        * procedures calling each other passing arguments around.
        *
        * By applying OOP techniques, we extract these repetitive parameters and declare them as fields in our classes.
        * Our classes will then encapsulate both the data and the operations on the data(methods). As a result, our methods will
        * have fewer parameters and our code will be cleaner and more reusable.
        * 5. what is encapsulation?
        * ans:This is the first principle of OOP. binding and wrapping a code and data into a single unit. for ex. capsule is wrap with different medicine
        * 6. why should we declare fields as private?
        * ans:How we store data in an object is considered an implementation detail. We may change how we store data internally.
        * Plus , we dont want our objects to go into bad state (hold bad data). Thats why we should declare fields as private
        * and provide getters and setters only if required.These setters can ensure our objects dont go into bad state
        * by validating the values that are passed to them.
        * 7. what is abstraction?
        * ans: this is the second principle of OOP. hiding internal details and showing functionalities.
        *  for ex. a phone call we don't know the internal processing
        * 8. what is coupling ?
        * ans: the level of dependency between classes.
        * 9. How does the abstraction principle help reduce coupling ?
        * ans: By hiding the implementation details, we prevent other classes from getting affected when we change these details.
        * for ex. remote controls with fewer buttons are easier to use.
        * 10. what are constructors ?
        * ans: Constructors are called when we instantiate our classes . we use them to initialize our objects.
        * 11. what is method overloading?
        * ans:This means declaring a method with the same name but with different signatures.
        * The number, type and order of its parameters will be different.
        *12. what are static methods?
        * ans: They are accessible via classes, not objects.
        *
        *
        *
         */


    }
}
