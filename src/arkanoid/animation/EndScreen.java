package arkanoid.animation;

import arkanoid.listeners.Counter;
import biuoop.DrawSurface;
import biuoop.KeyboardSensor;

public class EndScreen implements Animation {

    private final boolean win;

    private final Counter score;

    /**
     * the constructor of the class.
     */
    public EndScreen(boolean win, Counter score) {
        this.win = win;
        this.score = score;
    }

    /**
     * does all the actions in a frame.
     *
     * @param d the drawsurface to draw the actions on.
     */
    @Override
    public void doOneFrame(DrawSurface d) {
        if (this.win) {
            d.drawText(10, d.getHeight() / 2, "You Win! Your score is " + score.getValue(), 32);
        }
        else {
            d.drawText(10, d.getHeight() / 2, "Game Over. Your score is " + score.getValue(), 32);
        }
    }

    /**
     * @return true if the game should stop and false otherwise.
     */
    @Override
    public boolean shouldStop() {
        return false;
    }
}
