import javax.swing.*; // Import semua class dari package javax.swing
import java.awt.*; // Import semua class dari package java.awt

// Membuat class HelloGridBagLayout yang merupakan turunan dari class JFrame
public class HelloGridBagLayout extends JFrame {

    // Membuat constructor HelloGridBagLayout
    public HelloGridBagLayout() {
        // Menutup aplikasi saat mengklik tombol close
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Membuat label header dengan teks Layout in action: GridBagLayout dan posisi di tengah
        JLabel headerLabel = new JLabel("Layout in action: GridBagLayout", JLabel.CENTER);

        // Membuat panel untuk menampung komponen lainnya dengan layout FlowLayout
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        // Membuat panel untuk menampung komponen lainnya dengan layout GridBagLayout
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray); // Mengatur warna background panel
        panel.setSize(300, 300); // Menentukan ukuran panel
        GridBagLayout layout = new GridBagLayout(); // Membuat objek GridBagLayout
        panel.setLayout(layout); // Mengatur layout dari panel
        GridBagConstraints gbc = new GridBagConstraints(); // Membuat objek GridBagConstraints

        // Membuat button dengan teks Button 1 dan menambahkannya ke panel dengan posisi di (0, 0) dan mengisi seluruh ruang horizontal dari panel
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JButton("Button 1"), gbc);

        // Membuat button dengan teks Button 2 dan menambahkannya ke panel dengan posisi di (1, 0) dan mengisi seluruh ruang horizontal dari panel
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(new JButton("Button 2"), gbc);

        // Membuat button dengan teks Button 3 dan menambahkannya ke panel dengan posisi di (0, 1) dan mengisi seluruh ruang horizontal dari panel dengan tinggi 20
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 20;
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JButton("Button 3"), gbc);

        // Membuat button dengan teks Button 4 dan menambahkannya ke panel dengan posisi di (1, 1) dan mengisi seluruh ruang horizontal dari panel
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(new JButton("Button 4"), gbc);

        // Membuat button dengan teks Button 5 dan menambahkannya ke panel dengan posisi di (0, 2) dan mengisi seluruh ruang horizontal dari panel dengan lebar 2
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 2;
        panel.add(new JButton("Button 5"), gbc);

        controlPanel.add(panel); // Menambahkan panel ke controlPanel

        // Menambahkan headerLabel dan controlPanel ke JFrame
        this.setLayout(new GridLayout(2, 1)); // Mengatur layout dari JFrame
        this.add(headerLabel);
        this.add(controlPanel);
        this.setSize(400, 400); // Menentukan ukuran JFrame
    }

    // Membuat method main
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                HelloGridBagLayout hello = new HelloGridBagLayout();
                hello.setVisible(true);
            }
        });
    }
}
