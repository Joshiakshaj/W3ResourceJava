import java.util.Scanner;

public class table{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int i = 1;
        
        do{
            System.out.println(n*i);
            i++;
        }while(i<11);
        //while(i<11){
        //    System.out.println(n*i);
        //    i++;
        //}
    }

}
