package Using_Swing_Components;

import javax.swing.*;
import java.awt.*;

public class MenuEx extends JFrame {
    MenuEx() {
        setTitle("리스트 만들기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createMenu();
        setSize(250,200);
        setVisible(true);
    }

    void createMenu(){
        JMenuBar mb = new JMenuBar();
        JMenu screenMenu = new JMenu("Screen");

        screenMenu.add(new JMenuItem("Load"));
        screenMenu.add(new JMenuItem("Hide"));
        screenMenu.add(new JMenuItem("Reshow"));
        screenMenu.addSeparator();
        screenMenu.add(new JMenuItem("Exit"));

        mb.add(screenMenu);
        mb.add(new JMenu("Edit"));
        mb.add(new JMenu("Source"));
        mb.add(new JMenu("Project"));
        mb.add(new JMenu("Run"));

        //메뉴바를 프레임에 부착
        setJMenuBar(mb);
    }

    public static void main(String[] args) {
        new MenuEx();
    }
}
