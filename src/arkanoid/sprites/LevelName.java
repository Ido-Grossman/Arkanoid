package arkanoid.sprites;

import biuoop.DrawSurface;

import java.awt.*;

public class LevelName implements Sprite {

    private final String name;

    public LevelName(String name) {
        this.name = name;
    }

    /**
     * draws the Arkanoid.Sprites.Sprite on the given surface.
     *
     * @param d the given surface.
     */
    @Override
    public void drawOn(DrawSurface d) {
        d.setColor(Color.BLACK);
        d.drawText(550, 20, "Level Name:" + name, 20);
    }

    /**
     * notifies the sprites that time has passed.
     */
    @Override
    public void timePassed() {

    }
}
