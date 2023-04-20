public class CurrentConditions implements Display {
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherStation weatherStation;

    public CurrentConditions(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.registerDisplay(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.printf("Current conditions: %.1fF degrees, %.1f%% humidity, %.1f inHg pressure\n",
                temperature, humidity, pressure);
    }
}
