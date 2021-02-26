import java.util.Scanner;
public class IntPattern {
    
	public static void main(String[] args) { 
        int i,j,k,l;
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        n=n/2;
        for(i=0;i<s.length();i++){
        for(j=i;j<s.length();j++){
            System.out.printf(" ");
        }
        for(k=0;k<=i;k++){ 
            if(k<=n){
            System.out.print(s.charAt(k+n));
            }else{
                System.out.print(s.charAt((k-n)-1));
            }
        }
            //for(k=n;k<=(n+i)%s.length();k++){
            //     for(k=n;k<=(n+i)%s.length();k++){ 
            //             System.out.print(s.charAt(k));
            // }
        System.out.printf("\n");
        }
    }
}