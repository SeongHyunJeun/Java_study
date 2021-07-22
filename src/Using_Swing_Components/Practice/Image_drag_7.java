package Using_Swing_Components.Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Image_drag_7 extends JFrame {
    ImageIcon icon = new ImageIcon("images/img.jpg");
    JLabel la = new JLabel(icon);


    Image_drag_7(){
        setTitle("이미지 드래깅");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
        la.setSize(icon.getIconWidth(), icon.getIconWidth());
        la.setLocation(100,100);
        MyListener listener = new MyListener();
        la.addMouseListener(listener);
        la.addMouseMotionListener(listener);
        c.add(la);
        setSize(500,500);
        setVisible(true);
    }

    class MyListener extends MouseAdapter{
        int x, y;

        @Override
        public void mousePressed(MouseEvent e) {
            x = e.getX();
            y = e.getY();
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            int distanceX = e.getX() - x;
            int distanceY = e.getY() - y;
            la.setLocation(la.getX()+ distanceX, la.getY() + distanceY);


        }
    }
    public static void main(String[] args) {
        new Image_drag_7();
    }
}
