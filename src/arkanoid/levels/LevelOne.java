package arkanoid.levels;

import arkanoid.Velocity;
import arkanoid.collidables.Block;
import arkanoid.geometry.Point;
import arkanoid.geometry.Rectangle;
import arkanoid.sprites.Sprite;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ido grossman <idoddii@gmail.com>
 * @version 1.
 * @since 05-06-2021
 */
public class LevelOne implements LevelInformation {
    /**
     * @return the number of balls in the given level.
     */
    @Override
    public int numberOfBalls() {
        return 2;
    }

    /**
     * @return The initial velocity of each ball
     */
    @Override
    public List<Velocity> initialBallVelocities() {
        List<Velocity> v = new ArrayList<>();
        v.add(Velocity.fromAngleAndSpeed(70, 5));
        v.add(Velocity.fromAngleAndSpeed(300, 5));
        return v;
    }

    /**
     * @return the speed of the paddle.
     */
    @Override
    public int paddleSpeed() {
        return 5;
    }

    /**
     * @return the width paddle.
     */
    @Override
    public int paddleWidth() {
        return 75;
    }

    /**
     * @return the name of the level.
     */
    @Override
    public String levelName() {
        return "WAAN";
    }

    /**
     * @return the background of the level.
     */
    @Override
    public Sprite getBackground() {
        return null;
    }

    /**
     * The Blocks that make up this level, each block contains, its size, color and location.
     *
     * @return the blocks of the level.
     */
    @Override
    public List<Block> blocks() {
        int rows = 6, columns = 12, width = 40, height = 20;
        Color[] colors = {Color.GRAY, Color.RED, Color.YELLOW, Color.BLUE, Color.PINK, Color.GREEN};
        List<Block> blocks = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            for (int j = i; j < columns; j++) {
                blocks.add(new Block(new Rectangle(new Point(300 + width * j, 100 + height * i),
                        width, height), colors[i]));
            }
        }
        return blocks;
    }

    /**
     * @return Number of blocks that should be removed before the level is considered to be "cleared".
     */
    @Override
    public int numberOfBlocksToRemove() {
        return 50;
    }
}
