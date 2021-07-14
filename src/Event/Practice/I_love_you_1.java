package Event.Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class I_love_you_1 extends JFrame {
    JLabel la =new JLabel("자기야");
    I_love_you_1(){
        setTitle("마우스 올리기 내리기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        la.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                la.setText("자기야");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                la.setText("사랑해");
            }
        });
        la.setHorizontalAlignment(la.CENTER);
        c.add(la, BorderLayout.NORTH);
        setSize(400,300);
        setVisible(true);

    }

    public static void main(String[] args){
        new I_love_you_1();
    }
}
