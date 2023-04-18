package chap8;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SayHelloAnonymousAdapter extends JFrame {

    JLabel lblHello;

    public SayHelloAnonymousAdapter() {
        Random random = new Random();//random
        JPanel panel = new JPanel();
        Font fnt = new Font("Tahoma", Font.BOLD, 30);
        lblHello = new JLabel("Lucky Number");
        lblHello.setFont(fnt);
        panel.add(lblHello);
        this.add(panel, BorderLayout.CENTER);
        lblHello.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {               
                lblHello.setText(String.valueOf(random.nextInt(999)));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblHello.setText("You are lucky");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new  SayHelloAnonymousAdapter();
        frame.setTitle("By Panuwat");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}//end
