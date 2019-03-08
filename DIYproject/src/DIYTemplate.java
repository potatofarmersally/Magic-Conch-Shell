import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DIYTemplate extends JFrame {

	private static final long serialVersionUID = -3145628090769981498L;
	public JButton myBackButton;
	public JPanel myWestPanel;
	public JPanel myCenterPanel;
	
	public DIYTemplate() {
		super();
		
		myBackButton = new JButton("Back");
		myWestPanel = new JPanel();
		myCenterPanel = new JPanel();
		
		setUpFrame();
		setUpWestPanel();
		setUpCenterPanel();
		
		myBackButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent event) {
				dispose();
			}
		});
		
		setVisible(true);
	}
	
	protected void setUpFrame() {
		setTitle("MCS DIY Home Improvement Project Organizer");
		setSize(new Dimension(800, 600));
		setResizable(false);
		setLayout(new BorderLayout());
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		add(myWestPanel, BorderLayout.WEST);
		add(myCenterPanel, BorderLayout.CENTER);
	}
	
	protected void setUpWestPanel() {
		myWestPanel.setLayout(new GridLayout(12, 1));
		myWestPanel.setPreferredSize(new Dimension(100, 800));
		myWestPanel.add(myBackButton);
		myWestPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}
	
	protected void setUpCenterPanel() {
		myCenterPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}
	

}