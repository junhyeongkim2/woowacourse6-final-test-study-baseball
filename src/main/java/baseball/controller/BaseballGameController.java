package baseball.controller;

import baseball.model.Computer;
import baseball.model.Generator;
import baseball.view.InputView;
import baseball.view.OutputView;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BaseballGameController {

    private Computer computer;
    private boolean restartFlag = true;

    public void start() {
        OutputView.printStartMessage();
        computer = Computer.of(Generator.generateComputerNumbers());

        do {
            List<Integer> userNumbers = splitNumbers(InputView.readNumbers());
            int ballCount = computer.calculateBall(userNumbers);
            int strikeCount = computer.calculateStrike(userNumbers);
            OutputView.printResultMessage(ballCount, strikeCount);
            if (strikeCount == 3) {
                restart();
            }
        } while (restartFlag);

    }

    private List<Integer> splitNumbers(String input) {
        return Arrays.stream(input.split("")).map(userNumber -> Integer.parseInt(userNumber))
                .collect(
                        Collectors.toList());
    }

    private void restart() {
        String restartNumber = InputView.readRestartNumber();
        if (restartNumber.equals("1")) {
            computer = Computer.of(Generator.generateComputerNumbers());
            restartFlag = true;
        }
        if (restartNumber.equals("2")) {
            restartFlag = false;
        }
    }


}
