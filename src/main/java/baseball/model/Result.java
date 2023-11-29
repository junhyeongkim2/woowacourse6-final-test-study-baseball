package baseball.model;

public class Result {

    private final int ballCount;
    private final int strikeCount;

    public Result(int ballCount, int strikeCount) {
        this.ballCount = ballCount;
        this.strikeCount = strikeCount;
    }

    public Boolean isThreeStrike() {
        if (strikeCount == 3 && ballCount == 0) {
            return true;
        }
        return false;
    }
}
