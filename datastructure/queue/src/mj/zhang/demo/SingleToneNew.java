package mj.zhang.demo;

/**
 * @ClassName SingleToneNew
 * @Author ZhangMingJun
 * @Description
 * @Date 2024/7/24 8:55
 * @Version 1.0
 **/
public class SingleToneNew {

    private SingleToneNew(){

    }

    private static volatile SingleToneNew instance;

    public static SingleToneNew getInstance() {
        if (instance == null) {
            synchronized (SingleToneNew.class) {
                if (instance == null) {
                    instance = new SingleToneNew();
                }
            }
        }
        return instance;
    }
}
