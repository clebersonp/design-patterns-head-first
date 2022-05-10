package pattern.br.design.swing.observer;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample {

	private JFrame frame;

	public static void main(String[] args) {

		SwingObserverExample example = new SwingObserverExample();
		example.go();

	}

	private void go() {

		this.frame = new JFrame();

		JButton button = new JButton("Should I do it?");

		// Listeners ou Observers ao botao
		button.addActionListener(e -> System.out.println("Don't do it, you might regret it!"));
		button.addActionListener(e -> System.out.println("Come one, do it!"));

		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.getContentPane().add(BorderLayout.CENTER, button);
		this.frame.setSize(300, 300);
		this.frame.setVisible(true);
	}

}
