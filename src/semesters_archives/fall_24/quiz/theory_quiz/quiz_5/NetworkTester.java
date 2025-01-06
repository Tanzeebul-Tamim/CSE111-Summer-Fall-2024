package semesters_archives.fall_24.quiz.theory_quiz.quiz_5;

/*
    Carefully read the following Network and NetworkTester classes. Your task is to design the derived MobileNetwork class with necessary attributes and methods, such that the main method produces the given output. You must ensure that the new class utilizes the inherited elements when appropriate.

    Output:
    ------------------
    Network Name: GP-Data
    Bandwidth: 20.0 Mbps
    Signal Strength: weak
    Data Limit: 1.0 GB
    File size exceeds download limit.
    ------------------
    GP-Data has weak signal strength.
    Download stopped.
    Downloading 0.5 GB over 25.0 seconds.
    ------------------
    Network Name: GP-Data
    Bandwidth: 20.0 Mbps
    Signal Strength: Stable
    Data Limit: 0.5 GB
    File size exceeds download limit.
    ------------------
    Network Name: GP-Data
    Bandwidth: 20.0 Mbps
    Signal Strength: Stable
    Data Limit: 0.5 GB
 */

class Network {
    protected String name;
    protected double bandwidth;
    protected String signalStrength;

    public Network(String name, double bandwidth, String signalStrength) {
        this.name = name;
        this.bandwidth = bandwidth;
        this.signalStrength = signalStrength;
    }

    public String toString() {
        return "Network Name: " + name + "\n"
                + "Bandwidth: " + bandwidth + " Mbps\n"
                + "Signal Strength: " + signalStrength;
    }
}

public class NetworkTester {
    public static void main(String[] args) {
        MobileNetwork gpNetwork = new MobileNetwork("GP-Data", 20, "weak", 1);
        System.out.println("------------------");
        System.out.println(gpNetwork);
        gpNetwork.download(1.2);
        System.out.println("------------------");
        gpNetwork.download(0.7);
        gpNetwork.signalStrength = "Stable";
        gpNetwork.download(0.5);
        System.out.println("------------------");
        System.out.println(gpNetwork);
        gpNetwork.download(0.7);
        System.out.println("------------------");
        System.out.println(gpNetwork);
    }
}
