package Table; // Package untuk class TableBiodataApp

import javax.swing.*; // Import semua class dari package javax.swing
import java.awt.event.ActionEvent; // Import class ActionEvent dari package java.awt.event
import java.awt.event.ActionListener; // Import class ActionListener dari package java.awt.event
import java.util.ArrayList; // Import class ArrayList dari package java.util
import java.util.Arrays; // Import class Arrays dari package java.util

// Membuat class BiodataApp yang merupakan turunan dari class JFrame
public class TableBiodataApp extends JFrame {
    // Membuat constructor BiodataApp
    public TableBiodataApp() {
        // Menutup aplikasi saat mengklik tombol close
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Deklarasi labelInput dengan tipe JLabel dengan teks "Nama: " dan posisi (15, 40) dan ukuran 350 x 10
        JLabel labelNama = new JLabel("Nama: ");
        labelNama.setBounds(15, 40, 350, 10);

        // Deklarasi textField dengan tipe JTextField dan posisi (15, 60) dan ukuran 350 x 30
        JTextField textFieldNama = new JTextField();
        textFieldNama.setBounds(15, 60, 350, 30);

        // Deklarasi labelNomorHP dengan tipe JLabel dengan teks "Nomor HP: " dan posisi (15, 100) dan ukuran 350 x 10
        JLabel labelNomorHP = new JLabel("Nomor HP: ");
        labelNomorHP.setBounds(15, 100, 350, 10);

        // Deklarasi textField dengan tipe JTextField dan posisi (15, 120) dan ukuran 350 x 30
        JTextField textFieldNomorHP = new JTextField();
        textFieldNomorHP.setBounds(15, 120, 350, 30);

        // Deklarasi labelRadio dengan tipe JLabel dengan teks "Jenis Kelamin: " dan posisi (15, 160) dan ukuran 350 x 10
        JLabel labelRadio = new JLabel("Jenis Kelamin: ");
        labelRadio.setBounds(15, 160, 350, 10);

        // Deklarasi radio1 dengan tipe JRadioButton dengan teks "Laki-laki" dan posisi (15, 180) dan ukuran 350 x 30
        JRadioButton radio1 = new JRadioButton("Laki-laki"); // Radio button pertama yang dipilih
        radio1.setBounds(15, 180, 350, 30);

        // Deklarasi radio2 dengan tipe JRadioButton dengan teks "Perempuan" dan posisi (15, 210) dan ukuran 350 x 30
        JRadioButton radio2 = new JRadioButton("Perempuan"); // Radio button kedua
        radio2.setBounds(15, 210, 350, 30);

        // Deklarasi group dengan tipe ButtonGroup untuk mengelompokkan radio1 dan radio2
        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);

        // Deklarasi checkBox dengan tipe JCheckBox dengan teks "Warga Negara Asing" dan posisi (15, 250) dan ukuran 350 x 30
        JCheckBox checkBox = new JCheckBox("Warga Negara Asing");
        checkBox.setBounds(15, 250, 350, 30);

       // Deklarasi button dengan tipe JButton dengan teks "Simpan" dan posisi (15, 290) dan ukuran 100 x 40
        JButton button = new JButton("Simpan");
        button.setBounds(15, 290, 100, 40);

        // Deklarasi table dengan tipe JTable, scrollPane dengan tipe JScrollPane, dan tableModel dengan tipe FormTableModel
        javax.swing.JTable table = new javax.swing.JTable();
        JScrollPane scrollPane = new JScrollPane(table);
        // Set posisi dan ukuran scrollPane dengan posisi (15, 340) dan ukuran 350 x 100
        scrollPane.setBounds(15, 340, 350, 100);

        // Set tableModel pada table yang telah dibuat
        FormTableModel tableModel = new FormTableModel();
        table.setModel(tableModel);

        // Menambahkan action listener pada button ketika tombol ditekan maka akan menambahkan data pada tabel
        // Menggunakan lambda expression. Data yang ditambahkan adalah nama, nomorHP, jenisKelamin, dan wargaNegara
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Deklarasi variabel jenisKelamin dengan tipe String untuk menyimpan jenis kelamin yang dipilih
                String jenisKelamin = "";
                if (radio1.isSelected()) {
                    jenisKelamin = radio1.getText();
                }
                if (radio2.isSelected()) {
                    jenisKelamin = radio2.getText();
                }

                // Deklarasi variabel nama, nomorHP, dan wargaNegara dengan tipe String untuk menyimpan data yang diinputkan
                String nama = textFieldNama.getText();
                String nomorHP = textFieldNomorHP.getText();
                // Menggunakan ternary operator untuk menentukan apakah checkbox dipilih atau tidak
                String wargaNegara = checkBox.isSelected() ? "Ya" : "Bukan";

                // Menampilkan pesan error jika nama, nomorHP, atau jenisKelamin kosong dan menghentikan eksekusi
                if (nama.isEmpty() || nomorHP.isEmpty() || jenisKelamin.isEmpty()) {
                    JOptionPane.showMessageDialog(TableBiodataApp.this, "Harap isi Nama, Nomor HP, dan Jenis Kelamin.", "Error!", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Menambahkan data ke tableModel dengan menggunakan method addRow di class FormTableModel
                tableModel.addRow(new ArrayList<>(Arrays.asList(nama, nomorHP, jenisKelamin, wargaNegara)));

            }
        });

        // Menambahkan komponen-komponen ke dalam JFrame
        this.add(button);
        this.add(scrollPane);
        this.add(textFieldNama);
        this.add(labelNama);
        this.add(textFieldNomorHP);
        this.add(labelNomorHP);
        this.add(labelRadio);
        this.add(radio1);
        this.add(radio2);
        this.add(checkBox);

        // Set posisi dan ukuran JFrame dan mengatur agar tidak dapat diubah ukurannya
        this.setSize(1200, 1000);
        this.setLayout(null);
    }

    // Main method untuk menjalankan aplikasi GUI
    public static void main(String[] args) {
        // Menjalankan aplikasi GUI dengan menggunakan thread yang berjalan di EDT (Event Dispatch Thread)
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Membuat instance BiodataApp dan menampilkannya.
                TableBiodataApp biodata = new TableBiodataApp();
                biodata.setVisible(true);
            }
        });
    }
}
