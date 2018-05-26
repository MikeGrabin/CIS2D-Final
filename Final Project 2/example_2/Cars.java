public class Cars {

    private  String manufacture;
    private  int year;
    private  String model;


    public Cars(String manufacture, int year, String model) {
        this.manufacture = manufacture;
        this.year = year;
        this.model = model;
    }
    public  String getManufacture() {
        return manufacture;
    }

    public  void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public  int getYear() {
        return year;
    }

    public  void setYear(int year) {
        this.year = year;
    }

    public  String getModel() {
        return model;
    }

    public  void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString()
    {
        String result = "";
        result += "\nManufacture: "+ getManufacture() + "\nYear: "+getYear()+
                "\nModel: "+getModel();
        return result;
    }
}
