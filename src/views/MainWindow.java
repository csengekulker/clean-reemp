package views;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MainWindow extends JFrame {
    public JPanel buttonPanel;
    public JPanel tablePanel;
    public JButton exitButton;
    public JButton loadButton; 

    public DefaultTableModel tableModel = new DefaultTableModel();
    public JTable table = new JTable(tableModel);
    JScrollPane spanel = new JScrollPane(table);

    public MainWindow() {
        this.buttonPanel = new JPanel(); 
        this.tablePanel = new JPanel();

        this.exitButton = new JButton("Kilépés");
        this.loadButton = new JButton("Betölt");

        this.buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.LINE_AXIS));

        Object[] felirat = {"Id", "Név", "Település", "Fizetés"};
		tableModel.setColumnIdentifiers(felirat);        

        this.buttonPanel.add(this.exitButton); 
        this.buttonPanel.add(this.loadButton);
        this.tablePanel.add(spanel);

        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        this.add(buttonPanel);
        this.add(tablePanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
}
