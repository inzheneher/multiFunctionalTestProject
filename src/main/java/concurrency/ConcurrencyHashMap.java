package concurrency;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrencyHashMap {

    static ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();

    public static void main(String[] args) {

        concurrentHashMap.put("a", "1");

        for (Object o : concurrentHashMap.entrySet()) {
            System.out.println("o = " + o);
        }

        for (Object o : concurrentHashMap.keySet()) {
            System.out.println("o = " + o);
        }

        for (Object o : concurrentHashMap.values()) {
            System.out.println("o = " + o);
        }

    }

}
