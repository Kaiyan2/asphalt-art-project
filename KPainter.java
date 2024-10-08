import org.code.neighborhood.*;

public class KPainter extends MuralPainter {

  /*
  * The painter paints the letter K in whichever color is selected.
  */
 public void paintK(String color) {
   setPaint(10);
   move();   
   move();
   turnRight();
   move();   
   move();
   paint(color);
   move();
   paint(color);
   move();
   paint(color);
   move();
   paint(color);
   move();
   paint(color);
   turnLeft();
   move();
   move();
   move();
   paint(color);
   turnLeft();
   move();
   turnLeft();
   move();
   paint(color);
   move();
   turnRight();
   move();
   paint(color);
   move();
   turnRight();
   move();
   paint(color);
   move();
   turnLeft();
   move();
   paint(color);
   move();
   move();
   turnRight();
   move();
   move();
   
 }

}