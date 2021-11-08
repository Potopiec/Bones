package dev.raf.dao.dto;

public class FossilDto {
    private int id;
    private String type;
    private String period;
    private String name;
    private String location;
    private String state;


    public  FossilDto(){}

    public FossilDto(int id, String type, String period, String name, String location, String state) {
        this.id = id;
        this.type = type;
        this.period = period;
        this.name = name;
        this.location = location;
        this.state = state;

    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getPeriod() {
        return period;
    }

    public String getLocation() {return location;}

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "FossilQueryDto{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", period='" + period + '\'' +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
