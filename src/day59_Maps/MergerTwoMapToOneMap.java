package day59_Maps;

import java.util.HashMap;
import java.util.Map;

public class MergerTwoMapToOneMap {
    public static void main(String[] args) {
        //Map 1
     Map<Integer, String> intToString = new HashMap<Integer, String>();
     intToString.put(1, "One");
     intToString.put(2, "Two");
     intToString.put(3, "Three");
     intToString.put(4, "Four");
     intToString.put(5, "Five");
     System.out.println("first map: " + intToString);
     //Map 2
     Map<Integer, String> primes = new HashMap<>();
     primes.put(2, "TWO");
     primes.put(3, "THREE");
     primes.put(5, "FIVE");
     primes.put(7, "SEVEN");
     primes.put(11, "ELEVEN");
    System.out.println("second map: " + primes);
    // when you combine map, it would contains mapping
    // from the two maps, but for duplicate keys
    // values will be updated from the second map
    // you can choose any map to source and destination
    // for example, in below code, intToString map
    // will contain combined value but primes will
    // not be changed.
    intToString.putAll(primes);

    System.out.println("combined map: " + intToString);
//        first map: {1=One, 2=Two, 3=Three, 4=Four, 5=Five}
//        second map: {2=TWO, 3=THREE, 5=FIVE, 7=SEVEN, 11=ELEVEN}
//        combined map: {1=One, 2=TWO, 3=THREE, 4=Four, 5=FIVE, 7=SEVEN, 11=ELEVEN}

}
}
