public class Result extends Operation{
    String equal;
    double result;

    public Result(int first, String operator, int second, double result) {
        super(first, operator, second);
        this.equal = "=";
        this.result = result;
    }

    public String getEqual() {
        return equal;
    }

    public void setEqual(String equal) {
        this.equal = equal;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Result{" +
                "equal='" + equal + '\'' +
                ", result=" + result +
                "} " + super.toString();
    }
}
