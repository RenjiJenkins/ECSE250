/*The following code contains compile errors.
a) Identify and explain each compile error.
b) Modify the program such that it compiles correctly.

abstract class Employee { 
private String name;
public Employee(String name) {
this.name = name;
}
public abstract double calculateSalary();
}


class Professor extends Employee { 
public Professor() {
super("Unknown"); //what, string should be a parameter to modify
}//does not define what calculateSalary does?
}

public class Test {
public static void main(String[] args) {
Employee e = new Employee("Bob"); //Error1: cannot instantiate an abstract class
System.out.println(e.calculateSalary()); //Error2: calculateSalary is not defined
}
}*/

abstract class Employee { 
private String name;
public Employee(String name) {
this.name = name;
}
public abstract double calculateSalary();
}


class Professor extends Employee { 
public Professor(String name) {
super(name); 
}

    @Override
    public double calculateSalary() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}

public class Test {
public static void main(String[] args) {
Employee e = new Professor("Bob"); /
System.out.println(e.calculateSalary()); 
}
}