package arkanoid.levels;

import arkanoid.animation.AnimationRunner;

import arkanoid.animation.EndScreen;
import arkanoid.animation.KeyPressStoppableAnimation;
import arkanoid.listeners.Counter;
import arkanoid.animation.Animation;
import biuoop.KeyboardSensor;

import java.util.List;

public class GameFlow {

    private final KeyboardSensor keyboardSensor;

    private final AnimationRunner animationRunner;

    private boolean win;

    private final Counter score;

    public GameFlow(AnimationRunner ar, KeyboardSensor ks) {
        this.animationRunner = ar;
        this.keyboardSensor = ks;
        this.score = new Counter(0);
        this.win = true;
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
                this.win = false;
                break;
            }
        }
        Animation end = new EndScreen(this.win, this.score);
        Animation endk = new KeyPressStoppableAnimation(this.keyboardSensor, KeyboardSensor.SPACE_KEY, end);
        this.animationRunner.run(endk);
        this.animationRunner.getGui().close();
    }
}
