import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainGUI {

    public MainGUI(){
        JFrame window = new JFrame();
        ImageIcon img = new ImageIcon("/home/zark0/Imágenes/1.png");
        JMenuBar menuBar = new JMenuBar();
        JMenu appearance = new JMenu("appearance");
        JMenuItem darkMode = new JMenuItem("dark Mode");
        JMenuItem dumbMode = new JMenuItem("Bright Mode");
        
        window.setVisible(true);
        window.setSize(400, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("UwU");
        window.setIconImage(img.getImage());
        window.getContentPane().setBackground(Color.DARK_GRAY);
        window.setJMenuBar(menuBar);
        appearance.add(darkMode);
        appearance.add(dumbMode);
        menuBar.add(appearance);
        menuBar.setBackground(Color.DARK_GRAY);

    }
    public static void main (String[] args){
        new MainGUI();
    }
    
}
