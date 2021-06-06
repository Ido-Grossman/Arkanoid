package arkanoid.animation;

import biuoop.DrawSurface;
import biuoop.KeyboardSensor;

public class KeyPressStoppableAnimation implements Animation {

    private final KeyboardSensor keyboardSensor;

    private final String key;

    private final Animation animation;

    private boolean stop;

    private boolean isAlreadyPressed;


    public KeyPressStoppableAnimation(KeyboardSensor sensor, String key, Animation animation) {
        this.keyboardSensor = sensor;
        this.key = key;
        this.animation = animation;
        this.isAlreadyPressed = true;
        this.stop = true;
    }

    /**
     * does all the actions in a frame.
     *
     * @param d the drawsurface to draw the actions on.
     */
    @Override
    public void doOneFrame(DrawSurface d) {
        if (this.keyboardSensor.isPressed(this.key) && !this.isAlreadyPressed) {
            this.stop = false;
        }
        if (!this.keyboardSensor.isPressed(this.key)) {
            this.isAlreadyPressed = false;
        }
        this.animation.doOneFrame(d);
    }

    /**
     * @return true if the game should stop and false otherwise.
     */
    @Override
    public boolean shouldStop() {
        return !this.stop;
    }
}
