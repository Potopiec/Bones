package dev.raf.dao.dto;

public class FossilQueryDto {
    private int id;
    private String types;
    private String period;
    private String name;
    private String place;
    private String state;



    public FossilQueryDto(int id, String types, String period, String name, String place, String state) {
        this.id = id;
        this.types = types;
        this.period = period;
        this.name = name;
        this.place = place;
        this.state = state;

    }

    public int getId() {
        return id;
    }

    public String getTypes() {
        return types;
    }

    public String getPeriod() {
        return period;
    }

    public String getPlace() {return place;}

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

}
