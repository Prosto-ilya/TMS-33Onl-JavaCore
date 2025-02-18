package lesson_16_homework.Task_1;

import java.util.HashMap;
import java.util.Map;

public class wordMultiple {
    public static void main(String[] args){
        System.out.println(wordMulti(new String[] {"a", "b", "a", "c", "b"}));
        System.out.println(wordMulti(new String[] {"c", "b", "a"}));
        System.out.println(wordMulti(new String[] {"c", "c", "c", "c"}));
    }
       public static  Map<String,Boolean>  wordMulti(String[] words){
           Map<String, Integer> valueMap = new HashMap<>();
           Map <String, Boolean> resultMap = new HashMap<>();
           for (String word:words){
               valueMap.put(word, valueMap.getOrDefault(word, 0)+1);
           }
           for (String word: valueMap.keySet()){
               resultMap.put(word, valueMap.get(word)>=2);
           }
           return resultMap;
        }
    }

