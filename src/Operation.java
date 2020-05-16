public class Operation {
    private int first;
    private String operator;
    private int second;

    public Operation(int first, String operator, int second) {
        this.first = first;
        this.operator = operator;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "first=" + first +
                ", operator='" + operator + '\'' +
                ", second=" + second +
                '}';
    }
}