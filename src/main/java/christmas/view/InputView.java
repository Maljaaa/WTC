package christmas.view;

import static camp.nextstep.edu.missionutils.Console.readLine;
import static christmas.view.Error.*;
import static christmas.view.Format.*;
import static christmas.view.Show.*;

public class InputView {

    public String readDate() {
        while (true) {
            try {
                System.out.println(READ_DATE.getMessage());
                String date = readLine();
                validateDate(date);
                return date;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void validateDate(String date) {
        if (!date.matches(NUMBER.getFormat())) {
            throw new IllegalArgumentException(INVALID_DATE.getMessage());
        }
    }

    public String readOrder() {
        System.out.println(READ_ORDER.getMessage());

        return readLine();
    }
}
