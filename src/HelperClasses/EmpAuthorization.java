package HelperClasses;

import HelpingLitrals.hl_MAIN_CLASS;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Nilesh Verma on 01-Nov-16.
 */
public class EmpAuthorization {
    JTabbedPane ParentTab;
    JPanel AddingStuff, Analysis;
    JScrollPane Refund, Settings;

    public EmpAuthorization
            (JTabbedPane parentTabPane, JPanel panelAddingStuff, JScrollPane Refund, JPanel analysis, JScrollPane settingsMain) {
        this.ParentTab = parentTabPane;
        this.AddingStuff = panelAddingStuff;
        this.Analysis = analysis;
        this.Refund = Refund;
        this.Settings = settingsMain;

    }


    public void setJPanel_AccTo_Authorization(int JPanel_AccTo_Authorization) {
        try {
            PreparedStatement ps = hl_MAIN_CLASS.getMyConn().prepareStatement
                    ("select canAddNewItem,canRefund,canAnalyse,canAdmin from hit.emp_authorization where authorization_id=?");
            ps.setInt(1,JPanel_AccTo_Authorization);

            ResultSet myRs = ps.executeQuery();
            if (myRs.next()) {

                if(! myRs.getBoolean("canAddNewItem")){ParentTab.remove(AddingStuff);}
                if(! myRs.getBoolean("canRefund")){ParentTab.remove(Refund);}
                if(! myRs.getBoolean("canAnalyse")){ParentTab.remove(Analysis);}
                if(! myRs.getBoolean("canAdmin")){ParentTab.remove(Settings);}

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
