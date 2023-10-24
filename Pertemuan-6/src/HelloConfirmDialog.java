import javax.swing.*; // import semua class dari package javax.swing
import java.awt.*; // import semua class dari package java.awt
import java.awt.event.ActionEvent; // import class ActionEvent dari package java.awt.event
import java.awt.event.ActionListener; // import class ActionListener dari package java.awt.event

// class HelloConfirmDialog yang diturunkan dari class JFrame
public class HelloConfirmDialog extends JFrame {

    // constructor HelloConfirmDialog
    public HelloConfirmDialog() {
        // ketika tombol close di klik, maka aplikasi akan berhenti
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // set layout dari JFrame ini menjadi FlowLayout
        this.setLayout(new FlowLayout());

        // membuat JButton dengan teks "EXIT" dan mengatur posisi di (130, 100) dengan ukuran 100 x 40

        JButton button = new JButton("EXIT");
        button.setBounds(130, 100, 100, 40);

        // menambahkan event listener untuk button, ketika button di klik, maka akan muncul dialog konfirmasi JOptionPane dengan pilihan YES dan NO untuk keluar dari aplikasi.
        // jika pilihan YES dipilih, maka aplikasi akan berhenti, jika pilihan NO dipilih, maka akan muncul dialog JOptionPane yang memberitahukan bahwa anda membatalkan keluar dari aplikasi
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

        // menambahkan button ke JFrame
        this.add(button);
        // mengatur ukuran JFrame menjadi 200 x 200
        this.setSize(200, 200);
    }

    // Membuat method main untuk menjalankan aplikasi GUI
    public static void main(String[] args) {
        // menjalankan aplikasi GUI dengan menggunakan thread yang berjalan di EDT (Event Dispatch Thread)
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                HelloConfirmDialog h = new HelloConfirmDialog();
                h.setVisible(true);
            }
        });
    }

}
