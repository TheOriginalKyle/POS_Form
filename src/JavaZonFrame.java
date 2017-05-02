import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

public class JavaZonFrame extends javax.swing.JFrame implements ActionListener, ItemListener
{
	private JPanel jPanel1;
	private JButton btnAdd;
	private JComboBox cboItem1, cboItem2, cboItem3;
	private JTextField txtQty1, txtQty2, txtQty3;
	private JTextField txtPrice1, txtPrice2, txtPrice3;
	private JTextField txtLineTotal3, txtLineTotal2, txtLineTotal1;
	private JLabel jLabel14, jLabel12, jLabel11, jLabel10, jLabel2;
	private JLabel jLabel3, jLabel4, jLabel5, jLabel9;
	private JLabel jLabel8, jLabel7, jLabel6, jLabel1, jLabel13;
	private JTextField txtOrderID, txtFirstName, txtLastName, txtPhone, txtMemberShip;
	private JButton btnReset;
	private JLabel jLabel15;
	private JButton btnImport;
	private JTextField txtStreet, txtCity, txtState, txtZip;
	private JTextField txtTotal;
	private JTextField txtTax;
	private JTextField txtSubtotal;
	private JLabel lblLineTotal;
	private JLabel lblTotal;
	private JLabel lblTax;
	private JLabel lblSubtotal;
	private JButton btnExport;
	private JButton btnClear;
	private JButton btnList;
	private JButton btnFind;
	private JButton btnDelete;
	private JavaZon jz;
	private Menu menu;

