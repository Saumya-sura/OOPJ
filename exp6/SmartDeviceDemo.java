// WiFiEnabled.java
interface WiFiEnabled {
    void connectToWiFi(String network);
    void disconnectWiFi();
}

// BluetoothEnabled.java
interface BluetoothEnabled {
    void pairDevice(String deviceName);
    void unpairDevice();
}

// SmartSpeaker.java
class SmartSpeaker implements WiFiEnabled, BluetoothEnabled {
    @Override
    public void connectToWiFi(String network) {
        System.out.println("Connected to WiFi network: " + network);
    }

    @Override
    public void disconnectWiFi() {
        System.out.println("Disconnected from WiFi");
    }

    @Override
    public void pairDevice(String deviceName) {
        System.out.println("Paired with Bluetooth device: " + deviceName);
    }

    @Override
    public void unpairDevice() {
        System.out.println("Unpaired from Bluetooth device");
    }

    public void playMusic(String songName) {
        System.out.println("Playing song: " + songName);
    }
}

// SmartDeviceDemo.java
public class SmartDeviceDemo {
    public static void main(String[] args) {
        SmartSpeaker speaker = new SmartSpeaker();
        speaker.connectToWiFi("HomeWiFi");
        speaker.pairDevice("Phone");
        speaker.playMusic("Imagine");
        speaker.disconnectWiFi();
        speaker.unpairDevice();
    }
}
