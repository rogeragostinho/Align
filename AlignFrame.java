import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JCheckBox;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JButton;
	
public class AlignFrame extends JFrame
{	
	// left
	private JPanel panelLeft;
	private JCheckBox checkBoxSnapToGrid;
	private JCheckBox checkBoxShowGrid;

	// center
	private JPanel panelCenter;
	private JLabel labelY;
	private JLabel labelX;
	private JTextField textFieldX;
	private JTextField textFieldY;

	// right
	private JPanel panelRight;
	private JButton buttonOK;
	private JButton buttonCancel;
	private JButton buttonHelp;

	public AlignFrame()
	{
		super("Align");
		setLayout(new FlowLayout(FlowLayout.CENTER, 30, 30));
		
		configurePanelLeft();
		configurePanelCenter();
		configurePanelRight();
		
		add(panelLeft);
		add(panelCenter);
		add(panelRight);
	}		
		
	private void configurePanelLeft()
	{
		panelLeft = new JPanel(new GridLayout(2, 1));

		checkBoxSnapToGrid = new JCheckBox("Snap to Grid");
		checkBoxShowGrid = new JCheckBox("Show Grid");

		panelLeft.add(checkBoxSnapToGrid);
		panelLeft.add(checkBoxShowGrid);
	}

	private void configurePanelCenter()
	{
		panelCenter = new JPanel(new GridLayout(2, 2, 0, 20));

		labelX = new JLabel("X:");
		textFieldX = new JTextField("8", 4);

		labelY = new JLabel("Y:");
		textFieldY = new JTextField("8", 4);

		panelCenter.add(labelX);
		panelCenter.add(textFieldX);
		panelCenter.add(labelY);
		panelCenter.add(textFieldY);
	}

	private void configurePanelRight()
	{
		panelRight = new JPanel(new GridLayout(3, 1, 0, 10));

		buttonOK = new JButton("OK");
		buttonCancel = new JButton("Cancel");
		buttonHelp = new JButton("Help");

		panelRight.add(buttonOK);
		panelRight.add(buttonCancel);
		panelRight.add(buttonHelp);
	}
}