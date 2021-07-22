package Using_Swing_Components.Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Random_Click_8 extends JFrame {
    JLabel [] la = new JLabel[10];
    int [] x = new int[10];
    int [] y = new int[10];


    Random_Click_8(){
        setTitle("Ten 레이블 클릭");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
        createLabel();
        setSize(400,400);
        setVisible(true);
        }


        class Listener extends MouseAdapter {
            int index = 0;

            @Override
            public void mousePressed(MouseEvent e) {
                JLabel l = (JLabel) e.getSource();
                if (l.getText().equals(Integer.toString(index))) {
                    la[index].setVisible(false);
                    index++;
                }
                if(index ==10) {
                    JOptionPane.showMessageDialog(Random_Click_8.this,"성공",
                                            "성공",JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                }
                }
        }


    void createLocation(){
        for(int i=0; i<x.length; i++){
            x[i] = (int)(Math.random()* 350 );
            for(int j=i-1; j>=0; j--){
                if(x[i] == x[j]) i--;
            }
        }
        System.out.println();

        for(int i=0; i<y.length; i++){
            y[i] = (int)(Math.random()* 350 );
            for(int j=i-1; j>=0; j--){
                if(y[i] == y[j]) i--;
            }
        }
    }


    void createLabel() {
        Font f = new Font("arial",Font.BOLD,20);
        Listener li = new Listener();
        createLocation();

        for (int i = 0; i < la.length; i++) {
            la[i] = new JLabel(Integer.toString(i));
            la[i].setBounds(x[i],y[i],20,20);           // (x축, y축, width, height)
            la[i].setForeground(Color.MAGENTA);
            la[i].setFont(f);
            la[i].addMouseListener(li);
            getContentPane().add(la[i]);
        }
    }


    public static void main(String[] args) {
         new Random_Click_8();
        }
    }

