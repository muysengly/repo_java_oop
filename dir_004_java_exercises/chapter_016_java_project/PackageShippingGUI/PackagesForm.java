import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class PackagesForm extends JDialog implements ActionListener {
    PersistenceService ps;
    ArrayList<Package> list;
    JLabel packageType;
    JComboBox packageTypeList;
    JLabel recipientLabel;
    JTextField recipientField;
    JLabel addressLabel;
    JTextField addressField;
    JLabel shipmentDateLabel;
    JTextField shipmentDateField;
    JLabel weightLabel;
    JTextField weightField;
    JButton saveButton;

    public PackagesForm(PersistenceService ps, ArrayList<Package> list) {
        this.ps = ps;
        this.list = list;

        String[] packageTypes = {
                "Base Package",
                "Advanced Package",
                "Overnight Package"
        };
        setTitle("Insert new Package");

        Container c = getContentPane();
        c.setLayout(null);

        packageType = new JLabel("Package Type");
        packageType.setSize(100, 20);
        packageType.setLocation(10, 10);
        c.add(packageType);

        packageTypeList = new JComboBox(packageTypes);
        packageTypeList.setSize(200, 20);
        packageTypeList.setLocation(200, 10);
        c.add(packageTypeList);

        recipientLabel = new JLabel("Recipient");
        recipientLabel.setSize(100, 20);
        recipientLabel.setLocation(10, 40);
        c.add(recipientLabel);

        recipientField = new JTextField();
        recipientField.setSize(200, 20);
        recipientField.setLocation(200, 40);
        c.add(recipientField);

        addressLabel = new JLabel("Address");
        addressLabel.setSize(100, 20);
        addressLabel.setLocation(10, 70);
        c.add(addressLabel);

        addressField = new JTextField();
        addressField.setSize(200, 20);
        addressField.setLocation(200, 70);
        c.add(addressField);

        shipmentDateLabel = new JLabel("Shipment Date");
        shipmentDateLabel.setSize(100, 20);
        shipmentDateLabel.setLocation(10, 100);
        c.add(shipmentDateLabel);

        shipmentDateField = new JTextField();
        shipmentDateField.setSize(200, 20);
        shipmentDateField.setLocation(200, 100);
        c.add(shipmentDateField);

        weightLabel = new JLabel("Weight");
        weightLabel.setSize(100, 20);
        weightLabel.setLocation(10, 130);
        c.add(weightLabel);

        weightField = new JTextField();
        weightField.setSize(200, 20);
        weightField.setLocation(200, 130);
        c.add(weightField);

        saveButton = new JButton("Save");
        saveButton.setSize(100, 20);
        saveButton.setLocation(150, 160);
        saveButton.addActionListener(this);
        c.add(saveButton);

        setSize(500, 250);
        setModal(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String packageType = (String) this.packageTypeList.getSelectedItem();
        String recipient = this.recipientField.getText();
        String address = this.addressField.getText();
        String shipmentDate = this.shipmentDateField.getText();
        String weight = this.weightField.getText();

        if (packageType.equals("Base Package"))
            this.list.add(new BasePackage(recipient,
                    address, Double.parseDouble(weight), LocalDate.parse(shipmentDate)));
        else if (packageType.equals("Advanced Package"))
            this.list.add(new AdvancedPackage(recipient,
                    address, Double.parseDouble(weight), LocalDate.parse(shipmentDate)));
        else if (packageType.equals("Overnight Package"))
            this.list.add(new OvernightPackage(recipient,
                    address, Double.parseDouble(weight), LocalDate.parse(shipmentDate)));

        try {
            this.ps.saveToFile();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        this.dispose();
    }
}
