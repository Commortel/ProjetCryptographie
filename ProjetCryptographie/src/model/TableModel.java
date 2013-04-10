package model;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Thibaut
 */
public class TableModel extends AbstractTableModel
{
    private String[] columnNames = {"Name", "Mail"};
    private Object[][] data = { { "Test", "Test" } };

    /**
     *
     * @return
     */
    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    /**
     *
     * @return
     */
    @Override
    public int getRowCount() {
        return data.length;
    }

    /**
     *
     * @param col
     * @return
     */
    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }

    /**
     *
     * @param row
     * @param col
     * @return
     */
    @Override
    public Object getValueAt(int row, int col) {
        return data[row][col];
    }

    /**
     *
     * @param c
     * @return
     */
    @Override
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

    // if Table's editable
    /**
     *
     * @param row
     * @param col
     * @return
     */
    @Override
    public boolean isCellEditable(int row, int col) {
            return true;       
    }

    // if Data change
    /**
     *
     * @param value
     * @param row
     * @param col
     */
    @Override
    public void setValueAt(Object value, int row, int col) 
    {
        data[row][col] = value;
        fireTableCellUpdated(row, col);
    }
    
    public void addValue(Object value)
    {
       // data[data.length-1][columnNames-1] =
    }
}
