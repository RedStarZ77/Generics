package Ex;

import java.util.List;
import java.util.Objects;

public class WildcardSum {
    public static double sumNumbers(List<? extends Number> numbers){
        double result = 0;
        for (Number object : numbers){
            result += object.doubleValue();
        }
        return result;
    }
}
