import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnEventSwing extends JFrame {

    public BtnEventSwing(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello World");
        label.setBounds(130, 40, 400, 10);

        JButton btn = new JButton("Klik");
        btn.setBounds(130, 100,100, 40);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Hello Pemograman II");
            }
        });

        this.add(btn);
        this.add(label);

        this.setSize(400, 500);
        this.setLayout(null);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                BtnEventSwing btnn = new BtnEventSwing();
                btnn.setVisible(true);
            }
        });
    }

}
