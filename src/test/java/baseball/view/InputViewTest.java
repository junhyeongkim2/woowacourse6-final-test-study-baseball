package baseball.view;

import camp.nextstep.edu.missionutils.Console;
import net.bytebuddy.pool.TypePool.Resolution.Illegal;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class InputViewTest {

    @DisplayName("숫자 입력 세자리가 아닌 경우 예외 발생 4자리 테스트")
    @Test
    void validateReadNumbersForm_IsNotThreeNumberFour_ExceptionThrow() {
        assertThatThrownBy(() -> InputView.validateReadNumbersForm("1234")).isInstanceOf(
                IllegalArgumentException.class);
    }

    @DisplayName("숫자 입력 세자리가 아닌 경우 예외 발생 2자리 테스트")
    @Test
    void validateReadNumbersForm_IsNotThreeNumberTwo_ExceptionThrow() {
        assertThatThrownBy(() -> InputView.validateReadNumbersForm("12")).isInstanceOf(
                IllegalArgumentException.class);
    }

    @DisplayName("숫자 입력 세자리가 아닌 경우 예외 발생 1자리 테스트")
    @Test
    void validateReadNumbersForm_IsNotThreeNumberOne_ExceptionThrow() {
        assertThatThrownBy(() -> InputView.validateReadNumbersForm("1")).isInstanceOf(
                IllegalArgumentException.class);
    }

}
