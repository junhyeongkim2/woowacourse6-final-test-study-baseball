package baseball.model;

import java.util.List;

public class Computer {

    private final List<Integer> computerNumbers;

    private Computer(List<Integer> computerNumbers) {
        this.computerNumbers = computerNumbers;
    }

    public static Computer of(List<Integer> numbers) {
        return new Computer(numbers);
    }

    public List<Integer> getComputerNumbers() {
        return computerNumbers;
    }


    public int calculateStrike(UserNumbers userNumbers) {
        return userNumbers.compareDigit(computerNumbers);
    }

    public int calculateBall(UserNumbers userNumbers) {
        return userNumbers.compareDifferentDigitAndIncludedNumber(computerNumbers);
    }
}
