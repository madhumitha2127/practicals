class Student {
String name;
int roll_no;
int age;

void display() {
    System.out.println("Name: " + name);
    System.out.println("Roll No: " + roll_no);
    System.out.println("Age: " + age);
}


}

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

    Student s = new Student();

    System.out.print("Enter Name: ");
    s.name = sc.nextLine();

    System.out.print("Enter Roll No: ");
    s.roll_no = sc.nextInt();

    System.out.print("Enter Age: ");
    s.age = sc.nextInt();

    System.out.println("\n--- Student Details ---");
    s.display();

    sc.close();
}


}