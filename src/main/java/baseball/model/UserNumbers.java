package baseball.model;

import java.util.List;

public class UserNumbers {
    private final List<Integer> userNumbers;

    public UserNumbers(List<Integer> userNumbers) {
        this.userNumbers = userNumbers;
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


}
