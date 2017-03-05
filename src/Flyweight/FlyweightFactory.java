package Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ray on 2017/3/5.
 * 享元工厂类
 */
public class FlyweightFactory {

    private static final FlyweightFactory instance = new FlyweightFactory();
    private Map<String,Flyweight> cache = new HashMap<String, Flyweight>();

    public static final String KEY_CHAR_A = "A";
    public static final String KEY_CHAR_B = "B";

    public FlyweightFactory(){
    }

    public static FlyweightFactory getInstance(){
        return instance;
    }

    public Flyweight getFlyweight(String key){
        if(cache.get(key) != null){
            return cache.get(key);
        }
        if(key.equals(KEY_CHAR_A)){
            cache.put(key, new ConcreteFlyweight('A'));
            return cache.get(key);
        }
        if(key.equals(KEY_CHAR_B)){
            cache.put(key, new ConcreteFlyweight('B'));
            return cache.get(key);
        }
        return null;
    }

    public int getCacheSize(){
        return cache.size();
    }




}
