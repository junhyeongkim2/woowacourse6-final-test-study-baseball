package baseball.model;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


public class ComputerTest {

    private Computer computer;

    @BeforeEach
    void setUp() {
        computer = Computer.of(List.of(1, 2, 3));
    }

    @DisplayName("컴퓨터 번호 생성 테스트")
    @Test
    void createNumbers_EqualResult_Success() {
        //given
        List<Integer> numbers;
        //when
        numbers = computer.getComputerNumbers();
        //then
        System.out.println(numbers);
        assertThat(numbers.size()).isEqualTo(3);
        assertThat(computer.getComputerNumbers().get(0)).isEqualTo(1);
        assertThat(computer.getComputerNumbers().get(1)).isEqualTo(2);
        assertThat(computer.getComputerNumbers().get(2)).isEqualTo(3);
    }

    @DisplayName("스트라이크 판별 성공 테스트")
    @Test
    void calculateStrike_EqualResult_Success() {
        //given
        int strikeCount;
        //when
        strikeCount = computer.calculateStrike(new UserNumbers("124"));
        //then
        assertThat(strikeCount).isEqualTo(2);
    }

    @DisplayName("볼 판별 성공 테스트")
    @Test
    void calculateBall_EqualResult_Success() {
        //given
        int ballCount;
        //when
        ballCount = computer.calculateBall(new UserNumbers("314"));
        //then
        assertThat(ballCount).isEqualTo(2);
    }

    @DisplayName("낫싱 판별 성공 테스트")
    @Test
    void calculateNothing_EqualResult_Success() {
        //given
        int strikeCount;
        int ballCount;
        //when
        strikeCount = computer.calculateStrike(new UserNumbers("456"));
        ballCount = computer.calculateBall(new UserNumbers("456"));

        //then
        assertThat(strikeCount).isEqualTo(0);
        assertThat(ballCount).isEqualTo(0);
    }


}
