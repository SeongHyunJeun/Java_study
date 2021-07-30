package Graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

public class GraphicsDrawLineMouseEx extends JFrame {
    GraphicsDrawLineMouseEx(){
        setTitle("마우스로 여러개의 선 그리기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyPanel());

        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GraphicsDrawLineMouseEx();
    }

    //선을 그릴 수 있는 패널을 구현한다.
    //이 패널에 Mouse 리스너를 구현한다.
    class MyPanel extends JPanel{
        //그려진 선을 모두 저장하기 위해 시작점은 vStart에
        //끝점은 vEnd 벡터에 각각 저장한다
        Vector<Point> vStart = new Vector<Point>();
        Vector<Point> vEnd = new Vector<Point>();

        public MyPanel(){

            //Mouse 리스너를 등록한다.
            // 이 리스너는 마우스 버튼이 눌러지면 마우스 포인터(시작점)를 vStart 벡터에 저장하고
            // 마우스 버튼이 놓여지면 마우스 포인터(끝점)를 vEnd 벡터에 저장한다.

            addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    Point startP = e.getPoint();
                    vStart.add(startP);
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    Point endP = e.getPoint();
                    vEnd.add(endP);
                    //패널의 다시 그리기를 요청
                    repaint();
                }
            });
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.BLUE);

            for(int i=0; i<vStart.size(); i++){
                Point s= vStart.elementAt(i);
                Point e = vEnd.elementAt(i);

                //시작점에서 끝점까지 선을 그린다.
                g.drawLine((int)s.getX(), (int) s.getY(), (int) e.getX(), (int) e.getY());
            }
        }
    }
}
