package mj.zhang.demo;

/**
 * @ClassName SingleTone
 * @Author ZhangMingJun
 * @Description
 * @Date 2024/7/24 8:50
 * @Version 1.0
 **/
public class SingleTone {

    private static SingleTone instance = new SingleTone();

    private SingleTone() {
    }

    public static SingleTone getInstance() {
        return instance;
    }

}
