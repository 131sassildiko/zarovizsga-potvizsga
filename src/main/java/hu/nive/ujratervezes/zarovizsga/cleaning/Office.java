package hu.nive.ujratervezes.zarovizsga.cleaning;

public class Office implements Cleanable{

    private String address;
    private int area;
    private int levels;
    private BuildingType type = BuildingType.OFFICE;

    public Office(String address, int area, int levels) {
        this.address = address;
        this.area = area;
        this.levels = levels;
    }

    public BuildingType getType() {
        return type;
    }

    public int getArea() {
        return area;
    }

    public int getLevels() {
        return levels;
    }

    @Override
    public int clean() {
        return (levels*area*100);
    }

    @Override
    public String getAddress() {
        return address;
    }
}
