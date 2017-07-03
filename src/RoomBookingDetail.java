
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by nirmit on 29/6/17.
 */
public class RoomBookingDetail{
    JLabel cust_id, cust_name, cust_city, cust_add, header, noPerson, mob_no, payment_label, date_label, cust_id0, cust_id1;
    JTextField custId_textf, custname_textf, mobNo_textf, custCity_textf, custAdd_textf;
    JTextField texcustId_textf;
    JComboBox<String> cityop;
    JComboBox<Integer> NopOp;
    JComboBox<String> ModeP;

    JRadioButton male_radio;
    JRadioButton female_radio;
    String[] Mode = new String[]{"Select Mode..", "Debit Card", "Credit Card", "Other Visa card"};
    String[] city = new String[]{"Select city..", "Delhi", "Uttar pradesh", "Ghaziabad"};
    Integer[] NoP = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    // JPasswordField j3,j4;
    JPanel jPanel;
    JButton checkIn_button, exit_button;

    RoomBookingDetail( JFrame jFrame) {
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(1000, 1000);
        jFrame.setResizable(false);

        header = new JLabel("SIGN UP PAGE");
        cust_id = new JLabel("Customer-ID");
        cust_name = new JLabel("Customer Name");
        cust_city = new JLabel("Customer City");
        cust_add = new JLabel("Customer Address");
        //header = new JLabel("No of Person");
        noPerson = new JLabel("No of Person");
        mob_no = new JLabel("Mobile No");
        payment_label = new JLabel("Mode of Payment");
        date_label = new JLabel("Check In Date");
        cust_id0 = new JLabel("Date of Birth");
        cust_id1 = new JLabel("Gender");
        custId_textf = new JTextField();
        custname_textf = new JTextField();
        mobNo_textf = new JTextField();
        custCity_textf = new JTextField();
        custAdd_textf = new JTextField();
        cityop = new JComboBox<>(city);
        ModeP = new JComboBox<>(Mode);
        NopOp = new JComboBox<>(NoP);

        male_radio = new JRadioButton("Male");
        female_radio = new JRadioButton("Female");

        texcustId_textf = new JTextField();
        checkIn_button = new JButton("CHECK IN");
        exit_button = new JButton("EXIT");
        header.setBounds(250, 60, 500, 25);
        //header.setSize(25,25);

        cust_id.setBounds(350, 180, 150, 20);
        cust_name.setBounds(350, 210, 150, 20);
        cust_city.setBounds(350, 240, 150, 20);
        cust_id1.setBounds(350, 270, 150, 20);
        noPerson.setBounds(350, 300, 150, 20);
        mob_no.setBounds(350, 330, 150, 20);
        payment_label.setBounds(350, 360, 150, 20);
        date_label.setBounds(350, 390, 150, 20);
        cust_id0.setBounds(350, 420, 150, 20);
        cust_add.setBounds(350, 450, 150, 20);

        custId_textf.setBounds(500, 180, 180, 20);
        custname_textf.setBounds(500, 210, 180, 20);
        cityop.setBounds(500, 240, 180, 20);
        // texcustId_textf.setBounds(500,270,180,20);
        male_radio.setBounds(500, 270, 70, 20);
        female_radio.setBounds(600, 270, 70, 20);
        NopOp.setBounds(500, 300, 180, 20);
        mobNo_textf.setBounds(500, 330, 180, 20);
        ModeP.setBounds(500, 360, 180, 20);
        //custname_textf.setBounds(500,210,180,20);
        custCity_textf.setBounds(500, 390, 180, 20);
        custAdd_textf.setBounds(500, 420, 180, 20);
        texcustId_textf.setBounds(500, 450, 180, 80);

        checkIn_button.setBounds(350, 550, 150, 25);
        exit_button.setBounds(530, 550, 150, 25);

        jPanel = new JPanel();
        jPanel.setBackground(Color.lightGray);
        header.setHorizontalAlignment(SwingConstants.CENTER);
        jPanel.add(header);
        jPanel.add(cust_id);
        jPanel.add(custId_textf);
        jPanel.add(cust_name);
        jPanel.add(custname_textf);
        jPanel.add(cust_city);
        jPanel.add(cityop);
        jPanel.add(noPerson);
        jPanel.add(NopOp);
        jPanel.add(mob_no);
        jPanel.add(mobNo_textf);
        jPanel.add(payment_label);
        jPanel.add(ModeP);
        jPanel.add(date_label);
        jPanel.add(custname_textf);
        jPanel.add(cust_id0);
        jPanel.add(custId_textf);
        jPanel.add(cust_id1);
        jPanel.add(male_radio);
        jPanel.add(female_radio);
        //jPanel.add(custname_textf);

        jPanel.add(cust_add);
        jPanel.add(texcustId_textf);
        ;
        jPanel.add(cust_city);
        jPanel.add(custCity_textf);
        jPanel.add(cust_add);
        jPanel.add(custAdd_textf);
        jPanel.add(checkIn_button);
        jPanel.add(exit_button);


        jFrame.add(jPanel);
        jPanel.setLayout(null);
        jFrame.setVisible(true);

        exit_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.setVisible(false);
                new SelectRoom(jFrame);
            }
        });
    }



}
