public class ResultUtils {

    public static Result[] createResults(Operation[] operations) {

        Result[] results = new Result[operations.length];

        for (int i = 0; i < results.length; i++) {
            int first = operations[i].getFirst();
            String operator = operations[i].getOperator();
            int second = operations[i].getSecond();

            double result = 0;
            switch (operator) {
                case "+":
                    result = operations[i].getFirst() + operations[i].getSecond();
                    break;
                case "-":
                    result = operations[i].getFirst() - operations[i].getSecond();
                    break;
                case ":":
                    result = operations[i].getFirst() / operations[i].getSecond();
                    break;
                case "*":
                    result = operations[i].getFirst() * operations[i].getSecond();
                    break;
            }
            results[i] = new Result(first, operator, second, result);
        }
        return results;
    }
}
