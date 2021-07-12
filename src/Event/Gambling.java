package Event;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Gambling extends JFrame {
    JPanel contentPane = new JPanel();
    JLabel []L = new JLabel[3];
    JLabel L1 = new JLabel("시작합니다.");


    void CreateJLabel(){
        for(int i=0; i<L.length; i++) {
            L[i] = new JLabel("0");
            L[i].setOpaque(true);
            L[i].setHorizontalAlignment(L[i].CENTER);
            L[i].setBackground(Color.MAGENTA);
            L[i].setForeground(Color.YELLOW);
            L[i].setSize(100, 50);
            L[i].setLocation(50 + i*120, 70);
            L[i].setFont(new Font("Font", Font.BOLD, 30));
            contentPane.add(L[i]);
        }
    }

    Gambling(){
        setTitle("Gambling");
        setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        L1.setLocation(200,180);
        L1.setSize(200,100);
        contentPane.add(L1);
        CreateJLabel();
        contentPane.addKeyListener(new KeyListen());
        setSize(480,300);
        setVisible(true);
        contentPane.setFocusable(true); //컨테이너를 컨텐트팬으로 사용시 안써도 포커스 잡힘. 조건부로 종료될땐 false로 끄자
        contentPane.requestFocus();
    }

    class KeyListen extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            if(e.getKeyChar() == '\n'){
                int []compare = new int[3];
                for(int i=0; i<L.length; i++){
                    int random = (int)(Math.random()*5);
                    L[i].setText(Integer.toString(random));
                    compare[i] = random;
                }
                if(compare[0] == compare[1] && compare[1] == compare[2]) {
                    L1.setText("축하합니다!!");
                    contentPane.setFocusable(false);
                }
                else
                    L1.setText("아쉽습니다.");

            }
        }
    }


    public static void main(String[] args){
        new Gambling();
    }
}
