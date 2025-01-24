public class Rond extends Forme {
    public int diametre = 0;

    public Rond(int diametre) {
        this.diametre = diametre;
    }

    @Override
    public double getPerimetre() {
        return Math.floor(diametre * Math.PI);
    }

    @Override
    public String toString() {
        return "Ce rond mesure" + " " + getPerimetre() + " " + "de circonférence" + "\n"
                + "rayon : " + this.diametre + "\n";
    }
}
