package Array;

public class demo_multi_dim
{
    public static void main(String[] args){

        // Multidimensional array initialization &  declaration
        int[][] arr = new int[2][3];


        // 0,0    0,1   0,2
        // 1,0    1,1   1,2

        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[0][2] = 30;
        arr[1][0] = 40;
        arr[1][1] = 50;
        arr[1][2] = 60;


        for(int i = 0 ; i < arr.length; i++)
        {
            for(int j = 0 ; j < arr[i].length ; j++)
            {
                System.out.print(arr[i][j] + "");
            }
            System.out.println();
        }


        int[][] arr1 = { {1,2},{3,4} };  // directly insert the values to the arr

        System.out.println("arr1[1][1] : " + arr1[1][1]);

        for(int i = 0 ; i < 2; i++)
        {
            for(int j = 0 ; j < 2 ; j++)
                System.out.print(arr1[i][j] +" ");
            System.out.println();
        }

        int n = 2;
        int m = 2;
        int it = 1;

        int[][] arr2 = new int[n][m];

        // Assign values to array

        for(int i = 0; i<n; i++)
        {
            for(int j = 0 ; j<m; j++)
            {
                arr2[i][j] = it;
                it++;
            }
        }

        // Printing the Array
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            System.out.print(arr2[i][j] + " ");
            System.out.println();
        }


    }
}
