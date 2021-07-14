package Event.Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Dragged_color_3 extends JFrame {
    Dragged_color_3(){
        super("드래깅도안 색변경");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setBackground(Color.GREEN);
        MouseListen ml = new MouseListen();
        c.addMouseListener(ml);
        c.addMouseMotionListener(ml);

        setSize(400,400);
        setVisible(true);
    }
    class MouseListen extends MouseAdapter  {


        @Override
        public void mouseDragged(MouseEvent e) {
            Container c = (Container)e.getSource();
            c.setBackground(Color.YELLOW);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            Container c = (Container)e.getSource();
            c.setBackground(Color.GREEN);
        }
    }
    public static void main(String[] args) {
        new Dragged_color_3();
    }
}
