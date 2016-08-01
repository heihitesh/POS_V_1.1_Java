/*
 * Created by JFormDesigner on Mon Aug 01 23:33:38 IST 2016
 */

package Details;

import java.beans.*;
import javax.swing.event.*;

import DataBaseServices.dbsItem;
import DataBaseServices.dbsItemSpecific;
import HelperClasses.Toast;
import HelpingLitrals.hl_MAIN_CLASS;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Hitesh Verma
 */
public class ItemUpdateAndAnalysis extends JFrame {
    String itemName,Category;
    dbsItemSpecific ItemSpecfic;
    Connection myConn = hl_MAIN_CLASS.getMyConn();
    String Qty_ACTION = "ADD";
    int currentQty;
    int newQty = currentQty;


    public ItemUpdateAndAnalysis(String itemName, String cat , String CurrentPrice , String CurrentQuantity) {
        initComponents();
        this.itemName = itemName;
        this.Category = cat;
        this.currentQty = Integer.parseInt(CurrentQuantity.replaceAll("[\\D]", ""));

        ItemSpecfic = new dbsItemSpecific(myConn,table1);
        ItemSpecfic.refreshItemSpecificTabel(itemName);
        DetailItemName.setText(itemName);
        DetailCategory.setText(cat);
        UpdateItemName.setText(itemName);
        UpdateCategory.setText(cat);
        UpdateCurrentPrice.setText(CurrentPrice);
        UpdateCurrentQty.setText(CurrentQuantity);
        UpdateNewQty.setText(String.valueOf(currentQty));

        String qty_unit =  hl_MAIN_CLASS.getQuantityUnit(CurrentQuantity);

        UpdateQtyUnit.setText(qty_unit);
        UpdateQtyUnit2.setText(qty_unit);

    }

    private void bClose(ActionEvent e) {
        // TODO add your code here
    }

    private void bItemSave(ActionEvent e) {
        // TODO add your code here
        int newQTY = Integer.parseInt(UpdateNewQty.getText());
        float newPrice = Float.parseFloat(tvUpdatePrice.getText());
        String newRemark = tvUpdateRemak.getText();
//
//            dbsItem.setItemSpecificTable
//                    (hl_item_table.getITEM_TABLE_itemName(), hl_item_table.getITEM_TABLE_itemQty(),
//                            hl_item_table.ITEM_TABLE_itemPrice, addQty, newPrice, hl_item_table.getITEM_TABLE_itemRemark());
//            //4) Updating the Quantity Table
//            dbsItem.updateQuantityTable(hl_item_table.getITEM_TABLE_itemQty() + addQty, hl_item_table.getITEM_TABLE_itemName());
//            //5) Update the Sales Tabel
//            dbsItem.updateSalesTable(newPrice, hl_item_table.getITEM_TABLE_itemName());
//            //6) change the Remark
//            dbsItem.updateRemark(newRemark, hl_item_table.getITEM_TABLE_itemName());
//            //7) change Item table table_id to not NULL
//            dbsItem.ChangeTabelID_ItemTable(hl_item_table.getITEM_TABLE_itemName());
//            //8) Update both the tables
//            dbsItem.refreshItemTabel();
//
//
//        //if the table is already created only just increment the tabel
//            System.out.println("Table found");
//
//            dbsItem.setItemSpecificTable
//                    (hl_item_table.getITEM_TABLE_itemName(), hl_item_table.getITEM_TABLE_itemQty(),
//                            hl_item_table.getITEM_TABLE_itemPrice(), addQty, newPrice, hl_item_table.getITEM_TABLE_itemRemark());
//
//            dbsItem.updateQuantityTable(hl_item_table.getITEM_TABLE_itemQty() + addQty, hl_item_table.getITEM_TABLE_itemName());
//            //5) Update the Sales Tabel
//            dbsItem.updateSalesTable(newPrice, hl_item_table.getITEM_TABLE_itemName());
//            //6) change the Remark
//            dbsItem.updateRemark(newRemark, hl_item_table.getITEM_TABLE_itemName());
//            //7) change Item table table_id to not NULL
//            dbsItem.ChangeTabelID_ItemTable(hl_item_table.getITEM_TABLE_itemName());
//            //8) Update both the tables
//            dbsItem.refreshItemTabel();
//
//        }


    }

