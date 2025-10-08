import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class Interfaccia{
	
	public static void main(String[] args) {
		JFrame finestra = new JFrame("Calcolatrice per matrici");
		finestra.setLayout(new FlowLayout());
		
		//
		Ascoltatore a;
		a = new Ascoltatore();
		
		JLabel Input = new JLabel();	
		Input.setText("Input Matrice");
		finestra.add(Input);
		
		JTextArea InputField = new JTextArea(10, 20);
		InputField.setText("1 0 0\n0 1 0\n0 0 1");
		finestra.add(InputField);
		
		JButton fix = new JButton("Fissa Matrice"); //tramuta la matrice da semplice input text a tipo matrice;
		finestra.add(fix);
		fix.addActionListener(a);
		
		//
		JPanel PannelloFunzioni1 = new JPanel();
		
		JButton sum = new JButton("+");
		JButton diff = new JButton("-");
		JButton mult = new JButton("r*c");
		
		JLabel Operation = new JLabel();	
		Operation.setText("Operazioni matrice-matrice");
		PannelloFunzioni1.add(Operation);
		
		PannelloFunzioni1.add(sum);
		PannelloFunzioni1.add(diff);
		PannelloFunzioni1.add(mult);
		finestra.add(PannelloFunzioni1);
		
		JPanel PannelloFunzioni2 = new JPanel();
		JLabel Find = new JLabel();	
		Find.setText("Operazioni di ricerca");
		PannelloFunzioni2.add(Find);
		finestra.add(PannelloFunzioni2);
		
		sum.addActionListener(a);
		diff.addActionListener(a);
		mult.addActionListener(a);
		
		finestra.pack();
		finestra.setVisible(true);
		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

