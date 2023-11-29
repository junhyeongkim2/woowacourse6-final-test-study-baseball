package baseball.model;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class GeneratorTest {

    @DisplayName("컴퓨터 번호 생성 테스트")
    @Test
    void generateComputerNumbers_EqualResult_Success() {
        //given
        List<Integer> numbers;
        //when
        numbers = Generator.generateComputerNumbers();
        //then
        System.out.println(numbers);
        assertThat(numbers.size()).isEqualTo(3);
    }

}
