package Event.Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Click_move_5 extends JFrame {
    JLabel la = new JLabel("C");
    Click_move_5(){
        setTitle("클릭 연습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);

        la.setSize(50,50);
        la.setLocation(50,50);
        la.setFont(new Font("base",Font.ITALIC,30));
        c.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int xBound = c.getWidth() - la.getWidth();
                int yBound = c.getHeight() - la.getHeight();
                la.setLocation((int)(Math.random()*xBound), (int)(Math.random()*yBound));
            }
        });
        c.add(la);
        setSize(400,400);
        setVisible(true);

    }

    public static void main(String[]args){
        new Click_move_5();
    }
}
