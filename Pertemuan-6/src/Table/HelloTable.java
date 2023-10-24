package Table; // Package untuk class HelloTable

import javax.swing.*; // Import semua class dari package javax.swing
import java.awt.event.ActionEvent; // Import class ActionEvent dari package java.awt.event
import java.awt.event.ActionListener; // Import class ActionListener dari package java.awt.event
import java.util.ArrayList; // Import class ArrayList dari package java.util
import java.util.Arrays; // Import class Arrays dari package java.util

// Class HelloTable yang meng-extend class JFrame
public class HelloTable extends JFrame {

    // Constructor HelloTable
    public HelloTable() {
        // Untuk menutup aplikasi ketika tombol close ditekan
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Deklarasi labelInput dengan tipe JLabel dengan teks "Nama: " dan posisi (15, 40) dan ukuran 350 x 10
        JLabel labelInput = new JLabel("Nama: ");
        labelInput.setBounds(15, 40, 350, 10);

        // Deklarasi textField dengan tipe JTextField dan posisi (15, 60) dan ukuran 350 x 30
        JTextField textField = new JTextField();
        textField.setBounds(15, 60, 350, 30);

        // Deklarasi labelRadio dengan tipe JLabel dengan teks "Jenis Member: " dan posisi (15, 100) dan ukuran 350 x 10
        JLabel labelRadio = new JLabel("Jenis Member: ");
        labelRadio.setBounds(15, 100, 350, 10);

        // Deklarasi radio1 dengan tipe JRadioButton dengan teks "Silver" dan posisi (15, 115) dan ukuran 350 x 30
        JRadioButton radio1 = new JRadioButton("Silver");
        radio1.setBounds(15, 115, 350, 30);

        // Deklarasi radio2 dengan tipe JRadioButton dengan teks "Gold" dan posisi (15, 145) dan ukuran 350 x 30
        JRadioButton radio2 = new JRadioButton("Gold");
        radio2.setBounds(15, 145, 350, 30);

        // Deklarasi radio3 dengan tipe JRadioButton dengan teks "Platinum" dan posisi (15, 175) dan ukuran 350 x 30
        JRadioButton radio3 = new JRadioButton("Platinum");
        radio3.setBounds(15, 175, 350, 30);

        // Deklarasi group dengan tipe ButtonGroup untuk mengelompokkan radio1, radio2, dan radio3
        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        group.add(radio3);

        // Deklarasi button dengan tipe JButton dengan teks "Simpan" dan posisi (15, 205) dan ukuran 100 x 30
        JButton button = new JButton("SImpan");
        button.setBounds(15, 205, 100, 30);

        // Deklarasi table dengan tipe JTable, scrollableTable dengan tipe JScrollPane, dan tableModel dengan tipe MyTableModel
        javax.swing.JTable table = new JTable();
        JScrollPane scrollableTable = new JScrollPane(table);
        // Set posisi dan ukuran scrollableTable dengan posisi (15, 250) dan ukuran 350 x 200
        scrollableTable.setBounds(15, 250, 350, 200);

        // Set tableModel pada table yang telah dibuat
        MyTableModel tableModel = new MyTableModel();
        table.setModel(tableModel);

        // Menambahkan action listener pada button ketika tombol ditekan maka akan menambahkan data pada tabel
        // Data yang ditambahkan adalah nama dan jenis member yang dipilih
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String jenisMember = "";
                if (radio1.isSelected()) {
                    jenisMember = radio1.getText();
                }
                if (radio2.isSelected()) {
                    jenisMember = radio2.getText();
                }
                if (radio3.isSelected()) {
                    jenisMember = radio3.getText();
                }

                String nama = textField.getText();
                tableModel.addRow(new ArrayList<>(Arrays.asList(nama, jenisMember)));
            }
        });

        // Menambahkan komponen-komponen ke dalam JFrame
        this.add(button);
        this.add(textField);
        this.add(labelInput);
        this.add(labelRadio);
        this.add(radio1);
        this.add(radio2);
        this.add(radio3);
        this.add(scrollableTable);

        // Set posisi dan ukuran JFrame dengan posisi (100, 100) dan ukuran 400 x 500 dan mengatur layout menjadi null
        this.setSize(400, 500);
        this.setLayout(null);
    }

    // Main method untuk menjalankan aplikasi GUI
    public static void main(String[] args) {
        // Menjalankan aplikasi GUI dengan menggunakan thread yang berjalan di EDT (Event Dispatch Thread)
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                HelloTable helloTable = new HelloTable();
                helloTable.setVisible(true);
            }
        });
    }

}
