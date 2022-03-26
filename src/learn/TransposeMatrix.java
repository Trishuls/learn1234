package learn;

public class TransposeMatrix {
    public static void main(String[] args) {
        int original[][]={{9,2,3},{4,5,6},{7,8,9}};
        int transpose[][] = new int[3][3];

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                transpose[i][j]=original[j][i];
            }
        }

        System.out.println("original matrix");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(original[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("transposed matrix");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("adding diagonals");
        int sum=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(i==j)
                {
                    System.out.print(transpose[i][j]);
                }
                else
                    System.out.print(0);

            }
            System.out.println();
        }
//        System.out.println(sum);
    }
}
