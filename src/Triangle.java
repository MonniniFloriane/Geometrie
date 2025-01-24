public class Triangle {
    public int cote = 0;
    public int air  = 0;

    public Triangle(int cote, int air) {
        this.cote = cote;
        this.air  = air;
    }

    public int getTriangleArea() {
        return cote * air;
    }

    @Override
    public String toString() {
        return "Ce triangle mesure" + " " + getTriangleArea() + " " + "de cotées";
    }
}
