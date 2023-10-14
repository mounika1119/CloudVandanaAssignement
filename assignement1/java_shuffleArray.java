import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {
    public static void main(String[] args) {
        
        List<Integer> List1 = new ArrayList<>();
        List1.add(1);
        List1.add(2);
        List1.add(3);
        List1.add(4);
        List1.add(5);
        List1.add(6);
        List1.add(7);

        
        Collections.shuffle(List1);

       
        Integer[] shuffledArray = List1.toArray(new Integer[0]);

        
        for (int num : shuffledArray) {
            System.out.print(num + " ");
        }
    }
}

