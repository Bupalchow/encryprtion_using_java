import java.util.Scanner;
public class encrypt {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the message");
        String n=sc.nextLine();
        //encrypt
        for (int i=0 ;i<n.length(); i++){
            for(int a= n.length(); a<(n.length()+1);a++) {
                char j = n.charAt(i);
                char encr = (char) (j + a);
                System.out.print(encr);
            }

        }
        System.out.println(" ");
        System.out.println("enter the word to decrypt");
        String b=sc.nextLine();

        //decrypt
        for (int i=0 ;i<b.length(); i++) {
            for (int a = b.length(); a < (b.length() + 1); a++) {
                char j = b.charAt(i);
                char decr = (char) (j - a);
                System.out.print(decr);
            }
        }

    }
}
