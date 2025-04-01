import java.awt.*;

public class LecutreDrawingPanel {
   public static void main(String[] args){
      DrawingPanel panel = new DrawingPanel(400, 200);
      panel.setBackground(Color.LIGHT_GRAY);
      Graphics g = panel.getGraphics();
      // draw body of car
      g.fillRect(10, 30, 100, 50);
      // draw back red wheel
      g.setColor(Color.RED);
      g.fillOval(20, 70, 20, 20);
      // draw front red wheel - same y coordinate, width, and height
      g.fillOval(80, 70, 20, 20);
      // draw window
      g.setColor(Color.CYAN);
      g.fillRect(80, 40, 30, 20);
   }
}
// want a draw car method 