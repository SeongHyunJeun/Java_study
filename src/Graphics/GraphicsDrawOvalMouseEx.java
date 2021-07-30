package Graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GraphicsDrawOvalMouseEx extends JFrame {
    GraphicsDrawOvalMouseEx(){
        setTitle("마우스 드래깅으로 타원 그리기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyPanel());

        setSize(300,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new GraphicsDrawOvalMouseEx();
    }


    class MyPanel extends JPanel{
        Point start= null, end = null;
        public MyPanel(){
            MyMouseListener listener = new MyMouseListener();

            addMouseListener(listener);
            addMouseMotionListener(listener);
        }
        class MyMouseListener extends MouseAdapter{
            @Override
            public void mousePressed(MouseEvent e) {
                start = e.getPoint();
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                end = e.getPoint();
                repaint();
            }
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if(start == null) return;

            int x = Math.min(start.x, end.x);  //최소값. 작은 것으로 고정
            int y = Math.min(start.y, end.y);

            int width = Math.abs(start.x - end.x);  //빼기 절대값
            int height = Math.abs(start.y - end.y);
            g.drawOval(x, y, width, height);


        }
    }
}
