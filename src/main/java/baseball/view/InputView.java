package baseball.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.regex.Pattern;

public class InputView {

    private static final String READNUMBER_FORM = "^\\d{3}+";

    public static String readNumbers() {
        System.out.print("숫자를 입력해주세요 : ");
        String input = Console.readLine();
        validateReadNumbersForm(input);
        return input;
    }

    public static String readRestartNumber() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료\n게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String input = Console.readLine();
        validateReadRestartNumber(input);
        return input;
    }

    public static void validateReadNumbersForm(String input) {
        if (!Pattern.matches(READNUMBER_FORM, input)) {
            throw new IllegalArgumentException("[ERROR] 잘못된 값이 입력되었습니다. 게임을 종료합니다.");
        }
    }


    public static void validateReadRestartNumber(String input) {
        if (!input.equals("1") && !input.equals("2")) {
            throw new IllegalArgumentException("[ERROR] 잘못된 값이 입력되었습니다. 게임을 종료합니다.");
        }
    }


}
