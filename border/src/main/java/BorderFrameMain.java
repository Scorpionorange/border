import javax.swing.*;
import java.awt.*;

/**
 * Created by ScorpionOrange on 2016/09/11.
 */
public class BorderFrameMain {
    public static void main(String[] args){
        EventQueue.invokeLater(() -> {
            JFrame frame = new BorderFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Border Frame Testing");
            frame.setVisible(true);

            frame.setSize(800, 600);
        });
    }
}
