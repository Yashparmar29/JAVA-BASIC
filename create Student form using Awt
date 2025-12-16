import java.awt.*;
import java.awt.event.*;

class method extends Frame implements ItemListener , ActionListener
{
    Label lblid,lblname,lbl_sub;
    TextField txtid,txtname;
    List sub_name;
    Button btn_add;
    method()
    {
        super("Student data");
        this.setLayout(new FlowLayout());
        this.setSize(400,400);
        
        lblid = new Label("Id :- ");
        add(lblid);
        txtid = new TextField();
        add(txtid);

        lblname = new Label("Name :- ");
        add(lblname);
        txtname = new TextField();
        add(txtname);
        
        lbl_sub = new Label("Subject");
        add(lbl_sub);
        sub_name = new List(4,false);
        sub_name.add("Java");
        sub_name.add("Python");
        sub_name.add("Research Method");
        sub_name.add("Dbms");
        sub_name.add("Dcn");
        add(sub_name);
        sub_name.addItemListener(this);

        btn_add = new Button("Show Data");
        add(btn_add);
        btn_add.addActionListener(this);


        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
        this.setVisible(true);
    }
    public void itemStateChanged(ItemEvent ie)
    {
        sub_name.getSelectedItem();
    }
    public void actionPerformed(ActionEvent ae)
    {
        String i = sub_name.getSelectedItem();
        System.out.println(i);
    }
}

public class awt_example 
{    
    public static void main(String[] args)
    {
        new method();
    }    
}
