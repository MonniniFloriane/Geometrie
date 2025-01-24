public class Rond {
    public int rayon     = 0;
    public int perimetre = 0;

    public Rond(int rayon, int perimetre) {
        this.rayon     = rayon;
        this.perimetre = perimetre;
    }

    public int getPerimetreRond() {
        return rayon * perimetre;
    }

    @Override
    public String toString() {
        return "Ce rond mesure" + " " + getPerimetreRond() + " " + "de circonférence";
    }
}
