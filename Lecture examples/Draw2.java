import java.awt.*;

public class Draw2 {
   
   public static void main(String[] args) {
   // panel is 500 by 400
   DrawingPanel panel = new DrawingPanel(500, 400);
   panel.setBackground(Color.CYAN);
   Graphics g = panel.getGraphics();
   draw1(g, 50, 50, 100); // main needs g to work
   draw1(g, 100, 200, 100);
   draw1(g, 250, 150, 75);
   
  }
   
   // draw upper  
   public static void draw1(Graphics g, int x, int y, int size) { // x and y are upper left 
      // draw the square
      g.setColor(Color.RED);
      g.fillRect(x, y, size, size);
      g.setColor(Color.BLACK);
      g.drawRect(x, y, size, size);
      // draw the circle
      g.setColor(Color.GREEN);
      g.fillOval(x, y, size, size); 
      g.setColor(Color.BLACK);
      g.drawOval(x, y, size, size);
      // draw the cross
      g.drawLine(x, y, x + size, y + size);
      g.drawLine(x, y + size, x + size, y); // diagonals x and y are the same but switch one  
   
   }
   
//    // draw lower - different x, y
//    public static void draw2(Graphics g) {
//          // draw the square
//       g.setColor(Color.RED);
//       g.fillRect(x, y, size, size);
//       g.setColor(Color.BLACK);
//       g.drawRect(x, y, size, size);
//          // draw the circle
//       g.setColor(Color.GREEN);
//       g.fillOval(x, y, size, size); 
//       g.setColor(Color.BLACK);
//       g.drawOval(x, y, size, size);
//          // draw the cross
//       g.drawLine(100, 200, 200, 300);
//       g.drawLine(100, 300, 200, 200);
//    }
//      // draw smaller 
//       // draw the square
//    public static void draw3(Graphics g) {
//       g.setColor(Color.RED);
//       g.fillRect(x, y, size, size);
//       g.setColor(Color.BLACK);
//       g.drawRect(x, y, size, size);
//       // draw the circle
//       g.setColor(Color.GREEN);
//       g.fillOval(x, y, size, size); 
//       g.setColor(Color.BLACK);
//       g.drawOval(x, y, size, size);
//       // draw the cross
//       g.drawLine(x, y, x + size, y + size);
//       g.drawLine(x, y + size, x + size, y);
//    }
}
