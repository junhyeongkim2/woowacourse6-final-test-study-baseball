package baseball.view;

public class OutputView {

    public static void printStartMessage() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public static void printResultMessage(int ballCount, int strikeCount) {
        printOnlyBall(ballCount,strikeCount);
        printOnlyStrike(ballCount,strikeCount);
        printBallAndStrike(ballCount,strikeCount);
        printNothing(ballCount,strikeCount);
    }

    public static void printOnlyBall(int ballCount, int strikeCount) {
        if (ballCount != 0 && strikeCount == 0) {
            System.out.println(ballCount + "볼");
        }
    }

    public static void printOnlyStrike(int ballCount, int strikeCount) {
        if (ballCount == 0 && strikeCount != 0) {
            System.out.println(strikeCount + "스트라이크");
        }
    }

    public static void printBallAndStrike(int ballCount, int strikeCount) {
        if (ballCount != 0 && strikeCount != 0) {
            System.out.println(ballCount + "볼 " + strikeCount + "스트라이크");
        }
    }

    public static void printNothing(int ballCount, int strikeCount){
        if(ballCount==0 && strikeCount==0){
            System.out.println("낫싱");
        }
    }




}
