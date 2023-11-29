package baseball.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ResultTest {

    @DisplayName("3스트라이크 결과 생성 정상 작동 테스트")
    @Test
    void isThreeStrike_EqualTrue_Success() {
        //given
        Result result = new Result(0, 3);

        //when
        Boolean threeStrike = result.isThreeStrike();

        //then
        assertThat(threeStrike).isTrue();
    }

    @DisplayName("3스트라이크 아닌 경우 결과 생성 정상 작동 테스트")
    @Test
    void isThreeStrike_EqualFalse_Success() {
        //given
        Result result = new Result(0, 2);

        //when
        Boolean threeStrike = result.isThreeStrike();

        //then
        assertThat(threeStrike).isFalse();
    }

}
