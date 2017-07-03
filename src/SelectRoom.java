
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by nirmit on 29/6/17.
 */
public class SelectRoom {

    SelectRoom(JFrame jFrame){
        JLabel selectRoom = new JLabel("Select  Room");
        selectRoom.setBounds(40, 40, 180, 10);
        selectRoom.setHorizontalAlignment(SwingConstants.CENTER);
        selectRoom.setForeground(Color.BLUE);
        selectRoom.setSize(300, 10);

        JPanel jPanel = new JPanel();
        JButton luxuryRoom = new JButton("Luxury Room");
        luxuryRoom.setBounds(150, 100, 120, 30);
        jPanel.add(luxuryRoom);

        jPanel.add(selectRoom);

        JButton semiRoom = new JButton("Semi Luxury Room");
        semiRoom.setBounds(150, 150, 120, 30);
        jPanel.add(semiRoom);

        JButton normalRoom = new JButton("Normal Room");
        normalRoom.setBounds(150, 200, 120, 30);
        jPanel.add(normalRoom);


        jFrame.setTitle("Select Room Type");
        jFrame.add(jPanel);
        jFrame.setSize(500, 500);
        jPanel.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setResizable(false);

        luxuryRoom.addMouseListener(new MouseAdapter() {
            /**
             * {@inheritDoc}
             *
             * @param e
             */
            @Override
            public void mouseClicked(MouseEvent e) {
                jPanel.setVisible(false);
                new RoomBookingDetail(jFrame);
                // logInPage.setVisible(true);



                //  System.out.println("sign in page");
                //launch sign in form
            }
        });


        semiRoom.addMouseListener(new MouseAdapter() {
            /**
             * {@inheritDoc}
             *
             * @param e
             */
            @Override
            public void mouseClicked(MouseEvent e) {
                jPanel.setVisible(false);
                new RoomBookingDetail(jFrame);
                // logInPage.setVisible(true);



                //  System.out.println("sign in page");
                //launch sign in form
            }
        });

        normalRoom.addMouseListener(new MouseAdapter() {
            /**
             * {@inheritDoc}
             *
             * @param e
             */
            @Override
            public void mouseClicked(MouseEvent e) {
                jPanel.setVisible(false);
                new RoomBookingDetail(jFrame);
                // logInPage.setVisible(true);



                //  System.out.println("sign in page");
                //launch sign in form
            }
        });

    }

}
