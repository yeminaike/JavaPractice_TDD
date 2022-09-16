package TDD.Arithmetic;

public class Arithmetic {
    public int addition(int n1, int n2, int n3, int n4, int n5) {
        return (n1 + n2 + n3 + n4 + n5);
    }
    public int subtraction(int n1, int n2, int n3, int n4, int n5) {
        return (n1 - n2 - n3 - n4 - n5);
    }
    public int multiplication(int n1, int n2, int n3, int n4, int n5) {
        return (n1 * n2 * n3 * n4 * n5);
    }
    public int division(int n1, int n2) {
        return (n1 / n2);
    }
    public int modolus(int n1, int n2) {
        return (n1 % n2);
    }
    public int average(int n1, int n2, int n3, int n4, int n5) {
        int sum = (n1 + n2 + n3 + n4 + n5);
        return (sum / 5);
    }
    public int maximumNumber(int n1, int n2, int n3, int n4, int n5) {
        return Math.max(Math.max(Math.max(Math.max(n1, n2), n3), n4), n5);
    }
    public int minimumNumber(int n1, int n2, int n3, int n4, int n5) {
        return Math.min(Math.min(Math.min(Math.min(n1 , n2), n3), n4), n5);
    }
    public int exponential(int n1, int n2) {
        return (int) Math.pow(n1, n2);
    }
    public int squareRoot(int n1) {
        return (int) Math.sqrt(n1);
    }
}
