public class Main {
    public static void main(String[] args) {
        SumOperation sum = new SumOperation();
        int res=sum.getSum(3,9);
        System.out.println("sum: " + res);
    }
}

@FunctionalInterface
interface Operator{
    int toOperate (int a, int b);
}

class SumOperation{
    int getSum(int a , int b){
        Operator op= (x, y) -> x + y;
        return op.toOperate(a , b);
    }
}