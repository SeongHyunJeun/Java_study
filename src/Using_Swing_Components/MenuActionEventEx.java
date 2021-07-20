package Using_Swing_Components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuActionEventEx extends JFrame {
    JLabel imgLabel = new JLabel();
    ImageIcon imgIcon = new ImageIcon("images/img.jpg");
    MenuActionEventEx(){
        setTitle("Menu에 Action 리스너 만들기 예제");
        createMenu();
        getContentPane().add(imgLabel, BorderLayout.CENTER);
        setSize(250,200);
        setVisible(true);
    }

    void createMenu(){
        JMenuBar mb = new JMenuBar();
        JMenu screenMenu = new JMenu("Screen");
        JMenuItem [] menuItems = new JMenuItem[4];
        String [] itemTitle = {"Load", "Hide", "ReShow", "Exit"};

        MenuActionListener listener = new MenuActionListener();
        for(int i=0; i<menuItems.length; i++){
            menuItems[i] = new JMenuItem(itemTitle[i]);
            menuItems[i].addActionListener(listener);
            screenMenu.add(menuItems[i]);
        }
        mb.add(screenMenu);
        setJMenuBar(mb);
    }

    class MenuActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String cmd = e.getActionCommand();   //사용자가 선택한 메뉴아이템의 문자열 리턴 , e.getSource 후 getText도 가능.
            switch (cmd){
                case "Load" :
                    if(imgLabel.getIcon() != null) return;
                    imgLabel.setIcon(imgIcon); break;

                case "Hide" :
                    imgLabel.setVisible(false); break;

                case "ReShow" :
                    imgLabel.setVisible(true); break;

                case "Exit" :
                    System.exit(0); break;

            }
        }
    }


    public static void main(String[] args) {
        new MenuActionEventEx();
    }
}
