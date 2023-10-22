import javax.swing.*; // Import semua class dari package javax.swing
import java.awt.event.ActionEvent; // Import class ActionEvent dari package java.awt.event
import java.awt.event.ActionListener; // Import class ActionListener dari package java.awt.event

// Membuat class BiodataApp yang merupakan turunan dari class JFrame
public class BiodataApp extends JFrame {
    // Membuat constructor BiodataApp
    public BiodataApp() {
        // Konfigurasi frame utama
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Menutup aplikasi saat mengklik tombol close

        // Membuat label dan teks input untuk Nama
        JLabel labelNama = new JLabel("Nama: ");
        labelNama.setBounds(15, 40, 350, 10); // Menentukan posisi dan ukuran label

        JTextField textFieldNama = new JTextField();
        textFieldNama.setBounds(15, 60, 350, 30); // Menentukan posisi dan ukuran teks input

        // Membuat label dan teks input untuk Nomor HP
        JLabel labelNomorHP = new JLabel("Nomor HP: ");
        labelNomorHP.setBounds(15, 100, 350, 10);

        JTextField textFieldNomorHP = new JTextField();
        textFieldNomorHP.setBounds(15, 120, 350, 30);

        // Membuat label dan radio button untuk Jenis Kelamin
        JLabel labelRadio = new JLabel("Jenis Kelamin: ");
        labelRadio.setBounds(15, 160, 350, 10);

        JRadioButton radio1 = new JRadioButton("Laki-laki", true); // Radio button pertama yang dipilih
        radio1.setBounds(15, 180, 350, 30);

        JRadioButton radio2 = new JRadioButton("Perempuan"); // Radio button kedua
        radio2.setBounds(15, 210, 350, 30);

        ButtonGroup group = new ButtonGroup(); // Membuat grup untuk radio button
        group.add(radio1);
        group.add(radio2);

        // Membuat checkbox untuk Warga Negara Asing
        JCheckBox checkBox = new JCheckBox("Warga Negara Asing");
        checkBox.setBounds(15, 250, 350, 30);

        // Membuat tombol "Simpan" dan area teks output
        JButton button = new JButton("Simpan");
        button.setBounds(15, 290, 100, 40);

        JTextArea output = new JTextArea("");
        output.setBounds(15, 340, 350, 100);

        // Menambahkan action listener ke tombol "Simpan"
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mengambil nilai dari radio button yang dipilih
                String jenisKelamin = "";
                if (radio1.isSelected()) {
                    jenisKelamin = radio1.getText();
                }
                if (radio2.isSelected()) {
                    jenisKelamin = radio2.getText();
                }

                String nama = textFieldNama.getText(); // Mengambil nilai dari teks input nama
                String nomorHP = textFieldNomorHP.getText(); // Mengambil nilai dari teks input nomorHP
                String wargaNegara = checkBox.isSelected() ? "Warga Negara Asing" : "Bukan Warga Negara Asing"; // Mengambil nilai dari checkbox

                // Validasi apakah nama, nomorHP, dan jenisKelamin sudah diisi
                if (nama.isEmpty() || nomorHP.isEmpty() || jenisKelamin.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Harap isi Nama, Nomor HP, dan Jenis Kelamin.");
                    return; // Menghentikan eksekusi jika salah satu tidak diisi
                }

                // Menghapus isi output sebelum menambahkan yang baru
                output.setText("");

                // Menambahkan output yang baru
                output.append("Nama: " + nama + "\nNomor HP: " + nomorHP + "\nJenis Kelamin: " + jenisKelamin + "\n" + wargaNegara + "\n");

                textFieldNama.setText(""); // Membersihkan teks input nama
                textFieldNomorHP.setText(""); // Membersihkan teks input nomorHP
                group.clearSelection(); // Membersihkan seleksi radio button
            }
        });

        // Menambahkan elemen-elemen ke frame
        this.add(button);
        this.add(output);
        this.add(textFieldNama);
        this.add(labelNama);
        this.add(textFieldNomorHP);
        this.add(labelNomorHP);
        this.add(labelRadio);
        this.add(radio1);
        this.add(radio2);
        this.add(checkBox);

        // Konfigurasi frame utama
        this.setSize(400, 500); // Menentukan ukuran frame
        this.setLayout(null); // Menggunakan tata letak nol
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Membuat instance BiodataApp dan menampilkannya.
                BiodataApp biodata = new BiodataApp();
                biodata.setVisible(true);
            }
        });
    }
}
