package Using_Swing_Components.Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBox_4 extends JFrame {
    JCheckBox enable = new JCheckBox("버튼 비활성화");
    JCheckBox seeable = new JCheckBox("버튼 감추기");
    JButton bt = new JButton("test button");

    CheckBox_4(){
        setTitle("CheckBox와 ItemListener");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        MyItemListener listen = new MyItemListener();
        enable.addItemListener(listen);
        seeable.addItemListener(listen);

        c.add(enable);
        c.add(seeable);
        c.add(bt);

        setSize(400,300);
        setVisible(true);

    }

    class MyItemListener implements ItemListener{
        @Override
        public void itemStateChanged(ItemEvent e) {
            if(e.getStateChange() == ItemEvent.SELECTED ){
                if(e.getItem() ==enable)
                    bt.setEnabled(false);
                else
                    bt.setVisible(false);
            }
            else{
                if(e.getItem() ==enable)
                    bt.setEnabled(true);
                else
                    bt.setVisible(true);
            }
        }
    }

    public static void main(String[] args) {
        new CheckBox_4();
    }
}
