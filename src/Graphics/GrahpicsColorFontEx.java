package Graphics;

import javax.swing.*;
import java.awt.*;

public class GrahpicsColorFontEx extends JFrame {
    GrahpicsColorFontEx(){
        setTitle("문자열, Color, Font 사용 에제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyPanel());

        setSize(300,300);
        setVisible(true);
    }

    class MyPanel extends JPanel{
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.BLUE);
            g.drawString("자바가 정말 재밌다.~~", 30, 30);

            g.setColor(new Color(255, 0, 0));
            g.setFont(new Font("Arial", Font.ITALIC, 30));
            g.drawString("귀칼디",30,70);
            g.setColor(new Color(0x00ff00ff));

            for(int i=1; i<=4; i++){
                g.setFont(new Font("Jokerman", Font.ITALIC, i*10));
                g.drawString("원랜디",30, 60+i*40);
            }
        }
    }
    public static void main(String[] args) {
        new GrahpicsColorFontEx();
    }
}
