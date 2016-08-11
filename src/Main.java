import javax.swing.*;

/**
 * Created by FckLove on 3/16/2016.
 */
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Light Matrix");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(new LightMatrixPanel());
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
