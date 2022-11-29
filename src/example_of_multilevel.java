class student {
    String sname, sadd;

    student(String s, String a) {
        sname = s;
        sadd = a;
    }

    void student_display() {
        System.out.println("student name " + sname);
        System.out.println("address is " + sadd);
    }
}

class exam extends student {
    int total_marks;

    exam(int m, String s, String a) {
        super(s, a);
        total_marks = m;
    }

    void exam_display() {
        System.out.println(" total mark is " + total_marks);
    }
}

class fees extends exam {
    String date;
    int famt;

    fees(String d, int amt, int m, String s, String a) {
        super(m, s, a);
        date = d;
        famt = amt;
    }

    void fees_display() {
        System.out.println("fees date is " + date);
        System.out.println(" amount is  " + famt);
    }
}

public class example_of_multilevel {
    public static void main(String s[]) {
        fees obj = new fees("10-10-2022", 7000, 500, "Anand", "bh-1-");
        obj.student_display();
        obj.exam_display();
        obj.fees_display();
    }
}