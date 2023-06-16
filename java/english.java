import javax.swing.JOptionPane;
public class english{
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("HELLO WHAT IS YOUR NAME?");
        JOptionPane.showMessageDialog(null,"HELLO "+name+", NICE TO MEET YOU");
        int age=Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null,"YOU ARE NOT TOO OLD YET. "+ age +" IS JUST A NUMBER");
    }

}