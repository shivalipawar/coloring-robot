import models.Colors;
import models.Command;
import models.Directions;

public class Robot implements Command {

    Position position;
    Colors color;

    Robot(Colors colors ){
        position = new Position(new Coordinates(0,0),Directions.NORTH);
        color = colors;
    }

    @Override
    public void turnLeft() {

    }

    @Override
    public void turnRight() {

    }

    @Override
    public void moveForward() {

    }

    @Override
    public void install() {

    }
}
