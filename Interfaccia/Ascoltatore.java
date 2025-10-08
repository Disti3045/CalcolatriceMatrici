import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ascoltatore implements ActionListener{
	public Ascoltatore() {
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals("+")) {
			System.out.println("sum");
		}else if(e.getActionCommand().equals("-")) {
			System.out.println("diff");
		}else if(e.getActionCommand().equals("r*c")) {
			System.out.println("r*c");
		}else if(e.getActionCommand().equals("Fissa Matrice")) {
			System.out.println("fixed matrix");
		}
	}
}
