public class Main {
    public static void main(String[] args) {
        System.out.println("****Classe classique****\n");

        Rectangle rectangle = new Rectangle(5,10);
        Triangle triangle   = new Triangle(10);
        Rond rond           = new Rond(5);

        System.out.println(rectangle);
        System.out.println(triangle);
        System.out.println(rond);

        System.out.println("****Exemple avec classe mère****\n");

        Forme f;
        f = new Rectangle(10,10);
        System.out.println(f);

        f = new Triangle(20);
        System.out.println(f);

        f = new Rond(10);
        System.out.println(f);

        System.out.println("****Exemple avec classe générale****\n");
        Dessin d = new Dessin();
        System.out.println(d);
    }
}