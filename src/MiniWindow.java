import javax.swing.*;
import java.awt.*;

public class MiniWindow extends JFrame {
    MiniWindow() {
        JFrame frame = new JFrame("Mini Window");
        frame.setSize(new Dimension(1280, 720));
        frame.setLocationRelativeTo(frame);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MiniWindow();
    }
}
