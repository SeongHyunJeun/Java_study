package Event.Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame_size_6 extends JFrame {
    JButton b= new JButton("A");
    Frame_size_6(){
        setTitle("키로 프레임 크기 조절");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
        setSize(136,150);
        b.setLocation(35,20);
        b.setSize(50,30);

        c.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int x,y;
                x = getWidth(); y = getHeight();
                switch (e.getKeyCode()){
                    case KeyEvent.VK_F1:
                        setSize(x+10,y+10);
                        b.setLocation(b.getX()+5,20);
                        break;
                    case KeyEvent.VK_F2:
                        setSize(x-10,y-10);
                        b.setLocation(b.getX()-5,20);
                        break;
                    case KeyEvent.VK_Q:
                        System.exit(0);
                }
            }
        });
        c.add(b);
        setVisible(true);
        c.setFocusable(true);
        c.requestFocus();
    }
    public static void main(String[] args){
       new Frame_size_6();
    }
}
