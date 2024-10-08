import org.code.neighborhood.*;

public class PainterPlus extends Painter {
  /*
  * Turns the painter to the right.
  */
  public void turnRight() {
  turnLeft();
  turnLeft();
  turnLeft();
  }

  /*
  * Takes all the paint from the bucket the painter is standing on.
  */
  public void takeAllPaint() {
    while (isOnBucket()) {
      takePaint();      
    }
    
  }

  /*
  * Paints a Donut like shape by painting in a circle and leaving the middle empty.
  */
  public void paintDonut(String color) {
    while (hasPaint()) {
      move();
      turnRight();
      paint(color);
      move();
      paint(color);

      
    }

  }
  /*
  * Moves the painter forward until it can't anymore.
  */
    public void moveFast() {
      while (canMove()) {
        move();
      }

    }
  
}