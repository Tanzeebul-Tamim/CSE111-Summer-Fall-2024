package semesters_archives.summer_24.assignments.assignment_9.task5;

public class Smartphone {
    private String model;
    private int featureCount;
    private String[] featureNames;
    private String[] featureValues;

    public Smartphone() {
        this.featureNames = new String[10];
        this.featureValues = new String[10];
    }

    public Smartphone(String model) {
        this.model = model;
        this.featureNames = new String[10];
        this.featureValues = new String[10];
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void updateName(String model) {
        this.model = model;
    }

    public void addFeature(String featureName, String featureValue) {
        if (this.model == null) {
            System.out.println("Feature cannot be added without phone name");
        } else {
            boolean alreadyExists = false;
            int alreadyExistsIdx = -1;

            for (int i = 0; i < featureCount; i++) {
                String feature = this.featureNames[i];

                if (feature != null && feature.equals(featureName)) {
                    alreadyExists = true;
                    alreadyExistsIdx = i;
                    break;
                }
            }

            int featureCapacity = this.featureNames.length;

            if (featureCapacity > featureCount) {
                if (alreadyExists) {
                    String feature_value = featureValues[alreadyExistsIdx];
                    featureValues[alreadyExistsIdx] = feature_value + ", " + featureValue;
                } else {
                    featureNames[featureCount] = featureName;
                    featureValues[featureCount] = featureValue;
                    featureCount++;
                }

            } else {
                System.out.println("Cannot add more features. Capacity reached!");
            }
        }
    }

    public void printDetail() {
        System.out.printf("Phone Name: %s\n", this.model);

        for (int i = 0; i < featureCount; i++) {
            String featureName = this.featureNames[i];
            String featureValue = this.featureValues[i];

            if (featureName != null && featureValue != null) {
                System.out.println(featureName + ": " + featureValue);
            }
        }
    }
}
