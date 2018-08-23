package display;

import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;

public abstract class Display {

    private final static Component CENTER = null;

    private static boolean created = false;

    private static JFrame window;

    private static Canvas content;

    public static void create(final int width, final int height, final String title) {

        if (created) {
            return;
        } else {
            // content settings
            content = new Canvas() {
                @Override
                public void paint(Graphics graphics) {
                    super.paint(graphics);
                    render(graphics);
                }
            };
            final Dimension size = new Dimension(width, height);
            content.setPreferredSize(size);
            content.setBackground(Color.BLACK);
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

    public static void render() {
        content.repaint();
    }

    private static void render(final Graphics graphics) {
        graphics.setColor(Color.WHITE);
        graphics.fillOval(400 - 50, 300 - 50, 100, 100);
    }
}
