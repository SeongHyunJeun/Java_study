package Using_Swing_Components.Practice;

import javax.swing.*;
import java.awt.*;

public class Img_1 extends JFrame {
    JLabel[] la = {new JLabel(new ImageIcon("images/img1.jpg")) ,
                          new JLabel(new ImageIcon("images/img2.jpg")),
                        new JLabel(new ImageIcon("images/img3.jpg")),
                        new JLabel(new ImageIcon("images/img4.jpg"))};


    Img_1(){
        setTitle("4 Images");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new GridLayout(1,4,10,10));

        for(int i=0; i<la.length; i++)
            c.add(la[i]);

        setSize(500,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Img_1();
    }
}
