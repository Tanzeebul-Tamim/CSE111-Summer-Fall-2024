package semesters_archives.fall_24.term_exams.final_exam.inheritance;

public class WeatherReport {
    public double temp;
    public double humidity;
    public double windSpd;

    public WeatherReport(double temperature, double humidity, double windSpeed) {
        this.temp = temperature;
        this.humidity = humidity;
        this.windSpd = windSpeed;
    }

    public void displayReport() {
        System.out.println("Weather Report:");
        System.out.println("Temperature: " + temp + " Celsius");
        System.out.println("Humidity: " + humidity + "%");
        System.out.println("Wind Speed: " + windSpd + " km/h");
    }

    public void compareWith(RainReport other) {
        System.out.println("Comparing Weather Reports:");
        System.out.println("Temperature Difference: " + Math.abs(this.temp - other.temp) + " Celsius");
        System.out.println("Humidity Difference: " + Math.abs(this.humidity - other.humidity) + "%");
        System.out.println("WindSpeed Difference: " + Math.abs(this.windSpd - other.windSpd) + " km/h");
    }
}
