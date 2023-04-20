public class StatisticsDisplay implements Display {
    private float temperatureMin;
    private float temperatureMax;
    private float tempRunningTotal;
    private int numReadings;

    public void update(float temperature, float humidity, float pressure) {
        if (numReadings == 0 || temperature < temperatureMin) {
            temperatureMin = temperature;
        }
        if (numReadings == 0 || temperature > temperatureMax) {
            temperatureMax = temperature;
        }
        tempRunningTotal += temperature;
        numReadings++;
        display();
    }

    public void display() {
        float temperatureAverage = tempRunningTotal / numReadings;
        System.out.printf("Avg/Max/Min temperature: %.1fF/%.1fF/%.1fF\n",
                temperatureAverage, temperatureMax, temperatureMin);
    }
}
