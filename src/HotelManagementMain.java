import javax.swing.*;

/**
 * Created by Dell on 6/27/2017.
 */
public class HotelManagementMain {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("MainFrame");
        jFrame.setSize(500, 500);

        new HomePage(jFrame);
    }
}
