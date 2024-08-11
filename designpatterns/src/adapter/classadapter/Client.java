package adapter.classadapter;

/**
 * @ClassName Client
 * @Author ZhangMingJun
 * @Description
 * @Date 2024/7/29 20:50
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
