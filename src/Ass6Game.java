//ID: 208985424
import arkanoid.animation.AnimationRunner;
import arkanoid.levels.GameFlow;
import arkanoid.listeners.Counter;
import arkanoid.levels.LevelInformation;
import arkanoid.levels.LevelOne;
import arkanoid.levels.levelTwo;
import arkanoid.sprites.LivesIndicator;
import biuoop.GUI;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

/**
 * @author ido grossman <idoddii @ gmail.com>
 * @version 1.
 * @since 18-04-2021
 */
public class Ass6Game {

    /**
     * creates a new game class, initializing and running it.
     * @param args the given arguments from the user.
     */
    public static void main(String[] args) {
        List<LevelInformation> l = new ArrayList<>();
        l.add(new LevelOne());
        l.add(new levelTwo());
        GUI gui = new GUI("arkanoid", 800, 600);
        AnimationRunner animation = new AnimationRunner(gui, 60);
        GameFlow flow = new GameFlow(animation, gui.getKeyboardSensor());
        flow.runLevels(l);
    }
}