    private void radioUpdateAdd(ActionEvent e) {
        // TODO add your code here
        Qty_ACTION = "ADD";
        newQty = Integer.parseInt(tvUpdateQty.getText()) + currentQty;
        UpdateNewQty.setText(String.valueOf(newQty));
    }

    private void radioUpdateSubtract(ActionEvent e) {
        // TODO add your code here
        Qty_ACTION = "SUB";
        if ((currentQty - Integer.parseInt(tvUpdateQty.getText())) >= 0) {
            newQty = currentQty - Integer.parseInt(tvUpdateQty.getText());
        } else {
            Toast.makeText(hl_MAIN_CLASS.getMainPanel(), "Please Enter a Valid Value", Toast.Style.ERROR).display();
            newQty = 0;
        }
        UpdateNewQty.setText(String.valueOf(newQty));

    }


    private void tvUpdateQtyCaretUpdate(CaretEvent e) {
        // TODO add your code here
        try {
            tvUpdateQty.getText();
            if (Qty_ACTION.equals("ADD")) {
                newQty = Integer.parseInt(tvUpdateQty.getText()) + currentQty;
            } else {
                if ((currentQty - Integer.parseInt(tvUpdateQty.getText())) >= 0) {
                    newQty = currentQty - Integer.parseInt(tvUpdateQty.getText());
                } else {
                    Toast.makeText(hl_MAIN_CLASS.getMainPanel(), "Please Enter a Valid Value", Toast.Style.ERROR).display();
                    newQty = 0;
                }
            }
            UpdateNewQty.setText(String.valueOf(newQty));
        }catch (Exception ex){
            UpdateNewQty.setText(String.valueOf(currentQty));
        }
    }



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Hitesh Verma
        tabbedPane1 = new JTabbedPane();
        panel1 = new JPanel();
        DetailItemName = new JLabel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        label2 = new JLabel();
        label3 = new JLabel();
        DetailCategory = new JLabel();
        button1 = new JButton();
        label1 = new JLabel();
        panel2 = new JPanel();
        label21 = new JLabel();
        label22 = new JLabel();
        label23 = new JLabel();
        button4 = new JButton();
        label24 = new JLabel();
        tvUpdatePrice = new JTextField();
        label26 = new JLabel();
        tvUpdateQty = new JTextField();
        label27 = new JLabel();
        scrollPane6 = new JScrollPane();
        tvUpdateRemak = new JTextArea();
        UpdateItemName = new JLabel();
        UpdateCategory = new JLabel();
        label5 = new JLabel();
        UpdateCurrentPrice = new JLabel();
        label7 = new JLabel();
        UpdateCurrentQty = new JLabel();
        UpdateQtyUnit = new JLabel();
        separator1 = new JSeparator();
        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();
        separator2 = new JSeparator();
        label10 = new JLabel();
        UpdateNewQty = new JLabel();
        UpdateQtyUnit2 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();

