import java.awt.*;
import javax.swing.*;

public class MyPanel extends JPanel{

    MyPanel(){

        this.setPreferredSize( new Dimension(500,500));
    }
     public void paint(Graphics g){
        
        Graphics2D g2D = (Graphics2D) g;

        g2D.drawString("NIRNOY",100,100);

        g2D.setPaint(Color.BLUE);
        //g2D.drawOval(50,50,200,200);
        g2D.fillOval(50,50,200,200);

    }
}