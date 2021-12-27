import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class first extends Applet implements ActionListener {
    Button bttn1 = new Button("Enlarge");
    Button bttn2 = new Button("Small");
    int choice = 0;
    int ch = 0;

    public void init() {
        this.setSize(1000, 1000);
        setBackground(Color.lightGray);
        bttn1.addActionListener(this);
        bttn2.addActionListener(this);
        add(bttn1);
        add(bttn2);
    }

    public void paint(Graphics g) {
        if (choice >= 0 || ch >= 0) {
            g.setColor(Color.YELLOW);
            g.fillOval(500, 300, 100 + choice - ch, 100 + choice - ch);
            g.fillOval(500, 200, 100 + choice - ch, 100 + choice - ch);
            g.fillOval(600, 200, 100 + choice - ch, 100 + choice - ch);
            g.fillOval(600, 300, 100 + choice - ch, 100 + choice - ch);
            g.setColor(Color.PINK);
            g.fillOval(540, 240, 50 + choice - ch, 50 + choice - ch);
            g.fillOval(540, 315, 50 + choice - ch, 50 + choice - ch);
            g.fillOval(610, 315, 50 + choice - ch, 50 + choice - ch);
            g.fillOval(610, 240, 50 + choice - ch, 50 + choice - ch);
            g.setColor(Color.red);
            g.fillOval(560, 265, 80 + choice - ch, 80 + choice - ch);
            g.setColor(Color.red);
            int c[] = { 595 + choice - ch, 597 + choice - ch, 599 + choice - ch, 601 + choice - ch };
            int d[] = { 450, 300, 300, 450 };
            g.fillPolygon(c, d, 4);
        }
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == bttn1)
            choice = choice + 1;
        else if (ae.getSource() == bttn2)
            ch = ch + 1;
        repaint();
    }
}

/*
  <html>
  <applet code ="first.class" width=800 height=800>
  </applet>
  </html>
 */
