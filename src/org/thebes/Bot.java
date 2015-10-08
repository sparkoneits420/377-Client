package org.thebes;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.lang.Runnable;

/**
 *
 * @author smokey
 */
 public class Bot extends JFrame {
 
	public Bot() {
		super("377 Client");
		initComponents();
	}
		
	private void initComponents() {
	
		clientStub = new ClientStub();
		
		setDefaultLookAndFeelDecorated(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(765, 503));
		
		add(clientStub, BorderLayout.CENTER);
		this.pack();
		clientStub.init(); 
	}


	public static final void main(String args[]) {
		EventQueue.invokeLater(new Runnable() { 
			public void run() {
				new Bot().setVisible(true);
			}
		});
	}
	
	private ClientStub clientStub;
 
 }