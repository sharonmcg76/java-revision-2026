//package org.example.sp2pastpaperjan25.q7;
//
////Need successful JUnit 5 tests covering all statements,
//// plus a timeout test.
//
//public class Q7a {
//    import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.jupiter.api.Assumptions.assumeTrue;
//
//import java.time.Duration;
//import org.junit.jupiter.api.Test;
//
//    public class MysteryTest {
//
//        @Test
//        public void testNegativeYThrows() {
//            assertThrows(ArithmeticException.class, () -> mystery(5, -1));
//        }
//
//        @Test
//        public void testLoopNotEntered() {
//            assertEquals(0, mystery(3, 5));
//        }
//
//        @Test
//        public void testLoopEntered() {
//            assertEquals(2, mystery(10, 5));
//        }
//
//        @Test
//        public void testTenEightFastEnough() {
//            assertTimeout(Duration.ofMillis(1800), () -> {
//                int result = mystery(10, 8);
//                assertEquals(1, result);
//            });
//        }
//    }
//}
