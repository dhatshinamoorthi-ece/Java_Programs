import java.util.LinkedList;
import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        LinkedList<Integer>list=new LinkedList<>();
        int k=s.nextInt();
        list.addFirst(k);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i)+" ");
            
        }

    }
}
