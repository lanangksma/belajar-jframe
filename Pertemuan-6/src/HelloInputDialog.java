import javax.swing.*;
import java.awt.*;

public class HelloInputDialog extends JFrame {

    public HelloInputDialog() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JButton button = new JButton("Input");
        button.setBounds(130, 100, 100, 40);

        button.addActionListener(e -> {
            String name = JOptionPane.showInputDialog("Masukkan nama anda");
            JOptionPane.showMessageDialog(null, "Hello " + name);
        });

        this.add(button);

        this.setSize(200, 200);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            HelloInputDialog h = new HelloInputDialog();
            h.setVisible(true);
        });
    }

}
