package Patterns;

public class Pattern1 {

    public static void main(String[] args) {

        System.out.println("Your pattern is :");
        for(int i=1;i<=6;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

