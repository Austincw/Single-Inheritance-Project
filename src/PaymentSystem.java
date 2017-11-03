import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * JFrame class that creates and holds variables within the
 * GUI and access the methods and variables inherited from employee
 */

public class PaymentSystem extends JFrame {

    static Employee emp;

    private JPanel panelMain;
    private JTextField textFirstName;
    private JComboBox employeeType;
    private JTextField textSSN;
    private JTextField textLastName;
    private JTextField textAddress;
    private JTextField textPhoneNum;
    private JCheckBox newProductCheckBox;
    private JCheckBox performanceCheckBox;
    private JTextField textOverTimeHours;
    private JButton clearFormButton;
    private JButton displayButton;

    public PaymentSystem() {



        employeeType.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == employeeType) {
                    JComboBox cb = (JComboBox) e.getSource();

                }
            }
        });

        displayButton.addActionListener(new ActionListener() { // button for displaying all information for a particular employee
            @Override
            public void actionPerformed(ActionEvent e) {
                String empType = (String)employeeType.getSelectedItem();

                if(empType.equals("Manager")){

                    Manager mg = new Manager();

                    mg.setFirstname(textFirstName.getText());
                    mg.setLastname(textLastName.getText());
                    mg.setSSN(textSSN.getText());
                    mg.setAddress(textAddress.getText());
                    mg.setPhoneNum(textPhoneNum.getText());

                    if(performanceCheckBox.isSelected()) {
                        mg.setBonus(.03);
                        mg.performaceBonus();
                    }


                    JOptionPane.showMessageDialog(null,mg.Display());

                }else if(empType.equals("Engineer")){

                    Engineer eg = new Engineer();

                    eg.setFirstname(textFirstName.getText());
                    eg.setLastname(textLastName.getText());
                    eg.setSSN(textSSN.getText());
                    eg.setAddress(textAddress.getText());
                    eg.setPhoneNum(textPhoneNum.getText());

                    if(newProductCheckBox.isSelected())
                        eg.setSalary(eg.getSalary() + 10000);

                    JOptionPane.showMessageDialog(null,eg.Display());

                }else if(empType.equals("Technician")){

                    Technician th = new Technician();

                    th.setFirstname(textFirstName.getText());
                    th.setLastname(textLastName.getText());
                    th.setSSN(textSSN.getText());
                    th.setAddress(textAddress.getText());
                    th.setPhoneNum(textPhoneNum.getText());
                    th.setOverTimeHours(Integer.parseInt(textOverTimeHours.getText()));



                    JOptionPane.showMessageDialog(null,th.Display());
                }

                //JOptionPane.showMessageDialog(null, emp.Display());
            }
        });

        clearFormButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textSSN.setText("");
                textFirstName.setText("");
                textLastName.setText("");
                textAddress.setText("");
                textPhoneNum.setText("");
                textOverTimeHours.setText("");

            }
        });




        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(panelMain);
        setSize(800,600);
        setVisible(true);


    }

}
