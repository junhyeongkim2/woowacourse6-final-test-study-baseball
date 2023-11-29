package baseball.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UserNumbers {

    private static final String EMPTY_STRING = "";
    private final List<Integer> userNumbers;
    private final int ZERO = 0;

    public UserNumbers(String input) {
        this.userNumbers = splitNumbers(input);
    }

    public int compareDigit(List<Integer> computerNumbers) {
        return (int) IntStream.range(ZERO, userNumbers.size())
                .filter(index -> computerNumbers.get(index) == userNumbers.get(index)).count();
    }

    public int compareDifferentDigitAndIncludedNumber(List<Integer> computerNumbers) {
        return (int) IntStream.range(ZERO, userNumbers.size())
                .filter(index -> computerNumbers.get(index) != userNumbers.get(index) && computerNumbers.contains(
                        userNumbers.get(index))).count();
    }

    private List<Integer> splitNumbers(String input) {
        return Arrays.stream(input.split(EMPTY_STRING)).map(userNumber -> Integer.parseInt(userNumber))
                .collect(
                        Collectors.toList());
    }


}
