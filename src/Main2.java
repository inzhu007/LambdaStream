public class Main2 {
    public static void main(String[] args) {
        PowerOperation powerOperation = new PowerOperation();
        int res2= powerOperation.getPower(2,3);
        System.out.println(res2);
    }
}

class PowerOperation{
    int getPower(int a, int b){
        Operator power= (x,y) -> (int)Math.pow(x,y);
        return power.toOperate(a,b);
    }
}