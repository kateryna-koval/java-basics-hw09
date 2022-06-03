import java.util.ArrayList;

/**
 * ArrayUtil exercises.
 */
public class ArrayUtil {

    /**
     * Finds the common elements between two arrays (String values).
     *
     * @param array1 first array
     * @param array2 second array
     * @return String array with common elements
     */
    public static String[] findCommon(String[] array1, String[] array2) {
        ArrayList<String> result = new ArrayList<>();
        for (String s : array1) {
            for (int j = 0; j < array2.length; j++) {
                if (s.equals(array2[j])) {
                    result.add(s);
                    array2[j] = "common elements";
                }
            }
        }
        return result.toArray(new String[0]);
    }
}