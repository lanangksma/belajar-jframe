import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloBorderLayout extends JFrame {

    public HelloBorderLayout() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel pertanyaan = new JLabel("Apaa Ibukota Negara Indonesia?");
        JLabel labelHasil = new JLabel("Jawaba pertanyaan diatas!!");

        JButton jawaban1 = new JButton("Jakarta");
        JButton jawaban2 = new JButton("Bandung");
        JButton jawaban3 = new JButton("Surabaya");

        jawaban1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                labelHasil.setText("Jawaban anda benar!");
            }
        });

        jawaban2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                labelHasil.setText("Jawaban anda salah!");
            }
        });

        jawaban3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                labelHasil.setText("Jawaban anda salah!");
            }
        });

        this.add(pertanyaan, BorderLayout.NORTH);
        this.add(labelHasil, BorderLayout.SOUTH);
        this.add(jawaban1, BorderLayout.WEST);
        this.add(jawaban2, BorderLayout.CENTER);
        this.add(jawaban3, BorderLayout.EAST);

        this.setSize(400, 200);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                HelloBorderLayout hello = new HelloBorderLayout();
                hello.setVisible(true);
            }
        });
    }
}
