import javax.swing.JOptionPane;
public class UpdateCommand implements Command {
  public void Execute () {
     JOptionPane.showMessageDialog(null, "Updated menu selected");
  }
}
