package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class Computer {

    private final List<Integer> numbers;

    public Computer(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public static Computer of() {
        List<Integer> numbers = new ArrayList<>();
        while (numbers.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!numbers.contains(randomNumber)) {
                numbers.add(randomNumber);
            }
        }
        return new Computer(numbers);
    }

    public List<Integer> getNumbers() {
        return numbers;
    }


    public int calculateStrike(List<Integer> userNumbers) {
        int strikeCount = 0;
        for (int i = 0; i < userNumbers.size(); i++) {
            if (numbers.get(i) == userNumbers.get(i)) {
                strikeCount++;
            }
        }
        return strikeCount;
    }

    public int calculateBall(List<Integer> userNumbers) {
        return (int) userNumbers.stream().filter(userNumber -> numbers.contains(userNumber)).count();
    }
}
