package christmas.view.input;

import static camp.nextstep.edu.missionutils.Console.readLine;
import static christmas.view.utils.Error.INVALID_DATE;
import static christmas.view.utils.Format.NUMBER;
import static christmas.view.utils.Show.READ_DATE;

public class InputDate {
    public String readDate() {
        while (true) {
            try {
                return requestDateInput();
            } catch (IllegalArgumentException e) {
                printInvalidDateMessage();
            }
        }
    }

    private String requestDateInput() {
        System.out.println(READ_DATE.getMessage());
        String date = readLine();
        validateDate(date);
        return date;
    }

    private void validateDate(String date) {
        validateNumber(date);
        validateRange(date);
    }

    private void validateNumber(String date) {
        if (!date.matches(NUMBER.getFormat())) {
            throw new IllegalArgumentException();
        }
    }

    private void validateRange(String date) {
        if (Integer.parseInt(date) < 1 || Integer.parseInt(date) > 31) {
            throw new IllegalArgumentException();
        }
    }

    private void printInvalidDateMessage() {
        System.out.println(INVALID_DATE.getMessage());
    }
}
