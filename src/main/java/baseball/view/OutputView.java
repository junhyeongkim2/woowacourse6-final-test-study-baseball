package baseball.view;

import baseball.model.Result;

public class OutputView {

    private static final String START_MESSAGE = "숫자 야구 게임을 시작합니다.";
    private static final String BALL = "볼";
    private static final String STRIKE = "스트라이크";
    private static final String NOTHING = "낫싱";
    private static final String SPACE = " ";
    private static final int ZERO = 0;

    public static void printStartMessage() {
        System.out.println(START_MESSAGE);
    }

    public static void printResultMessage(Result result) {
        printOnlyBall(result.getBallCount(), result.getStrikeCount());
        printOnlyStrike(result.getBallCount(), result.getStrikeCount());
        printBallAndStrike(result.getBallCount(), result.getStrikeCount());
        printNothing(result.getBallCount(), result.getStrikeCount());
    }

    private static void printOnlyBall(int ballCount, int strikeCount) {
        if (ballCount != ZERO && strikeCount == ZERO) {
            System.out.println(ballCount + BALL);
        }
    }

    private static void printOnlyStrike(int ballCount, int strikeCount) {
        if (ballCount == ZERO && strikeCount != ZERO) {
            System.out.println(strikeCount + STRIKE);
        }
    }

    private static void printBallAndStrike(int ballCount, int strikeCount) {
        if (ballCount != ZERO && strikeCount != ZERO) {
            System.out.println(ballCount + BALL + SPACE + strikeCount + STRIKE);
        }
    }

    private static void printNothing(int ballCount, int strikeCount) {
        if (ballCount == ZERO && strikeCount == ZERO) {
            System.out.println(NOTHING);
        }
    }


}
