public class TriangleClassifier {
    public static String triangleClassifier(int sideA, int sideB, int sideC) {
        boolean check1 = (sideA + sideB) > sideC;
        boolean check2 = (sideB + sideC) > sideA;
        boolean check3 = (sideC + sideA) > sideB;
        boolean check4 = Math.pow(sideA, 2) == Math.pow(sideB, 2) + Math.pow(sideC, 2);
        boolean check5 = Math.pow(sideB, 2) == Math.pow(sideA, 2) + Math.pow(sideC, 2);
        boolean check6 = Math.pow(sideC, 2) == Math.pow(sideB, 2) + Math.pow(sideA, 2);
        if (check1 && check2 && check3) {
            if (check4 || check5 || check6) {
                return "Tam giác vuông";
            } else if (sideA == sideB && sideA == sideC && sideB == sideC) {
                return "Tam giác đều";
            } else if (sideA == sideB || sideA == sideC || sideB == sideC) {
                return "Tam giác cân";
            } else
                return "Tam giác thường";
        } else
            return "không phải 3 cạnh của tam giác";
    }

    public static void main(String[] args) {
        triangleClassifier(2, 2, 2);
    }
}
