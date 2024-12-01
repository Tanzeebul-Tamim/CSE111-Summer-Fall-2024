package fall_24.class_notes.lec_7.oop.task5;

public class Smartphone {
    private String model;
    private int featureCount;
    public String[] features;

    public void setModel(String model) {
        this.model = model;
    }

    public void addFeature(String featureName) {
        addFeature(featureName, "");
    }

    public void addFeature(String featureName, String featureValue) {
        if (this.model == null) {
            System.out.println("Feature cannot be added without model name");
        } else {
            int featureCapacity = this.features.length;

            if (featureCapacity > featureCount) {
                String featureWithValue = featureName + ": " + featureValue;
                String featureString = featureValue == "" ? featureName : featureWithValue;

                features[featureCount] = featureString;
                featureCount++;
            } else {
                System.out.println("Cannot add more features. Capacity reached!");
            }
        }
    }

    public void printDetail() {
        System.out.printf("Phone Model: %s\n", this.model);

        if (this.features != null) {
            for (String feature : features) {
                if (feature != null) {
                    System.out.println("- " + feature);
                }
            }
        }
    }
}
