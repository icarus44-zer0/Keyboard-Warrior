package com.purplecobras.keyboardwarrior.gui.v1;

import javax.swing.table.AbstractTableModel;

public abstract class GUI_TableModel extends AbstractTableModel {

    private static final long serialVersionUID = 1L;
    private static String[] tableModel_colNames = GUI_ShortcutTable.list;
    private static Object[][] tableModel_data;

    public void setData(Object[][] data1){
        tableModel_data = data1;
    }

    /**
     * Returns the number of rows in the table model.
     */
    public int getRowCount() {
        return tableModel_data.length;
    }

    /**
     * Returns the number of columns in the table model.
     */
    public int getColumnCount() {
        return tableModel_colNames.length;
    }

    /**
     * Returns the column name for the column index.
     */
    @Override
    public String getColumnName(int column) {
        return tableModel_colNames[column];
    }

    /**
     * Returns data type of the column specified by its index.
     */
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return getValueAt(0, columnIndex).getClass();
    }

    /**
     * Returns the value of a table model at the specified
     * row index and column index.
     */
    public Object getValueAt(int rowIndex, int columnIndex) {
        return tableModel_data[rowIndex][columnIndex];
    }
}