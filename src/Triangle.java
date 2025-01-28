import java.util.Arrays;

public class Triangle extends Forme {
    private int cote = 0;

    public Triangle() {}

    public Triangle(int cote) {
        this.cote = cote;
    }

    public Triangle(int cote, int x, int y) {
        super(x, y);
        this.cote = cote;
    }

    @Override
    public double getPerimetre() {
        return cote * 3;
    }

    @Override
    public String toString() {
        return "Ce triangle mesure" + " " + getPerimetre() + " " + "de cotées" + "\n"
                + "cote : " + this.cote + "\n"
                + super.toString();
    }

    public String toHTMLCanvas() {
        String res = "drawEquilateralTriangle(ctx,";
        res += this.getX() + ",";
        res += this.getY() + ",";
        res += this.cote + ",";
        res += "\"green\", \"black\");";
        return res;
    }
}
