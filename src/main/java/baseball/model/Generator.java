package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class Generator {
    private static final int MAX_NUMBER_SIZE = 3;
    private static final int START_NUMBER = 1;
    private static final int END_NUMBER = 9;


    public static List<Integer> generateComputerNumbers() {
        List<Integer> numbers = new ArrayList<>();
        while (numbers.size() < MAX_NUMBER_SIZE) {
            int randomNumber = Randoms.pickNumberInRange(START_NUMBER, END_NUMBER);
            if (!numbers.contains(randomNumber)) {
                numbers.add(randomNumber);
            }
        }
        System.out.println("new Numbers : " + numbers);
        return numbers;
    }
}
