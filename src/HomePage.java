
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

/**
 * Created by jatin kumar vimal on 04/07/2017.
 */
public class HomePage {
    JPanel panelMiddle;

    JButton loginbutton;
    JLabel Homelabel,aboutuslabel,policylabel,faqslabel,contactlabel;
    JLabel Hotellabel,hollalabel,textlabel;

    public HomePage(JFrame jFrame) throws IOException {
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setTitle("Home Page");

        jFrame.setContentPane(new JLabel((new ImageIcon("src\\MainPackage\\images\\123.jpg"))));
//        loginbutton = new JButton("LOG IN");
//        Exitbutton = new JButton("EXIT");
//        registrationButton = new JButton("Registration ");
//        Homelabel = new JLabel("WELCOME TO OUR HOTEL");
//        Homelabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
//        Homelabel.setBounds(120, 120, 300, 25);
//        loginbutton.setBounds(180, 180, 150, 25);
//        Exitbutton.setBounds(180, 210, 150, 25);
//        registrationButton.setBounds(180, 240, 150, 25);
//        panelHome = new JPanel();
//        jFrame.add(panelHome);
//
//        //  panelHome.setBackground(Color.blue);
////        panelHome.setBackground(Color.black);
//        panelHome.setLayout(null);
//        panelHome.add(Homelabel);
//        panelHome.add(loginbutton);
//        panelHome.add(Exitbutton);
//        panelHome.add(registrationButton);
//        panelHome.requestFocus();
//        loginbutton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                panelHome.setVisible(false);
//                //  new LogInPage(jFrame);
//            }
//        });
//        registrationButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                panelHome.setVisible(false);
//                // new RegstrationPage(jFrame);
//            }
//        });
//        Exitbutton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                jFrame.dispose();
//            }
//        });
//        jFrame.setContentPane(new JLabel((new ImageIcon("src\\MainPackage\\images\\holla1.jpg"))));
        loginbutton= new JButton("BOOK NOW");
        //panelHome= new JPanel();
        panelMiddle = new JPanel();
        Homelabel= new JLabel("Home");
        aboutuslabel= new JLabel("About Us");
        policylabel=new JLabel("Policy");
        faqslabel= new JLabel("FAQS");
        contactlabel= new JLabel("Contact");
        Hotellabel = new JLabel("HOTEL");
        hollalabel=new JLabel("holla");
        textlabel= new JLabel("(A Place Where You Came As A Guest and Leave As a Family)");
        //panelMiddle.setLayout(null);
        panelMiddle.setSize(1200,680);
        //Hotellabel.setSize(500,400);
        // panelHome.setSize(1200,150);
        //  panelHome.setOpaque(false);
        panelMiddle.setOpaque(false);
        panelMiddle.setLayout(null);

        Homelabel.setForeground(Color.WHITE);
        aboutuslabel.setForeground(Color.WHITE);
        policylabel.setForeground(Color.WHITE);
        faqslabel.setForeground(Color.WHITE);
        contactlabel.setForeground(Color.WHITE);
        Hotellabel.setFont(new Font("Times New Roman",Font.BOLD,100));

        textlabel.setFont(new Font("Times New Roman",Font.ITALIC,20));
        hollalabel.setFont(new Font("Times New Roman",Font.BOLD,100));

        textlabel.setBounds(340,380,1000,25);
        hollalabel.setBounds(680,100,800,400);
        Hotellabel.setBounds(300,100,800,400);
        Homelabel.setBounds(800,120,50,40);
        aboutuslabel.setBounds(850,120,70,40);
        policylabel.setBounds(920,120,50,40);
        faqslabel.setBounds(970,120,50,40);
        contactlabel.setBounds(1020,120,50,40);
        loginbutton.setBounds(550,450,100,40);
        // contactlabel.setBounds(850,120,50,30);

        loginbutton.setForeground(Color.WHITE);
        loginbutton.setBackground(Color.RED);
        //  panelMiddle.add(loginbutton);


        textlabel.setForeground(Color.WHITE);
        hollalabel.setForeground(Color.WHITE);
        Hotellabel.setForeground(Color.red);

        panelMiddle.add(textlabel);
        panelMiddle.add(hollalabel);
        panelMiddle.add(Homelabel);
        panelMiddle.add(aboutuslabel);
        panelMiddle.add(policylabel);
        panelMiddle.add(faqslabel);
        panelMiddle.add(contactlabel);

        panelMiddle.add(Hotellabel);
        panelMiddle.add(loginbutton);

        //jFrame.add(panelHome);
        jFrame.add(panelMiddle);
        jFrame.setSize(1200, 680);
        jFrame.setVisible(true);
        jFrame.setResizable(false);
    }


}