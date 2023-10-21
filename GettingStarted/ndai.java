public class ndai {
    private String make;
    private String model;
    private int year;

    public ndai(String make, String model, int year) {
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }
    ndai(ndai x)
    {
        this.copy(x);
    }

    // Getter methods
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // Setter methods
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void copy(ndai x)
    {
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());
    }
}
