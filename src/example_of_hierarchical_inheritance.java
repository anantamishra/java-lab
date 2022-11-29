class student {
    String sname, sadd;

    void assign_student(String s, String a) {
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

    void exam_assign(int m) {

        total_marks = m;
    }

    void exam_display() {
        System.out.println(" total mark is " + total_marks);
    }
}

class fees extends student {
    String date;
    int famt;

    void fees_asign(String d, int amt) {

        date = d;
        famt = amt;
    }

    void fees_display() {
        System.out.println("fees date is " + date);
        System.out.println(" amount is  " + famt);
    }
}

public class example_of_hierarchical_inheritance {
    public static void main(String s[]) {
        exam eobj = new exam();
        eobj.assign_student("binita", "ktm");
        eobj.student_display();
        eobj.exam_assign(500);
        eobj.exam_display();
        fees obj = new fees();
        obj.fees_asign("10-10-2022", 7000);
        obj.fees_display();
    }
}