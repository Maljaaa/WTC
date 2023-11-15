package christmas.model.menu;

public class MenuCount {

    private int appetizerCount;
    private int beverageCount;
    private int desertCount;
    private int mainCount;

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

    public void addAppetizerCount() {
        this.appetizerCount++;
    }

    public void addBeverageCount() {
        this.beverageCount++;
    }

    public void addDesertCount() {
        this.desertCount++;
    }

    public void addMainCount() {
        this.mainCount++;
    }
}
