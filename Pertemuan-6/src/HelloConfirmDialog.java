import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloConfirmDialog extends JFrame {

    public HelloConfirmDialog() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JButton button = new JButton("EXIT");
        button.setBounds(130, 100, 100, 40);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int confirmation = JOptionPane.showConfirmDialog(null, "Apakaj anda yakin ingin keluar dari apikasi?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (confirmation == JOptionPane.YES_OPTION) {
                    System.exit(0);
                } else {
                    JOptionPane.showMessageDialog(null, "Anda membatalkan keluar dari aplikasi");
                }
            }
        });

        this.add(button);

        this.setSize(200, 200);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                HelloConfirmDialog h = new HelloConfirmDialog();
                h.setVisible(true);
            }
        });
    }

}
