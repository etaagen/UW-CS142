import java.awt.*;

public class Wed {
   public static void main(String[] args) {
   // panel is 500 by 400
   DrawingPanel panel = new DrawingPanel(500, 400);
   panel.setBackground(Color.CYAN);
   Graphics g = panel.getGraphics();
   
   // draw upper  
      // draw the square
   g.setColor(Color.RED);
   g.fillRect(50, 50, 100, 100);
   g.setColor(Color.BLACK);
   g.drawRect(50, 50, 100, 100);
      // draw the circle
   g.setColor(Color.GREEN);
   g.fillOval(50, 50, 100, 100); 
   g.setColor(Color.BLACK);
   g.drawOval(50, 50, 100, 100);
      // draw the cross
   g.drawLine(50, 50, 150, 150);
   g.drawLine(50, 150, 150, 50); // diagonals x and y are the same but switch one  
   
   // draw lower - different x, y
      // draw the square
   g.setColor(Color.RED);
   g.fillRect(100, 200, 100, 100);
   g.setColor(Color.BLACK);
   g.drawRect(100, 200, 100, 100);
      // draw the circle
   g.setColor(Color.GREEN);
   g.fillOval(100, 200, 100, 100); 
   g.setColor(Color.BLACK);
   g.drawOval(100, 200, 100, 100);
      // draw the cross
   g.drawLine(100, 200, 200, 300);
   g.drawLine(100, 300, 200, 200);
   
     // draw smaller 
      // draw the square
   g.setColor(Color.RED);
   g.fillRect(250, 150, 75, 75);
   g.setColor(Color.BLACK);
   g.drawRect(250, 150, 75, 75);
      // draw the circle
   g.setColor(Color.GREEN);
   g.fillOval(250, 150, 75, 75); 
   g.setColor(Color.BLACK);
   g.drawOval(250, 150, 75, 75);
      // draw the cross
   g.drawLine(250, 150, 325, 225);
   g.drawLine(250, 225, 325, 150);
   }
}
