import javax.swing.*; // Import semua class dari package javax.swing
import java.awt.event.ActionEvent; // Import class ActionEvent dari package java.awt.event
import java.awt.event.ActionListener; // Import class ActionListener dari package java.awt.event

// Class HelloScrollPane yang merupakan turunan dari class JFrame
public class HelloScrollPane extends JFrame {

    // Constructor HelloScrollPane
    public HelloScrollPane() {
        // Menutup aplikasi ketika tombol close ditekan
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Membuat label dengan teks "Input Nama" dan menempatkannya di posisi (130, 40) dengan ukuran 100 x 10
        JLabel labelInput = new JLabel("Input Nama");
        labelInput.setBounds(130, 40, 100, 10);

        // Membuat text field dan menempatkannya di posisi (130, 60) dengan ukuran 100 x 30
        JTextField textField = new JTextField();
        textField.setBounds(130, 60, 100, 30);

        // Membuat button dengan teks "Klik" dan menempatkannya di posisi (130, 100) dengan ukuran 100 x 40
        JButton button = new JButton("Klik");
        button.setBounds(130, 100, 100, 40);

        // Membuat text area dan scrollPane untuk menampung text area. dengan posisi (130, 150) dan ukuran 100 x 100
        JTextArea txtOutput = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(txtOutput);
        scrollPane.setBounds(130, 150, 100, 100);

        // Mengatur scroll bar agar selalu muncul baik secara horizontal maupun vertikal
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        // Menambahkan action listener pada button ketika button ditekan akan menambahkan teks "Hello " + nama ke text area
        // dan mengosongkan text field setelah button ditekan
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textField.getText();
                txtOutput.append("Hello " + nama + "\n");
                textField.setText("");
            }
        });

        // Menambahkan label, text field, button, dan scroll pane ke frame
        this.add(labelInput);
        this.add(textField);
        this.add(button);
        this.add(scrollPane);

        // Mengatur ukuran frame menjadi 400 x 500 dan mengatur agar frame tidak dapat diubah ukurannya
        this.setSize(400, 500);
        this.setLayout(null);
    }

    // Membuat method main untuk menjalankan aplikasi GUI
    public static void main(String[] args) {
        // Menjalankan aplikasi GUI dengan menggunakan thread yang berjalan di EDT (Event Dispatch Thread)
        javax.swing.SwingUtilities.invokeLater(() -> {
            HelloScrollPane h = new HelloScrollPane();
            h.setVisible(true);
        });
    }

}
