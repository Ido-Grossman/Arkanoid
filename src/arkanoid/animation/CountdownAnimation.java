package arkanoid.animation;

import arkanoid.sprites.SpriteCollection;
import biuoop.DrawSurface;
import biuoop.Sleeper;

import java.awt.*;

// The CountdownAnimation will display the given gameScreen,
// for numOfSeconds seconds, and on top of them it will show
// a countdown from countFrom back to 1, where each number will
// appear on the screen for (numOfSeconds / countFrom) seconds, before
// it is replaced with the next one.
public class CountdownAnimation implements Animation {

    private double numOfSeconds;

    private int countFrom;

    private SpriteCollection gameScreen;

    private int currentSecond;

    public CountdownAnimation(double numOfSeconds, int countFrom, SpriteCollection gameScreen) {
        this.numOfSeconds = numOfSeconds;
        this.countFrom = countFrom;
        this.gameScreen = gameScreen;
        this.currentSecond = countFrom;
    }

    /**
     * does all the actions in a frame.
     *
     * @param d the drawsurface to draw the actions on.
     */
    @Override
    public void doOneFrame(DrawSurface d) {
        d.setColor(Color.WHITE);
        d.drawText(400, 300, String.valueOf(this.countFrom), 50);
        this.countFrom -= 1;
        d.setColor(Color.BLACK);
    }

    /**
     * @return true if the game should stop and false otherwise.
     */
    @Override
    public boolean shouldStop() {
//        if (this.currentSecond == (this.countFrom - this.numOfSeconds)) {
//            return true;
//        }
//        this.currentSecond -= 1;
        return this.countFrom == 0;
    }
}
