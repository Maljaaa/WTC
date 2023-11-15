package christmas.model.event;

public class EventPrice {

    private static EventPrice instance = null;
    private int dDayEventPrice;
    private int weekdayEventPrice;
    private int holidayEventPrice;
    private int specialEventPrice;
    private int giveAwayEventPrice;
    private int eventPrice;

    private EventPrice() {
    }

    public static EventPrice getInstance() {
        if (instance == null) {
            instance = new EventPrice();
        }
        return instance;
    }

    public int getdDayEventPrice() {
        return dDayEventPrice;
    }

    public void setdDayEventPrice(int dDayEventPrice) {
        this.dDayEventPrice = dDayEventPrice;
    }

    public int getWeekdayEventPrice() {
        return weekdayEventPrice;
    }

    public void setWeekdayEventPrice(int weekdayEventPrice) {
        this.weekdayEventPrice = weekdayEventPrice;
    }

    public int getHolidayEventPrice() {
        return holidayEventPrice;
    }

    public void setHolidayEventPrice(int holidayEventPrice) {
        this.holidayEventPrice = holidayEventPrice;
    }

    public int getSpecialEventPrice() {
        return specialEventPrice;
    }

    public void setSpecialEventPrice(int specialEventPrice) {
        this.specialEventPrice = specialEventPrice;
    }

    public int getGiveAwayEventPrice() {
        return giveAwayEventPrice;
    }

    public void setGiveAwayEventPrice(int giveAwayEventPrice) {
        this.giveAwayEventPrice = giveAwayEventPrice;
    }

    public int getEventPrice() {
        return eventPrice = getdDayEventPrice() +
                getWeekdayEventPrice() +
                getHolidayEventPrice() +
                getSpecialEventPrice() +
                getGiveAwayEventPrice();
    }
}
