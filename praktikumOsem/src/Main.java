import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        Platno.dajPlatno().addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                if (key == KeyEvent.VK_LEFT) {
                    robot.posun(Smer.VLAVO, 5);
                } else if (key == KeyEvent.VK_UP) {
                    robot.posun(Smer.HORE, 5);
                }  else if (key == KeyEvent.VK_DOWN) {
                    robot.posun(Smer.DOLE, 5);
                }  else if (key == KeyEvent.VK_RIGHT) {
                    robot.posun(Smer.VPRAVO, 5);
                }   else if (key == KeyEvent.VK_S) {
                    robot.ulozKrokyDoSuboru();
                }   else if (key == KeyEvent.VK_L) {
                    robot.nacitajUlozeneKroky();
                }   else if (key == KeyEvent.VK_R) {
                    robot.dajNapovodnu();
                } else if (key == KeyEvent.VK_ESCAPE) {
                    robot.vymazSubor();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }

        });
    }
}