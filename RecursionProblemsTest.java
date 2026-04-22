import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RecursionProblemsTest {

    // count8 tests
    @Test
    public void testCount8_1() {
        assertEquals(1, RecursionProblems.count8(8));
    }

    @Test
    public void testCount8_2() {
        assertEquals(2, RecursionProblems.count8(818));
    }

    @Test
    public void testCount8_3() {
        assertEquals(4, RecursionProblems.count8(8818));
    }

    @Test
    public void testCount8_4() {
        assertEquals(0, RecursionProblems.count8(123));
    }

    @Test
    public void testCount8_5() {
        assertEquals(3, RecursionProblems.count8(888));
    }

    // countHi tests
    @Test
    public void testCountHi_1() {
        assertEquals(1, RecursionProblems.countHi("xxhixx"));
    }

    @Test
    public void testCountHi_2() {
        assertEquals(2, RecursionProblems.countHi("xhixhix"));
    }

    @Test
    public void testCountHi_3() {
        assertEquals(1, RecursionProblems.countHi("hi"));
    }

    @Test
    public void testCountHi_4() {
        assertEquals(0, RecursionProblems.countHi("hello"));
    }

    @Test
    public void testCountHi_5() {
        assertEquals(3, RecursionProblems.countHi("hihihi"));
    }

    // countHi2 tests
    @Test
    public void testCountHi2_1() {
        assertEquals(1, RecursionProblems.countHi2("ahixhi"));
    }

    @Test
    public void testCountHi2_2() {
        assertEquals(2, RecursionProblems.countHi2("ahibhi"));
    }

    @Test
    public void testCountHi2_3() {
        assertEquals(0, RecursionProblems.countHi2("xhixhi"));
    }

    @Test
    public void testCountHi2_4() {
        assertEquals(1, RecursionProblems.countHi2("hixhi"));
    }

    @Test
    public void testCountHi2_5() {
        assertEquals(2, RecursionProblems.countHi2("hihi"));
    }

    // strCount tests
    @Test
    public void testStrCount_1() {
        assertEquals(2, RecursionProblems.strCount("catcowcat", "cat"));
    }

    @Test
    public void testStrCount_2() {
        assertEquals(1, RecursionProblems.strCount("catcowcat", "cow"));
    }

    @Test
    public void testStrCount_3() {
        assertEquals(0, RecursionProblems.strCount("catcowcat", "dog"));
    }

    @Test
    public void testStrCount_4() {
        assertEquals(2, RecursionProblems.strCount("aaaaa", "aa"));
    }

    @Test
    public void testStrCount_5() {
        assertEquals(1, RecursionProblems.strCount("hello", "ll"));
    }

    // stringClean tests
    @Test
    public void testStringClean_1() {
        assertEquals("yza", RecursionProblems.stringClean("yyzzza"));
    }

    @Test
    public void testStringClean_2() {
        assertEquals("abcd", RecursionProblems.stringClean("abbbcdd"));
    }

    @Test
    public void testStringClean_3() {
        assertEquals("Helo", RecursionProblems.stringClean("Hello"));
    }

    @Test
    public void testStringClean_4() {
        assertEquals("a", RecursionProblems.stringClean("aaaa"));
    }

    @Test
    public void testStringClean_5() {
        assertEquals("abc", RecursionProblems.stringClean("abc"));
    }
}