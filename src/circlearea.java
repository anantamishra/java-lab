public class circlearea {
    float radius, pi;

    circlearea() {
        pi = 3.14f;
    }

    void circle_area(float r) {
        radius = r;
        double circlearea = pi * radius * radius;
        System.out.println("Circle area is " + circlearea);
    }

    public static void main(String[] args) {
        circlearea obj = new circlearea();
        obj.circle_area(5.56f);
    }

}
