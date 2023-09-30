public class FactorialLoop {

    public static void main(String[] args) {
        int value = 5;

//        int result =  factorialLoop(value);
        int result =  factorialRecursive(value);

//        System.out.println("Factorial of " + value + " is = " + result);

    }


    private static int factorialLoop(int value){
        var result = 1;
        for(int i = 1; i<=value; i++){
            result*=i;
        }

        return result;
    }


    /**
     * Method for recursive factorial
     * @param value first value
     * @return the total for factorial Recursive
     */
    private static int factorialRecursive(int value){
        if(value ==1){
            System.out.println("value is 1 "+ value);

            return 1;
        } else {
            System.out.println("value is "+ value);
            System.out.println("value total is "+ value * factorialRecursive(value-1));

            return value * factorialRecursive(value-1);
        }
    }
}
