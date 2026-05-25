package main.java.exercises;

public class NormalizeInput {
    private final String input;

    public NormalizeInput(String input) {
        this.input = input;
    }

    public String normalize() {
        if (this.input == null) return null;
        return this.input.strip().replaceAll("\\s+", " ").toLowerCase();
    }

    @Override
    public String toString() {
        return "NormalizeInput{" +
                "input='" + input + '\'' +
                '}';
    }
}
