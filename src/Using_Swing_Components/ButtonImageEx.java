package Using_Swing_Components;

import javax.swing.*;
import java.awt.*;

public class ButtonImageEx extends JFrame {
    ButtonImageEx(){
        setTitle("이미지 버튼 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");
        ImageIcon rolloverIcon = new ImageIcon("images/rolloverIcon.gif");
        ImageIcon pressedIcon = new ImageIcon("images/pressedIcon.gif");

        JButton btn = new JButton("call~~", normalIcon);
        btn.setRolloverIcon(pressedIcon);
        btn.setPressedIcon(pressedIcon);
        c.add(btn);

        setSize(250,150);
        setVisible(true);
    }
    public static void main(String[] args){
        new ButtonImageEx();
    }
}
