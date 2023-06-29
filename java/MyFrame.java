import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class MyFrame extends JFrame implements ActionListener{

    JButton button;
    MyFrame(){

        button = new JButton();
        button.setBounds(200,100,250,100);
        button.addActionListener(this);
        button.setText("CLICK HERE");
        button.setFocusable(false);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==button) {
        System.out.println("DO NOT DISTURB");

       }
    }
}