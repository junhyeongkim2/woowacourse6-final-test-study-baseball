package baseball.view;

import baseball.model.Result;
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

    @DisplayName("1볼 1스트라이크 결과 메세지 출력 성공 테스트")
    @Test
    void printResultMessage_EqualOneBallOneStrikeMessage_Success() {
        //given
        ByteArrayOutputStream output = captureOutputValues();
        int ballCount = 1;
        int StrikeCount = 1;
        //when
        OutputView.printResultMessage(new Result(ballCount, StrikeCount));

        //then
        assertThat(output.toString()).isEqualTo("1볼 1스트라이크\n");

    }

    @DisplayName("2볼 0스트라이크 결과 메세지 출력 성공 테스트")
    @Test
    void printResultMessage_EqualTwoBallZeroStrikeMessage_Success() {
        //given
        ByteArrayOutputStream output = captureOutputValues();
        int ballCount = 2;
        int StrikeCount = 0;
        //when
        OutputView.printResultMessage(new Result(ballCount, StrikeCount));

        //then
        assertThat(output.toString()).isEqualTo("2볼\n");
    }

    @DisplayName("0볼 2스트라이크 결과 메세지 출력 성공 테스트")
    @Test
    void printResultMessage_EqualZeroBallTwoStrikeMessage_Success() {
        //given
        ByteArrayOutputStream output = captureOutputValues();
        int ballCount = 0;
        int StrikeCount = 2;
        //when
        OutputView.printResultMessage(new Result(ballCount, StrikeCount));

        //then
        assertThat(output.toString()).isEqualTo("2스트라이크\n");
    }

    @DisplayName("3스트라이크 결과 메세지 출력 성공 테스트")
    @Test
    void printResultMessage_EqualZeroBallThreeStrikeMessage_Success() {
        //given
        ByteArrayOutputStream output = captureOutputValues();
        int ballCount = 0;
        int StrikeCount = 3;
        //when
        OutputView.printResultMessage(new Result(ballCount, StrikeCount));

        //then
        assertThat(output.toString()).isEqualTo("3스트라이크\n");
    }


}
