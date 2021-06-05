package arkanoid.animation;

import biuoop.KeyboardSensor;
import biuoop.DrawSurface;

/**
 * @author ido grossman <idoddii@gmail.com>
 * @version 1.
 * @since 04-06-2021
 */
public class PauseScreen implements Animation {

    private final KeyboardSensor keyboard;

    private boolean stop;

    /**
     * the constructor of the class.
     * @param k the keyboard sensor.
     */
    public PauseScreen(KeyboardSensor k) {
        this.keyboard = k;
        this.stop = false;
    }

    /**
     * does all the actions in a frame.
     *
     * @param d the drawsurface to draw the actions on.
     */
    @Override
    public void doOneFrame(DrawSurface d) {
        d.drawText(10, d.getHeight() / 2, "paused -- press space to continue", 32);
        if (this.keyboard.isPressed(KeyboardSensor.SPACE_KEY)) {
            this.stop = true;
        }
    }

    /**
     * @return true if the game should stop and false otherwise.
     */
    @Override
    public boolean shouldStop() {
        return this.stop;
    }
}
