import org.code.neighborhood.*;

public class PainterPlus extends Painter {

//turns the painter to the right
  public void turnRight() {
  turnLeft();
  turnLeft();
  turnLeft();
  }

//takes all the paint from the bucket the painter is on
  public void takeAllPaint() {
    while (isOnBucket()) {
      takePaint();      
    }
    
  }


//paints a donut or circle type figure
  public void paintDonut(String color) {
    while (hasPaint()) {
      move();
      turnRight();
      paint(color);
      move();
      paint(color);

      
    }

  }

    public void moveFast() {
      while (canMove()) {
        move();
      }

    }

}