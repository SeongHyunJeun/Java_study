package Graphics;

import javax.swing.*;
import java.awt.*;

public class GraphicsDrawLineEx extends JFrame {
    GraphicsDrawLineEx(){
        setTitle("drawLine 사용 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyPanel());

        setSize(400,400);
        setVisible(true);
    }

    class MyPanel extends JPanel{
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.RED);
            g.drawLine(20,20, 100, 100);
            g.drawOval(40,40, 100,100);
            g.drawRoundRect(20,20,120,80,40,60);

            g.setColor(Color.GREEN);
            g.drawArc(20,100,80,80,90,270);


            int [] x = {80,40,80,120};
            int [] y = {40,120,200,120};
            g.drawPolygon(x, y, 4);

        }
    }
    public static void main(String[] args) {
        new GraphicsDrawLineEx();
    }
}
