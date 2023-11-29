package baseball.view;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


public class OutputViewTest {

    ByteArrayOutputStream captureOutputValues() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        return outputStream;
    }


    @DisplayName("숫자 야구 시작 메세지 출력 성공 테스트")
    @Test
    void printStartMessage_EqualMessage_Success() {

        //given
        ByteArrayOutputStream output = captureOutputValues();

        //when
        OutputView.printStartMessage();

        //then
        assertThat(output.toString()).isEqualTo("숫자 야구 게임을 시작합니다.\n");

    }
}
