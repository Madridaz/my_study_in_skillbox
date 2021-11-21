import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Main {

  public static void main(String[] args) {
    JFrame jFrame = new JFrame();
    jFrame.setSize(400, 400);

    jFrame.add(new MainForm().getMainPanel());

    jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);

  }
}
