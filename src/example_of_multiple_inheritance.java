import java.util.Scanner;

interface Student {
    public void s_get();

    public void s_display();
}

interface Exam {
    public void e_get();

    public void e_display();

}

class example_of_multiple_inheritance implements Student, Exam {
    String sname;
    int m1, m2, m3;
    Scanner obj;

    public void s_get() {
        sname = "Ananta";

    }

    public void s_display() {
        System.out.println("Student name is " + sname);
    }

    public void e_get() {
        obj = new Scanner(System.in);
        System.out.println("Enter marks of three subjects");
        m1 = obj.nextInt();
        m2 = obj.nextInt();
        m3 = obj.nextInt();
    }

    public void e_display() {
        float total = m1 + m2 + m3;
        float per = total / 3;
        System.out.println("Total marks is " + total);
        System.out.println("Percentage is " + per);
    }

    public static void main(String s[]) {
        example_of_multiple_inheritance obj = new example_of_multiple_inheritance();
        obj.s_get();
        obj.s_display();
        obj.e_get();
        obj.e_display();
    }
}