package HomeTask2;

public class test1 {

    public static void main(String[] args) {
        int line;
        int star;
        System.out.println("Triangle a");
        for( line = 1; line <= 10; line++ )
        {
            for( star = 1; star <= line; star++ )
            {

                System.out.print( "# " );
            }
            System.out.println();
        }

        System.out.println("Triangle b");

        for( line = 1; line <= 10; line++ )
        {
            for( star = 1; star <= 10; star++ )
            {

                if(line<star)
                    System.out.print( "*" );
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("Triangle c");

        for( line = 1; line <= 10; line++ )
        {
            for( star = 1; star <= 10; star++ )
            {

                if(line<=star)
                    System.out.print( "*" );
                //else
                // System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("Triangle d");

        for( line = 1; line <= 10; line++ )
        {
            for( star = 1; star <= 10; star++ )
            {

                if(line>10-star)
                    System.out.print( "*" );
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
