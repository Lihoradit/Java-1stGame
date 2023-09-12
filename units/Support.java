package org.example.units;
public class Support extends BaseHero{
    private int supBox;
    public Support(String name) {
        super(50, 1, 6, 0, new int[]{0,0},0,name);
        supBox=10;
    }
    @Override
    public String getInfo() {
        return String.format("Подсобитель"+super.getInfo());
    }
}
