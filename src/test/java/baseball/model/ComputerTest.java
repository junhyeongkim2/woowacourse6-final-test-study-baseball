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
        Computer computer = new Computer();
        //when
        List<Integer> numbers = computer.createNumbers();
        //then
        System.out.println(numbers);
        assertThat(numbers.size()).isEqualTo(3);
    }


}
