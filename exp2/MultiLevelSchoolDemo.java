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

class GraduateStudent extends Student {
    GraduateStudent(String name, int age) {
        super(name, age);
    }

    void research() {
        System.out.println(name + " is conducting research.");
    }
}

public class MultiLevelSchoolDemo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter graduate student name: ");
        String name = sc.nextLine();

        System.out.print("Enter graduate student age: ");
        int age = sc.nextInt();

        GraduateStudent gradStudent = new GraduateStudent(name, age);

        gradStudent.displayInfo();
        gradStudent.study();
        gradStudent.research();
        sc.close();
    }
}
