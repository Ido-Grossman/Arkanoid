package arkanoid.levels;

import arkanoid.animation.AnimationRunner;

import arkanoid.listeners.Counter;
import arkanoid.sprites.LivesIndicator;
import arkanoid.sprites.ScoreIndicator;
import biuoop.KeyboardSensor;

import java.util.List;

public class GameFlow {

    private final KeyboardSensor keyboardSensor;

    private final AnimationRunner animationRunner;


    private final Counter score;

    public GameFlow(AnimationRunner ar, KeyboardSensor ks) {
        this.animationRunner = ar;
        this.keyboardSensor = ks;
        this.score = new Counter(0);
    }

    public void runLevels(List<LevelInformation> levels) {
        for (LevelInformation levelInfo : levels) {
            GameLevel level = new GameLevel(levelInfo, this.keyboardSensor, this.animationRunner, this.score);
            level.initialize();
            level.run();
            if (level.nextLevel()) {
                continue;
            }
            if (level.shouldStop()) {
                break;
            }
        }
        this.animationRunner.getGui().close();
    }
}
