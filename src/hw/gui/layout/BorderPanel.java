package hw.gui.layout;

import java.awt.Frame;
import java.awt.BorderLayout;
import java.awt.Panel;
import java.awt.Button;
import java.awt.Color;

class BorderPanel {
	public static void main(String[] args) {
		Frame frame  = new Frame();
		BorderLayout border = new BorderLayout();
		Panel panel_n = new Panel();
		Panel panel_c = new Panel();
		Button bt1 = new Button("previous");
		Button bt2 = new Button("next");
		
		panel_n.setBackground(Color.YELLOW);
		panel_c.setBackground(Color.CYAN);
		
		panel_n.add(bt1);
		panel_n.add(bt2);
		
		frame.setLayout(border);
		
		frame.add(panel_n,BorderLayout.NORTH);
		frame.add(panel_c,BorderLayout.CENTER);
		
		frame.setSize(600,500);
		frame.setVisible(true);
	}
}