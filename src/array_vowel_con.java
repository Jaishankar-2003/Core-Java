import java.util.Scanner;

public class array_vowel_con
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter size");
        int size = scn.nextInt();

        //create array
        char[] a1 = new char[size];

        System.out.println("enter values");
        for(int i = 0 ; i<=size-1 ; i++)
        {
            a1[i] = scn.next().charAt(0);
        }

        //perform operaion

        int countvow = 0;
        int countcon = 0;
        for(int i = 0 ; i<=size-1 ; i++)
        {
            if(a1[i]=='a'||a1[i]=='e'||a1[i]=='i'||a1[i]=='o'||a1[i]=='u'||a1[i]=='A'||a1[i]=='E'||a1[i]=='I'||a1[i]=='O'||a1[i]=='U')
            {
                countvow++;
            }
            else
            {
                countcon++;
            }
        }
        System.out.println("value is vowel : " + countvow);
        System.out.println("value is consonent : " + countcon);
    }
}
