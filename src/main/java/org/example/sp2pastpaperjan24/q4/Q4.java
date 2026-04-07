//package org.example.sp2pastpaperjan24.q4;
//
//public class Q4 {
//    import static org.junit.jupiter.api.Assertions.*;
//import java.time.Duration;
//import org.junit.jupiter.api.Test;
//
//    public class MultTest {
//
//        @Test
//        public void testNegativeX() {
//            assertThrows(IllegalArgumentException.class, () -> mult(-1, 5));
//        }
//
//        @Test
//        public void testNegativeY() {
//            assertThrows(IllegalArgumentException.class, () -> mult(2, -3));
//        }
//
//        @Test
//        public void testZeroCase() {
//            assertEquals(0L, mult(0, 5));
//        }
//
//        @Test
//        public void testPositiveCase() {
//            assertEquals(6L, mult(2, 3));
//        }
//
//        @Test
//        public void testTimeout() {
//            assertTimeout(Duration.ofMillis(2024), () -> {
//                long result = mult(2, 2);
//                assertEquals(4L, result);
//            });
//        }
//    }
//}
