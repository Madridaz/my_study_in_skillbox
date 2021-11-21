import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainForm {

  private JPanel mainPanel;
  private JTextField textName;
  private JTextField textSurname;
  private JTextField textPatronymic;
  private JButton collapseButton;

  public MainForm() {
    collapseButton.addActionListener(new Action() {
      @Override
      public Object getValue(String key) {
        return null;
      }

      @Override
      public void putValue(String key, Object value) {

      }

      @Override
      public void setEnabled(boolean b) {

      }

      @Override
      public boolean isEnabled() {
        return false;
      }

      @Override
      public void addPropertyChangeListener(PropertyChangeListener listener) {

      }

      @Override
      public void removePropertyChangeListener(PropertyChangeListener listener) {

      }

      @Override
      public void actionPerformed(ActionEvent e) {
        String entName = textName.getText();
        String entSurname = textSurname.getText();
        String entPatronymic = textPatronymic.getText();

        if (entName.length() == 0 || entSurname.length() == 0 || entPatronymic.length() == 0) {
          JOptionPane.showMessageDialog(mainPanel, "Введены не все данные");
        } else {
          System.out.println("Верный ввод");


        }

      }
    });
  }

  public JPanel getMainPanel() {
    return mainPanel;
  }


}
