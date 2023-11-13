package christmas.view;

import static camp.nextstep.edu.missionutils.Console.readLine;
import static christmas.view.Error.*;
import static christmas.view.Format.*;
import static christmas.view.Show.*;

public class InputView {

    public int readDate() {
        System.out.println(READ_DATE.getMessage());
        String date = readLine();

        isInt(date);

        return Integer.parseInt(date);
    }

    private void isInt(String date) {
        if (!date.matches(NUMBER.getFormat())) {
            throw new IllegalArgumentException(INVALID_DATE.getMessage());
        }
    }

    public String readOrder() {
        System.out.println(READ_ORDER.getMessage());

        return readLine();
    }


}
