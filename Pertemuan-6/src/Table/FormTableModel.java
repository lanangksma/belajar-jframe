package Table;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class FormTableModel extends AbstractTableModel {
    private String[] columnNames = {"Nama", "No HP", "Jenis Kelamin", "WNA"};
    private ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        List<String> rowItem = data.get(rowIndex);
        return rowItem.get(columnIndex);
    }

    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    public void addRow(ArrayList<String> value) {
        data.add(value);
        fireTableRowsInserted(getRowCount() - 1, getRowCount() - 1);
    }
}
