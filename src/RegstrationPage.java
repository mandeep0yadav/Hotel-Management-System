import org.gjt.mm.mysql.Driver;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by Dell on 6/22/2017.
 */
public class RegstrationPage {
    RegstrationPage(JFrame jf){
        JPanel jp = new JPanel();
        JButton b = new JButton("REGISTER");
        JTextField editUserName = new JTextField();
        JPasswordField editPassword = new JPasswordField();
        JTextField editFirstName = new JTextField();
        JTextField editLastName = new JTextField();
        JTextField editContactNo = new JTextField();
        JTextField editGender = new JTextField();
        JPasswordField editConfirmPassword = new JPasswordField();
        String[] genderType = {"Male", "Female"};
        JComboBox selectGenderCombox = new JComboBox(genderType);


        JLabel registrationLabel = new JLabel("REGISTRATION PAGE");
        JLabel USERNAME = new JLabel("Username");
        JLabel PASSWORD = new JLabel("Password");
        JLabel FIRSTNAME = new JLabel("FirstName");
        JLabel LASTNAME = new JLabel("LastName");
        JLabel CONTACTN0 = new JLabel("ContactNo.");
        JLabel Gender = new JLabel("Gender");
        JLabel confirmpassword = new JLabel("Confirm Password");
        JLabel signIn = new JLabel("Already have an account? LogIn");
        JLabel alertLabel=new JLabel("");
        alertLabel.setForeground(Color.RED);


        registrationLabel.setBounds(40, 20, 180, 10);
        registrationLabel.setHorizontalAlignment(SwingConstants.CENTER);
        registrationLabel.setForeground(Color.BLUE);
        registrationLabel.setSize(300, 10);

        FIRSTNAME.setBounds(70, 60, 100, 10);
        editFirstName.setBounds(200, 60, 150, 20);
        LASTNAME.setBounds(70, 90, 100, 10);
        editLastName.setBounds(200, 90, 150, 20);
        CONTACTN0.setBounds(70, 120, 100, 10);
        editContactNo.setBounds(200, 120, 150, 20);

        Gender.setBounds(70, 150, 100, 10);
        selectGenderCombox.setBounds(200, 150, 150, 20);
        selectGenderCombox.setBackground(Color.white);
        editGender.setBounds(200, 150, 150, 20);
        editGender.setVisible(false);
        editGender.setText("Male");
        selectGenderCombox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                JComboBox selectGenderCombox=(JComboBox)e.getSource();
                String gender=(String)selectGenderCombox.getSelectedItem();
                editGender.setText(gender);
            }
        });
        USERNAME.setBounds(70, 180, 100, 10);
        editUserName.setBounds(200, 180, 150, 20);
        PASSWORD.setBounds(70, 210, 100, 10);
        editPassword.setBounds(200, 210, 150, 20);
        confirmpassword.setBounds(70, 240, 150, 10);
        editConfirmPassword.setBounds(200, 240, 150, 20);

        jp.setBounds(100, 100, 440, 440);
        b.setBounds(150, 300, 90, 30);
        alertLabel.setBounds(120,275,200,30);

        signIn.setBounds(110, 340, 200, 20);
        signIn.setForeground(Color.BLUE);

        jp.add(registrationLabel);
        jp.add(USERNAME);
        jp.add(editUserName);
        jp.add(PASSWORD);
        jp.add(editPassword);
        jp.add(FIRSTNAME);
        jp.add(LASTNAME);
        jp.add(CONTACTN0);
        jp.add(confirmpassword);
        jp.add(Gender);
        jp.add(editFirstName);
        jp.add(editLastName);
        jp.add(editConfirmPassword);
        jp.add(editContactNo);
        jp.add(editGender);
        jp.add(selectGenderCombox);
        jp.add(signIn);
        jp.add(alertLabel);


        jp.add(b);
        jf.add(jp);
        jf.setSize(400, 400);
        jp.setLayout(null);
        jf.setVisible(true);
        jf.setResizable(false);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (editFirstName.getText().toString().trim().length() > 0 &&
                        editLastName.getText().toString().trim().length() > 0 &&
                        editContactNo.getText().toString().trim().length() > 0 &&
                        editUserName.getText().toString().trim().length() > 0 &&
                        String.valueOf(editPassword.getPassword()).toString().trim().length() > 0 &&
                        String.valueOf(editConfirmPassword.getPassword()).toString().trim().length() > 0

                        ) {
                    if (String.valueOf(editConfirmPassword.getPassword()).equals(String.valueOf(editPassword.getPassword()))) {


                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbname", "root", "12345");
                            CallableStatement stmt = con.prepareCall("{call addCredentials(?,?,?,?,?,?)}");
                            stmt.setString(1, editFirstName.getText());
                            stmt.setString(2, editLastName.getText());
                            stmt.setLong(3, Long.parseLong(editContactNo.getText()));
                            stmt.setString(4, editGender.getText());
                            stmt.setString(5, editUserName.getText());
                            stmt.setString(6, String.valueOf(editPassword.getPassword()));
                            stmt.execute();


                            System.out.println("success");
                            JOptionPane.showMessageDialog(jp, "registration is completed", "SUCCESS", JOptionPane.PLAIN_MESSAGE);
                        } catch (Exception e) {

                        }
                    } else {
                        {
                            JOptionPane.showMessageDialog(jp, "Your password is not matched. Please re-enter your Password", "ERROR", JOptionPane.WARNING_MESSAGE);
                            editPassword.setText("");

                            editConfirmPassword.setText("");
                            editPassword.requestFocus();
                        }
                    }
                } else {
                    if (editFirstName.getText().toString().trim().length() == 0) {
                       alertLabel.setText("Please enter your Firstname");
                       editFirstName.requestFocus();

                    } else if (editLastName.getText().toString().trim().length() == 0) {
                        alertLabel.setText("Please enter your Lastname");
                        editLastName.requestFocus();

                    } else if (editContactNo.getText().toString().trim().length() == 0) {
                        alertLabel.setText("Please enter your Contactno");
                        editContactNo.requestFocus();

                    } else if (editUserName.getText().toString().trim().length() == 0) {
                        alertLabel.setText("Please choose a unique username");
                        editUserName.requestFocus();

                    } else if (String.valueOf(editPassword.getPassword()).toString().trim().length() == 0) {
                      alertLabel.setText("Please enter your Firstname");
                      editPassword.requestFocus();

                    } else if (String.valueOf(editConfirmPassword.getPassword()).toString().trim().length() == 0) {
                        alertLabel.setText("Please enter your password two times");
                        editConfirmPassword.requestFocus();

                    }

                }
            }
        });
        signIn.addMouseListener(new MouseAdapter() {
            /**
             * {@inheritDoc}
             *
             * @param e
             */
            @Override
            public void mouseClicked(MouseEvent e) {
                jp.setVisible(false);
                new LogInPage(jf);
                       // logInPage.setVisible(true);



              //  System.out.println("sign in page");
                //launch sign in form
            }
        });


    }
}
