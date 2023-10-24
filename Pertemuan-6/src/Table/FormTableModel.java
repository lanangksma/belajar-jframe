package Table; // Package untuk class FormTableModel

import javax.swing.table.AbstractTableModel; // Import class AbstractTableModel
import java.util.ArrayList; // Import class ArrayList
import java.util.List; // Import class List

// Class FormTableModel yang merupakan subclass dari AbstractTableModel
public class FormTableModel extends AbstractTableModel {
    // Deklarasi Array untuk menyimpan nama kolom tabel(header) yang bertipe String dengan columnNames "Nama", "No HP", "Jenis Kelamin", "WNA"
    private String[] columnNames = {"Nama", "No HP", "Jenis Kelamin", "WNA"};
    // Deklarasi ArrayList untuk menyimpan data yang bertipe ArrayList<String> dengan nama variabel "data"
    private ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();

    // Method untuk mengembalikan nilai dari jumlah baris tabel
    @Override
    public int getRowCount() {
        return data.size();
    }

    // Method untuk mengembalikan nilai dari jumlah kolom tabel
    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    // Method untuk mengembalikan nilai dari isi tabel berdasarkan baris dan kolom
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        List<String> rowItem = data.get(rowIndex);
        return rowItem.get(columnIndex);
    }

    // Method untuk mengembalikan nilai dari nama kolom tabel berdasarkan indeks kolom
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }

    // Method isCellEditable untuk mengembalikan nilai boolean apakah tabel dapat diedit atau tidak
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    // Method untuk menambahkan baris pada tabel berdasarkan data yang diberikan dengan tipe ArrayList<String>
    public void addRow(ArrayList<String> value) {
        data.add(value);
        fireTableRowsInserted(getRowCount() - 1, getRowCount() - 1); // Untuk mengupdate tabel
    }
}
