import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String !!!");
        String string=scanner.next();

        string=string.toLowerCase(Locale.ROOT);
        System.out.println(SpecialAppearance(string));

    }

    private static int SpecialAppearance(String string) {
        int result=0;
        int count=0;

        for(int i=0;i<string.length();i++){
            if(string.charAt(i)=='a'){
                count++;
            }
            else if(string.charAt(i)=='g'){
                result+=count;
            }
        }
        return result;
    }
}