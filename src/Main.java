public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,10);
        Triangle triangle   = new Triangle(30,10);
        Rond rond           = new Rond(10,20);

        System.out.println(rectangle.toString());
        System.out.println(triangle.toString());
        System.out.println(rond.toString());
    }
}