package Using_Swing_Components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboActionEx extends JFrame {
    String [] fruits= {"apple", "banana", "mango"};
    ImageIcon[] images = { new ImageIcon("images/apple.jpg"),
            new ImageIcon("images/banana.jpg"),
            new ImageIcon("images/mango.jpg")};

    JLabel imgLabel = new JLabel(images[0]);

    ComboActionEx(){
        setTitle("리스트 만들기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JComboBox combo = new JComboBox(fruits);
        c.add(combo); c.add(imgLabel);

        combo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox cb = (JComboBox) e.getSource();

                int index = cb.getSelectedIndex();  //콤보박스의 선택된 아이템의 인덱스 번호 알아내기
                imgLabel.setIcon(images[index]);
            }
        });

        setSize(300,250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ComboActionEx();
    }
}
