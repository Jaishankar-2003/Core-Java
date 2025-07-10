public class arith_swap {
    public static void main (String[] args){
        int a=100;
        int b = 200;
        int temp = 0;

        System.out.println("a ="+a);
        System.out.println("a ="+b);

        //logic
        temp = a;
        a=b;
        b=temp;

        System.out.println("a ="+a);
        System.out.println("a ="+b);

    }
}
