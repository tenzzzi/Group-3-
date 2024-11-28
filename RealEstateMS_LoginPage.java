/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group3.realestatems_g3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author ACER
 */
public class RealEstateMS_LoginPage extends JFrame{
    
    private JTextField txtAdminID;
    private JPasswordField pfPassword;
    private JPanel panel;
    private JLabel lblAdminID;
    private JLabel lblPassword;
    private JButton btnLogin;
    private JButton btnClear;
    
    public RealEstateMS_LoginPage(){
        //Frame
        setTitle("Admin Login");
        setSize(900, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        
        //Components - Labels
        JLabel lblAdminID = new JLabel("Admin ID:");
        lblAdminID.setBounds(250, 155, 100, 30);
        add(lblAdminID);
        
        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setBounds(250, 205, 100, 30);
        add(lblPassword);
        
        //Components - Text Field
        JTextField txtAdminID = new JTextField();
        txtAdminID.setBounds(330, 150, 200, 40);
        add(txtAdminID);
        
        JPasswordField pfPassword = new JPasswordField();
        pfPassword.setBounds(330, 200, 200, 40);
        add(pfPassword);
        
        //Components - Buttons
        JButton btnClear = new JButton("CLEAR");
        btnClear.setBounds(449, 250, 80, 30);
        add(btnClear);
        
        JButton btnLogin = new JButton("LOGIN");
        btnLogin.setBounds(350, 250, 80, 30);
        add(btnLogin);
        
        //Action Listener
        btnLogin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            
                String adminID = txtAdminID.getText();
                String password = new String(pfPassword.getPassword());
                
                //Validation
                if (adminID.equals("admin123") && password.equals("admin456")){
                    JOptionPane.showMessageDialog(null, "Login Succesful!");
                    RealEstateMS_MainPage mainPage = new RealEstateMS_MainPage();
                    mainPage.setVisible(true);
                    dispose();
                    
                } else{
                    JOptionPane.showMessageDialog(null, "Invalid Admin ID or Password");
                } 
            }  
        });
        
        btnClear.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                txtAdminID.setText("");
                pfPassword.setText("");
            
            }
        });

        setVisible(true);
    }
}
