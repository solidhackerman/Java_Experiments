import java.awt.*;

public class Experiment16
{
	private Frame mainFrame;
	private Label headerLabel;
	private Label statusLabel;
	private Panel controlPanel;
	
	public Experiment16()
	{
		prepareGUI();
	}
	public static void main(String[] args)
	{
		Experiment16 expt16=new Experiment16();
		expt16.showButtonDemo();
	}
	private void prepareGUI()
	{
		mainFrame = new Frame("Java AWT Examples");
		mainFrame.setSize(400,400);
		mainFrame.setLayout(new GridLayout(3,1));
		
		headerLabel=new Label();
		headerLabel.setAlignment(Label.CENTER);
		statusLabel=new Label();
		statusLabel.setAlignment(Label.CENTER);
		statusLabel.setSize(350,100);
		
		controlPanel=new Panel();
		controlPanel.setLayout(new FlowLayout());
		
		mainFrame.add(headerLabel);
		mainFrame.add(controlPanel);
		mainFrame.add(statusLabel);
		mainFrame.setVisible(true);
	}
	private void showButtonDemo()
	{
		headerLabel.setText("Control in action: Buttton");
		
		Button okButton=new Button("OK");
		Button submitButton=new Button("SUBMIT");
		Button cancelButton=new Button("Cancel");
		controlPanel.add(okButton);
		controlPanel.add(submitButton);
		controlPanel.add(cancelButton);
		
		mainFrame.setVisible(true);
	}
}
