public class Rectangle extends Forme {
    public int largeur = 0;
    public int hauteur = 0;

    public Rectangle(int largeur, int hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public double getPerimetre() {
        return (this.largeur * this.hauteur) * 2;
    }

    @Override
    public String toString() {
        return "Ce rectangle mesure" + " " + getPerimetre() + "\n"
                + "largeur : " + this.largeur + "\n"
                + "hauteur : " + this.hauteur + "\n";
    }
}
