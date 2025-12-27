public class NeighboringNumbers {
    private final int prev;
    private final int next;

    public NeighboringNumbers(int prev, int next) {
        this.prev = prev;
        this.next = next;
    }

    public int getPrev() {
        return prev;
    }

    public int getNext() {
        return next;
    }

    public static NeighboringNumbers CalcNeighbor(int n) {
        return new NeighboringNumbers(n -1, n + 1);
    }
}
