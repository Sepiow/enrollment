
import java.awt.*;
import java.applet.*;
import java.awt.List;
import java.awt.Choice;
import java.awt.event.*;

public class enroll extends Applet implements ActionListener {

    Label l1 = new Label("Student number:");
    TextField t1 = new TextField(10);
    Label l2 = new Label("Student Name:");
    TextField t2 = new TextField(10);
    Label l3 = new Label("Course");
    Label l4 = new Label("0");
    Choice c1 = new Choice();
    List ll1 = new List();
    List ll2 = new List();
    Button b1 = new Button(">>>");
    Button b2 = new Button("<<<");
    Button b3 = new Button("Total");
    CheckboxGroup cbg = new CheckboxGroup();
    Checkbox cb1 = new Checkbox("5%", cbg, true);
    Checkbox cb2 = new Checkbox("10%", cbg, true);
    Checkbox cb3 = new Checkbox("15%", cbg, true);

    public void init() {
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l4);
        add(l3);
        add(c1);
        add(ll1);
        add(b1);
        add(b2);
        add(b3);
        add(ll2);
        add(cb1);
        add(cb2);
        add(cb3);
        c1.addItem("BSCS");
        c1.addItem("BSIT");
        c1.addItem("BSCpe");

        ll1.add("CSCI01 LEC");
        ll1.add("CSCI01 LAB");
        ll1.add("ITNA01 LEC");
        ll1.add("ITNA01 LAB");
        ll1.add("PE");
        ll1.add("HUMA01");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        double amt = 0;
        if (e.getSource() == b1) {
            if (ll1.getSelectedItem().equals("CSCI01 LEC")) {
                ll2.add(ll1.getSelectedItem());
                ll1.remove(ll1.getSelectedIndex());
                double aa = Double.parseDouble(l4.getText());
                amt = aa + 1000;
                l4.setText("" + amt);

            }
            if (ll1.getSelectedItem().equals("CSCI01 LAB")) {
                ll2.add(ll1.getSelectedItem());
                ll1.remove(ll1.getSelectedIndex());
                double aa = Double.parseDouble(l4.getText());
                amt = aa + 500;
                l4.setText("" + amt);

            }
        }
        if (e.getSource() == b2) {
            if (ll2.getSelectedItem().equals("CSCI01 LEC")) {
                ll1.add(ll2.getSelectedItem());
                ll2.remove(ll2.getSelectedIndex());
                Double aa = Double.parseDouble(l4.getText());
                amt = aa - 1000;
                l4.setText("" + amt);

            }
            if (ll2.getSelectedItem().equals("CSCI01 LAB")) {
                ll1.add(ll2.getSelectedItem());
                ll2.remove(ll2.getSelectedIndex());
                Double aa = Double.parseDouble(l4.getText());
                amt = aa - 500;
                l4.setText("" + amt);

            }
        }
        if (e.getSource() == b3) {
            double aa = Double.parseDouble(l4.getText());
            amt = aa * 0.05;
            amt = aa - amt;
            l4.setText("" + amt);
        }

    }

}