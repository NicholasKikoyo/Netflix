package users;
import devices.Device;
public abstract class Account {
    double price;
    int numberOfParallelScreens;
    String email;

    public abstract void watch(Device device, String movie );

}
