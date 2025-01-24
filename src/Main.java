public class Main {
    public static void main(String[] args) {
        System.out.println("****Classe classique****\n");

        Rectangle rectangle = new Rectangle(5,10, 20,50);
        Triangle triangle   = new Triangle(10,20,50);
        Rond rond           = new Rond(5, 20,50);

        System.out.println(rectangle);
        System.out.println(triangle);
        System.out.println(rond);

        System.out.println("****Exemple avec classe mère****\n");

        Forme f;
        f = new Rectangle(10,10, 20,50);
        System.out.println(f);

        f = new Triangle(20,10,30);
        System.out.println(f);

        f = new Rond(10,10,30);
        System.out.println(f);

        System.out.println("****Exemple avec classe générale****\n");
        Dessin d = new Dessin(new Rectangle(10,10,20, 50),
                new Triangle(20,10,30),
                new Rond(20,20,10));
        System.out.println(d);
    }
}