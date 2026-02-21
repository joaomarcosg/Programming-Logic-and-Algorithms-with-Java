public class GradeAverage {
    private final int firstGrade;
    private final int secondGrade;

    public GradeAverage(int firstGrade, int secondGrade) {
        this.firstGrade = firstGrade;
        this.secondGrade = secondGrade;
    }

    public int getFirstGrade() {
        return firstGrade;
    }

    public int getSecondGrade() {
        return secondGrade;
    }

    public static int CalcGradeAverage(int firstGrade, int secondGrade) {
        return firstGrade + secondGrade / 2;
    }
}
