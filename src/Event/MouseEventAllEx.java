package Event;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseEventAllEx extends JFrame {
    JLabel la = new JLabel(   "Move Me");

    MouseEventAllEx(){
        setTitle("MouseListener와 MouseMotionListener 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
        la.setSize(80,20);
        la.setLocation(100,80);
        c.addMouseListener(new MyMouseListener());
        c.addMouseMotionListener(new MyMouseListener());
        c.add(la);
        setSize(300,200);
        setVisible(true);
    }

    class MyMouseListener extends MouseAdapter{

        @Override
        public void mousePressed(MouseEvent e) {
            la.setLocation(e.getX(),e.getY());
            setTitle("mousePressed("+e.getX()+","+e.getY() + ")");
            }

        @Override
        public void mouseReleased(MouseEvent e) {
            la.setLocation(e.getX(),e.getY());
            setTitle("mouseReleased("+e.getX()+","+e.getY() + ")");
        }


        @Override
        public void mouseEntered(MouseEvent e) {
            Component comp = (Component)e.getSource();
            comp.setBackground(Color.CYAN);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            Component comp = (Component)e.getSource();
            comp.setBackground(Color.YELLOW);
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            la.setLocation(e.getX(),e.getY());
            setTitle("mouseDragged("+e.getX()+","+e.getY() + ")");
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            la.setLocation(e.getX(),e.getY());
            setTitle("mouseMoved("+e.getX()+","+e.getY() + ")");
        }
    }


    public static void main(String[] args){
        new MouseEventAllEx();
    }
}
