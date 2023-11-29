package baseball.controller;

import baseball.model.Computer;
import baseball.model.Generator;
import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseballGameController {

    void start() {
        OutputView.printStartMessage();
        InputView.readNumbers();
        Computer computer = Computer.of(Generator.generateComputerNumbers());


    }


}
