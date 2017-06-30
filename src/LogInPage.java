import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;

/**
 * Created by Dell on 6/24/2017.
 */
public class LogInPage {
    Connection con = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;


    LogInPage(JFrame jFrame) {
        JLabel logInPage = new JLabel("LOGIN ");
        JTextField editUserIDlogin = new JTextField();
        JPasswordField editPasswordlogin = new JPasswordField();
        JLabel accountRegister = new JLabel("Don't have account? Register now.");
        logInPage.setBounds(40, 40, 180, 10);
        logInPage.setHorizontalAlignment(SwingConstants.CENTER);
        logInPage.setForeground(Color.BLUE);
        logInPage.setSize(300, 10);

        JPanel jPanel = new JPanel();
        JButton logInButton = new JButton("LOGIN");
        JLabel UserIDlog = new JLabel("UserID");
        JLabel PASSWORDlog = new JLabel("Password");
        JLabel alertLabel = new JLabel();
        UserIDlog.setBounds(70, 90, 100, 10);
        editUserIDlogin.setBounds(170, 90, 150, 20);
        PASSWORDlog.setBounds(70, 140, 100, 10);
        editPasswordlogin.setBounds(170, 140, 150, 20);
        accountRegister.setBounds(100, 260, 300, 20);
        accountRegister.setForeground(Color.BLUE);
        jPanel.setBounds(100, 100,440, 440);
        alertLabel.setForeground(Color.RED);
        logInButton.setBounds(150, 200, 90, 30);
        alertLabel.setBounds(100, 175, 200, 30);

        jPanel.add(logInButton);
        jPanel.add(accountRegister);

        jFrame.setTitle("Login in to your account");
        jFrame.add(jPanel);
        jFrame.setSize(400, 500);
        jPanel.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setResizable(false);
        jPanel.add(logInPage);
        jPanel.add(editUserIDlogin);
        jPanel.add(editPasswordlogin);
        jPanel.add(UserIDlog);
        jPanel.add(PASSWORDlog);
        jPanel.add(alertLabel);


        accountRegister.addMouseListener(new MouseAdapter() {
            /**
             * {@inheritDoc}
             *
             * @param e
             */
            @Override
            public void mouseClicked(MouseEvent e) {
                jPanel.setVisible(false);
                new RegstrationPage(jFrame);
                // logInPage.setVisible(true);


                //  System.out.println("sign in page");
                //launch sign in form
            }
        });

        logInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if (editUserIDlogin.getText().trim().length() > 0 && String.valueOf(editPasswordlogin.getPassword()).trim().length() > 0) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbname", "root", "12345");
                        PreparedStatement stmt = con.prepareCall("{call addCredentials(?,?,?,?,?,?)}");
                        String sql = "Select * from mycredentials Where userID='" + editUserIDlogin.getText() + "' and password='" + String.valueOf(editPasswordlogin.getPassword()) + "'";
                        rs = stmt.executeQuery(sql);
                        if (rs.next()) {
                            jPanel.setVisible(false);
                            new SelectRoom(jFrame);
                            //in this case enter when at least one result comes it means user is valid
                        } else {
                            //in this case enter when  result size is zero  it means user is invalid

                            alertLabel.setText("Incorrect UserID or Password");
                            editPasswordlogin.setText("");
                            editUserIDlogin.setText("");
                        }
                    } catch (Exception exception) {
                        exception.printStackTrace();

                    }
                } else if (editUserIDlogin.getText().toString().trim().length() == 0) {
                    alertLabel.setText("Please enter your userID");
                    editUserIDlogin.requestFocus();

                } else if (String.valueOf(editPasswordlogin.getPassword()).toString().trim().length() == 0) {
                    alertLabel.setText("Please enter your password");
                    editPasswordlogin.requestFocus();


                }
            }
        });
    }

}