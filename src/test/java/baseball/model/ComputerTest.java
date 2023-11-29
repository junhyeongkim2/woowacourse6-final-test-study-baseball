package baseball.model;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


public class ComputerTest {


    @DisplayName("컴퓨터 번호 생성 테스트")
    @Test
    void createNumbers_EqualResult_Success() {
        //given
        Computer computer = Computer.of(List.of(1, 2, 3));
        //when
        List<Integer> numbers = computer.getNumbers();
        //then
        System.out.println(numbers);
        assertThat(numbers.size()).isEqualTo(3);
        assertThat(computer.getNumbers().get(0)).isEqualTo(1);
        assertThat(computer.getNumbers().get(1)).isEqualTo(2);
        assertThat(computer.getNumbers().get(2)).isEqualTo(3);
    }


    @DisplayName("스트라이크 판별 성공 테스트")
    @Test
    void calculateStrike_EqualResult_Success() {
        //given
        Computer computer = Computer.of(List.of(1,2,3));
        //when
        int strikeCount = computer.calculateStrike(List.of(1, 2, 4));
        //then
        assertThat(strikeCount).isEqualTo(2);
    }

    @DisplayName("볼 판별 성공 테스트")
    @Test
    void calculateBall_EqualResult_Success() {
        //given
        Computer computer = Computer.of(List.of(1,2,3));
        //when
        int ballCount = computer.calculateBall(List.of(3, 1, 4));
        //then
        assertThat(ballCount).isEqualTo(2);
    }


    @DisplayName("낫싱 판별 성공 테스트")
    @Test
    void calculateNothing_EqualResult_Success() {
        //given
        Computer computer = Computer.of(List.of(1,2,3));
        //when
        int strikeCount = computer.calculateStrike(List.of(4, 5, 6));
        int ballCount = computer.calculateBall(List.of(4, 5, 6));

        //then
        assertThat(strikeCount).isEqualTo(0);
        assertThat(ballCount).isEqualTo(0);
    }


}
