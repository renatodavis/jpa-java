package com.renatodavis.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import com.renatodavis.model.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class FormCategoriaView extends JFrame {

	private JPanel contentPane;
	private JTable jTCategoria;
	
	CategoriaTableModel categoriaTable = new CategoriaTableModel();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormCategoriaView frame = new FormCategoriaView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FormCategoriaView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 888, 497);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 84, 852, 301);
		contentPane.add(scrollPane);
		
		jTCategoria = new JTable();
		scrollPane.setViewportView(jTCategoria);
		
		jTCategoria.setModel(categoriaTable);
	}
	
	
}
