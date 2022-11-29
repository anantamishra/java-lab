class student {

    String sname, sadd;

    student(String s, String a) {
        sname = s;
        sadd = a;
    }

    void student_display() {
        System.out.println("Student name:" + sname);
        System.out.println("Student address:" + sadd);

    }
}

class exam extends student {
    int total_marks;

    exam(int m, String s, String a) {
        super(s, a);
        total_marks = m;
    }

    void exam_display() {
        System.out.println("Total makrs is" + total_marks);
    }
}

public class example_of_singlelevel {
    public static void main(String s[]) {
        exam obj = new exam(500, "Ananta", "BHR-1");
        obj.student_display();
        obj.exam_display();

    }
}