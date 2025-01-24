public class Triangle extends Forme {
    private int cote = 0;

    public Triangle(int cote) {
        this.cote = cote;
    }

    @Override
    public double getPerimetre() {
        return cote * 3;
    }

    @Override
    public String toString() {
        return "Ce triangle mesure" + " " + getPerimetre() + " " + "de cotées" + "\n"
                + "cote : " + this.cote + "\n";
    }
}
