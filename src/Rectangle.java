import java.util.Arrays;

public class Rectangle extends Forme {
    private int largeur = 0;
    private int hauteur = 0;

    public Rectangle() {
        this.largeur = 0;
        this.hauteur = 0;
    }

    public Rectangle(int largeur, int hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public Rectangle(int largeur, int hauteur, int x, int y) {
        super(x,y);
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
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

    public String toHTMLCanvas() {
        String res = "ctx.fillRect(";
        res += this.getX() + ",";
        res += this.getY() + ",";
        res += this.hauteur + ",";
        res += this.largeur + ");";
        return res;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Rectangle r2 = new Rectangle(3,4);

        System.out.println(r);
        System.out.println(r2);
    }
}
