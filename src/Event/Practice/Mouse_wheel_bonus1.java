package Event.Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseWheelEvent;

public class Mouse_wheel_bonus1 extends JFrame {
    JLabel la = new JLabel("Love Java");


    Mouse_wheel_bonus1(){
        setTitle("+,-로 폰트크기 조절");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        la.setFont(new Font("base",Font.ITALIC,5));
        la.setHorizontalAlignment(la.CENTER);
        Container c = getContentPane();
        la.addMouseWheelListener(new MouseAdapter() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                int n = e.getWheelRotation();
                Font f = la.getFont();
                int size = f.getSize();
                if (n < 0) {
                    if(size<=5) return;
                    la.setFont(new Font("base", Font.ITALIC, size -5));
                }
                else la.setFont(new Font("base", Font.ITALIC, size + 5));
            }
        });
        c.add(la);
        setSize(400,400);
        setVisible(true);

    }

    public static void main(String[] args){
        new Mouse_wheel_bonus1();
    }
}
