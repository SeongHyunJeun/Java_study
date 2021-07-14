package Event.Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Key_Released_2 extends JFrame {

    Key_Released_2(){
        super("키 누르기 떼기 연습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setBackground(Color.RED);
        c.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyChar() == 'r')
                c.setBackground(Color.CYAN);

            }

            @Override
            public void keyReleased(KeyEvent e) {
                c.setBackground(Color.red);
            }
        });

        setSize(400,200);
        setVisible(true);
        c.requestFocus();
    }

    public static void main(String[] args){
        new Key_Released_2();
    }
}
