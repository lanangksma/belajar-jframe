import javax.swing.*; // import semua class dari package javax.swing
import java.awt.*; // import semua class dari package java.awt

// class HelloInputDialog merupakan turunan dari class JFrame
public class HelloInputDialog extends JFrame {

    // constructor HelloInputDialog
    public HelloInputDialog() {
        // ketika tombol close di klik, maka program akan berhenti
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // set layout dari JFrame menjadi FlowLayout
        this.setLayout(new FlowLayout());

        // membuat button dengan teks "Input" dan mengatur posisinya (130, 100) dengan ukuran (100, 40)
        JButton button = new JButton("Input");
        button.setBounds(130, 100, 100, 40);

        // ketika button di klik, maka akan muncul dialog untuk memasukkan nama. ShownInputDialog akan mengembalikan nilai string yang diinputkan
        // kemudian nilai tersebut akan ditampilkan dengan menggunakan JOptionPane
        button.addActionListener(e -> {
            String name = JOptionPane.showInputDialog("Masukkan nama anda");
            JOptionPane.showMessageDialog(null, "Hello " + name);
        });

        this.add(button); // menambahkan button ke JFrame

        this.setSize(200, 200); // mengatur ukuran JFrame menjadi 200x200
    }

    // membuat method main untuk menjalankan aplikasi GUI
    public static void main(String[] args) {
        // menjalankan aplikasi GUI dengan menggunakan thread yang berjalan di EDT (Event Dispatch Thread)
        javax.swing.SwingUtilities.invokeLater(() -> {
            HelloInputDialog h = new HelloInputDialog();
            h.setVisible(true);
        });
    }

}
