package arkanoid.levels;

import arkanoid.Velocity;
import arkanoid.collidables.Block;
import arkanoid.geometry.Point;
import arkanoid.sprites.Sprite;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class levelTwo implements LevelInformation {
    /**
     * @return the number of balls in the given level.
     */
    @Override
    public int numberOfBalls() {
        return 5;
    }

    /**
     * @return The initial velocity of each ball
     */
    @Override
    public List<Velocity> initialBallVelocities() {
        List<Velocity> v = new ArrayList<>();
        v.add(Velocity.fromAngleAndSpeed(300, 5));
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
        return 200;
    }

    /**
     * @return the name of the level.
     */
    @Override
    public String levelName() {
        return "dos";
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
        int columns = 12, width = 40, height = 20;
        Color[] colors = {Color.GRAY, Color.RED, Color.YELLOW, Color.BLUE, Color.PINK, Color.GREEN};
        List<Block> blocks = new ArrayList<>();
        for (int i = 0; i < columns; i++) {
                blocks.add(new Block(new arkanoid.geometry.Rectangle(new Point(300 + width * i, 100),
                        width, height), colors[0]));
        }
        return blocks;
    }

    /**
     * @return Number of blocks that should be removed before the level is considered to be "cleared".
     */
    @Override
    public int numberOfBlocksToRemove() {
        return 12;
    }
}
