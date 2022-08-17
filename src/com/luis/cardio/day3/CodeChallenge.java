package src.com.luis.cardio.day3;

import java.util.*;

/**
 * This java class represents a private code challenge made for an interview
 */
public class CodeChallenge {

    public static void main(String[] args) {

    }
    Map<Long, Long> count(Map<String, UserStats>... visits) {
        Map<Long,Long> response = new HashMap<>();
        if(visits == null)
            return response;
        Arrays.stream(visits).filter(map -> map != null && !map.isEmpty()).forEach(map -> {
            System.out.println("map --> " + map);
            Set<String> s = map.keySet();
            s.forEach(key ->{
                boolean isParseable = true;
                Long l = 0L;
                try{
                    l = Long.parseLong(key);
                }catch(Exception e){
                    isParseable = false;
                }
                if(isParseable && map.get(key) != null && map.get(key).getVisitCount().orElse(null) != null){
                    if(!response.containsKey(l)){
                        response.put(l,map.get(key).getVisitCount().get());
                    }else{
                        response.put(l, response.get(l) + map.get(key).getVisitCount().get() );
                    }
                }
            });
        });

        return response;
    }

}
