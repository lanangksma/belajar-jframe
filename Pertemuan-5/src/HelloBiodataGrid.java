import javax.swing.*; // Import semua class dari package javax.swing
import java.awt.*; // Import semua class dari package java.awt
import java.awt.event.ActionEvent; // Import class ActionEvent dari package java.awt.event
import java.awt.event.ActionListener; // Import class ActionListener dari package java.awt.event

// Membuat class HelloBiodataGrid yang merupakan turunan dari class JFrame
public class HelloBiodataGrid extends JFrame {

    // Membuat constructor HelloBiodataGrid
    public HelloBiodataGrid() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Menutup aplikasi saat mengklik tombol close

        JLabel headerLabel = new JLabel("Form Biodata", JLabel.CENTER);// Membuat label header

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());// Mengatur layout dari controlPanel

        JPanel panel = new JPanel();
        panel.setSize(500, 500);// Menentukan ukuran panel
        GridBagLayout layout = new GridBagLayout();
        panel.setLayout(layout);// Mengatur layout dari panel
        GridBagConstraints gbc = new GridBagConstraints();

        // Membuat label dan teks input untuk Nama
        gbc.fill = GridBagConstraints.HORIZONTAL;// Mengatur agar komponen mengisi seluruh ruang horizontal
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JLabel("Nama"), gbc);

        // Membuat label dan teks input untuk Nomor HP
        gbc.gridx = 0;
        gbc.gridy = 1;
        JTextField textFieldNama = new JTextField(8);
        panel.add(textFieldNama, gbc);

        // Membuat label dan radio button untuk Jenis Kelamin
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Nomor hp"), gbc);

        // Membuat label dan teks input untuk Nomor HP
        gbc.gridx = 0;
        gbc.gridy = 3;
        JTextField textFieldNomorHP = new JTextField(8);
        panel.add(textFieldNomorHP, gbc);

        // Membuat label dan radio button untuk Jenis Kelamin
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(new JLabel("Jenis Kelamin"), gbc);

        // Membuat label dan radio button untuk Jenis Kelamin
        gbc.gridx = 1;
        gbc.gridy = 1;
        JRadioButton radio1 = new JRadioButton("Laki-laki", true);
        panel.add(radio1, gbc);

        // Membuat label dan radio button untuk Jenis Kelamin
        gbc.gridx = 1;
        gbc.gridy = 2;
        JRadioButton radio2 = new JRadioButton("Perempuan");
        panel.add(radio2, gbc);

        // Membuat label dan radio button untuk Jenis Kelamin
        ButtonGroup group = new ButtonGroup(); // Membuat grup untuk radio button
        group.add(radio1);
        group.add(radio2);

        // Membuat checkbox untuk Warga Negara Asing
        gbc.gridx = 1;
        gbc.gridy = 3;
        JCheckBox checkBox = new JCheckBox("Warga Negara Asing");
        panel.add(checkBox, gbc);

        // Membuat tombol "Simpan" dan area teks output
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 2;
        JButton button = new JButton("Simpan");
        panel.add(button, gbc);

        // Membuat tombol "Simpan" dan area teks output
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 2;
        JTextArea output = new JTextArea(10, 20);
        output.setEditable(false);
        output.setBorder(BorderFactory.createLineBorder(Color.darkGray));
        panel.add(output, gbc);


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
                String wargaNegara = checkBox.isSelected() ? "WNA: Ya" : "WNA: Bukan"; // Mengambil nilai dari checkbox

                // Validasi apakah nama, nomorHP, dan jenisKelamin sudah diisi
                if (nama.isEmpty() || nomorHP.isEmpty() || jenisKelamin.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Harap isi Nama, Nomor HP, dan Jenis Kelamin.");
                    return; // Menghentikan eksekusi jika salah satu tidak diisi
                }

                // Validasi apakah nomorHP hanya berisi angka
                if (!nomorHP.matches("[0-9]+")) {
                    JOptionPane.showMessageDialog(null, "Nomor HP hanya boleh berisi angka.");
                    return; // Menghentikan eksekusi jika nomorHP tidak hanya berisi angka
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


        controlPanel.add(panel);// Menambahkan panel ke controlPanel

        this.setLayout(new GridLayout(2, 1));// Menambahkan headerLabel dan controlPanel ke frame
        this.add(headerLabel);// Menambahkan headerLabel dan controlPanel ke frame
        this.add(controlPanel);// Menambahkan headerLabel dan controlPanel ke frame
        this.setSize(400, 800);// Menentukan ukuran frame
    }

    // Membuat method main
    public static void main(String[] args) {
        // Menjalankan aplikasi
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                HelloBiodataGrid hello = new HelloBiodataGrid();
                hello.setVisible(true);
            }
        });
    }
}
