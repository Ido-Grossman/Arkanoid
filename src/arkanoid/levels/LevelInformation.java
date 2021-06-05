package arkanoid.levels;

import arkanoid.Velocity;
import arkanoid.sprites.Sprite;
import arkanoid.collidables.Block;

import java.util.List;

/**
 * @author ido grossman <idoddii@gmail.com>
 * @version 2.
 * @since 04-06-2021
 */
public interface LevelInformation {

    /**
     * @return the number of balls in the given level.
     */
    int numberOfBalls();

    /**
     * @return The initial velocity of each ball
     */
    // Note that initialBallVelocities().size() == numberOfBalls()
    List<Velocity> initialBallVelocities();

    /**
     * @return the speed of the paddle.
     */
    int paddleSpeed();

    /**
     * @return the width paddle.
     */
    int paddleWidth();

    /**
     * @return the name of the level.
     */
    // the level name will be displayed at the top of the screen.
    String levelName();

    /**
     * @return the background of the level.
     */
    // Returns a sprite with the background of the level
    Sprite getBackground();

    /**
     * The Blocks that make up this level, each block contains, its size, color and location.
     * @return the blocks of the level.
     */
    List<Block> blocks();

    /**
     *
     * @return Number of blocks that should be removed before the level is considered to be "cleared".
     */
    // This number should be <= blocks.size();
    int numberOfBlocksToRemove();
}
