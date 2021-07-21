package Using_Swing_Components.Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Digit_changer_6 extends JFrame {
    JTextField src = new JTextField(8);
    JTextField dest = new JTextField(8);
    JLabel l = new JLabel("->");
    Digit_changer_6(){
    setTitle("Digit Changer");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    c.add(src); c.add(l); c.add(dest);


    createRadio();
    setSize(400,300);
    setVisible(true);
    }

    void createRadio(){
    ButtonGroup g = new ButtonGroup();
    JRadioButton [] bt = new JRadioButton[4];
    String [] bt_name = {"decimal", "binary", "octal", "hex"};
    ItemListen listen = new ItemListen();

    for(int i=0; i<bt.length; i++){
        bt[i] = new JRadioButton(bt_name[i]);
        bt[i].addItemListener(listen);
        g.add(bt[i]);
        getContentPane().add(bt[i]);
    }
    }

    class ItemListen implements ItemListener{
        @Override
        public void itemStateChanged(ItemEvent e) {
            if(src.getText().length() == 0) return ;;
            int n = Integer.parseInt(src.getText());
            JRadioButton b = (JRadioButton) e.getItem();
            switch(b.getText()){
                case "decimal" : dest.setText(Integer.toString(n)); dest.setVisible(true); break;
                case "binary" : dest.setText(Integer.toBinaryString(n)); dest.setVisible(true); break;
                case "octal" : dest.setText(Integer.toOctalString(n)); dest.setVisible(true); break;
                case "hex" : dest.setText(Integer.toHexString(n)); dest.setVisible(true); break;
            }
        }
    }
    public static void main(String[] args) {
        new Digit_changer_6();
    }
}
