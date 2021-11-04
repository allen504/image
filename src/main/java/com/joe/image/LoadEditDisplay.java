package com.joe.image;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class LoadEditDisplay {
    String imagePath;
    BufferedImage bufferedImage;
    public LoadEditDisplay(String imagePath) throws IOException {
        //load
        this.imagePath = imagePath;
        bufferedImage = ImageIO.read(new File(imagePath));

        //edit
        Graphics2D g = (Graphics2D) bufferedImage.getGraphics();
        g.setStroke(new BasicStroke(3));
        g.setColor(Color.BLUE);
        g.drawRect(10, 10, bufferedImage.getWidth() - 20, bufferedImage.getHeight() - 20);

        //display
        JLabel picLabel = new JLabel(new ImageIcon(bufferedImage));
        JPanel jPanel = new JPanel();
        jPanel.add(picLabel);
        JFrame f = new JFrame();
        f.setSize(new Dimension(bufferedImage.getWidth(), bufferedImage.getHeight()));
        f.add(jPanel);
        f.setVisible(true);
    }


}
