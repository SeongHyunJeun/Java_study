package Event.Practice;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class make_0_7 extends JFrame {
    Integer num = (int)(Math.random()*60+1);
    JLabel la = new JLabel(num.toString());
    JButton [] b = new JButton[3];


    make_0_7(){
        setTitle("0으로 만들기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
        la.setSize(100,100);
        la.setLocation(160,30);
        la.setFont(new Font("base",Font.BOLD,70));
        c.add(la);
        makeButton();


        setSize(400,300);
        setVisible(true);

    }
    void makeButton(){
        b[0] = new JButton("+2");
        b[1] = new JButton("-1");
        b[2] = new JButton("%4");
        MouseListener ml = new MouseListener();
        for(int i=0; i<b.length; i++){
            b[i].setSize(70,50);
            b[i].setLocation(80+ i*80 ,200);
            b[i].addMouseListener(ml);
            getContentPane().add(b[i]);
        }
    }

    class MouseListener extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            setTitle("0으로 만들기");
            JButton bb = (JButton)e.getSource();
            bb.setEnabled(false);
            String la_text = la.getText();
            Integer la_int = Integer.parseInt(la_text);

            switch (bb.getText()){
                case "+2" : la_int +=2; la.setText(la_int.toString());  break;
                case "-1" : la_int -=1; la.setText(la_int.toString());  break;
                case "%4" : la_int %=4;;
                    if(la_int == 0) {
                    setTitle("성공");
                    Integer ran = (int)(Math.random()*60+1);
                    la.setText(ran.toString());
                    for(int i=0; i<b.length; i++) b[i].setEnabled(true);
                }
                    else{
                        setTitle("실패");
                        for(int i=0; i<b.length; i++) b[i].setEnabled(true);
                }
                    break;
            }
        }
    }
    public static void main(String[] args){
        new make_0_7();
    }
}
