package app;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import java.awt.Color;

public class View extends JFrame {

	private int labels;
	private JPanel contentPane;
	private JLabel lblNewLabel,lblNewLabel_1,lblNewLabel_2,lblNewLabel_3,lblNewLabel_4,lblNewLabel_5,lblNewLabel_6,lblNewLabel_7,lblNewLabel_8,lblNewLabel_9,
	lblNewLabel_10,lblNewLabel_11,lblNewLabel_12,lblNewLabel_13,lblNewLabel_14;
	private tempController controller;
	private ButtonGroup bGroup;
	private JRadioButton rdbtnNewRadioButton, rdbtnNewRadioButton_1,rdbtnNewRadioButton_2;
	private JButton btnNewButton,btnNewButton_1;
	private JLabel[] f;
	/**
	 * Create the frame.
	 */
	public View(int labels, tempController controller) {
		this.controller = controller;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1106, 739);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		contentPane.setLayout(null);
		setContentPane(contentPane);
		initialize(labels);
		this.setVisible(true);
	}

	public void initialize(int labels){
		this.labels = labels;
		this.getContentPane().removeAll();
 		this.repaint();
		if(labels ==15){
			lblNewLabel = new JLabel("Root");
			lblNewLabel.setBounds(530, 31, 100, 16);
			contentPane.add(lblNewLabel);
			
			lblNewLabel_1 = new JLabel("New label");
			lblNewLabel_1.setBounds(218, 131, 100, 16);
			contentPane.add(lblNewLabel_1);
			
			lblNewLabel_2 = new JLabel("New label");
			lblNewLabel_2.setBounds(789, 131, 100, 16);
			contentPane.add(lblNewLabel_2);
			
			lblNewLabel_3 = new JLabel("New label");
			lblNewLabel_3.setBounds(108, 200, 100, 16);
			contentPane.add(lblNewLabel_3);
			
			lblNewLabel_4 = new JLabel("New label");
			lblNewLabel_4.setBounds(344, 200, 100, 16);
			contentPane.add(lblNewLabel_4);
			
			lblNewLabel_5 = new JLabel("New label");
			lblNewLabel_5.setBounds(662, 200, 100, 16);
			contentPane.add(lblNewLabel_5);
			
			lblNewLabel_6 = new JLabel("New label");
			lblNewLabel_6.setBounds(895, 200, 100, 16);
			contentPane.add(lblNewLabel_6);
			
			lblNewLabel_7 = new JLabel("New label");
			lblNewLabel_7.setBounds(37, 287, 100, 16);
			contentPane.add(lblNewLabel_7);
			
			lblNewLabel_8 = new JLabel("New label");
			lblNewLabel_8.setBounds(166, 287, 100, 16);
			contentPane.add(lblNewLabel_8);
			
			lblNewLabel_9 = new JLabel("New label");
			lblNewLabel_9.setBounds(287, 287, 100, 16);
			contentPane.add(lblNewLabel_9);
			
			lblNewLabel_10 = new JLabel("New label");
			lblNewLabel_10.setBounds(410, 287, 100, 16);
			contentPane.add(lblNewLabel_10);
			
			lblNewLabel_11 = new JLabel("New label");
			lblNewLabel_11.setBounds(590, 287, 100, 16);
			contentPane.add(lblNewLabel_11);
			
			lblNewLabel_12 = new JLabel("New label");
			lblNewLabel_12.setBounds(724, 287, 100, 16);
			contentPane.add(lblNewLabel_12);
			
			lblNewLabel_13 = new JLabel("New label");
			lblNewLabel_13.setBounds(842, 287, 100, 16);
			contentPane.add(lblNewLabel_13);

			lblNewLabel_14 = new JLabel("New label");
			lblNewLabel_14.setBounds(962, 287, 100, 16);
			contentPane.add(lblNewLabel_14);
			
	 	}else if(labels ==14){
			lblNewLabel = new JLabel("Root");
			lblNewLabel.setBounds(530, 31, 100, 16);
			contentPane.add(lblNewLabel);
			
			lblNewLabel_1 = new JLabel("New label");
			lblNewLabel_1.setBounds(218, 131, 100, 16);
			contentPane.add(lblNewLabel_1);
			
			lblNewLabel_2 = new JLabel("New label");
			lblNewLabel_2.setBounds(789, 131, 100, 16);
			contentPane.add(lblNewLabel_2);
			
			lblNewLabel_3 = new JLabel("New label");
			lblNewLabel_3.setBounds(108, 200, 100, 16);
			contentPane.add(lblNewLabel_3);
			
			lblNewLabel_4 = new JLabel("New label");
			lblNewLabel_4.setBounds(344, 200, 100, 16);
			contentPane.add(lblNewLabel_4);
			
			lblNewLabel_5 = new JLabel("New label");
			lblNewLabel_5.setBounds(662, 200, 100, 16);
			contentPane.add(lblNewLabel_5);
			
			lblNewLabel_6 = new JLabel("New label");
			lblNewLabel_6.setBounds(895, 200, 100, 16);
			contentPane.add(lblNewLabel_6);
			
			lblNewLabel_7 = new JLabel("New label");
			lblNewLabel_7.setBounds(37, 287, 100, 16);
			contentPane.add(lblNewLabel_7);
			
			lblNewLabel_8 = new JLabel("New label");
			lblNewLabel_8.setBounds(166, 287, 100, 16);
			contentPane.add(lblNewLabel_8);
			
			lblNewLabel_9 = new JLabel("New label");
			lblNewLabel_9.setBounds(287, 287, 100, 16);
			contentPane.add(lblNewLabel_9);
			
			lblNewLabel_10 = new JLabel("New label");
			lblNewLabel_10.setBounds(410, 287, 100, 16);
			contentPane.add(lblNewLabel_10);
			
			lblNewLabel_11 = new JLabel("New label");
			lblNewLabel_11.setBounds(590, 287, 100, 16);
			contentPane.add(lblNewLabel_11);
			
			lblNewLabel_12 = new JLabel("New label");
			lblNewLabel_12.setBounds(724, 287, 100, 16);
			contentPane.add(lblNewLabel_12);
			
			lblNewLabel_13 = new JLabel("New label");
			lblNewLabel_13.setBounds(842, 287, 100, 16);
			contentPane.add(lblNewLabel_13);

		}else if(labels == 13){
			lblNewLabel = new JLabel("Root");
			lblNewLabel.setBounds(530, 31, 100, 16);
			contentPane.add(lblNewLabel);
			
			lblNewLabel_1 = new JLabel("New label");
			lblNewLabel_1.setBounds(218, 131, 100, 16);
			contentPane.add(lblNewLabel_1);
			
			lblNewLabel_2 = new JLabel("New label");
			lblNewLabel_2.setBounds(789, 131, 100, 16);
			contentPane.add(lblNewLabel_2);
			
			lblNewLabel_3 = new JLabel("New label");
			lblNewLabel_3.setBounds(108, 200, 100, 16);
			contentPane.add(lblNewLabel_3);
			
			lblNewLabel_4 = new JLabel("New label");
			lblNewLabel_4.setBounds(344, 200, 100, 16);
			contentPane.add(lblNewLabel_4);
			
			lblNewLabel_5 = new JLabel("New label");
			lblNewLabel_5.setBounds(662, 200, 100, 16);
			contentPane.add(lblNewLabel_5);
			
			lblNewLabel_6 = new JLabel("New label");
			lblNewLabel_6.setBounds(895, 200, 100, 16);
			contentPane.add(lblNewLabel_6);
			
			lblNewLabel_7 = new JLabel("New label");
			lblNewLabel_7.setBounds(37, 287, 100, 16);
			contentPane.add(lblNewLabel_7);
			
			lblNewLabel_8 = new JLabel("New label");
			lblNewLabel_8.setBounds(166, 287, 100, 16);
			contentPane.add(lblNewLabel_8);
			
			lblNewLabel_9 = new JLabel("New label");
			lblNewLabel_9.setBounds(287, 287, 100, 16);
			contentPane.add(lblNewLabel_9);
			
			lblNewLabel_10 = new JLabel("New label");
			lblNewLabel_10.setBounds(410, 287, 100, 16);
			contentPane.add(lblNewLabel_10);
			
			lblNewLabel_11 = new JLabel("New label");
			lblNewLabel_11.setBounds(590, 287, 100, 16);
			contentPane.add(lblNewLabel_11);
			
			lblNewLabel_12 = new JLabel("New label");
			lblNewLabel_12.setBounds(724, 287, 100, 16);
			contentPane.add(lblNewLabel_12);
		}else if(labels == 12){
			lblNewLabel = new JLabel("Root");
			lblNewLabel.setBounds(530, 31, 100, 16);
			contentPane.add(lblNewLabel);
			
			lblNewLabel_1 = new JLabel("New label");
			lblNewLabel_1.setBounds(218, 131, 100, 16);
			contentPane.add(lblNewLabel_1);
			
			lblNewLabel_2 = new JLabel("New label");
			lblNewLabel_2.setBounds(789, 131, 100, 16);
			contentPane.add(lblNewLabel_2);
			
			lblNewLabel_3 = new JLabel("New label");
			lblNewLabel_3.setBounds(108, 200, 100, 16);
			contentPane.add(lblNewLabel_3);
			
			lblNewLabel_4 = new JLabel("New label");
			lblNewLabel_4.setBounds(344, 200, 100, 16);
			contentPane.add(lblNewLabel_4);
			
			lblNewLabel_5 = new JLabel("New label");
			lblNewLabel_5.setBounds(662, 200, 100, 16);
			contentPane.add(lblNewLabel_5);
			
			lblNewLabel_6 = new JLabel("New label");
			lblNewLabel_6.setBounds(895, 200, 100, 16);
			contentPane.add(lblNewLabel_6);
			
			lblNewLabel_7 = new JLabel("New label");
			lblNewLabel_7.setBounds(37, 287, 100, 16);
			contentPane.add(lblNewLabel_7);
			
			lblNewLabel_8 = new JLabel("New label");
			lblNewLabel_8.setBounds(166, 287, 100, 16);
			contentPane.add(lblNewLabel_8);
			
			lblNewLabel_9 = new JLabel("New label");
			lblNewLabel_9.setBounds(287, 287, 100, 16);
			contentPane.add(lblNewLabel_9);
			
			lblNewLabel_10 = new JLabel("New label");
			lblNewLabel_10.setBounds(410, 287, 100, 16);
			contentPane.add(lblNewLabel_10);
			
			lblNewLabel_11 = new JLabel("New label");
			lblNewLabel_11.setBounds(590, 287, 100, 16);
			contentPane.add(lblNewLabel_11);
		}else if(labels == 11){
			lblNewLabel = new JLabel("Root");
			lblNewLabel.setBounds(530, 31, 100, 16);
			contentPane.add(lblNewLabel);
			
			lblNewLabel_1 = new JLabel("New label");
			lblNewLabel_1.setBounds(218, 131, 100, 16);
			contentPane.add(lblNewLabel_1);
			
			lblNewLabel_2 = new JLabel("New label");
			lblNewLabel_2.setBounds(789, 131, 100, 16);
			contentPane.add(lblNewLabel_2);
			
			lblNewLabel_3 = new JLabel("New label");
			lblNewLabel_3.setBounds(108, 200, 100, 16);
			contentPane.add(lblNewLabel_3);
			
			lblNewLabel_4 = new JLabel("New label");
			lblNewLabel_4.setBounds(344, 200, 100, 16);
			contentPane.add(lblNewLabel_4);
			
			lblNewLabel_5 = new JLabel("New label");
			lblNewLabel_5.setBounds(662, 200, 100, 16);
			contentPane.add(lblNewLabel_5);
			
			lblNewLabel_6 = new JLabel("New label");
			lblNewLabel_6.setBounds(895, 200, 100, 16);
			contentPane.add(lblNewLabel_6);
			
			lblNewLabel_7 = new JLabel("New label");
			lblNewLabel_7.setBounds(37, 287, 100, 16);
			contentPane.add(lblNewLabel_7);
			
			lblNewLabel_8 = new JLabel("New label");
			lblNewLabel_8.setBounds(166, 287, 100, 16);
			contentPane.add(lblNewLabel_8);
			
			lblNewLabel_9 = new JLabel("New label");
			lblNewLabel_9.setBounds(287, 287, 100, 16);
			contentPane.add(lblNewLabel_9);
			
			lblNewLabel_10 = new JLabel("New label");
			lblNewLabel_10.setBounds(410, 287, 100, 16);
			contentPane.add(lblNewLabel_10);
		}else{
			lblNewLabel = new JLabel("Root");
			lblNewLabel.setBounds(530, 31, 100, 16);
			contentPane.add(lblNewLabel);
			
			lblNewLabel_1 = new JLabel("New label");
			lblNewLabel_1.setBounds(218, 131, 100, 16);
			contentPane.add(lblNewLabel_1);
			
			lblNewLabel_2 = new JLabel("New label");
			lblNewLabel_2.setBounds(789, 131, 100, 16);
			contentPane.add(lblNewLabel_2);
			
			lblNewLabel_3 = new JLabel("New label");
			lblNewLabel_3.setBounds(108, 200, 100, 16);
			contentPane.add(lblNewLabel_3);
			
			lblNewLabel_4 = new JLabel("New label");
			lblNewLabel_4.setBounds(344, 200, 100, 16);
			contentPane.add(lblNewLabel_4);
			
			lblNewLabel_5 = new JLabel("New label");
			lblNewLabel_5.setBounds(662, 200, 100, 16);
			contentPane.add(lblNewLabel_5);
			
			lblNewLabel_6 = new JLabel("New label");
			lblNewLabel_6.setBounds(895, 200, 100, 16);
			contentPane.add(lblNewLabel_6);
			
			lblNewLabel_7 = new JLabel("New label");
			lblNewLabel_7.setBounds(37, 287, 100, 16);
			contentPane.add(lblNewLabel_7);
			
			lblNewLabel_8 = new JLabel("New label");
			lblNewLabel_8.setBounds(166, 287, 100, 16);
			contentPane.add(lblNewLabel_8);
			
			lblNewLabel_9 = new JLabel("New label");
			lblNewLabel_9.setBounds(287, 287, 100, 16);
			contentPane.add(lblNewLabel_9);
		}
		
		btnNewButton = new JButton("Randomize");
		btnNewButton.addActionListener(controller);
		btnNewButton.setBounds(51, 410, 97, 25);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Start");
		btnNewButton_1.addActionListener(controller);
		btnNewButton_1.setBounds(51, 450, 97, 25);
		contentPane.add(btnNewButton_1);
		
		rdbtnNewRadioButton = new JRadioButton("0.5");
		rdbtnNewRadioButton.setBounds(51, 503, 127, 25);
		rdbtnNewRadioButton.setActionCommand("0.5");
		contentPane.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("1");
		rdbtnNewRadioButton_1.setBounds(51, 550, 127, 25);
		rdbtnNewRadioButton_1.setActionCommand("1");
		contentPane.add(rdbtnNewRadioButton_1);
		
		rdbtnNewRadioButton_2 = new JRadioButton("2");
		rdbtnNewRadioButton_2.setBounds(51, 597, 127, 25);
		rdbtnNewRadioButton_2.setActionCommand("2");;
		contentPane.add(rdbtnNewRadioButton_2);
		
		JTextArea textArea = new JTextArea("Array", 15,1);
		textArea.setBounds(186, 345, 866, 334);
		textArea.setLineWrap(true);
		textArea.setFont(new Font("LucidaSans", Font.PLAIN, 25));
		contentPane.add(textArea);

		bGroup = new ButtonGroup();
		bGroup.add(rdbtnNewRadioButton);
		bGroup.add(rdbtnNewRadioButton_1);
		bGroup.add(rdbtnNewRadioButton_2);
	}

	public JLabel[] getLabels(){
		f = new JLabel[labels];
		if(labels ==15){
			f[0] =lblNewLabel;
			f[1]=lblNewLabel_1;
			f[2]=lblNewLabel_2;
			f[3]=lblNewLabel_3;
			f[4]=lblNewLabel_4;		
			f[5]=lblNewLabel_5;
			f[6]=lblNewLabel_6;
			f[7]=lblNewLabel_7;
			f[8]=lblNewLabel_8;		
			f[9]=lblNewLabel_9;
			f[10]=lblNewLabel_10;
			f[11]=lblNewLabel_11;
			f[12]=lblNewLabel_12;	
			f[13]=lblNewLabel_13;
			f[14]=lblNewLabel_14;
			return f;
		}else if(labels ==14){
			f[0] = lblNewLabel;
			f[1]=lblNewLabel_1;
			f[2]=lblNewLabel_2;
			f[3]=lblNewLabel_3;
			f[4]=lblNewLabel_4;		
			f[5]=lblNewLabel_5;
			f[6]=lblNewLabel_6;
			f[7]=lblNewLabel_7;
			f[8]=lblNewLabel_8;		
			f[9]=lblNewLabel_9;
			f[10]=lblNewLabel_10;
			f[11]=lblNewLabel_11;
			f[12]=lblNewLabel_12;	
			f[13]=lblNewLabel_13;
			return f;
		}else if(labels ==13){
			f[0] = lblNewLabel;
			f[1]=lblNewLabel_1;
			f[2]=lblNewLabel_2;
			f[3]=lblNewLabel_3;
			f[4]=lblNewLabel_4;		
			f[5]=lblNewLabel_5;
			f[6]=lblNewLabel_6;
			f[7]=lblNewLabel_7;
			f[8]=lblNewLabel_8;		
			f[9]=lblNewLabel_9;
			f[10]=lblNewLabel_10;
			f[11]=lblNewLabel_11;
			f[12]=lblNewLabel_12;	
			return f;
		}else if(labels ==12){
			f[0] = lblNewLabel;
			f[1]=lblNewLabel_1;
			f[2]=lblNewLabel_2;
			f[3]=lblNewLabel_3;
			f[4]=lblNewLabel_4;		
			f[5]=lblNewLabel_5;
			f[6]=lblNewLabel_6;
			f[7]=lblNewLabel_7;
			f[8]=lblNewLabel_8;		
			f[9]=lblNewLabel_9;
			f[10]=lblNewLabel_10;
			f[11]=lblNewLabel_11;	
			return f;
		}else if(labels == 11){
			f[0] =lblNewLabel;
			f[1]=lblNewLabel_1;
			f[2]=lblNewLabel_2;
			f[3]=lblNewLabel_3;
			f[4]=lblNewLabel_4;		
			f[5]=lblNewLabel_5;
			f[6]=lblNewLabel_6;
			f[7]=lblNewLabel_7;
			f[8]=lblNewLabel_8;		
			f[9]=lblNewLabel_9;
			f[10]=lblNewLabel_10;
			return f;
		}else{
			f[0] =lblNewLabel;
			f[1]=lblNewLabel_1;
			f[2]=lblNewLabel_2;
			f[3]=lblNewLabel_3;
			f[4]=lblNewLabel_4;		
			f[5]=lblNewLabel_5;
			f[6]=lblNewLabel_6;
			f[7]=lblNewLabel_7;
			f[8]=lblNewLabel_8;		
			f[9]=lblNewLabel_9;
			return f;
		}
	}

	public void setLabels(JLabel[] j){
		this.f = j;
		assignLabels();
	}
	public void assignLabels(){
		if(labels == 15){
			lblNewLabel = f[0];
			lblNewLabel_1 = f[1];
			lblNewLabel_2 = f[2];
			lblNewLabel_3 = f[3];
			lblNewLabel_4 = f[4];
			lblNewLabel_5 = f[5];
			lblNewLabel_6 = f[6];
			lblNewLabel_7 = f[7];
			lblNewLabel_8 = f[8];
			lblNewLabel_9 = f[9];
			lblNewLabel_10 = f[10];
			lblNewLabel_11 = f[11];
			lblNewLabel_12 = f[12];
			lblNewLabel_13 = f[13];
			lblNewLabel_14 = f[14];
		}
		if(labels == 14){
			lblNewLabel = f[0];
			lblNewLabel_1 = f[1];
			lblNewLabel_2 = f[2];
			lblNewLabel_3 = f[3];
			lblNewLabel_4 = f[4];
			lblNewLabel_5 = f[5];
			lblNewLabel_6 = f[6];
			lblNewLabel_7 = f[7];
			lblNewLabel_8 = f[8];
			lblNewLabel_9 = f[9];
			lblNewLabel_10 = f[10];
			lblNewLabel_11 = f[11];
			lblNewLabel_12 = f[12];
			lblNewLabel_13 = f[13];
		}
		if(labels == 13){
			lblNewLabel = f[0];
			lblNewLabel_1 = f[1];
			lblNewLabel_2 = f[2];
			lblNewLabel_3 = f[3];
			lblNewLabel_4 = f[4];
			lblNewLabel_5 = f[5];
			lblNewLabel_6 = f[6];
			lblNewLabel_7 = f[7];
			lblNewLabel_8 = f[8];
			lblNewLabel_9 = f[9];
			lblNewLabel_10 = f[10];
			lblNewLabel_11 = f[11];
			lblNewLabel_12 = f[12];
		}
		if(labels == 12){
			lblNewLabel = f[0];
			lblNewLabel_1 = f[1];
			lblNewLabel_2 = f[2];
			lblNewLabel_3 = f[3];
			lblNewLabel_4 = f[4];
			lblNewLabel_5 = f[5];
			lblNewLabel_6 = f[6];
			lblNewLabel_7 = f[7];
			lblNewLabel_8 = f[8];
			lblNewLabel_9 = f[9];
			lblNewLabel_10 = f[10];
			lblNewLabel_11 = f[11];
		}
		if(labels == 11){
			lblNewLabel = f[0];
			lblNewLabel_1 = f[1];
			lblNewLabel_2 = f[2];
			lblNewLabel_3 = f[3];
			lblNewLabel_4 = f[4];
			lblNewLabel_5 = f[5];
			lblNewLabel_6 = f[6];
			lblNewLabel_7 = f[7];
			lblNewLabel_8 = f[8];
			lblNewLabel_9 = f[9];
			lblNewLabel_10 = f[10];
		}
		if(labels == 10){
			lblNewLabel = f[0];
			lblNewLabel_1 = f[1];
			lblNewLabel_2 = f[2];
			lblNewLabel_3 = f[3];
			lblNewLabel_4 = f[4];
			lblNewLabel_5 = f[5];
			lblNewLabel_6 = f[6];
			lblNewLabel_7 = f[7];
			lblNewLabel_8 = f[8];
			lblNewLabel_9 = f[9];
		}
		repaint();
	}

	public String getJRadioButton(){
		return  bGroup.getSelection().getActionCommand();
	}

	public JButton[] getButtons(){
		JButton[] arrB= new JButton[2];
		arrB[0] = btnNewButton;
		arrB[1] = btnNewButton_1;
		return arrB;
	}
}
