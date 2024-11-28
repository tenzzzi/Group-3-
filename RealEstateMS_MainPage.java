/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group3.realestatems_g3;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class RealEstateMS_MainPage extends JFrame{
    
    public RealEstateMS_MainPage() {
        initComponents();
        
        //Frame
        setTitle("Real Estate Management System");
        setSize(900, 700);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        JTabbedPane tabbedPane = new JTabbedPane();
        
        //Tab 1
        JPanel panel1 = new JPanel();
        panel1.add(new JLabel(""));
        tabbedPane.addTab("Clients", panel1);
        
        JPanel searchPanel1 = new JPanel();
        JTextField txtSearch1 = new JTextField(20);
        JButton btnSearch1 = new JButton("SEARCH");
        searchPanel1.add(txtSearch1);
        searchPanel1.add(btnSearch1);
        
        //Tab 1 > JTable
        String[] columnNames1 = {"Client ID", "Name", "Contact Number", "Email Adress", "Properties Owned"};
        DefaultTableModel model1 = new DefaultTableModel(columnNames1, 100);
        JTable table1 = new JTable(model1);
        JScrollPane scrollPane1 = new JScrollPane(table1);
        
        //Tab 1 - Buttons
        JPanel buttonPanel1 = new JPanel();
        JButton btnMarAn = new JButton("Market Analysis");
        JButton btnSalRe = new JButton("Sales Report");
        buttonPanel1.add(btnMarAn);
        buttonPanel1.add(btnSalRe);
        
        panel1.add(searchPanel1, BorderLayout.NORTH);
        panel1.add(scrollPane1, BorderLayout.AFTER_LINE_ENDS);
        panel1.add(buttonPanel1, BorderLayout.EAST);
        
        btnMarAn.setSize(100, 40);
        btnSalRe.setSize(100, 40); 
        
        
        //Tab 2
        JPanel panel2 = new JPanel();
        panel2.add(new JLabel(""));
        tabbedPane.addTab("Properties", panel2);
            
        JPanel searchPanel2 = new JPanel();
        JTextField searchField2 = new JTextField(20);
        JButton btnSearch2 = new JButton("SEARCH");
        searchPanel2.add(searchField2);
        searchPanel2.add(btnSearch2);
        
        
//      //Tab 2 > Tables
        String[] columnNames2 = {"Property ID", "Location", "Price", "Status"};
        DefaultTableModel model2 = new DefaultTableModel(columnNames2, 100);
        JTable table2 = new JTable(model2);
        JScrollPane scrollPane2 = new JScrollPane(table2);
        
        //Tab 2 - Buttons
        JPanel buttonPanel2 = new JPanel();
        JButton btnManTra = new JButton("Manage Transactions");
        buttonPanel2.add(btnManTra);
        
        panel2.add(searchPanel2, BorderLayout.BEFORE_LINE_BEGINS);
        panel2.add(scrollPane2, BorderLayout.AFTER_LAST_LINE);
        panel2.add(buttonPanel2, BorderLayout.EAST);
        
        //Main Panle
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        mainPanel.add(tabbedPane, BorderLayout.CENTER);
        
//        this.add(tabbedPane);
        this.add(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(900, 700);
        this.setVisible(true);
        
        //Action Listener
        btnMarAn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
            
        });
        
    }
}
