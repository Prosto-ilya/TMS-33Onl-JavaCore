package lesson_16_homework.Task_2;

import java.util.HashMap;
import java.util.Map;

public class Pairs {
    public static void main(String[] args) throws StringIndexOutOfBoundsException  {
        System.out.println(pairs(new String[] {"code", "bug"}));
        System.out.println(pairs(new String[] {"man", "moon", "main"}));
        System.out.println(pairs(new String[] {"man", "moon", "good", "night"}));
    }
    public static Map <String, String> pairs(String[] strings){
        Map<String, String> resultMap = new HashMap<>();
        for(String str : strings){
            String key = String.valueOf(str.charAt(0));
            String value = String.valueOf(str.charAt(str.length()-1));
            resultMap.put(key, value);
        }
        return resultMap;
    }
}
