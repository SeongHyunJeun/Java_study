package Using_Swing_Components.Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Image_button extends JFrame {
    ImageIcon [] Icon = {new ImageIcon("images/image0.jpg"),
             new ImageIcon("images/image1.jpg"),
             new ImageIcon("images/image2.jpg"),
             new ImageIcon("images/image3.jpg")};

    JLabel img = new JLabel(Icon[0]);


    Image_button(){
        setTitle("Open Challenge10");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.add(new MenuPanel(),BorderLayout.SOUTH);
        c.add(img,BorderLayout.CENTER);
        setSize(300,400);
        setVisible(true);
    }

    class MenuPanel extends JPanel{
        int index = 0;
        ImageIcon left_i = new ImageIcon("images/left.png");
        ImageIcon right_i = new ImageIcon("images/right.png");
        JButton left_b = new JButton(left_i);
        JButton right_b = new JButton(right_i);
        MenuPanel(){
            setBackground(Color.GRAY);
            left_b.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (index == 0) index =3;
                    else index--;
                    img.setIcon(Icon[index]);
                }
            });
            right_b.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (index == 3) index =0;
                    else index++;
                    img.setIcon(Icon[index]);}
            });

            add(left_b);
            add(right_b);
        }
    }

    public static void main(String[] args) {
        new Image_button();
    }
}
