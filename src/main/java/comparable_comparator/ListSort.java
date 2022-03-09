package comparable_comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListSort {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 2, 70, 45, 75);
        List<String> list1 = Arrays.asList("Rajesh", "Brajesh", "Akash", "Deepak", "Awadesh");
       //List<Integer> integerList = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        List<String> stringList = list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("After Sorting: "+stringList);
    }
}
