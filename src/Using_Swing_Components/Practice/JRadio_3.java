package Using_Swing_Components.Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JRadio_3 extends JFrame {
    JRadioButton red = new JRadioButton("Red", true);
    JRadioButton blue = new JRadioButton("Blue");
    JRadio_3() {
        setTitle("Two Radio Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.setBackground(Color.RED);

        ButtonGroup g = new ButtonGroup();


        g.add(red);
        g.add(blue);
        c.add(red);
        c.add(blue);

        ColorAction ca = new ColorAction();
        red.addItemListener(ca);
        blue.addItemListener(ca);

        setSize(300, 200);
        setVisible(true);
    }

    class ColorAction implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getItem() == red) {
                getContentPane().setBackground(Color.RED);
            } else if (e.getItem() == blue) {
                getContentPane().setBackground(Color.BLUE);
            }
        }
    }

    public static void main(String[] args) {
        new JRadio_3();
    }
}