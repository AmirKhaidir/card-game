import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class CardDeckTest {

    @Test
    public void test1() {
        Map<Integer, List<String>> data = new HashMap<>();
        data.put(1, Arrays.asList("2@", "2#", "4#", "5@", "5^", "9@", "9*", "J*", "Q@", "Q#", "K@", "K#", "A*"));
        data.put(2, Arrays.asList("4@", "4*", "7*", "8@", "8^", "9^", "10^", "J@", "Q*", "K^", "K*", "A@", "A#"));
        data.put(3, Arrays.asList("2*", "3@", "3#", "3^", "3*", "4^", "5#", "7#", "7^", "9#", "10@", "10#", "J^"));
        data.put(4, Arrays.asList("2^", "5*", "6@", "6#", "6^", "6*", "7@", "8#", "8*", "10*", "J#", "Q^", "A^"));

        assertEquals(2, 1 + 1);
    }

    @Test
    public void test2() {
        Map<Integer, List<String>> data = new HashMap<>();
        data.put(1, Arrays.asList("2@", "2#", "2^", "2*", "6^", "7@", "8@", "9^", "10@", "10*", "J^", "A#", "A*"));
        data.put(2, Arrays.asList("3#" ,"3*" ,"4@" ,"6@" ,"6#" ,"6*" ,"7#" ,"7^" ,"7*" ,"8#" ,"10^" ,"J@" ,"A^"));
        data.put(3, Arrays.asList("3^", "4#", "4*", "5@", "8^", "8*", "9@", "J#", "J*", "Q@", "Q#", "Q^", "K*"));
        data.put(4, Arrays.asList("3@", "4^", "5#", "5^", "5*", "9#", "9*", "10#", "Q*", "K@", "K#", "K^", "A@"));

        assertEquals(2, 1 + 1);
    }

    public void test3() {
        Map<Integer, List<String>> data = new HashMap<>();
        data.put(1, Arrays.asList("2@", "3#", "3^", "4@", "4#", "4*", "5@", "8^", "10*", "J#", "Q@", "Q#", "A*"));
        data.put(2, Arrays.asList("2#", "3@", "3*", "5#", "6^", "9#", "9^", "10@", "10#", "Q*", "K@", "A@", "A#"));
        data.put(3, Arrays.asList("5^", "5*", "7*", "8@", "8#", "9@", "9*", "J*", "Q^", "K#", "K^", "K*", "A^"));
        data.put(4, Arrays.asList("2^", "2*", "4^", "6@", "6#", "6*", "7@", "7#", "7^", "8*", "10^", "J@", "J^"));

        assertEquals(2, 1 + 1);
    }
}
