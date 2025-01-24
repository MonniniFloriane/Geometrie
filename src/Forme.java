import java.util.Arrays;

public abstract class Forme {
    //location
    protected int x = 0;
    protected int y = 0;

    public abstract double getPerimetre();
    //location
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public Forme(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    };

    @Override
    public String toString() {
        return "je suis positionner à [" + x + ","+ y + "]\n";
    }
}
