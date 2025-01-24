import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dessin {
    private final List<Forme> formes = new ArrayList<>();

    public Dessin(Forme...formes) {
        this.formes.addAll(Arrays.asList(formes));
    }

    public double getPerimetre() {
        int total = 0;
        for (Forme forme : this.formes) {
            total += (int) forme.getPerimetre();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Je suis un dessin qui contient \n"
                + this.formes + "\n"
                + "je messure" + " " + getPerimetre() + "\n";
    }
}
