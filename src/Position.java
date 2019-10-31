import models.Directions;

public class Position {
    private Coordinates coordinates;
    private Directions directions;

    Position(Coordinates coord, Directions direction){
       setCoordinates(coord);
       setDirections(direction);
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public Directions getDirections() {
        return directions;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public void setDirections(Directions directions) {
        this.directions = directions;
    }
}
