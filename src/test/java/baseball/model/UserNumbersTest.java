package baseball.model;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


public class UserNumbersTest {

    @DisplayName("유저 번호 자리수 비교 성공 테스트")
    @Test
    void compareDigit_EqualResult_Success() {
        //given
        UserNumbers userNumbers = new UserNumbers("123");
        //when
        int sameDigitCount = userNumbers.compareDigit(List.of(1, 2, 3));
        //then
        assertThat(sameDigitCount).isEqualTo(3);

    }

    @DisplayName("유저 번호 자리수는 다르고 포함된 수 비교 성공 테스트")
    @Test
    void compareDifferentDigitAndIncludedNumber_EqualResult_Success() {
        //given
        UserNumbers userNumbers = new UserNumbers("215");
        //when
        int includedNumber = userNumbers.compareDifferentDigitAndIncludedNumber(List.of(1, 2, 3));
        //then
        assertThat(includedNumber).isEqualTo(2);

    }


}
