import java.util.Scanner;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    Student(String name, int age) {
        super(name, age);
    }

    void study() {
        System.out.println(name + " is studying.");
    }
}

public class SingleLevelSchoolDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter student age: ");
        int age = sc.nextInt();

        Student student = new Student(name, age);

        student.displayInfo();
        student.study();
        sc.close();
    }
}
