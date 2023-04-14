import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingMain {


    JFrame jFrame;

    public static void main(String[] args) {
        SwingMain swingMain = new SwingMain();
        swingMain.go();
    }

    public void go() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        jFrame = new JFrame();

        JButton jButton = new JButton("Should I do it ?");

        jButton.addActionListener(new AngelListener());
        jButton.addActionListener(new DevilListener());

        jFrame.getContentPane().add(BorderLayout.CENTER, jButton);

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // 显示窗口
        jFrame.pack();
        jFrame.setVisible(true);
    }

    static class AngelListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            System.out.println("Don't do it, you might regret it!");
        }
    }

    static class DevilListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            System.out.println("Come on, do it!");
        }
    }

}
