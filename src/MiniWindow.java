import javax.swing.*;

public class MiniWindow extends JFrame {
    MiniWindow() {
        JFrame frame = new JFrame("Mini Window");
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MiniWindow();
    }
}
