package semesters_archives.fall_24.term_exams.final_exam.inheritance;

public class RainReport extends WeatherReport {
    private double originalRainfall;
    private double adjustedRainfall;
    private boolean thunderstorm;

    public RainReport(double temperature, double humidity, double windSpeed, double originalRainfall,
            boolean thunderstorm) {
        super(temperature, humidity, windSpeed);
        this.originalRainfall = originalRainfall;
        this.thunderstorm = thunderstorm;
        this.calc();
    }

    @Override
    public void displayReport() {
        super.displayReport();
        System.out.printf("Original Rainfall Amount: %.1f mm\n", this.originalRainfall);
        System.out.printf("Adjusted Rainfall Amount: %.2f mm\n", this.adjustedRainfall);
        System.out.printf("Thunderstorm: %s\n", this.thunderstorm ? "Yes" : "No");
    }
    
    @Override
    public void compareWith(RainReport other) {
        double actualDifference = Math.abs(this.originalRainfall - other.originalRainfall);
        double adjustedDifference = Math.abs(this.adjustedRainfall - other.adjustedRainfall);

        super.compareWith(other);
        System.out.println("Comparing Rain Reports:");
        System.out.printf("Actual Rainfall Difference: %.1f mm\n", actualDifference);
        System.out.printf("Adjusted Rainfall Difference: %.2f mm\n", adjustedDifference);
    }
    
    public void rainfallStatus() {
        if (this.adjustedRainfall > 50) {
            System.out.println("Due to heavy rainfall, this area can face a flood situation.");
        } else if (this.adjustedRainfall > 30) {
            System.out.println("The area will face Moderate rainfall.");
        } else {
            System.out.println("The area will face Light rainfall.");
        }
    }

    private void adjust(boolean condition, int percentage) {
        if (condition) {
            this.adjustedRainfall += this.adjustedRainfall * percentage / (double) 100;
        }
    }

    private void calc() {
        this.adjustedRainfall = this.originalRainfall;
        this.adjust(this.thunderstorm, 25);
        this.adjust(this.windSpd > 20, -10);
        this.adjust(this.humidity > 70, 20);
    }
}
