
package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author RONALDO TSETSEWA
 */
public class GymMembershipFrame extends JFrame{
    
    //panels
    private JPanel headingPn1;
    private JPanel clientPnl;
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel idNoPnl;
    private JPanel genderPn1;
    private JPanel contractsPnl;
    private JPanel personalTrainerOptionPnl;
    private JPanel membershipPnl;
    private JPanel commentsPnl;
    private JPanel btnsPn1;
    private JPanel headingClientCombinePnl;
    private JPanel membershipCommentsCombinedPnl;
    private JPanel mainPnl;
    
    //Labels
    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    private JLabel idNoLbl;
    private JLabel genderLbl;
    private JLabel personalTrainerLbl;
    private JLabel contractTypeLbl;
    
    //TextFiels
    private JTextField nameTxtField;
    private JTextField surnameTxtField;
    private JTextField idNoTxtFld;
    
    //ComboBox
    private JComboBox genderComboBox;
    
    //radio buttons
    private JRadioButton monthToMonthRadBtn;
    private JRadioButton sixMonthsRadBtn;
    private JRadioButton annualRadBtn;
    
    //ChechBox
    private JCheckBox personalTrainerChBx;
    
    //ButtonGroup
    private ButtonGroup btnGroup;
    
    //TextArea
    private JTextArea commentsArea;
    
    //ScrollPane
    private JScrollPane schrollableTxtArea;
    
    //private button
    private JButton applyBtn;

    public GymMembershipFrame() {
        
        String message = "Gym membership";
        setTitle(message);
        setSize(500, 500);
        
        //create panels
        headingPn1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        clientPnl = new JPanel(new GridLayout(4,1,1,1));
        clientPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1), "Client details"));
        
        namePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        surnamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        idNoPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPn1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        contractsPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        personalTrainerOptionPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        membershipPnl = new JPanel(new GridLayout(2,1,1,1));
        membershipPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1), "Contract options"));
        
        commentsPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        btnsPn1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        headingClientCombinePnl = new JPanel(new BorderLayout());
        membershipCommentsCombinedPnl = new JPanel(new BorderLayout());
        mainPnl = new JPanel(new BorderLayout());
        
        //create labels
        headingLbl = new JLabel("Membership Form");
        headingLbl.setFont(new Font(Font.SANS_SERIF, Font.ITALIC + Font.BOLD, 20));
        headingLbl.setForeground(Color.BLUE);
        headingLbl.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        
        
        nameLbl = new JLabel("Name:            ");
        surnameLbl = new JLabel("Surname:      ");
        idNoLbl = new JLabel("ID no:           ");
        genderLbl = new JLabel("Gender:         ");
        contractTypeLbl = new JLabel("Type of contract: ");
        personalTrainerLbl = new JLabel("Select the checkbox if you need a personal trainer");
        
        //create textFields
        nameTxtField = new JTextField(10);
        surnameTxtField = new JTextField(10);
        idNoTxtFld = new JTextField(10);
        
        //create a combobox
        genderComboBox = new JComboBox();
        genderComboBox.addItem("Male");
        genderComboBox.addItem("Female");
        
        //create radio buttons
        monthToMonthRadBtn = new JRadioButton("Month-to-Month");
        sixMonthsRadBtn = new JRadioButton("six-Months");
        annualRadBtn = new JRadioButton("Annual");
        
        //create a checkbox
        personalTrainerChBx = new JCheckBox();
        
        //create button group
        btnGroup = new ButtonGroup();
        btnGroup.add(monthToMonthRadBtn);
        btnGroup.add(sixMonthsRadBtn);
        btnGroup.add(annualRadBtn);
        
        //create textArea
        commentsArea = new JTextArea(20,40);
        commentsArea.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1), "Comments"));
        
        schrollableTxtArea = new JScrollPane(commentsArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        //create a button
        applyBtn = new JButton("APPLY");
        
        //add components to panels
        headingPn1.add(headingLbl);
        
        namePnl.add(nameLbl);
        namePnl.add(nameTxtField);
        
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnameTxtField);
        
        idNoPnl.add(idNoLbl);
        idNoPnl.add(idNoTxtFld);
        
        genderPn1.add(genderLbl);
        genderPn1.add(genderComboBox);
        
        clientPnl.add(namePnl);
        clientPnl.add(surnamePnl);
        clientPnl.add(idNoPnl);
        clientPnl.add(genderPn1);
        
        headingClientCombinePnl.add(headingPn1, BorderLayout.NORTH);
        headingClientCombinePnl.add(clientPnl, BorderLayout.CENTER);
        
        contractsPnl.add(contractTypeLbl);
        contractsPnl.add(monthToMonthRadBtn);
        contractsPnl.add(sixMonthsRadBtn);
        contractsPnl.add(annualRadBtn);
        
        personalTrainerOptionPnl.add(personalTrainerLbl);
        personalTrainerOptionPnl.add(personalTrainerChBx);
        
        membershipPnl.add(contractsPnl);
        membershipPnl.add(personalTrainerOptionPnl);
        
        commentsPnl.add(schrollableTxtArea);
        
        membershipCommentsCombinedPnl.add(membershipPnl, BorderLayout.NORTH);
        membershipCommentsCombinedPnl.add(commentsPnl, BorderLayout.CENTER);
        
        btnsPn1.add(applyBtn);
        
        mainPnl.add(headingClientCombinePnl, BorderLayout.NORTH);
        mainPnl.add(membershipCommentsCombinedPnl, BorderLayout.CENTER);
        mainPnl.add(btnsPn1, BorderLayout.SOUTH);
        
        add(mainPnl);
        
        pack();
        //getContentPane().setBackground(Color.BLUE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        
    }
    
    
}
