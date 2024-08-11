package objectadapter;

import adapter.classadapter.IVoltage5V;
import adapter.classadapter.Voltage220V;

/**
 * @ClassName VoltageObjectAdapter
 * @Author ZhangMingJun
 * @Description
 * @Date 2024/7/29 21:47
 * @Version 1.0
 **/
public class VoltageObjectAdapter implements IVoltage5V {

    private Voltage220V voltage220V;
    @Override
    public int getVoltage5v() {
        return voltage220V.getVoltage220v() / 44;
    }
}
