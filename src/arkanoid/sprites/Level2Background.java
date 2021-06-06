package arkanoid.sprites;

import biuoop.DrawSurface;

/**
 * @author ido grossman <idoddii@gmail.com>
 * @version 1.
 * @since 06-06-2021
 */
public class Level2Background implements Sprite {

    /**
     * draws the Arkanoid.Sprites.Sprite on the given surface.
     *
     * @param d the given surface.
     */
    @Override
    public void drawOn(DrawSurface d) {
        d.fillRectangle(0, 20, 800, 580);
    }

    /**
     * notifies the sprites that time has passed.
     */
    @Override
    public void timePassed() {

    }
}
