package christmas.model.menu;

public class MenuCount {

    private static MenuCount instance = null;

    private int appetizerCount;
    private int beverageCount;
    private int desertCount;
    private int mainCount;

    private MenuCount() {

    }

    public static MenuCount getInstance() {
        if (instance == null) {
            instance = new MenuCount();
        }
        return instance;
    }

    public void addAppetizerCount() {
        this.appetizerCount += 1;
    }

    public void addBeverageCount() {
        this.beverageCount += 1;
    }

    public void addDesertCount() {
        this.desertCount += 1;
    }

    public void addMainCount() {
        this.mainCount += 1;
    }

    public int getAppetizerCount() {
        return appetizerCount;
    }

    public int getBeverageCount() {
        return beverageCount;
    }

    public int getDesertCount() {
        return desertCount;
    }

    public int getMainCount() {
        return mainCount;
    }
}
