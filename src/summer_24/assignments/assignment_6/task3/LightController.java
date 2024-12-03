package summer_24.assignments.assignment_6.task3;

public class LightController {
    private boolean isON;
    private int brightness;

    public void showLightStatus() {
        String status = this.isON ? "ON" : "OFF";
        System.out.printf("Light status: %s\n", status);
        System.out.printf("Brightness Level: %d\n", this.brightness);
    }

    public void switchLight() {
        this.isON = !this.isON;

        if (this.isON) {
            this.brightness = this.brightness == 0 ? 1 : this.brightness;
            System.out.println("Lights are now ON.");
        } else {
            this.brightness = 0;
            System.out.println("Lights are now OFF.");
        }
    }

    public void adjustBrightness(int brightness) {
        int adjustedBrightness = this.brightness + brightness;

        if (this.isON) {
            if (1 <= adjustedBrightness && adjustedBrightness <= 10) {
                this.brightness = adjustedBrightness;
                System.out.println("Brightness adjusted.");
            } else {
                System.out.println("Brightness out of range. Set between 0 to 10.");
            }
        } else {
            System.out.println("Please turn on the light first!");
        }
    }

    public String resetSettings() {
        this.brightness = 1;
        return "Light settings have been reset.";
    }
}
