//package arkanoid.sprites;
//
//import arkanoid.listeners.Counter;
//import biuoop.DrawSurface;
//
//import java.awt.Color;
//
///**
// * @author ido grossman <idoddii@gmail.com>
// * @version 1.
// * @since 04-06-2021
// */
//public class LivesIndicator implements Sprite {
//
//    private Counter lives;
//
//    public LivesIndicator(Counter initialLives) {
//        this.lives = initialLives;
//    }
//
//    /**
//     * draws the Arkanoid.Sprites.Sprite on the given surface.
//     *
//     * @param d the given surface.
//     */
//    @Override
//    public void drawOn(DrawSurface d) {
//        d.setColor(Color.BLACK);
//        d.drawText(100, 20, "Lives:" + this.lives.toString(), 20);
//    }
//
//    /**
//     * notifies the sprites that time has passed.
//     */
//    @Override
//    public void timePassed() {
//
//    }
//}
