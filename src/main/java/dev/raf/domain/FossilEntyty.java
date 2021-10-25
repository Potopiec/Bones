package dev.raf.domain;

public class FossilEntyty {
    private int id;
    private FossilTypes types;
    private Period period;
    private String name;
    private Coordinats coordinats;
    private float sizeInMm;
    private String description;
    private float price;


    public FossilEntyty(int id, FossilTypes types, Period period, String name, Coordinats coordinats, float sizeInMm, String description, float price) {
        this.id = id;
        this.types = types;
        this.period = period;
        this.name = name;
        this.coordinats = coordinats;
        this.sizeInMm = sizeInMm;
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public FossilTypes getTypes() {
        return types;
    }

    public void setTypes(FossilTypes types) {
        this.types = types;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coordinats getCoordinats() {
        return coordinats;
    }

    public void setCoordinats(Coordinats coordinats) {
        this.coordinats = coordinats;
    }

    public float getSizeInMm() {
        return sizeInMm;
    }

    public void setSizeInMm(float sizeInMm) {
        this.sizeInMm = sizeInMm;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
