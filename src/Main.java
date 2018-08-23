import display.Display;

import javax.swing.AbstractAction;
import javax.swing.Timer;
import java.awt.event.ActionEvent;

public class Main {

    public static void main(String[] args) {

        Display.create(800, 600, "Tanks");
        final Timer t = new Timer(1000 / 60, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.render();
            }
        });
        t.setRepeats(true);
        t.start();

    }

}
