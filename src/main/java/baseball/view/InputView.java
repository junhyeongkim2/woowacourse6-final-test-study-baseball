package baseball.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.regex.Pattern;

public class InputView {

    private static final String READ_NUMBERS_MESSAGE = "숫자를 입력해주세요 : ";
    private static final String READ_RESTART_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료\n게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    private static final String INVALID_INPUT_ERROR_MESSAGE = "[ERROR] 잘못된 값이 입력되었습니다. 게임을 종료합니다.";

    private static final String RESTART_NUMBER = "1";
    private static final String END_NUMBER = "2";


    private static final String READNUMBER_FORM = "^\\d{3}+";

    public static String readNumbers() {
        System.out.print(READ_NUMBERS_MESSAGE);
        String input = Console.readLine();
        validateReadNumbersForm(input);
        return input;
    }

    public static String readRestartNumber() {
        System.out.println(READ_RESTART_MESSAGE);
        String input = Console.readLine();
        validateReadRestartNumber(input);
        return input;
    }

    public static void validateReadNumbersForm(String input) {
        if (!Pattern.matches(READNUMBER_FORM, input)) {
            throw new IllegalArgumentException(INVALID_INPUT_ERROR_MESSAGE);
        }
    }


    public static void validateReadRestartNumber(String input) {
        if (!input.equals(RESTART_NUMBER) && !input.equals(END_NUMBER)) {
            throw new IllegalArgumentException(INVALID_INPUT_ERROR_MESSAGE);
        }
    }


}
