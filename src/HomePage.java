import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by jatin kumar vimal on 30/06/2017.
 */
public class HomePage {
    JPanel panelHome;
    JButton loginbutton,Exitbutton,registrationButton;
    JLabel Homelabel;
    public HomePage(JFrame jFrame ){
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setTitle("Home Page");

        loginbutton = new JButton("LOG IN");
        Exitbutton = new JButton("EXIT");
        registrationButton= new JButton("Registration ");
        Homelabel= new JLabel("WELCOME TO OUR HOTEL");
        Homelabel.setFont(new Font("Times New Roman",Font.BOLD,20));
        Homelabel.setBounds(120,120,300,25);
        loginbutton.setBounds(180,180,150,25);
        Exitbutton.setBounds(180,210,150,25);
        registrationButton.setBounds(180,240,150,25);
        panelHome= new JPanel();
        jFrame.add(panelHome);
      //  panelHome.setBackground(Color.blue);
        panelHome.setBackground(Color.black);
        panelHome.setLayout(null);
        panelHome.add(Homelabel);
        panelHome.add(loginbutton);
        panelHome.add(Exitbutton);
        panelHome.add(registrationButton);
       loginbutton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               //jFrame.dispose();
               panelHome.setVisible(false);

               new LogInPage(jFrame);


           }
       });

        jFrame.setSize(500,500);
        jFrame.setVisible(true);
        jFrame.setResizable(false);
    }
}
