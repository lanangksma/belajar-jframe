import javax.swing.*; // Import semua class dari package javax.swing
import java.awt.event.ActionEvent; // Import class ActionEvent dari package java.awt.event
import java.awt.event.ActionListener; // Import class ActionListener dari package java.awt.event

// Membuat class HelloRadioButton yang merupakan turunan dari class JFrame
public class HelloRadioButton extends JFrame {

    // Membuat constructor HelloRadioButton
    public HelloRadioButton(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Menutup aplikasi saat mengklik tombol close

        // Membuat label dan teks input untuk Nama
        JLabel labelInput = new JLabel("Nama: ");
        labelInput.setBounds(15, 40,350,10);

        // Membuat teks input
        JTextField textField = new JTextField();
        textField.setBounds(15,60,350,30);

        // Membuat label dan radio button untuk Jenis Kelamin
        JLabel radioLabel = new JLabel("Jenis member:");
        radioLabel.setBounds(15, 100, 350, 10);

        // Membuat radio button
        JRadioButton radio1 = new JRadioButton("Silver", true);
        radio1.setBounds(15, 115, 350, 30);

        // Membuat radio button
        JRadioButton radio2 = new JRadioButton("Gold");
        radio2.setBounds(15, 145, 350, 30);

        // Membuat radio button
        JRadioButton radio3 = new JRadioButton("Platinum");
        radio3.setBounds(15, 175, 350, 30);

        // Membuat grup untuk radio button
        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        group.add(radio3);

        // Membuat tombol "Simpan" dan area teks output
        JButton button = new JButton("Simpan");
        button.setBounds(15, 205, 100, 40);

        // Membuat area teks output
        JTextArea output = new JTextArea("");
        output.setBounds(15, 255, 350, 100);

        // Menambahkan action listener ke tombol "Simpan"
        button.addActionListener(new ActionListener() {
            // Mengambil nilai dari radio button yang dipilih
            @Override
            public void actionPerformed(ActionEvent e) {
                String jenisMember = "";

                if (radio1.isSelected()){
                    jenisMember = radio1.getText();
                }
                if (radio2.isSelected()){
                    jenisMember = radio2.getText();
                }
                if (radio3.isSelected()){
                    jenisMember = radio1.getText();
                }

                // Mengambil nilai dari radio button yang dipilih
                String nama = textField.getText();
                output.append("Hello "+nama+"\njenis member anda "+jenisMember+"\n");
                textField.setText("");
            }
        });

        // Menambahkan komponen ke frame utama
        this.add(button);
        this.add(output);
        this.add(textField);
        this.add(labelInput);
        this.add(radioLabel);
        this.add(radio1);
        this.add(radio2);
        this.add(radio3);

        this.setSize(400, 500);
        this.setLayout(null);
    }

    // Membuat method main
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() { // Menjalankan aplikasi
            @Override
            public void run() {
                HelloRadioButton Hello = new HelloRadioButton();
                Hello.setVisible(true);
            }
        });
    }
}
