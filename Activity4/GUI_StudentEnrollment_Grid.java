import java.awt.*;
import javax.swing.*;

public class GUI_StudentEnrollment_Grid extends JFrame{
    public static void main(String[] args){
        new GUI_StudentEnrollment_Grid();
    }

    GUI_StudentEnrollment_Grid() {
        JPanel pnlInfromation = new JPanel();
        pnlInfromation.setLayout(new GridLayout(3,2,10,10));
        // pnlInfromation.setBackground(Color.GREEN);
        add(pnlInfromation).setBounds(10,10,300,100);

        JLabel lblName = new JLabel("Name");
        JTextArea txtName = new JTextArea();

        JLabel lblAge = new JLabel("Age");
        JTextArea txtAge = new JTextArea();

        JLabel lblAddress = new JLabel("Address");
        JTextArea txtAddress = new JTextArea();

        pnlInfromation.add(lblName);
        pnlInfromation.add(txtName);
        pnlInfromation.add(lblAge);
        pnlInfromation.add(txtAge);
        pnlInfromation.add(lblAddress);
        pnlInfromation.add(txtAddress);

        JPanel pnlButton = new JPanel();
        pnlButton.setLayout(new FlowLayout(FlowLayout.LEFT));
        // pnlButton.setBackground(Color.BLUE);
        add(pnlButton).setBounds(50,150,300,30);

        JButton btnAdd = new JButton("Add");
        JButton btnDel = new JButton("Delete");
        JButton btnUpd = new JButton("Update");

        pnlButton.add(btnAdd);
        pnlButton.add(btnDel);
        pnlButton.add(btnUpd);

        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700,500);
        setVisible(true);
    }
}


