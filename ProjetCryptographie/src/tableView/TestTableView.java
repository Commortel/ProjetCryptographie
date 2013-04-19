package tableView;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


/**
 * Test the table view.
 *
 * @author St�phane Brunner, Last modified by: $Author: stbrunner $ 
 * @version $Revision: 1.9 $ $Date: 2004/09/05 19:21:45 $.
 * Revision history:
 * $Log: TestTableView.java,v $
 * Revision 1.9  2004/09/05 19:21:45  stbrunner
 * add select by first letter
 *
 * Revision 1.8  2004/02/15 19:29:01  stbrunner
 * *** empty log message ***
 *
 * Revision 1.7  2003/06/06 06:31:57  stbrunner
 * Change description
 *
 */
public class TestTableView {
  /**
   * Run the application
   * @param pArgs the arguments
   */
  public static void main(String[] pArgs) {
    try {
      TableViewColumn[] columns =
        {
          new DefaultTableViewColumn(
            "Name",
            Row.class.getDeclaredMethod("getName", null),
            Row.class.getDeclaredMethod("setName", new Class[] {String.class})),
          new DefaultTableViewColumn(
            "Description",
            Row.class.getDeclaredMethod("getDescription", null),
            Row.class.getDeclaredMethod("setDescription", new Class[] {String.class})),
          new DefaultTableViewColumn(
            "Number",
            Row.class.getDeclaredMethod("getNumber", null),
            Row.class.getDeclaredMethod("setNumber", new Class[] {Integer.class})),
          new DefaultTableViewColumn(
            "Data",
            Row.class.getDeclaredMethod("getData", null),
            Row.class.getDeclaredMethod("setData", new Class[] {String.class})),
          new DefaultTableViewColumn(
            "Create",
            Row.class.getDeclaredMethod("getCreate", null),
            Row.class.getDeclaredMethod("setCreate", new Class[] {Date.class}))
      };

      Row[] rows =
        {
          new Row("toto", "This is my toto", 1, "Hello", new Date(1000000000000L)),
          new Row("ooo", "This is my ooo", 1, "999", new Date(1000000000000L)),
          new Row("aaa", "This is my aaa", 1, "888", new Date(200000000000L)),
          new Row("bbb", "This is my bbb", 1, "777", new Date(300000000000L)),
          new Row("ccc", "This is my ccc", 1, "666", new Date(400000000000L)),
          new Row("ddd", "This is my ddd", 1, "555", new Date(500000000000L)),
          new Row("eee", "This is my eee", 1, "444", new Date(600000000000L)),
          new Row("fff", "This is my fff", 1, "333", new Date(700000000000L)),
          new Row("ggg", "This is my ggg", 1, "222", new Date(800000000000L)),
          new Row("hhh", "This is my hhh", 1, "111", new Date(900000000000L))};

      final DefaultTableViewModel model = new DefaultTableViewModel(columns, Arrays.asList(rows));

      for (int i = 0 ; i < 20000 ; i++) {
        model.addRow(new Row("" + 1, "This is my " + i, 1, "" + (20000 - i), new Date()));
      }

      JFrame frame = new JFrame();
      final TableView view = new TableView(model);
      view.setMakeIndex(true);
      frame.getContentPane().setLayout(new BorderLayout());
      frame.getContentPane().add(new JScrollPane(view), BorderLayout.CENTER);

      JPanel panelBtn = new JPanel();
      JButton btnNew = new JButton("Add");
      JButton btnRemove = new JButton("Remove");
      btnNew.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent pEvent) {
          List selection = view.getSelectedRowObjects();
          model.addRow(new Row("New row", "This is s new row", 1, "Data of new row", new Date()));
          view.addRowSelection(selection);
        }
      });
      btnRemove.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent pEvent) {
          List selection = view.getSelectedRowObjects();
          model.removeRows(selection);
        }
      });

      panelBtn.setLayout(new GridLayout(2, 1));
      panelBtn.add(btnNew);
      panelBtn.add(btnRemove);
      frame.getContentPane().add(panelBtn, BorderLayout.EAST);

      frame.setSize(600, 400);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.validate();
      frame.setVisible(true);
    }
    catch (Exception e) {
      e.printStackTrace();
      System.exit(-1);
    }
  }

  /**
   * Definds a row
   * @author sbrunner
   */
  public static class Row {
    private String mName;
    private String mDescription;
    private Integer mNumber;
    private String mData;
    private Date mCreate;

    /**
     * Constructs
     * @param pName the row name
     * @param pDescription the row description
     * @param pNumber the row numbur
     * @param pData the row data
     * @param pCreate creation date
     */
    public Row(String pName, String pDescription, int pNumber, String pData, Date pCreate) {
      mName = pName;
      mDescription = pDescription;
      mNumber = new Integer(pNumber);
      mData = pData;
      mCreate = pCreate;
    }

    /**
     * Gets the name
     * @return String the name
     */
    public String getName() {
      return mName;
    }

  /**
   * Sets the name
   * @param pName the name
   */
    public void setName(String pName) {
      mName = pName;
    }

    /**
     * Gets the description
     * @return String the description
     */
    public String getDescription() {
      return mDescription;
    }

    /**
     * Sets the description
     * @param pDescription the description
     */
    public void setDescription(String pDescription) {
      mDescription = pDescription;
    }

    /**
     * Gets the number
     * @return Integer the number
     */
    public Integer getNumber() {
      return mNumber;
    }

    /**
     * Gets the number
     * @param pNumber the number
     */
    public void setNumber(Integer pNumber) {
      mNumber = pNumber;
    }

    /**
     * Gets the data
     * @return String the data
     */
    public String getData() {
      return mData;
    }

    /** 
     * Sets the data
     * @param pData the data
     */
    public void setData(String pData) {
      mData = pData;
    }

    /**
     * Gets the creation date
     * @return Date the creation date
     */
    public Date getCreate() {
      return mCreate;
    }

    /**
     * Sets the creation date
     * @param pCreate the creation date
     */
    public void setCreate(Date pCreate) {
      mCreate = pCreate;
    }
  }
}
