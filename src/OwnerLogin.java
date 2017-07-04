import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by jatin kumar vimal on 03/07/2017.
 */
public class OwnerLogin {
    JLabel ViewLabel;
    JButton nextbutton,exitbutton;
    JComboBox<String> StaffOption;
    JPanel AdminPanel;
    String[] Option = new String[]{"Select....", "Manager", "Employee", "Others"};
    public OwnerLogin(JFrame jFrame) {
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setTitle("Admin Login");
        jFrame.setSize(1000, 1000);
        jFrame.setResizable(false);

        ViewLabel=new JLabel("VIEW");
        nextbutton= new JButton("NEXT");
        exitbutton= new JButton("EXIT");
        StaffOption = new JComboBox<>(Option);

        AdminPanel= new JPanel();
        AdminPanel.setLayout(null);
        jFrame.add(AdminPanel);

        ViewLabel.setBounds(100,200,200,25);
        nextbutton.setBounds(300,300,100,25);
        exitbutton.setBounds(200,300,100,25);
        StaffOption.setBounds(200,200,200,25);


        AdminPanel.add(ViewLabel);
        AdminPanel.add(StaffOption);
        AdminPanel.add(nextbutton);
        AdminPanel.add(exitbutton);

        jFrame.setVisible(true);
        jFrame.setResizable(false);
        exitbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.dispose();
            }
        });

        nextbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(StaffOption.getSelectedItem().toString().trim().equals("Select....") || (StaffOption.
                        getSelectedItem().toString().trim().equals(null))||(StaffOption.getSelectedItem().toString().trim()
                .equals("Others"))){
                    JOptionPane.showMessageDialog(jFrame,"You Have Not Select Anything,Select Option And Try Again");
                }
                else if(StaffOption.getSelectedItem().toString().trim().equals("Manager")){
                    AdminPanel.setVisible(false);
                    new RegstrationPage(jFrame);
                }
                else if(StaffOption.getSelectedItem().toString().trim().equals("Employee")){
                    AdminPanel.setVisible(false);
                    new SelectRoom(jFrame);
                }
            }
        });





    }
}
