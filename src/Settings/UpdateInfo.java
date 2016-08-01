package Settings;

import java.awt.*;
import java.awt.event.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Mon Aug 01 15:44:38 IST 2016
 */



/**
 * @author Hitesh Verma
 */
public class UpdateInfo extends JFrame
{
    String downloadingLink;
    public UpdateInfo(float CURRENTVERSION, float latestVersion, String releasedDate, String description, String downloadingLink) {
        initComponents();
        UpdateCurrentVersion.setText(String.valueOf(CURRENTVERSION));
        UpdateLatestVersion.setText(String.valueOf(latestVersion));
        UpdateReleasedDate.setText(releasedDate);
        UpdateDescription.setText(description);
        this.downloadingLink = downloadingLink;

    }

    private void bUpdateDownload(ActionEvent e) {
        // TODO add your code here
        openWebpage(URI.create(downloadingLink));
    }

    public static void openWebpage(URI uri) {
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
            try {
                desktop.browse(uri);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public  void openWebpage(URL url) {
        try {
            openWebpage(url.toURI());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Hitesh Verma
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        separator1 = new JSeparator();
        label4 = new JLabel();
        UpdateLatestVersion = new JLabel();
        UpdateReleasedDate = new JLabel();
        label8 = new JLabel();
        UpdateDescription = new JLabel();
        button1 = new JButton();
        UpdateCurrentVersion = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("Update Info");
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getStyle() | Font.BOLD, label1.getFont().getSize() + 6f));

        //---- label2 ----
        label2.setText("Current Version : ");

        //---- label3 ----
        label3.setText("Latest Version : ");

        //---- label4 ----
        label4.setText("Released Date :  ");

        //---- UpdateLatestVersion ----
        UpdateLatestVersion.setText("xx.xx");

        //---- UpdateReleasedDate ----
        UpdateReleasedDate.setText("xx.xx");

        //---- label8 ----
        label8.setText("Description : ");

        //---- UpdateDescription ----
        UpdateDescription.setText("xx");

        //---- button1 ----
        button1.setText("Download New Version");
        button1.addActionListener(e -> bUpdateDownload(e));

        //---- UpdateCurrentVersion ----
        UpdateCurrentVersion.setText("xx.xx");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(129, 129, 129)
                                    .addComponent(label1))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                            .addComponent(label3)
                                            .addComponent(label2))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addGap(9, 9, 9)
                                            .addGroup(contentPaneLayout.createParallelGroup()
                                                .addComponent(label4)
                                                .addComponent(label8))))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(UpdateReleasedDate, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                        .addComponent(UpdateLatestVersion, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                        .addComponent(UpdateDescription, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                        .addComponent(UpdateCurrentVersion, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE))))
                            .addGap(0, 59, Short.MAX_VALUE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(separator1, GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)))
                    .addContainerGap())
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(112, 112, 112)
                    .addComponent(button1)
                    .addContainerGap(119, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label1)
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2)
                        .addComponent(UpdateCurrentVersion))
                    .addGap(5, 5, 5)
                    .addComponent(separator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label3)
                        .addComponent(UpdateLatestVersion))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label4)
                        .addComponent(UpdateReleasedDate))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label8)
                        .addComponent(UpdateDescription))
                    .addGap(41, 41, 41)
                    .addComponent(button1)
                    .addContainerGap(44, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Hitesh Verma
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JSeparator separator1;
    private JLabel label4;
    private JLabel UpdateLatestVersion;
    private JLabel UpdateReleasedDate;
    private JLabel label8;
    private JLabel UpdateDescription;
    private JButton button1;
    private JLabel UpdateCurrentVersion;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
