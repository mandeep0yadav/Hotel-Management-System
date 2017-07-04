
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
    JComboBox<String> gender;
    JComboBox<Integer> NopOp;
    JComboBox<String> ModeP;

    String[] sex = new String[]{"Select Gender...","Male","Female"};
    String[] Mode = new String[]{"Select Mode..", "Debit Card", "Credit Card", "Other Visa card"};
    String[] city = new String[]{"Select city..", "Delhi", "Uttar pradesh", "Ghaziabad"};
    Integer[] NoP = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    // JPasswordField j3,j4;
    JPanel jPanel;
    JButton checkIn_button, exit_button;

    RoomBookingDetail(JFrame jFrame) {
        //= new JFrame("Room Booking");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //jFrame.setContentPane(new JLabel((new ImageIcon("src\\Background\\ssss.jpg"))));

        cust_id= new JLabel("Customer ID");
        cust_name = new JLabel("Customer Name");
        cust_city= new JLabel("Customer City");
        cust_add= new JLabel("Customer City");
        header= new JLabel("ROOM BOOKING FORM");
        noPerson= new JLabel("NO. Of Person");
        mob_no= new JLabel("Mobile No.");
        payment_label= new JLabel("Mode Of Payment");
        date_label= new JLabel("Check In Date");
        cust_id0= new JLabel("Date Of Birth");
        cust_id1= new JLabel("Gender");

        custId_textf = new JTextField();
        custname_textf = new JTextField();
        mobNo_textf = new JTextField();
        custCity_textf = new JTextField();
        custAdd_textf = new JTextField();
        cityop = new JComboBox<>(city);
        ModeP = new JComboBox<>(Mode);
        NopOp = new JComboBox<>(NoP);
        gender= new JComboBox<>(sex);


        texcustId_textf = new JTextField();
        checkIn_button = new JButton("CHECK IN");
        exit_button = new JButton("EXIT");
        header.setBounds(170, 60, 900, 50);


        cust_id.setBounds(400, 180, 150, 20);
        cust_name.setBounds(400, 210, 150, 20);
        cust_city.setBounds(400, 240, 150, 20);
        cust_id1.setBounds(400, 270, 150, 20);
        noPerson.setBounds(400, 300, 150, 20);
        mob_no.setBounds(400, 330, 150, 20);
        payment_label.setBounds(400, 360, 150, 20);
        date_label.setBounds(400, 390, 150, 20);
        cust_id0.setBounds(400, 420, 150, 20);
        cust_add.setBounds(400, 450, 150, 20);

        custId_textf.setBounds(600, 180, 180, 20);
        custname_textf.setBounds(600, 210, 180, 20);
        cityop.setBounds(600, 240, 180, 20);


        gender.setBounds(600, 270, 180, 20);
        NopOp.setBounds(600, 300, 180, 20);
        mobNo_textf.setBounds(600, 330, 180, 20);
        ModeP.setBounds(600, 360, 180, 20);


        custCity_textf.setBounds(600, 390, 180, 20);
        custAdd_textf.setBounds(600, 420, 180, 20);
        texcustId_textf.setBounds(600, 450, 180, 80);

        checkIn_button.setBounds(400, 550, 150, 25);
        exit_button.setBounds(600, 550, 150, 25);

        jPanel = new JPanel();
        jPanel.setSize(1200,680);
        jPanel.setOpaque(false);
        header.setHorizontalAlignment(SwingConstants.CENTER);
        header.setFont(new Font("Times New Roman",Font.BOLD,50));

        header.setForeground(Color.WHITE);
        cust_id.setForeground(Color.WHITE);
        cust_name.setForeground(Color.WHITE);
        cust_city.setForeground(Color.WHITE);
        cust_add.setForeground(Color.WHITE);
        noPerson.setForeground(Color.WHITE);
        mob_no.setForeground(Color.WHITE);
        payment_label.setForeground(Color.WHITE);
        date_label.setForeground(Color.WHITE);
        cust_id0.setForeground(Color.WHITE);
        cust_id1.setForeground(Color.WHITE);

        jFrame.add(jPanel);
        jPanel.setLayout(null);
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
        jPanel.add(gender);
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

        jFrame.setSize(1200, 680);
        jFrame.setResizable(false);
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

