package keyboardwarrior.gui;

import javax.swing.table.AbstractTableModel;

public abstract class Shortcut_TableModel extends AbstractTableModel {

    private static final long serialVersionUID = 8866864446532065353L;
    private String[] name = new String[] { "Keys", "Values" };
    private Object[][] data;

    /**
     * 
     * @param data1
     */
    public void setData(Object[][] data1) {
        data = data1;
    }

    /**
     * 
     * @param name1
     */
    public void setName(String[] name1) {
        name = name1;
    }

    /**
     * Returns the number of rows in the table model.
     */
    public int getRowCount() {
        return data.length;
    }

    /**
     * Returns the number of columns in the table model.
     */
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

    /**
     * Returns the column name for the column index.
     */
    @Override
    public String getColumnName(int column) {
        return name[column];
    }

    
    /**
     * Returns data type of the column specified by its index.
     */
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return getValueAt(0, columnIndex).getClass();
    }

    /**
     * Returns the value of a table model at the specified row index and column
     * index.
     */
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][columnIndex];
    }
}
