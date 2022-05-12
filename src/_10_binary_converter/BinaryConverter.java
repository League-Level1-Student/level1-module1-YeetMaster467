package _10_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	
	JTextField answer;
	JLabel result;
	JFrame frame;
	
	public void showWindow() {
		frame = new JFrame();
		JPanel panel = new JPanel();
		answer = new JTextField(20);
		JButton button = new JButton("Convert");
		result = new JLabel(" ");
		panel.add(answer);
		panel.add(button);
		panel.add(result);
		frame.add(panel);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		button.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		result.setText(convert(answer.getText()));
		frame.pack();
	}
	
	String convert(String input) {
	    if(input.length() != 8){
	        JOptionPane.showMessageDialog(null, "Enter 8 bits!");
	        return "-";
	    }
	    String binary = "[0-1]+";
	    if (!input.matches(binary)) {
	        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, dummy!");
	        return "-";   
	    }
	    try {
	        int asciiValue = Integer.parseInt(input, 2);
	        char theLetter = (char) asciiValue;
	        return "" + theLetter;
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Enter a binary!");
	        return "-";
	    }
	}

}
