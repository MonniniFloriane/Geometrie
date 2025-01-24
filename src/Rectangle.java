public class Rectangle {
    public int largeur = 0;
    public int hauteur = 0;

    public Rectangle(int largeur, int hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public int getRectangle() {
        return largeur * hauteur;
    }

    @Override
    public String toString() {
        return "Ce rectangle mesure" + " " + getRectangle();
    }
}