        //======== tabbedPane1 ========
        {

            //======== panel1 ========
            {

                // JFormDesigner evaluation mark
                panel1.setBorder(new javax.swing.border.CompoundBorder(
                    new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                        "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                        javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                        java.awt.Color.red), panel1.getBorder())); panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


                //---- DetailItemName ----
                DetailItemName.setText("....");
                DetailItemName.setFont(DetailItemName.getFont().deriveFont(DetailItemName.getFont().getStyle() | Font.BOLD));

                //======== scrollPane1 ========
                {
                    scrollPane1.setViewportView(table1);
                }

                //---- label2 ----
                label2.setText("Category:-");
                label2.setFont(label2.getFont().deriveFont(Font.ITALIC, label2.getFont().getSize() + 2f));

                //---- label3 ----
                label3.setText("Item Name:-");
                label3.setFont(label3.getFont().deriveFont(label3.getFont().getStyle() & ~Font.BOLD, label3.getFont().getSize() + 5f));

                //---- DetailCategory ----
                DetailCategory.setText("...");
                DetailCategory.setFont(DetailCategory.getFont().deriveFont(DetailCategory.getFont().getStyle() | Font.BOLD, DetailCategory.getFont().getSize() + 3f));

                //---- button1 ----
                button1.setText("CLOSE");
                button1.addActionListener(e -> bClose(e));

                //---- label1 ----
                label1.setText("Details");
                label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 10f));

                GroupLayout panel1Layout = new GroupLayout(panel1);
                panel1.setLayout(panel1Layout);
                panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addGroup(panel1Layout.createParallelGroup()
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(393, 393, 393)
                                    .addComponent(button1))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(381, 381, 381)
                                    .addComponent(label1))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addGroup(panel1Layout.createParallelGroup()
                                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 784, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(panel1Layout.createSequentialGroup()
                                            .addComponent(label3)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(DetailItemName, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
                                            .addGap(133, 133, 133)
                                            .addComponent(label2)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(DetailCategory, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)))))
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(label1)
                            .addGap(18, 18, 18)
                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label3)
                                .addComponent(DetailItemName)
                                .addComponent(label2)
                                .addComponent(DetailCategory))
                            .addGap(18, 18, 18)
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addComponent(button1)
                            .addContainerGap(74, Short.MAX_VALUE))
                );
            }
            tabbedPane1.addTab("Details", panel1);

            //======== panel2 ========
            {

                //---- label21 ----
                label21.setText("Update & Edit");
                label21.setFont(label21.getFont().deriveFont(label21.getFont().getStyle() | Font.BOLD, label21.getFont().getSize() + 3f));

                //---- label22 ----
                label22.setText("Item Name* :");

                //---- label23 ----
                label23.setText("Category Name*:");

                //---- button4 ----
                button4.setText("Save");
                button4.addActionListener(e -> bItemSave(e));

                //---- label24 ----
                label24.setText("Price :");

                //---- label26 ----
                label26.setText("Quantity :");

                //---- tvUpdateQty ----
                tvUpdateQty.addCaretListener(e -> tvUpdateQtyCaretUpdate(e));

                //---- label27 ----
                label27.setText("Remark:-");

                //======== scrollPane6 ========
                {
                    scrollPane6.setViewportView(tvUpdateRemak);
                }

                //---- UpdateItemName ----
                UpdateItemName.setText("Name");

                //---- UpdateCategory ----
                UpdateCategory.setText("Category");

                //---- label5 ----
                label5.setText("Current Price : ");
                label5.setFont(label5.getFont().deriveFont(label5.getFont().getStyle() | Font.BOLD));

                //---- UpdateCurrentPrice ----
                UpdateCurrentPrice.setText("XX");
                UpdateCurrentPrice.setFont(UpdateCurrentPrice.getFont().deriveFont(UpdateCurrentPrice.getFont().getStyle() | Font.BOLD, UpdateCurrentPrice.getFont().getSize() + 2f));

                //---- label7 ----
                label7.setText("Current Quantity : ");
                label7.setFont(label7.getFont().deriveFont(label7.getFont().getStyle() | Font.BOLD));

                //---- UpdateCurrentQty ----
                UpdateCurrentQty.setText("XX");
                UpdateCurrentQty.setFont(UpdateCurrentQty.getFont().deriveFont(UpdateCurrentQty.getFont().getStyle() | Font.BOLD, UpdateCurrentQty.getFont().getSize() + 2f));

                //---- UpdateQtyUnit ----
                UpdateQtyUnit.setText("XX");
                UpdateQtyUnit.setFont(UpdateQtyUnit.getFont().deriveFont(UpdateQtyUnit.getFont().getStyle() | Font.BOLD));

                //---- radioButton1 ----
                radioButton1.setText("Add");
                radioButton1.setSelected(true);
                radioButton1.addActionListener(e -> radioUpdateAdd(e));

                //---- radioButton2 ----
                radioButton2.setText("Subtract");
                radioButton2.addActionListener(e -> radioUpdateSubtract(e));

                //---- label10 ----
                label10.setText("New Quantity :");

                //---- UpdateNewQty ----
                UpdateNewQty.setText("XX");

                //---- UpdateQtyUnit2 ----
                UpdateQtyUnit2.setText("XX");

                GroupLayout panel2Layout = new GroupLayout(panel2);
                panel2.setLayout(panel2Layout);
                panel2Layout.setHorizontalGroup(
                    panel2Layout.createParallelGroup()
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addGap(66, 66, 66)
                            .addGroup(panel2Layout.createParallelGroup()
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addGap(148, 148, 148)
                                    .addComponent(label7)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(UpdateCurrentQty))
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addComponent(label26)
                                    .addGap(18, 18, 18)
                                    .addComponent(tvUpdateQty, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(UpdateQtyUnit)
                                    .addGap(18, 18, 18)
                                    .addComponent(radioButton1)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(radioButton2)
                                    .addGap(35, 35, 35)
                                    .addComponent(label10)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(UpdateNewQty)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(UpdateQtyUnit2)))
                            .addContainerGap(228, Short.MAX_VALUE))
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addGroup(panel2Layout.createParallelGroup()
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addGroup(panel2Layout.createParallelGroup()
                                        .addGroup(panel2Layout.createSequentialGroup()
                                            .addGap(372, 372, 372)
                                            .addComponent(label21))
                                        .addGroup(panel2Layout.createSequentialGroup()
                                            .addGap(51, 51, 51)
                                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addComponent(label23)
                                                .addComponent(label24)
                                                .addComponent(label22))
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(panel2Layout.createParallelGroup()
                                                .addComponent(UpdateItemName, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
                                                .addGroup(panel2Layout.createSequentialGroup()
                                                    .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(UpdateCategory, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                                        .addComponent(tvUpdatePrice, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                                                    .addGap(18, 18, 18)
                                                    .addComponent(label5)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(UpdateCurrentPrice))))
                                        .addGroup(panel2Layout.createSequentialGroup()
                                            .addGap(108, 108, 108)
                                            .addComponent(label27)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(scrollPane6, GroupLayout.PREFERRED_SIZE, 297, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panel2Layout.createSequentialGroup()
                                            .addGap(270, 270, 270)
                                            .addComponent(button4)))
                                    .addGap(0, 360, Short.MAX_VALUE))
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(panel2Layout.createParallelGroup()
                                        .addComponent(separator1, GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
                                        .addComponent(separator2, GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE))))
                            .addContainerGap())
                );
                panel2Layout.setVerticalGroup(
                    panel2Layout.createParallelGroup()
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(label21)
                            .addGap(47, 47, 47)
                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label22)
                                .addComponent(UpdateItemName))
                            .addGap(20, 20, 20)
                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label23)
                                .addComponent(UpdateCategory))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label24)
                                .addComponent(tvUpdatePrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label5)
                                .addComponent(UpdateCurrentPrice))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(separator1, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label7)
                                .addComponent(UpdateCurrentQty))
                            .addGap(21, 21, 21)
                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(UpdateQtyUnit)
                                .addComponent(radioButton1)
                                .addComponent(radioButton2)
                                .addComponent(label26)
                                .addComponent(tvUpdateQty, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label10)
                                .addComponent(UpdateNewQty)
                                .addComponent(UpdateQtyUnit2))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(separator2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(panel2Layout.createParallelGroup()
                                .addComponent(scrollPane6, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label27))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                            .addComponent(button4)
                            .addContainerGap())
                );
            }
            tabbedPane1.addTab("Update & Edit", panel2);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(tabbedPane1)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(tabbedPane1)
        );
        pack();
        setLocationRelativeTo(getOwner());

        //---- buttonGroup1 ----
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(radioButton1);
        buttonGroup1.add(radioButton2);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Hitesh Verma
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JLabel DetailItemName;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JLabel label2;
    private JLabel label3;
    private JLabel DetailCategory;
    private JButton button1;
    private JLabel label1;
    private JPanel panel2;
    private JLabel label21;
    private JLabel label22;
    private JLabel label23;
    private JButton button4;
    private JLabel label24;
    private JTextField tvUpdatePrice;
    private JLabel label26;
    private JTextField tvUpdateQty;
    private JLabel label27;
    private JScrollPane scrollPane6;
    private JTextArea tvUpdateRemak;
    private JLabel UpdateItemName;
    private JLabel UpdateCategory;
    private JLabel label5;
    private JLabel UpdateCurrentPrice;
    private JLabel label7;
    private JLabel UpdateCurrentQty;
    private JLabel UpdateQtyUnit;
    private JSeparator separator1;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JSeparator separator2;
    private JLabel label10;
    private JLabel UpdateNewQty;
    private JLabel UpdateQtyUnit2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
