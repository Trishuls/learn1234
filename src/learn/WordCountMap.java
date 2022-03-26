package learn;

import java.util.HashMap;
import java.util.Map;

public class WordCountMap {

    public static void main(String[] args) {
        String str = "hello world hello hello hello is";
        String[] split = str.split(" ");
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<split.length;i++)
        {
            if(map.containsKey(split[i]))
            {
                int count = map.get(split[i]);
                map.put(split[i],++count);
            }
            else
            {
                map.put(split[i],1);
            }
        }
        System.out.println(map);
    }
}
