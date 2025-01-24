public class Dessin {
    private Forme forme;
    private Forme forme1;
    private Forme forme2;

    public Dessin() {
        forme = new Rectangle(20,20);
        forme1 = new Triangle(20);
        forme2 = new Rond(20);
    }

    public Forme getForme() {
        return forme;
    }

    public void setForme(Forme forme) {
        this.forme = forme;
    }

    @Override
    public String toString() {
        return "Je suis un dessin qui contient \n"
                + forme + "\n"
                + forme1 + "\n"
                + forme2 + "\n";
    }
}
