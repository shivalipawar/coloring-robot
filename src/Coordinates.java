import models.Colors;

public class Coordinates {
    private int x;
    private int y;
    private Colors colors;

    Coordinates(int x, int y){
        setX(x);
        setY(y);
        setColors(Colors.EMPTY);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Colors getColors() {
        return colors;
    }

    public void setColors(Colors colors) {
        this.colors = colors;
    }
}
