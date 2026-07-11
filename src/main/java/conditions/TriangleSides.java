package main.java.conditions;

public class TriangleSides {

    public ResultTriangleSides triangle(int sideA, int sideB, int sideC) {
        String type = "";
        boolean isTriangle = !(sideA > sideB + sideC || sideB > sideA + sideC || sideC > sideA + sideB);

        if (isTriangle) {
            type = triangleType(sideA, sideB, sideC);
        } else {
            type = "Its not a triangle";
        }

        return new ResultTriangleSides(isTriangle, type);

    }

    public String triangleType(int  sideA, int sideB, int sideC) {
        String equilateral = "Equilateral";
        String isosceles = "Isosceles";
        String scalene = "Scalene";

        if (sideA == sideB && sideA == sideC && sideB  == sideC) {
            return equilateral;
        } else if (sideA == sideB || sideA == sideC || sideB == sideC) {
            return isosceles;
        } else {
            return scalene;
        }
    }

}
