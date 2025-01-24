import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dessin {
    private List<Forme> formes = new ArrayList<>();

    public Dessin(Forme...formes) {
        this.formes.addAll(Arrays.asList(formes));
    }

    public Forme getForme() {
        return formes.getFirst();
    }

    public void setForme(List<Forme> forme) {
        this.formes = forme;
    }

    @Override
    public String toString() {
        return "Je suis un dessin qui contient \n"
                + this.formes + "\n";
    }
}
