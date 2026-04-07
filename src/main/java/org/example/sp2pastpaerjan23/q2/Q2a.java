//package org.example.sp2pastpaerjan23.q2;
//
//import org.junit.Test;
//
//public class Q2a {
//
//    //A suitable JUnit 5 answer is:
//    import static org.junit.jupiter.api.Assertions.*;
//import java.time.Duration;
//import org.junit.jupiter.api.Test;
//
//    public class DoubleStringTest {
//
//        @Test
//        public void testNullThrows() {
//            assertThrows(IllegalArgumentException.class, () -> doubleString(null));
//        }
//
//        @Test
//        public void testNormalString() {
//            assertEquals("abcabc", doubleString("abc"));
//        }
//
//        @Test
//        public void testTimeout() {
//            assertTimeout(Duration.ofMillis(2023), () -> {
//                assertEquals("xx", doubleString("x"));
//            });
//        }
//    }
//    //Explanation:
//    //The null test covers the exception branch.
//    //The normal string test covers the return statement.
//    //The timeout test checks the extra requirement that the test fails
//    // if execution takes more than 2023 milliseconds.
//
//}
