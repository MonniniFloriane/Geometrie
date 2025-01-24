public class Triangle {
    public int cote = 0;

    public Triangle(int cote) {
        this.cote = cote;
    }

    public int getTriangleArea() {
        return cote * 3;
    }

    @Override
    public String toString() {
        return "Ce triangle mesure" + " " + getTriangleArea() + " " + "de cotées" + "\n"
                + "cote : " + this.cote + "\n";
    }
}
