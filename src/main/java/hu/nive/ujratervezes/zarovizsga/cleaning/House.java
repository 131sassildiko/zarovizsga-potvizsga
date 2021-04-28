package hu.nive.ujratervezes.zarovizsga.cleaning;

public class House implements Cleanable {

    private String address;
    private int area;
    private BuildingType type = BuildingType.HOUSE;


    public int getArea() {
        return area;
    }

    public BuildingType getType() {
        return type;
    }

    public House(String address, int area) {
        this.address = address;
        this.area = area;
    }

    @Override
    public int clean() {
        return (area*80);
    }

    @Override
    public String getAddress() {
        return address;
    }
}
