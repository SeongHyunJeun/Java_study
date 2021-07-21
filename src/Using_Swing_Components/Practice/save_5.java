package Using_Swing_Components.Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class save_5 extends JFrame {
    JTextArea ta = new JTextArea();

    save_5(){
        setTitle("파일 저장");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        createMenu();
        c.add(new JScrollPane(ta));
        setSize(400,300);
        setVisible(true);
    }

    void createMenu(){
        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("파일");
        JMenuItem save = new JMenuItem("저장");
        file.add(save);
        mb.add(file);
        save.addActionListener(new MyActionListener());
        setJMenuBar(mb);
    }


    class MyActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(ta.getText().length() == 0) {
                JOptionPane.showMessageDialog(save_5.this,
                        "입력된 내용이 없습니다.",
                        "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            String fileName = JOptionPane.showInputDialog("저장할 파일명을 입력하세요");

            if(fileName == null) {
                JOptionPane.showMessageDialog(save_5.this,
                        "파일을 저장하지 않습니다.",
                        "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }

            try{
                FileWriter fout = new FileWriter(fileName);
                String t = ta.getText();

                StringTokenizer st = new StringTokenizer(ta.getText(), "\n");

                while(st.hasMoreTokens()){
                    fout.write(st.nextToken());
                    fout.write("\r\n");
                }
                fout.close();
            } catch (IOException e1) {}
        }
    }

    public static void main(String[] args) {
        new save_5();
    }
}
