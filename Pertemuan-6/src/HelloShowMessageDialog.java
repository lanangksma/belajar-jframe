import javax.swing.*; // Import semua class dari package javax.swing
import java.awt.*; // Import semua class dari package java.awt
import java.awt.event.ActionEvent; // Import class ActionEvent dari package java.awt.event
import java.awt.event.ActionListener; // Import class ActionListener dari package java.awt.event

// Membuat class HelloShowMessageDialog yang merupakan turunan dari class JFrame
public class HelloShowMessageDialog extends JFrame {

    // Membuat constructor HelloShowMessageDialog
    public HelloShowMessageDialog() {
        // Menutup aplikasi saat mengklik tombol close
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Membuat tombol-tombol untuk menampilkan pesan dialog
        JButton error = new JButton("Show Message Dialog ERROR");
        JButton infromation = new JButton("Show Message Dialog INFORMATION");
        JButton warning = new JButton("Show Message Dialog WARNING");
        JButton question = new JButton("Show Message Dialog QUESTION");
        JButton plain = new JButton("Show Message Dialog PLAIN");

        // Mengatur layout frame utama menjadi FlowLayout
        this.setLayout(new FlowLayout());

        // Menambahkan action listener untuk tombol error dengan JOptionPane ERROR_MESSAGE sebagai actionnya
        error.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(HelloShowMessageDialog.this, "Halo, selamat datang di praktikum pemograman II", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Menambahkan action listener untuk tombol infromation dengan JOptionPane INFORMATION_MESSAGE sebagai actionnya
        infromation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(HelloShowMessageDialog.this, "Halo, selamat datang di praktikum pemograman II", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Menambahkan action listener untuk tombol warning dengan JOptionPane WARNING_MESSAGE sebagai actionnya
        warning.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(HelloShowMessageDialog.this, "Halo, selamat datang di praktikum pemograman II", "WARNING", JOptionPane.WARNING_MESSAGE);
            }
        });

        // Menambahkan action listener untuk tombol question dengan JOptionPane QUESTION_MESSAGE sebagai actionnya
        question.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(HelloShowMessageDialog.this, "Halo, selamat datang di praktikum pemograman II", "QUESTION", JOptionPane.QUESTION_MESSAGE);
            }
        });

        // Menambahkan action listener untuk tombol plain dengan JOptionPane PLAIN_MESSAGE sebagai actionnya
        plain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(HelloShowMessageDialog.this, "Halo, selamat datang di praktikum pemograman II", "PLAIN", JOptionPane.PLAIN_MESSAGE);
            }
        });
        // NOTE : HelloShowMessageDialog.this merupakan parent component dari JOptionPane yang akan ditampilkan di tengah-tengah frame utama (HelloShowMessageDialog)

        // Menambahkan tombol-tombol ke frame utama dan menentukan ukuran frame utama
        this.add(error);
        this.add(infromation);
        this.add(warning);
        this.add(question);
        this.add(plain);

        // Menentukan ukuran frame utama menjadi 400x400
        this.setSize(400, 400);
    }

    // Membuat method main untuk menjalankan aplikasi GUI
    public static void main(String[] args) {
        // Menjalankan aplikasi GUI dengan menggunakan thread yang berjalan di EDT (Event Dispatch Thread)
        javax.swing.SwingUtilities.invokeLater(() -> {
            HelloShowMessageDialog h = new HelloShowMessageDialog();
            h.setVisible(true);
        });
    }
}
