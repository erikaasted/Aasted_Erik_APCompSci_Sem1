class Main
{
  public static void printSquare( int size )
  {
    if ( size >= 20 && size >= 4) 
    { size = 4; }

    int squareLenght = size;
    int i = 1; 
    int p = 1;

    if ( p <= size )
    {
       int t = 1;

       while ( t <= squareLenght  )
       {
        System.out.print( "*" );
        t = t + 1;
       }
    }
       System.out.println();           //  Newline
       i = i + 1;


    while ( i <= squareLenght )
    {

       int d = 1; 
       int s = 1;


       if ( s < squareLenght  );{
       System.out.print( "*" ); 
       s = s + 1;
       }

       while ( d < size-1  )
       {
        System.out.print( "." );
        d = d + 1;

       }


       System.out.println( "*" );
        i = i + 1;


    }

    if ( p <= size )
    {
       int t = 1;

       while ( t <= squareLenght  )
       {
        System.out.print( "*" );
        t = t + 1;
       }
    }

    System.out.println();           
       i = i + 1;

}
}