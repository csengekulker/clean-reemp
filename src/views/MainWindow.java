package views;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MainWindow extends JFrame {
    public JPanel buttonPanel; //button panel    
    public JPanel tablePanel; //table panel    
    public JButton exitButton; //exit button
    public JButton loadButton; //load button

    public DefaultTableModel model = new DefaultTableModel();
    public JTable table = new JTable(model);
    JScrollPane spanel = new JScrollPane(table);

    public MainWindow() {
        this.buttonPanel = new JPanel(); //init buttonPanel
        this.tablePanel = new JPanel(); //init tablePanel
        this.exitButton = new JButton("Kilépés");
        this.loadButton = new JButton("Betölt");
        this.buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.LINE_AXIS));

        Object[] felirat = {"Id", "Név", "Település", "Fizetés"};
		model.setColumnIdentifiers(felirat);        

        this.buttonPanel.add(this.exitButton); //add exit button
        this.buttonPanel.add(this.loadButton); //add load button
        this.tablePanel.add(spanel);
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        this.add(buttonPanel);
        this.add(tablePanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
}
