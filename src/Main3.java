import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter N numbers: ");
        int n=scanner.nextInt();

        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(scanner.nextInt());
        }
        list.stream()
                .filter(x-> x%2==0)
                .forEach(x->System.out.println(x));

    }
}

