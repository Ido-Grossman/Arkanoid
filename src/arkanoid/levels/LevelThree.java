package arkanoid.levels;

import arkanoid.Velocity;
import arkanoid.collidables.Block;
import arkanoid.geometry.Point;
import arkanoid.geometry.Rectangle;
import arkanoid.sprites.Level3Background;
import arkanoid.sprites.Sprite;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class LevelThree implements LevelInformation {

    private int blockNum;

    /**
     * @return the number of balls in the given level.
     */
    @Override
    public int numberOfBalls() {
        return 4;
    }

    /**
     * @return The initial velocity of each ball.
     */
    @Override
    public List<Velocity> initialBallVelocities() {
        List<Velocity> v = new ArrayList<>();
        v.add(Velocity.fromAngleAndSpeed(290, 5));
        v.add(Velocity.fromAngleAndSpeed(310, 5));
        v.add(Velocity.fromAngleAndSpeed(330, 5));
        v.add(Velocity.fromAngleAndSpeed(350, 5));
        return v;
    }

    /**
     * @return the speed of the paddle.
     */
    @Override
    public int paddleSpeed() {
        return 10;
    }

    /**
     * @return the width paddle.
     */
    @Override
    public int paddleWidth() {
        return 100;
    }

    /**
     * @return the level name will be displayed at the top of the screen.
     */
    @Override
    public String levelName() {
        return "The great pyramid of Giza";
    }

    /**
     * @return a sprite with the background of the level
     */
    @Override
    public Sprite getBackground() {
        return new Level3Background();
    }

    /**
     * The Blocks that make up this level, each block contains, its size, color and location.
     *
     * @return the blocks of the level.
     */
    @Override
    public List<Block> blocks() {
        List<Block> blocks = new ArrayList<>();
        for (int i = 1; i < 19; i++) {
            for (int j = 0; j < i; j++) {
                blocks.add(new Block(new Rectangle(new Point(400 - 20 * i + 40 *j, 50 + 20 * i), 40, 20),
                        Color.ORANGE));
            }
        }
        return blocks;
    }

    /**
     * @return Number of blocks that should be removed before the level is considered to be "cleared".
     */
    @Override
    public int numberOfBlocksToRemove() {
        return 190;
    }
}
