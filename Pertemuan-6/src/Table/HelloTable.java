package Table;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class HelloTable extends JFrame {

    public HelloTable() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel labelInput = new JLabel("Nama: ");
        labelInput.setBounds(15, 40, 350, 10);

        JTextField textField = new JTextField();
        textField.setBounds(15, 60, 350, 30);

        JLabel labelRadio = new JLabel("Jenis Member: ");
        labelRadio.setBounds(15, 100, 350, 10);

        JRadioButton radio1 = new JRadioButton("Silver");
        radio1.setBounds(15, 115, 350, 30);

        JRadioButton radio2 = new JRadioButton("Gold");
        radio2.setBounds(15, 145, 350, 30);

        JRadioButton radio3 = new JRadioButton("Platinum");
        radio3.setBounds(15, 175, 350, 30);

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        group.add(radio3);

        JButton button = new JButton("SImpan");
        button.setBounds(15, 205, 100, 30);

        javax.swing.JTable table = new JTable();
        JScrollPane scrollableTable = new JScrollPane(table);
        scrollableTable.setBounds(15, 250, 350, 200);

        MyTableModel tableModel = new MyTableModel();
        table.setModel(tableModel);

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

        this.add(button);
        this.add(textField);
        this.add(labelInput);
        this.add(labelRadio);
        this.add(radio1);
        this.add(radio2);
        this.add(radio3);
        this.add(scrollableTable);

        this.setSize(400, 500);
        this.setLayout(null);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                HelloTable helloTable = new HelloTable();
                helloTable.setVisible(true);
            }
        });
    }

}
