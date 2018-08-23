package display;

import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Dimension;

public abstract class Display {

    private final static Component CENTER = null;

    private static boolean created = false;

    private static JFrame window;

    private static Canvas content;

    public static void create(final int width, final int height, final String title) {

        if (created) {
            return;
        } else {
            // create content
            content = new Canvas();
            final Dimension size = new Dimension(width, height);
            content.setPreferredSize(size);
            // window settings
            window = new JFrame(title);
            window.setResizable(false);
            window.getContentPane().add(content);
            window.pack();
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setLocationRelativeTo(CENTER);
            window.setVisible(true);
        }

    }

}
