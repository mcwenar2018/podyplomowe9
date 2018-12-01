public class MarsRobot implements Robot {
    String status;
    int speed;
    float temperature;

    public void checkTemperature() {
        if (temperature < -80) {
                status = "powrot do domu";
                speed = 5;
            }
    }
    public void showAttributes() {
        System.out.println("Status: " + status);
        System.out.println("Predkosc: " + speed);
        System.out.println("Temperatura: " + temperature);
        }

    public void checkStatus() {
       System.out.println("Status: " + status);
       }
}

