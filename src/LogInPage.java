import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Dell on 6/24/2017.
 */
public class LogInPage {


    LogInPage(JFrame jFrame){
        JLabel logInPage = new JLabel("LOGIN ");
        JTextField editUserNamelogin = new JTextField();
        JPasswordField editPasswordlogin = new JPasswordField();
        JLabel accountRegister= new JLabel("Don't have account? Register now.");
        logInPage.setBounds(40, 40, 180, 10);
        logInPage.setHorizontalAlignment(SwingConstants.CENTER);
        logInPage.setForeground(Color.BLUE);
        logInPage.setSize(300, 10);

        JPanel jPanel = new JPanel();
        JButton logInButton = new JButton("LOGIN");
        JLabel USERNAMElog = new JLabel("Username");
        JLabel PASSWORDlog = new JLabel("Password");
        USERNAMElog.setBounds(70, 90, 100, 10);
        editUserNamelogin.setBounds(170, 90, 150, 20);
        PASSWORDlog.setBounds(70, 140, 100, 10);
        editPasswordlogin.setBounds(170, 140, 150, 20);
        accountRegister.setBounds(100,260,300,20);
        accountRegister.setForeground(Color.BLUE);
        jPanel.setBounds(100, 100, 440, 440);
        logInButton.setBounds(150, 200, 90, 30);
        jPanel.add(logInButton);
        jPanel.add(accountRegister);

        jFrame.add(jPanel);
        jFrame.setSize(400, 400);
        jPanel.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setResizable(false);
        jPanel.add(logInPage);
        jPanel.add(editUserNamelogin);
        jPanel.add(editPasswordlogin);
        jPanel.add(USERNAMElog);
        jPanel.add(PASSWORDlog);
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


    }

}