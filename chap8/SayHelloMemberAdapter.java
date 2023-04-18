package chap8;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SayHelloMemberAdapter extends JFrame {

    JLabel lblHello;

    class Say extends MouseAdapter{

 
        @Override
        public void mouseEntered(MouseEvent e) {
            lblHello.setText("Hello.....by Panuwat");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            lblHello.setText("Bye.....by Panuwat");
        }

    }//end Say

    public SayHelloMemberAdapter() {
        JPanel panel = new JPanel();
        Font fnt = new Font("Tahoma", Font.BOLD, 30);
        lblHello = new JLabel("meet someone");
        lblHello.setFont(fnt);
        panel.add(lblHello);
        this.add(panel, BorderLayout.CENTER);
        lblHello.addMouseListener(new Say());
    }

    public static void main(String[] args) {
        JFrame frame = new SayHelloMemberAdapter();
        frame.setTitle("By Panuwat");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}//end
