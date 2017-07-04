
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by nirmit on 29/6/17.
 */
public class SelectRoom {
    JPanel panelselect;
    JLabel selectRoom;
    JButton buttonluxury,buttonsemi,buttonnormal;
    public SelectRoom( JFrame jFrame) {
//        JFrame jFrame= new JFrame("demo");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //jFrame.setContentPane(new JLabel((new ImageIcon("src\\Background\\123.jpg"))));

        panelselect = new JPanel();
        buttonluxury= new JButton("LUXURY");
        buttonsemi= new JButton("SEMI LUXURY");
        buttonnormal= new JButton("NORMAL");
        selectRoom = new JLabel("Select Room Type");

        buttonsemi.setForeground(Color.white);
        buttonnormal.setForeground(Color.white);
        buttonluxury.setForeground(Color.white);
        selectRoom.setForeground(Color.WHITE);

        selectRoom.setFont(new Font("Times New Roman",Font.BOLD,50));

        buttonluxury.setBounds(500, 300, 180, 30);
        buttonsemi.setBounds(500, 350, 180, 30);
        buttonnormal.setBounds(500, 400, 180, 30);
        selectRoom.setBounds(400,200,400,55);

        buttonluxury.setBackground(Color.BLUE);
        buttonsemi.setBackground(Color.RED);
        buttonnormal.setBackground(Color.BLACK);

        panelselect.setSize(1200,680);
        panelselect.setOpaque(false);
        panelselect.setLayout(null);
        jFrame.add(panelselect);
        panelselect.add(buttonluxury);
        panelselect.add(buttonsemi);
        panelselect.add(buttonnormal);
        panelselect.add(selectRoom);

        jFrame.setSize(1200,680);
        jFrame.setVisible(true);


        buttonluxury.addMouseListener(new MouseAdapter() {
            /**
             * {@inheritDoc}
             *
             * @param e
             */
            @Override
            public void mouseClicked(MouseEvent e) {
                panelselect.setVisible(false);
                new RoomBookingDetail(jFrame);

            }
        });


        buttonsemi.addMouseListener(new MouseAdapter() {
            /**
             * {@inheritDoc}
             *
             * @param e
             */
            @Override
            public void mouseClicked(MouseEvent e) {
                panelselect.setVisible(false);
                new RoomBookingDetail(jFrame);
            }
        });

        buttonnormal.addMouseListener(new MouseAdapter() {
            /**
             * {@inheritDoc}
             *
             * @param e
             */
            @Override
            public void mouseClicked(MouseEvent e) {
                panelselect.setVisible(false);
                new RoomBookingDetail(jFrame);
            }
        });

    }
}
