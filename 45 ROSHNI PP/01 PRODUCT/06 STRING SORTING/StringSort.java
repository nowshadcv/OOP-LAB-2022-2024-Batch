package packA;

import java.util.Arrays;
import java.util.Scanner;
public class StringSort {

	public static void main(String[] args) {
		int Count = 0 ;
		String tmp ;
		Scanner scan = new Scanner ( System.in) ;
		System.out.println("Enter the number of strings to sort:") ;
		Count = scan.nextInt() ;
		String strlist [ ] = new String [ Count ] ;
		Scanner scan1 = new Scanner ( System.in ) ;
		System.out.println("Enter your string" ) ;
		for ( int i = 0 ; i < Count ; i++ )
			strlist [i] = scan1 . nextLine();
		System.out.println ( "choose 1 or 2 from the menu below:") ;
		System.out.println ( "1 : in-built sort " ) ;
		System.out.println ( "2 : user-defined sort " );
		int choice ;
		choice =scan.nextInt();
		switch ( choice ) {
		case 1 : Arrays.sort(strlist) ;
		         System.out.println( Arrays .toString(strlist) );
		         break ;
		case 2 : for ( int i = 0 ; i < Count-1 ; i++) {
			     for ( int j = i+1 ; j<strlist .length ; j++  ) {
			    	 if ( strlist [ i ] .compareTo ( strlist [ j ] )> 0 ) {
			    		 tmp = strlist [ i ] ;
			    		 strlist [ i ] = strlist [ j ] ;
			    		 strlist [ j ] = tmp ;
			    		 }
			    	 System.out.println( Arrays .toString(strlist) ) ;
			    	 break ;}}}
		
			
		
		
		

	}

}
