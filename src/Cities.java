public class Cities {
    private String country;
    private String cityName;

    public Cities(String cityName, String country){
        this.cityName = cityName;
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public String getCityName() {
        return cityName;
    }
}
