package views;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MainWindow extends JFrame {
    public JPanel panel1; //button panel    
    public JPanel panel2; //table panel    
    public JButton a; //exit button
    public JButton button2; //load button

    public DefaultTableModel model = new DefaultTableModel();
    public JTable table = new JTable(model);
    JScrollPane spanel = new JScrollPane(table);

    public MainWindow() {
        this.panel1 = new JPanel(); //init panel1
        this.panel2 = new JPanel(); //init panel2
        this.a = new JButton("Kilépés");
        this.button2 = new JButton("Betölt");
        this.panel1.setLayout(new BoxLayout(panel1, BoxLayout.LINE_AXIS));

        Object[] felirat = {"Id", "Név", "Település", "Fizetés"};
		model.setColumnIdentifiers(felirat);        

        this.panel1.add(this.a); //add exit button
        this.panel1.add(this.button2); //add load button
        this.panel2.add(spanel);
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        this.add(panel1);
        this.add(panel2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
}
