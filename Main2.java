import java.util.*;
import java.util.stream.*;

class Employee {
    int id; String name; double salary;
    Employee(int id, String name, double salary){
        this.id = id; this.name = name; this.salary = salary;
    }
    public String toString() { return id + " " + name + " " + salary; }
}

class Student {
    int roll; String name; double marks;
    Student(int roll, String name, double marks){
        this.roll = roll; this.name = name; this.marks = marks;
    }
    public String toString() { return roll + " " + name + " " + marks; }
}

class Product {
    int pid; String pname; double price;
    Product(int pid, String pname, double price){
        this.pid = pid; this.pname = pname; this.price = price;
    }
    public String toString() { return pid + " " + pname + " " + price; }
}

public class Main2 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1,"Alice",50000),
            new Employee(2,"Bob",60000),
            new Employee(3,"Charlie",55000)
        );
        employees.sort((e1,e2) -> Double.compare(e1.salary, e2.salary));
        employees.forEach(System.out::println);

        List<Student> students = Arrays.asList(
            new Student(101,"John",45),
            new Student(102,"Emma",75),
            new Student(103,"Liam",65)
        );
        students.stream()
                .filter(s -> s.marks > 50)
                .sorted(Comparator.comparing(s -> s.name))
                .forEach(System.out::println);

        List<Product> products = Arrays.asList(
            new Product(201,"Laptop",50000),
            new Product(202,"Mouse",1500),
            new Product(203,"Keyboard",2000)
        );
        products.stream()
                .filter(p -> p.price > 2000)
                .forEach(System.out::println);

        products.stream()
                .map(p -> p.pname)
                .forEach(System.out::println);

        double totalPrice = products.stream()
                                    .mapToDouble(p -> p.price)
                                    .sum();
        System.out.println(totalPrice);
    }
}
