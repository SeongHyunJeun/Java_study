package Using_Swing_Components.Practice;

import javax.swing.*;
import java.awt.*;

public class Menu_2 extends JFrame {
    Menu_2(){
        setTitle("4 Images");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createMenu();
        setSize(400,300);
        setVisible(true);
    }

    void createMenu(){
        String [] menuName = {"파일","편집","보기","입력"};
        JMenu [] mn = new JMenu[4];
        JMenuBar mb = new JMenuBar();

        for(int i=0; i<mn.length; i++) {
            mn[i] = new JMenu(menuName[i]);
            if (mn[i].getText().equals("보기")) {
                mn[i].add(new JMenuItem("화면확대"));
                mn[i].addSeparator();
                mn[i].add(new JMenuItem("쪽윤곽"));
            }

            mb.add(mn[i]);
        }
        setJMenuBar(mb);
    }

    public static void main(String[] args) {
        new Menu_2();
    }
}
