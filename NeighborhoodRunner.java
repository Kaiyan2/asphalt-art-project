import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    // Creates a MuralPainter object
    MuralPainter backgroundPainter = new MuralPainter();
    KPainter K = new KPainter();
    

    // Paints the background for the mural
  backgroundPainter.paintBackground("Black", 8);
    K.paintK("white");

  }
}