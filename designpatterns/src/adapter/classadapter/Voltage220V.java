package adapter.classadapter;

/**
 * @ClassName Voltage220V
 * @Author ZhangMingJun
 * @Description
 * @Date 2024/7/29 20:49
 * @Version 1.0
 **/
public class Voltage220V {

    private int voltage = 220;
    public int getVoltage220v(){
        System.out.printf("当前电压为:%s%n",voltage);
        return voltage;
    }

}
