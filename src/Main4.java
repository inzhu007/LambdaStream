import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter N numbers:");
        int n=scanner.nextInt();

        List<Integer> listNum=new ArrayList<>();
        for (int i=0;i<n;i++){
            listNum.add(scanner.nextInt());
        }
        int max = listNum.stream().max((a, b) -> {
            if (a > b) return 1;
            else if (a < b) return -1;
            else return 0;
        }).get();
        System.out.println("maximal element: " + max);
    }
}


