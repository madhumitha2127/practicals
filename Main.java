class student{
    String name;
    int roll_no;
    int age;

    void display(){
        System.out.println("Name:"+name);
        System.out.println("Roll No:"+roll_no);


    }
}
public class Main{
    public static void main(String[] args) {
        student s = new student();
        s.name = "Maha";
        s.roll_no = 73;
        s.age = 20;
        s.display();
    }
}