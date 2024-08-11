package adapter.classadapter;

/**
 * @ClassName Phone
 * @Author ZhangMingJun
 * @Description
 * @Date 2024/7/29 20:50
 * @Version 1.0
 **/
public class Phone {

    public void charging(IVoltage5V iVoltage5V){
        System.out.println("手机开始充电~~~~");
        iVoltage5V.getVoltage5v();
    }
}
