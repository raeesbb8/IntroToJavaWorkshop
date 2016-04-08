import javax.swing.JOptionPane;

public class Berthday {
	public static void main(String[] args) {
		String birthday=		JOptionPane.showInputDialog("what is your birthday");
		if (birthday.equals("12/2")){
		JOptionPane.showMessageDialog(null, "happy bithday"); 
		
			
		}else { JOptionPane.showMessageDialog(null, "happy unbirthday");
			
		}
	}

}
