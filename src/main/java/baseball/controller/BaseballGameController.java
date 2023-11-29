package baseball.controller;

import baseball.model.Computer;
import baseball.model.Generator;
import baseball.model.Result;
import baseball.model.UserNumbers;
import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseballGameController {

    private static final int THREE_STRIKE = 3;
    private static final String RESTART_NUMBER = "1";
    private static final String END_NUMBER = "2";
    private Computer computer;
    private boolean restartFlag;

    public BaseballGameController() {
        computer = Computer.of(Generator.generateComputerNumbers());
        restartFlag = true;
    }

    public void start() {
        OutputView.printStartMessage();
        do {
            UserNumbers userNumbers = new UserNumbers(InputView.readNumbers());
            createResult(userNumbers);
        } while (restartFlag);

    }

    private void createResult(UserNumbers userNumbers) {
        Result result = new Result(computer.calculateBall(userNumbers), computer.calculateStrike(userNumbers));
        OutputView.printResultMessage(result);
        if (result.isThreeStrike()) {
            restartOrEnd(InputView.readRestartNumber());
        }
    }

    private void restartOrEnd(String restartNumber) {
        restart(restartNumber);
        end(restartNumber);
    }

    private void restart(String restartNumber) {
        if (restartNumber.equals(RESTART_NUMBER)) {
            computer = Computer.of(Generator.generateComputerNumbers());
            restartFlag = true;
        }
    }

    private void end(String restartNumber) {
        if (restartNumber.equals(END_NUMBER)) {
            restartFlag = false;
        }
    }


}
