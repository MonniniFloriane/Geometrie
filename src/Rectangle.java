import java.util.Arrays;

public class Rectangle extends Forme {
    private int largeur = 0;
    private int hauteur = 0;

    public Rectangle(int largeur, int hauteur, int x, int y) {
        super(x,y);
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
                + "hauteur : " + this.hauteur + "\n"
                + super.toString();
    }
}
