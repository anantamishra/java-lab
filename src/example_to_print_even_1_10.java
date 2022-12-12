class even extends Thread {
    int i;

    even(String s) {
        super(s);
    }

    public void run() {
        try {
            for (i = 2; i <= 10; i = i + 2) {
                System.out.println("Even numbers are " + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread is interrupted 1");
        }
    }
}

class odd extends Thread {
    int i;

    odd(String s) {
        super(s);
    }

    public void run() {
        try {
            for (i = 1; i <= 10; i = i + 2) {
                System.out.println("Odd numbers are " + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread is interrupted 2");
        }
    }
}

public class example_to_print_even_1_10 {
    public static void main(String[] args) {
        even en = new even("Thread 1");
        odd od = new odd("Thread 2");
        en.start();
        od.start();
    }
}