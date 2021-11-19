package com.renatodavis.view;

import java.awt.EventQueue;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormSistemaMenu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormSistemaMenu window = new FormSistemaMenu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FormSistemaMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 652, 423);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Cadastros");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmPessoa = new JMenuItem("Pessoa");
		mntmPessoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Chamando categoria 
				FormPessoa formPessoa = new FormPessoa(); 
				frame.setTitle("Pessoa");
				formPessoa.setVisible(true);
			}
		});
		mnNewMenu.add(mntmPessoa);
		
		JMenuItem mntmCategoria = new JMenuItem("Categoria");
		mntmCategoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Chamando categoria 
				FormCategoria formCategoria = new FormCategoria(); 
				formCategoria.setVisible(true);
			}
		});
		mnNewMenu.add(mntmCategoria);
		
		JMenu mnNewMenu_1 = new JMenu("TesteViewCategoria");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("ViewCategoria");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormCategoriaView view = new FormCategoriaView();
				view.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JMenuItem menuItem = new JMenuItem("New menu item");
		menuBar.add(menuItem);
	}

}
