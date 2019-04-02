import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReplaceNumber {
    public List<Integer> getSeveralNumbers (List<Integer> collection, int occurrence, int replacement) {
        List<Integer> modified = new ArrayList<>();
        for (int number : collection) {
            if (number == occurrence) {
                modified.add(replacement);
            }
            if ( number != occurrence) {
                modified.add(number);
            }
        }
        return modified;
    }
}


