/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RealEstate;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @Lemon, Tines Jimay
 */
public class ManagingTransaction extends JFrame {
    private JButton jbtnSearch, jbtnAdd, jbtnUpdate, jbtnDelete;
    private JPanel jpClient, jpProperty;
    private JTextField jtfSearch;
    private JTable jtTrans;
    private JTabbedPane tabbedPane;
    private JLabel jlblHdrPage;
    private DefaultTableModel tblModel;
    private TableColumnModel tblColModel;
    
    ManagingTransaction(){
        setLayout(null);
        setTitle("Real Estate Managment Syatem");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(900, 700);
        setLayout(null);
        
    jlblHdrPage = new JLabel();
    jlblHdrPage.setText("Real Estate Management System - Properties’ Tab > Manage Transactions");
    jlblHdrPage.setBounds(5, 0, 600, 50);
        add(jlblHdrPage);
        
    tabbedPane = new JTabbedPane();
    tabbedPane.setBounds(70, 50, 700, 500);
        add(tabbedPane);
        
//    client panel
    jpClient = new JPanel();
    tabbedPane.addTab("Clients", jpClient);
    
    jpProperty = new JPanel();
    tabbedPane.addTab("Property", jpProperty);
    
    jtfSearch = new JTextField();
    jtfSearch.setText("Search...");
//    jtfSearch.setBounds(10, 50, 400, 35);
    jpProperty.add(jtfSearch);
    
    jbtnSearch = new JButton();
    jbtnSearch.setText("Search");
//    jbtnSearch.setBounds(410, 50, 100, 35);
    jpProperty.add(jbtnSearch);
    
//    table contents
    jtTrans = new JTable(new Object[][] {
                {"Property ID", "Transaction for", "Trans. Number", "Date", "Amount", "MOP"}
        }, new String[] {
                "Property ID", "Transaction for", "Trans. Number", "Date", "Amount", "MOP"
        });
    jpProperty.add(jtTrans);
//    String[] columns = {"Property ID", "Transaction for", "Trans. Number", "Date", "Amount", "MOP"};
//    tblModel = new DefaultTableModel(columns, 0);
//    jtTrans = new JTable(tblModel);
//    jpProperty.add(jtTrans);

    tblColModel = jtTrans.getColumnModel();
    
    tblColModel.getColumn(0).setPreferredWidth(110);
    tblColModel.getColumn(1).setPreferredWidth(150);
    tblColModel.getColumn(1).setPreferredWidth(110);
    tblColModel.getColumn(1).setPreferredWidth(110);
    tblColModel.getColumn(1).setPreferredWidth(110);
    tblColModel.getColumn(1).setPreferredWidth(110);
    
    jtTrans.setShowGrid(true);
    jpProperty.add(new JScrollPane(jtTrans));
    
    jbtnAdd = new JButton();
    jbtnAdd.setText("Add");
    jbtnAdd.setBounds(70, 560, 100, 40);
        add(jbtnAdd);
        
    jbtnDelete = new JButton();
    jbtnDelete.setText("Delete");
    jbtnDelete.setBounds(180, 560, 100, 40);
        add(jbtnDelete);
    
    jbtnUpdate = new JButton();
    jbtnUpdate.setText("Update");
    jbtnUpdate.setBounds(290, 560, 100, 40);
        add(jbtnUpdate);
    
        setVisible(true);
        
    }
    
    
    
}
