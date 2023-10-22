import javax.swing.*; // Import semua class dari package javax.swing
import java.awt.event.ActionEvent; // Import class ActionEvent dari package java.awt.event
import java.awt.event.ActionListener; // Import class ActionListener dari package java.awt.event
import java.awt.event.ItemEvent; // Import class ItemEvent dari package java.awt.event
import java.awt.event.ItemListener; // Import class ItemListener dari package java.awt.event

// Membuat class HelloCheckBox yang merupakan turunan dari class JFrame
public class HelloCheckBox extends JFrame {

    // Membuat atribut checkBoxSelected
    private boolean checkBoxSelected;

    // Membuat constructor HelloCheckBox
    public HelloCheckBox() {
        this.checkBoxSelected = false; // Menginisialisasi checkBoxSelected dengan false
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Menutup aplikasi saat mengklik tombol close

        // Membuat label dan teks input untuk Nama
        JLabel labelInput = new JLabel("Input nama");
        labelInput.setBounds(15,40,350,10);

        // Membuat teks input
        JTextField textField = new JTextField();
        textField.setBounds(15,60,350,30);

        // Membuat checkbox
        JCheckBox checkBox = new JCheckBox("Saya menyetujui syarat dan ketentuan yang berlaku");
        checkBox.setBounds(15,100,350,10);

        // Membuat tombol "Simpan" dan area teks output
        JButton button = new JButton("Simpan");
        button.setBounds(15,150,100,40);

        // Membuat area teks output
        JTextArea output = new JTextArea("");
        output.setBounds(15,200,350,100);

        // Menambahkan action listener ke tombol "Simpan"
        checkBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                checkBoxSelected = e.getStateChange()==1;
            }
        });

        // Menambahkan action listener ke tombol "Simpan"
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mengambil nilai dari radio button yang dipilih
                if (checkBoxSelected){
                    String nama = textField.getText();
                    output.append("Hello "+nama+"\n");
                    textField.setText("");
                } else {
                    output.append("Anda tidak mencentang kotak persetujuan\n");
                }
            }
        });

        // Menambahkan komponen ke frame utama
        this.add(button);
        this.add(output);
        this.add(textField);
        this.add(labelInput);
        this.add(checkBox);

        this.setSize(400, 500);
        this.setLayout(null);


    }

    // Membuat method main
    public static void main(String[] args) {
        // Menjalankan aplikasi
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                HelloCheckBox Hello = new HelloCheckBox();
                Hello.setVisible(true);
            }
        });
    }

}
