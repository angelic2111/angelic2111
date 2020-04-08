import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class SimpleStart extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleStart frame = new SimpleStart();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * This is the frame.
	 */
	JFrame frame = new JFrame("Simple GUI example");
	
	
	
	public SimpleStart() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		//---------------------------------------------------------------------------------
		//This is the menu list
		//---------------------------------------------------------------------------------
		JMenu fileMenu = new JMenu("File");
		menuBar.add(fileMenu);
		//--------------------------------------------------------------------------------
		//This is the list
		//--------------------------------------------------------------------------------
		JMenuItem item1 = new JMenuItem("LoadFile");
		fileMenu.add(item1);
		
		JMenuItem item2 = new JMenuItem("Load Pattern");
		fileMenu.add(item2);
		
		
		//--------------------------------------------------------------------------------
		//Now add actionlistener to load the file
		//--------------------------------------------------------------------------------
		item1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				 JFileChooser fileChooser = new JFileChooser(".");
				 int status = fileChooser.showOpenDialog(null);
			
				 //-----------------------------------------------------------------------------------
				 //If file is selected the file path is captured else canceled
				 //-----------------------------------------------------------------------------------
			
				 	//this is file choosing code
				 
				 if (status == JFileChooser.APPROVE_OPTION) {
				      File selectedFile = fileChooser.getSelectedFile();
				      System.out.println(selectedFile.getParent());
				      System.out.println(selectedFile.getName());
				      
				      //--------------------------------------------------------------------------------
				      //If file is choosed it is send to read
				      //------------------------------------------------------------------------------
				      LoadFile lf = new LoadFile();
				      
				      File file = fileChooser.getSelectedFile();
				      System.out.println(file);
				      lf.loadFile(file);
				      
				      //--------------------------------------------------------------------------------
				    } 
				 else if (status == JFileChooser.CANCEL_OPTION) {
				      System.out.println("calceled");

				    }
				  
			}
				
		});
		
		//----------------------------------------------------------------------------------------------------------
		//This is for loading pattern
		//----------------------------------------------------------------------------------------------------------
		item2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				 JFileChooser fileChooser = new JFileChooser(".");
				 int status = fileChooser.showOpenDialog(null);
			
				 //-----------------------------------------------------------------------------------
				 //If file is selected the file path is captured else canceled
				 //-----------------------------------------------------------------------------------
			
				 	//this is file choosing code
				 
				 if (status == JFileChooser.APPROVE_OPTION) {
				      File selectedFile = fileChooser.getSelectedFile();
				      System.out.println(selectedFile.getParent());
				      System.out.println(selectedFile.getName());
				      
				      //--------------------------------------------------------------------------------
				      //If file is choosed it is send to read
				      //------------------------------------------------------------------------------
				      LoadPattern ldp = new LoadPattern();
				      
				      File file = fileChooser.getSelectedFile();
				      System.out.println(file);
				      ldp.loadPattern(file);
				      
				      //--------------------------------------------------------------------------------
				    } 
				 else if (status == JFileChooser.CANCEL_OPTION) {
				      System.out.println("calceled");

				    }
				  
			}
				
		});

		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	}
}
