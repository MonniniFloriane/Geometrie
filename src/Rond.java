public class Rond {
    public int diametre = 0;

    public Rond(int diametre) {
        this.diametre = diametre;
    }

    public double getPerimetreRond() {
        return Math.floor(diametre * Math.PI);
    }

    @Override
    public String toString() {
        return "Ce rond mesure" + " " + getPerimetreRond() + " " + "de circonférence" + "\n"
                + "rayon : " + this.diametre + "\n";
    }
}
