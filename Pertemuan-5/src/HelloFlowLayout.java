import javax.swing.*; // Import semua class dari package javax.swing
import java.awt.*; // Import semua class dari package java.awt

// Membuat class HelloFlowLayout yang merupakan turunan dari class JFrame
public class HelloFlowLayout extends JFrame {

    // Membuat constructor HelloFlowLayout
    public HelloFlowLayout() {
        // Menutup aplikasi saat mengklik tombol close
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button1 = new JButton(" 1"); // Membuat button dengan teks 1
        JButton button2 = new JButton(" 2"); // Membuat button dengan teks 2
        JButton button3 = new JButton(" 3"); // Membuat button dengan teks 3
        JButton button4 = new JButton(" 4"); // Membuat button dengan teks 4
        JButton button5 = new JButton(" 5"); // Membuat button dengan teks 5
        JButton button6 = new JButton(" 6"); // Membuat button dengan teks 6
        JButton button7 = new JButton(" 7"); // Membuat button dengan teks 7
        JButton button8 = new JButton(" 8"); // Membuat button dengan teks 8
        JButton button9 = new JButton(" 9"); // Membuat button dengan teks 9
        JButton button10 = new JButton(" 10"); // Membuat button dengan teks 10
        this.setLayout(new FlowLayout()); // Mengatur layout dari JFrame

        // Menambahkan button ke JFrame
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.add(button5);
        this.add(button6);
        this.add(button7);
        this.add(button8);
        this.add(button9);
        this.add(button10);

        this.setSize(400, 400); // Menentukan ukuran JFrame
    }

    // Membuat method main
    public static void main(String[] args) {
        // Membuat thread untuk menjalankan JFrame
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                HelloFlowLayout hello = new HelloFlowLayout();
                hello.setVisible(true);
            }
        });
    }
}
