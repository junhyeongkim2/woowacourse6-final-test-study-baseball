package baseball.model;

public class Result {

    private static final int THREE_STRIKE = 3;
    private static final int ZERO_BALL = 0;
    private final int ballCount;
    private final int strikeCount;

    public Result(int ballCount, int strikeCount) {
        this.ballCount = ballCount;
        this.strikeCount = strikeCount;
    }

    public Boolean isThreeStrike() {
        if (strikeCount == THREE_STRIKE && ballCount == ZERO_BALL) {
            return true;
        }
        return false;
    }

    public int getBallCount() {
        return this.ballCount;
    }

    public int getStrikeCount() {
        return this.strikeCount;
    }


}
