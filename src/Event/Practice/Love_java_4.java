package Event.Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Love_java_4 extends JFrame {
    JLabel la = new JLabel("Love Java");


    Love_java_4(){
        setTitle("+,-로 폰트크기 조절");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        la.setFont(new Font("base",Font.ITALIC,5));
        la.setHorizontalAlignment(la.CENTER);
        Container c = getContentPane();
        c.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                Font f = la.getFont();
                int size = f.getSize();
                if(e.getKeyChar() =='+')
                    la.setFont(new Font("base",Font.ITALIC,size+5));

                else if(e.getKeyChar() == '-' && size !=5)
                    la.setFont(new Font("base",Font.ITALIC,size-5));
            }
        });
        c.add(la);
        setSize(400,400);
        setVisible(true);
        c.requestFocus();
    }

    public static void main(String[] args){
        new Love_java_4();
    }
}
