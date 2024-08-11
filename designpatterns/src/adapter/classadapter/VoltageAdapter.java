package adapter.classadapter;

/**
 * @ClassName VoltageAdapter
 * @Author ZhangMingJun
 * @Description
 * @Date 2024/7/29 20:49
 * @Version 1.0
 **/
public class VoltageAdapter extends Voltage220V implements IVoltage5V{

    @Override
    public int getVoltage5v() {
        return getVoltage220v() / 44;
    }
}
