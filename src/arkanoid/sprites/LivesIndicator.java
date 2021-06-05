package arkanoid.sprites;

import arkanoid.listeners.Counter;
import biuoop.DrawSurface;

import java.awt.*;

public class LivesIndicator implements Sprite {

    private Counter lives;

    public LivesIndicator(Counter initialLives) {
        this.lives = initialLives;
    }

    /**
     * draws the Arkanoid.Sprites.Sprite on the given surface.
     *
     * @param d the given surface.
     */
    @Override
    public void drawOn(DrawSurface d) {
        d.setColor(Color.BLACK);
        d.drawText(100, 20, "Lives:" + this.lives.toString(), 20);
    }

    /**
     * notifies the sprites that time has passed.
     */
    @Override
    public void timePassed() {

    }
}
