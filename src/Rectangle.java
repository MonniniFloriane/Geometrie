public class Rectangle {
    public int largeur = 0;
    public int hauteur = 0;

    public Rectangle(int largeur, int hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public int getRectangle() {
        return (this.largeur * this.hauteur) * 2;
    }

    @Override
    public String toString() {
        return "Ce rectangle mesure" + " " + getRectangle() + "\n"
                + "largeur : " + this.largeur + "\n"
                + "hauteur : " + this.hauteur + "\n";
    }
}
