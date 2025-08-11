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
        Student student = new Student("Alice", 20);
        student.displayInfo();
        student.study();
    }
}
