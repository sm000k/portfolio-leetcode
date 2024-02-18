package example.hackerrank;

import java.util.Set;

public class IntersectionUnionSubset {


    public static void main(String[] args) {
        Set<Integer> setA = new java.util.HashSet<>(Set.of(1, 3, 5, 7));
        Set<Integer> setB = Set.of(2,4,6,8);
        // intersection
//        setA.retainAll(setB);
//        System.out.println("setA = " + setA);
        // union
//        setA.addAll(setB);
//        System.out.println("setA = " + setA);;
        setA.removeAll(setB);
        System.out.println("setA = " + setA);

    }
}
