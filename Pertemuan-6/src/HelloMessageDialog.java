import javax.swing.*; // Import semua class dari package javax.swing
import java.awt.*; // Import semua class dari package java.awt
import java.awt.event.ActionEvent; // Import class ActionEvent dari package java.awt.event
import java.awt.event.ActionListener; // Import class ActionListener dari package java.awt.event

// Membuat class HelloMessageDialog yang merupakan turunan dari class JFrame
public class HelloMessageDialog extends JFrame {

    // Membuat constructor HelloMessageDialog
    public HelloMessageDialog() {
        // Menutup aplikasi saat mengklik tombol close
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Mengatur layout frame utama
        this.setLayout(new FlowLayout());

        // Membuat tombol "Klik!" dan menentukan posisi dan ukurannya
        JButton button = new JButton("Klik!");
        button.setBounds(130, 100, 100, 40);

        // Menambahkan action listener untuk tombol "Klik!" dengan JOptionPane sebagai actionnya
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Menampilkan pesan dialog
                JOptionPane.showMessageDialog(HelloMessageDialog.this, "Halo, selamat datang di praktikum pemograman II");
            }
        });

        // Menambahkan tombol "Klik!" ke frame utama dan menentukan ukuran frame utama
        this.add(button);
        this.setSize(200, 200);
    }

    // Membuat method main untuk menjalankan aplikasi GUI
    public static void main(String[] args) {
        // Menjalankan aplikasi GUI dengan menggunakan thread yang berjalan di EDT (Event Dispatch Thread)
        javax.swing.SwingUtilities.invokeLater(() -> {
            // Membuat objek HelloMessageDialog dan menampilkannya
            HelloMessageDialog h = new HelloMessageDialog();
            h.setVisible(true);
        });
    }
}
