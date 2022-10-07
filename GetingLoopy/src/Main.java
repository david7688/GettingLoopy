public class Main
{
    public static void main(String[] args)
    {

    // question 1

        for(int r=0; r <= 30; r++)
        {
            System.out.println(r);
        }

    // question 2

        for(int x=30; x >= 0; x--)
        {
            System.out.println(x);
        }

    // question 3

        for(int t=0; t <= 18; t+=3)
        {
            System.out.println(t);
        }

    // question 4

        for(int y=10; y >= 0; y-=2)
        {
            System.out.println(y);
        }

    // part b

    // question 7

        for(int i = 0; i <= 4; i++)
        {
            for(int j = 0; j <= 4; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    // question 6

        for(int i = 0; i <= 4; i++)
        {
            for(int j = i; j <= 4; j++){

                System.out.print("*");
            }
            System.out.println(" ");
        }

    // question 5

        for(int i = 0; i <= 5; i++)
        {
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    // extra credit

        for (int i = 0; i < 7; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                if (j == 0 || j == i + 1 || i + j == 7 || i * j == 9)
                {
                    System.out.print("*"+"*"+"*");
                }
                else
                {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }

    }
}