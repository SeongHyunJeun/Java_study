package Thread;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class VibratingFrame extends JFrame implements Runnable {
    Thread th;
    public VibratingFrame(){
        setTitle("진동하는 프레임 만들기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200,200);
        setLocation(300, 300);
        setVisible(true);

        getContentPane().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if(!th.isAlive()) return;
                th.interrupt();
            }
        });

        th = new Thread(this); // 진동 스레드 객체 생성
        th.start();
    }

    @Override
    public void run() {

        Random r = new Random();
        while (true){
            try {
                Thread.sleep(20);
            }
            catch (InterruptedException e){
                return;
            }
            int x = getX() + r. nextInt()%5;
            int y = getY() + r.nextInt()%5;
            setLocation(x,y);
        }
    }

    public static void main(String[] args) {
        new VibratingFrame();
    }
}
