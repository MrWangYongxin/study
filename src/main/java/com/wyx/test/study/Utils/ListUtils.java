package com.wyx.test.study.Utils;

import java.util.*;

public class ListUtils {

    public static Map<String,Object> getMaps(List<Map<String,Object>> list){
        Map<String,Object> map = new HashMap<>();
//        for (Map<String, Object> stringObjectMap : list) {
//            Set<Map.Entry<String, Object>> entries = stringObjectMap.entrySet();
//            Iterator iterator = entries.iterator();
//            while(iterator.hasNext()){
//                Map.Entry entry =(Map.Entry)iterator.next();
//               map.put(entry.getKey().toString(),entry.getValue());
//            }
//        }
        for (Map<String, Object> stringObjectMap : list) {
            map.putAll(stringObjectMap);
        }
        return map;
    }
}
