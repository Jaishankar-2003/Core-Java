public class arith_wo_swap {
    public static void main (String[] args){
        int a=100;
        int b = 200;
        int temp = 0;

        System.out.println("a ="+a);
        System.out.println("a ="+b);

        //logic
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("a ="+a);
        System.out.println("a ="+b);

    }
}
