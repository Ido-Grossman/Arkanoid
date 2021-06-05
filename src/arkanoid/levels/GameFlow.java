package arkanoid.levels;

import arkanoid.animation.AnimationRunner;

import biuoop.KeyboardSensor;

import java.util.List;

public class GameFlow {

    private final KeyboardSensor keyboardSensor;

    private final AnimationRunner animationRunner;

    public GameFlow(AnimationRunner ar, KeyboardSensor ks) {
        this.animationRunner = ar;
        this.keyboardSensor = ks;
    }

    public void runLevels(List<LevelInformation> levels) {
        for (LevelInformation levelInfo : levels) {
            GameLevel level = new GameLevel(levelInfo, this.keyboardSensor, this.animationRunner);
            level.initialize();
            level.run();
            if (level.getRemainingBalls().getValue() == 0) {
                break;
            }
        }
        this.animationRunner.getGui().close();
    }
}
