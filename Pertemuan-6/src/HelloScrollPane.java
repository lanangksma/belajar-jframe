import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloScrollPane extends JFrame {

    public HelloScrollPane() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel labelInput = new JLabel("Input Nama");
        labelInput.setBounds(130, 40, 100, 10);

        JTextField textField = new JTextField();
        textField.setBounds(130, 60, 100, 30);

        JButton button = new JButton("Klik");
        button.setBounds(130, 100, 100, 40);

        JTextArea txtOutput = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(txtOutput);
        scrollPane.setBounds(130, 150, 100, 100);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textField.getText();
                txtOutput.append("Hello " + nama + "\n");
                textField.setText("");
            }
        });

        this.add(labelInput);
        this.add(textField);
        this.add(button);
        this.add(scrollPane);

        this.setSize(400, 500);
        this.setLayout(null);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            HelloScrollPane h = new HelloScrollPane();
            h.setVisible(true);
        });
    }

}
