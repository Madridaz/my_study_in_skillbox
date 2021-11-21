import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainForm {

  private JTextField textName;
  private JTextField textSurname;
  private JTextField textPatronymic;
  private JButton collapseButton;
  private JPanel mainPanel;
  private JTextField allText;
  private JButton expandButton;
  private JLabel nameLabel;
  private JLabel surnameLabel;
  private JLabel patronymicLabel;

  public MainForm() {
    //скрыть текстовое поле и кнопку expand
    allText.setVisible(false);
    expandButton.setVisible(false);

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

        //проверка заполнения всех полей
        String entName = textName.getText();
        String entSurname = textSurname.getText();
        String entPatronymic = textPatronymic.getText();

        if (entName.length() == 0 || entSurname.length() == 0 || entPatronymic.length() == 0) {
          JOptionPane.showMessageDialog(mainPanel, "Введены не все данные");
        } else {
          //сокрытие полей формы 1, открытие формы 2
          hideFirstForm();

          expandButton.addActionListener(new Action() {
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
              String[] input = allText.getText().split(" ");
              if (input.length != 3) {
                JOptionPane.showMessageDialog(mainPanel, "Введены не все данные");
              } else {
                //сокрытие полей формы 1, открытие формы 2
                hideSecondForm();
              }
            }
          });


        }

      }
    });
  }

  public JPanel getMainPanel() {
    return mainPanel;
  }

  private void hideFirstForm() {
    textName.setVisible(false);
    textSurname.setVisible(false);
    textPatronymic.setVisible(false);
    nameLabel.setVisible(false);
    surnameLabel.setVisible(false);
    patronymicLabel.setVisible(false);
    collapseButton.setVisible(false);

    allText.setVisible(true);
    expandButton.setVisible(true);
  }

  private void hideSecondForm() {
    allText.setVisible(false);
    expandButton.setVisible(false);

    textName.setVisible(true);
    textSurname.setVisible(true);
    textPatronymic.setVisible(true);
    nameLabel.setVisible(true);
    surnameLabel.setVisible(true);
    patronymicLabel.setVisible(true);
    collapseButton.setVisible(true);


  }
}
