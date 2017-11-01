import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * JFrame class that creates and holds variables within the
 * GUI and access the methods and variables inherited from employee
 */

public class PaymentSystem extends JFrame {

    static Employee emp;

    private JButton button1;
    private JPanel panelMain;
    private JTextField textFirstName;
    private JComboBox employeeType;
    private JTextField textSSN;
    private JTextField textLastName;
    private JTextField textAddress;
    private JTextField textPhoneNum;
    private JCheckBox newProductCheckBox;
    private JCheckBox performanceCheckBox;
    private JTextField textField1;
    private JButton button2;
    private JButton clearFormButton;
    private JButton displayAnnualPayManagerButton;
    private JButton displayAnnualPayEngineerButton;

    public PaymentSystem() {

        emp = new Employee();

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "test");
            }
        });




        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(panelMain);
        setSize(800,600);
        setVisible(true);


    }

}
