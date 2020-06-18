import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {
    @Test
    void testFindAbsolute0() {
        int sideA = 2;
        int sideB = 2;
        int sideC = 2;
        String expected = "Tam giác đều";
        String result = TriangleClassifier.triangleClassifier(sideA, sideB, sideC);
        assertEquals(expected, result);
    }

    @Test
    void testFindAbsolute2() {
        int sideA = 2;
        int sideB = 2;
        int sideC = 3;
        String expected = "Tam giác cân";
        String result = TriangleClassifier.triangleClassifier(sideA, sideB, sideC);
        assertEquals(expected, result);
    }

    @Test
    void testFindAbsolute3() {
        int sideA = 3;
        int sideB = 4;
        int sideC = 5;
        String expected = "Tam giác vuông";
        String result = TriangleClassifier.triangleClassifier(sideA, sideB, sideC);
        assertEquals(expected, result);
    }

    @Test
    void testFindAbsolute4() {
        int sideA = 0;
        int sideB = 1;
        int sideC = 1;
        String expected = "không phải 3 cạnh của tam giác";
        String result = TriangleClassifier.triangleClassifier(sideA, sideB, sideC);
        assertEquals(expected, result);
    }

    @Test
    void testFindAbsolute5() {
        int sideA = 8;
        int sideB = 2;
        int sideC = 3;
        String expected = "không phải 3 cạnh của tam giác";
        String result = TriangleClassifier.triangleClassifier(sideA, sideB, sideC);
        assertEquals(expected, result);
    }

    @Test
    void testFindAbsolute6() {
        int sideA = -1;
        int sideB = 2;
        int sideC = 1;
        String expected = "không phải 3 cạnh của tam giác";
        String result = TriangleClassifier.triangleClassifier(sideA, sideB, sideC);
        assertEquals(expected, result);
    }
}