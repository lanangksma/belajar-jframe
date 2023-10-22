import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloMessageDialog extends JFrame {

    public HelloMessageDialog() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(new FlowLayout());

        JButton button = new JButton("Klik!");
        button.setBounds(130, 100, 100, 40);

//        button.addActionListener(e -> {
//            JOptionPane.showMessageDialog(HelloMessageDialog.this, "Halo, selamat datang di praktikum pemograman II");
//        });

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(HelloMessageDialog.this, "Halo, selamat datang di praktikum pemograman II");
            }
        });

        this.add(button);
        this.setSize(200, 200);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            HelloMessageDialog h = new HelloMessageDialog();
            h.setVisible(true);
        });
    }
}
