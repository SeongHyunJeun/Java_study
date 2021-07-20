package Using_Swing_Components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBoxItemEventEx extends JFrame {
    JCheckBox [] fruits = new JCheckBox[3];
    String [] names = {"사과", "배", "체리"};

    JLabel sumLabel;

    CheckBoxItemEventEx(){
        setTitle("체크박스 만들기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(new JLabel("사과 100원, 배 500원, 체리 20000원"));

        MyItemListener listener = new MyItemListener();

        //CheckBox 인스턴스화
        for(int i=0; i<fruits.length; i++){
            fruits[i] = new JCheckBox(names[i]);
            fruits[i].setBorderPainted(true);  //체크박스의 외곽선이 보이도록 설정
            c.add(fruits[i]);
            fruits[i].addItemListener(listener);
        }

        sumLabel = new JLabel("현재 0 원 입니다.");
        c.add(sumLabel);
        setSize(250,150);
        setVisible(true);
    }

    class MyItemListener implements ItemListener {
        int sum = 0;

        @Override
        public void itemStateChanged(ItemEvent e) {
            if(e.getStateChange() == ItemEvent.SELECTED){
                if(e.getItem() == fruits[0])
                    sum += 100;
                else if(e.getItem() == fruits[1])
                    sum += 500;
                else
                    sum += 20000;
            }

            else{
                if(e.getItem() == fruits[0])
                    sum -= 100;
                else if(e.getItem() == fruits[1])
                    sum -= 500;
                else
                    sum -= 20000;
            }
            sumLabel.setText("현재 " + sum + "원 입니다.");
            }
        }

    public static void main(String[] args){
        new CheckBoxItemEventEx();
    }
}
