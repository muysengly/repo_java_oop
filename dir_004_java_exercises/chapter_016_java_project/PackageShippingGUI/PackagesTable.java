import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PackagesTable extends JFrame implements ActionListener {
    PersistenceService ps;
    ArrayList<Package> list;
    JTable table;
    JScrollPane sp;
    JButton addPackageButton;
    PackageTableModel model;

    public PackagesTable(PersistenceService ps, ArrayList<Package> list) {
        this.ps = ps;
        this.list = list;
        model = new PackageTableModel(this.list);

        setTitle("Packages");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);

        table = new JTable(model);

        addPackageButton = new JButton("Add New Package");
        addPackageButton.setSize(200, 20);
        addPackageButton.setLocation(300, 360);
        addPackageButton.addActionListener(this);

        sp = new JScrollPane(table);
        sp.setBounds(10, 10, 760, 300);

        c.add(sp);
        c.add(addPackageButton);

        setSize(800, 500);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        PackagesForm form = new PackagesForm(this.ps, this.list);
        model.populateModel();
        ((AbstractTableModel) model).fireTableDataChanged();
    }

    class PackageTableModel extends AbstractTableModel {

        ArrayList<Package> list;
        private String[] columnNames = {
                "Package Type",
                "Recipient",
                "Address",
                "Shipment Date",
                "Weight",
                "Expected Date",
                "Cost"
        };
        private Object[][] data;

        public PackageTableModel(ArrayList<Package> list) {
            this.list = list;
            populateModel();
        }

        private void populateModel() {
            data = new Object[this.list.size()][7];
            int i = 0;
            String packageType;
            for (Package p : this.list) {
                if (p instanceof BasePackage)
                    packageType = "Base Package";
                else if (p instanceof AdvancedPackage)
                    packageType = "Advanced Package";
                else if (p instanceof OvernightPackage)
                    packageType = "Overnight Package";
                else
                    continue;

                Object[] rowdata = new Object[] {
                        packageType,
                        p.getRecipient(),
                        p.getAddress(),
                        p.getShipmentDate(),
                        p.getWeight(),
                        p.calculateDeliveryTime(),
                        p.calculateCost()
                };
                data[i++] = rowdata;
            }
        }

        public int getColumnCount() {
            return columnNames.length;
        }

        public int getRowCount() {
            return data.length;
        }

        public String getColumnName(int col) {
            return columnNames[col];
        }

        public Object getValueAt(int row, int col) {
            return data[row][col];
        }

        public Class getColumnClass(int c) {
            return getValueAt(0, c).getClass();
        }
    }
}
