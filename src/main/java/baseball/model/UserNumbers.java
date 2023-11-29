package baseball.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UserNumbers {

    private static final String EMPTY_STRING = "";
    private final List<Integer> userNumbers;

    public UserNumbers(String input) {
        this.userNumbers = splitNumbers(input);
    }

    public int compareDigit(List<Integer> computerNumbers) {
        int digitCount = 0;
        for (int i = 0; i < userNumbers.size(); i++) {
            if (computerNumbers.get(i) == userNumbers.get(i)) {
                digitCount++;
            }
        }
        return digitCount;
    }


    public int compareDifferentDigitAndIncludedNumber(List<Integer> computerNumbers) {
        int includedCount = 0;
        for (int i = 0; i < userNumbers.size(); i++) {
            if (computerNumbers.get(i) != userNumbers.get(i) && computerNumbers.contains(userNumbers.get(i))) {
                includedCount++;
            }
        }
        return includedCount;
    }

    private List<Integer> splitNumbers(String input) {
        return Arrays.stream(input.split(EMPTY_STRING)).map(userNumber -> Integer.parseInt(userNumber))
                .collect(
                        Collectors.toList());
    }


}