	public JavaZonFrame()
	{
		try
		{

			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

			GridLayout thisLayout = new GridLayout();

			jz = new JavaZon();
			menu = new Menu();

			String menuItems[] = menu.getMenuDescriptions();

			getContentPane().setLayout(thisLayout);

			jPanel1 = new JPanel();
			getContentPane().add(jPanel1);
			GridBagLayout jPanel1Layout = new GridBagLayout();

			jPanel1.setLayout(jPanel1Layout);
			jPanel1.setPreferredSize(new java.awt.Dimension(499, 426));

			btnAdd = new JButton();
			jPanel1.add(btnAdd, gc(1, 17, 1, 1));
			btnAdd.setText("Add");
			btnAdd.addActionListener(this);

			btnDelete = new JButton();
			jPanel1.add(btnDelete, gc(2, 17, 1, 1));
			btnDelete.setText("Delete");
			btnDelete.addActionListener(this);

			btnFind = new JButton();
			jPanel1.add(btnFind, gc(3, 17, 1, 1));
			btnFind.setText("Find");
			btnFind.addActionListener(this);

			btnList = new JButton();
			jPanel1.add(btnList, gc(4, 17, 1, 1));
			btnList.setText("List");
			btnList.addActionListener(this);

			btnClear = new JButton();
			jPanel1.add(btnClear, gc(5, 17, 1, 1));
			btnClear.setText("Clear");
			btnClear.addActionListener(this);

			txtOrderID = new JTextField(10);
			jPanel1.add(txtOrderID, gc(2, 2, 1, 1));

			btnReset = new JButton();
			jPanel1.add(btnReset, gc(6, 17, 1, 1));
			btnReset.setText("Reset");
			btnReset.addActionListener(this);

			txtFirstName = new JTextField(10);
			jPanel1.add(txtFirstName, gc(2, 3, 2, 1));

			txtLastName = new JTextField(10);
			jPanel1.add(txtLastName, gc(5, 3, 2, 1));

			jLabel1 = new JLabel();
			jPanel1.add(jLabel1, gc(1, 2, 1, 1));
			jLabel1.setText("Order ID:");

			jLabel2 = new JLabel();
			jPanel1.add(jLabel2, gc(1, 3, 1, 1));
			jLabel2.setText("First Name:");

			jLabel3 = new JLabel();
			jPanel1.add(jLabel3, gc(4, 3, 1, 1));
			jLabel3.setText("Last Name:");

			jLabel13 = new JLabel();
			jPanel1.add(jLabel13, gc(2, 0, 3, 1));
			jLabel13.setText("Welcome to JAVAZON III");

			// TODO ADD THE REST OF THE CONTROLS
			// REFER TO HANDOUT FOR THE CONTROLS NEEDED
			// AND THE LOCATION OF EACH ITEM

			pack();
			this.setSize(507, 500);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	private GridBagConstraints gc(int x, int y, int h, int w)
	{

		GridBagConstraints c = new GridBagConstraints();

		c.gridx = x;
		c.gridy = y;
		c.gridheight = h;
		c.gridwidth = w;

		c.anchor = GridBagConstraints.WEST;

		c.fill = GridBagConstraints.HORIZONTAL;

		c.insets = new Insets(5, 5, 5, 5);

		return c;
	}

	public void actionPerformed(ActionEvent e)
	{
		// based on the object that trigerred the event
		// call the appropriate method

		// Call addOrder

		// Call clearOrders

		// Call deleteOrder

		// Call findOrder

		// call printOrders

		// call resetForm

	}

	public void itemStateChanged(ItemEvent e)
	{
		// example of method to display the price of the product
		// based on what item was selected

		Object o = e.getSource();
		if (o == cboItem1)
		{
			if (cboItem1.getSelectedIndex() != -1)
				txtPrice1.setText(menu.getPrice(cboItem1.getSelectedIndex()));
		}

		// TODO add code to display the price
		// for the other comboboxes and textfields for the line item price

	}

	private void addOrder()
	{
		// CREATE VARIABLES TO HOLD INPUT
		// TODO
		// PASS THE INPUT TO THE VALIDATOR\
		// THE ONLY VALIDATION IN THIS PROJECT
		// IS THAT STRING VALUES ARE NOT BLANK
		// AND NUMERICAL VALUES ARE THE CORRECT TYPE
		// FOR EXAMPLE QUANTITY SHOULD BE INTEGER
		// PRICE SHOULD BE DOUBLE
		// EVERYTHING ELSE IS OK

		Validator.clearError(); // before we start processing we clear any
								// errors

		String orderID = Validator.getOrderID(txtOrderID.getText());
		String firstName = Validator.getFirstName(txtFirstName.getText());

		// add the other variables to hold your values from the validator in
		// here
		// see below what variables you will need to create a customer object
		// and an order object
		String lastName = "";
		String street = "";
		String city = "";
		String zip = "";
		String state = "";
		String phone = "";
		String membership = "";

		// Example of how to validate the combobox from the validator
		// After you create the validation method called getQuantity in the
		// validator
		// uncomment the Validator.getQuantity... line
		if (this.cboItem1.getSelectedIndex() != -1)
		{
			// Validator.getQuantity(txtQty1.getText());
		}

		// do the same thing for the other 2 comboboxes

		// if there are errors then display them to the user
		// otherwise start creating the objects for the order
		if (Validator.getError().length() != 0)
		{
			JOptionPane.showMessageDialog(null, "An Error Occured:\n\n" + Validator.getError());

		}
		else
		{
			Customer customer = new Customer(firstName, lastName, street, city, state, zip, phone, membership);

			Order order = new Order(orderID);
			order.setOrderCustomer(customer);

			if (this.cboItem1.getSelectedIndex() != -1)
			{
				Product product1 = menu.getMenu()[this.cboItem1.getSelectedIndex()];
				order.setOrderProduct(product1, Integer.parseInt(txtQty1.getText()));
				this.txtLineTotal1.setText(String.valueOf(order.getLineTotal(0)));
			}

			// do the same for the other 2 comboboxes

			jz.addOrder(order);
			jz.setClerk(orderID);
			jz.processOrder(orderID);

			// TODO
			// INSTEAD OF GET RECEIPT YOU NEED TO GREATE METHODS THAT
			// WILL RETURN INDIVIDUAL VALUES
			// FOR EACH LINE ITEM RETRIEVE THE TOTALS
			// FOR THE WHOLE ORDER RETRIEVE THE SUBTOTAL, TAX, TOTAL
			// DISPLAY THESE RESULTS IN THE APPROPRIATE BOXES INSTEAD OF THE
			// JOPTIONPANE BOX

			// JOptionPane.showMessageDialog(null, jz.getReceipt(orderID));
			JOptionPane.showMessageDialog(null, "Order " + orderID + " was Saved");
		}

	}

	private void deleteOrder()
	{
		String orderID = JOptionPane.showInputDialog("Enter Order ID to Delete");
		String result = jz.deleteOrder(orderID);

		JOptionPane.showMessageDialog(null, result);
	}

	private void findOrder()
	{
		// find a particular order

		// TODO
		// Fill the screen with the order that was retrieved
		// All the fields should be blanked out and filled with the values from
		// the new order

		String input = txtOrderID.getText();
		Order foundOrder = jz.findOrder(input);
		if (foundOrder != null)
		{
			Customer foundCustomer = foundOrder.getCustomer();

			txtFirstName.setText(foundCustomer.getFirstName());
			txtLastName.setText(foundCustomer.getLastName());
			txtStreet.setText(foundCustomer.getAddress());
			String city = txtCity.getText();
			String state = txtState.getText();
			String zip = txtZip.getText();
			String phone = txtPhone.getText();
			String membership = txtMemberShip.getText();

			// Example how to set the value of a combobox
			this.cboItem3.setSelectedItem("VB");
		}
		else
		{

			JOptionPane.showMessageDialog(null, "Order Not Found");
			;
		}
	}

	private void clearOrders()
	{
		// clear orders
		jz.clearOrders();
		JOptionPane.showMessageDialog(null, "Orders Cleared!");
	}

	private void printOrders()
	{
		// print summary of orders
		String result = jz.getOrdersSummary();
		if (result.length() == 0)
		{
			JOptionPane.showMessageDialog(null, "No Orders Available!");
		}
		else
		{
			JOptionPane.showMessageDialog(null, jz.getOrdersSummary());
		}
	}

	public void resetForm()
	{
		// TODO
		// ADD code here to reset the form to a blank state

		txtOrderID.setText("");
		txtFirstName.setText("");
		txtLastName.setText("");

		try
		{

			this.cboItem1.setSelectedIndex(-1);
			this.cboItem2.setSelectedIndex(-1);
			this.cboItem3.setSelectedIndex(-1);

		}
		catch (Exception ex)
		{
			// ignore error
		}
	}

}
