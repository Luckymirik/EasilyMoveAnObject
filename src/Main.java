import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Main extends JFrame {
    static  JFrame frame = new JFrame();
    static JLayeredPane pane = new JLayeredPane();
    static JLabel label = new JLabel("Текст");
    static Point point;
    static boolean move = false;
    static public void go(MouseEvent e)  {
        if (e.getButton() == 3){
            point = e.getPoint();
            move=true;
        }
    }
    public static void stop(MouseEvent e){
        move=false;
    }
    public static void move(MouseEvent e){
        if (move){
            Point point1 = SwingUtilities.convertPoint(label,e.getPoint(),pane)
        }
    }
    public static void main(String[] args) throws IOException {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Простое удаление");
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int width = 800, height = 800;
        frame.setBounds(dimension.width/2-width/2,dimension.height/2-height/2,width,height);



        pane.setFocusable(true);
        frame.add(pane);
        pane.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    add(e);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        frame.setVisible(true);

    }
}