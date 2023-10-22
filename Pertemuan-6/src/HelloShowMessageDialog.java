import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloShowMessageDialog extends JFrame {

    public HelloShowMessageDialog() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton error = new JButton("Show Message Dialog ERROR");
        JButton infromation = new JButton("Show Message Dialog INFORMATION");
        JButton warning = new JButton("Show Message Dialog WARNING");
        JButton question = new JButton("Show Message Dialog QUESTION");
        JButton plain = new JButton("Show Message Dialog PLAIN");
        this.setLayout(new FlowLayout());

        error.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(HelloShowMessageDialog.this, "Halo, selamat datang di praktikum pemograman II", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        });

        infromation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(HelloShowMessageDialog.this, "Halo, selamat datang di praktikum pemograman II", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        warning.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(HelloShowMessageDialog.this, "Halo, selamat datang di praktikum pemograman II", "WARNING", JOptionPane.WARNING_MESSAGE);
            }
        });

        question.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(HelloShowMessageDialog.this, "Halo, selamat datang di praktikum pemograman II", "QUESTION", JOptionPane.QUESTION_MESSAGE);
            }
        });

        plain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(HelloShowMessageDialog.this, "Halo, selamat datang di praktikum pemograman II", "PLAIN", JOptionPane.PLAIN_MESSAGE);
            }
        });

        this.add(error);
        this.add(infromation);
        this.add(warning);
        this.add(question);
        this.add(plain);

        this.setSize(400, 400);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            HelloShowMessageDialog h = new HelloShowMessageDialog();
            h.setVisible(true);
        });
    }
}
