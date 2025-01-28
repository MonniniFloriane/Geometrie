import java.util.Arrays;

public abstract class Forme {
    //location
    protected int x = 0;
    protected int y = 0;

    public Forme() {}

    public Forme(int x, int y) {
        this.x += x;
        this.y += y;
    };

    public abstract double getPerimetre();
    public abstract String toHTMLCanvas();

    //location
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void translate(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public String toString() {
        return "je suis positionner à [" + x + ","+ y + "]\n";
    }
}
