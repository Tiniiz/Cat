import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImagePanel extends JPanel {

    public static void main(String[] args) {
        BufferedImage myPicture = null;
        try {
            myPicture = ImageIO.read(new File("C:/Users/ivalu/IdeaProjects/Cat/cat.jpg"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        JLabel picLabel = new JLabel(new ImageIcon(myPicture));
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.add(picLabel);
        f.setSize(2000, 2000);
        f.show();

    }

}