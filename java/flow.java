import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
public class flow{
    public static void main(String[] args){

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        frame.setFocusable(false);
        frame.setResizable(false);
        frame.setBounds(200,200,200,250);

        frame.add(new JButton("1"));
         frame.add(new JButton("2"));
          frame.add(new JButton("3"));
           frame.add(new JButton("4"));
            frame.add(new JButton("5"));
             frame.add(new JButton("6"));
              frame.add(new JButton("7"));
               frame.add(new JButton("8"));
                frame.add(new JButton("9"));
                 frame.add(new JButton("10"));

                 frame.setVisible(true);
    }
}