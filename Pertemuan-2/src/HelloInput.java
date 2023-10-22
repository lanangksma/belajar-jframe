import javax.swing.*;
import java.awt.event.*;

public class HelloInput extends JFrame{

    public HelloInput() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Input Nama");
        label.setBounds(100, 400, 100, 10);

        JButton btn = new JButton("Klik");
        btn.setBounds(100, 60, 100, 30);

        JTextField field = new JTextField();
        field.setBounds(130, 100, 100, 40);

        JLabel output = new JLabel("");
        output.setBounds(100, 150, 100, 10);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = field.getText();
                output.setText("Hello"+nama);
            }
        });

        this.add(btn);
        this.add(label);
        this.add(output);
        this.add(field);

        this.setSize(400, 500);
        this.setLayout(null);

    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                HelloInput h = new HelloInput();
                h.setVisible(true);
            }
        });
    }

}
