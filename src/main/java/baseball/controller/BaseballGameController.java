package baseball.controller;

import baseball.model.Computer;
import baseball.model.Generator;
import baseball.view.InputView;
import baseball.view.OutputView;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BaseballGameController {

    void start() {
        OutputView.printStartMessage();
        Computer computer = Computer.of(Generator.generateComputerNumbers());

        do {
            List<Integer> userNumbers = splitNumbers(InputView.readNumbers());
            int ballCount = computer.calculateBall(userNumbers);
            int strikeCount = computer.calculateStrike(userNumbers);
            OutputView.printResultMessage(ballCount, strikeCount);
            if (strikeCount == 3) {
                InputView.readRestartNumber();
            }
        } while (true);

    }

    private List<Integer> splitNumbers(String input) {
        return Arrays.stream(input.split("")).map(userNumber -> Integer.parseInt(userNumber))
                .collect(
                        Collectors.toList());
    }


}
