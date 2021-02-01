import javax.swing.JFrame;

public class MainGUI {

    public MainGUI(){
        JFrame window = new JFrame();

        window.setVisible(true);
        window.setSize(400, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main (String[] args){
        new MainGUI();
    }
    
}
