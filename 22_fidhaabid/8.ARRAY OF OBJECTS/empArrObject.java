
package program8.java;
import java.util.Scanner;
public class empArrObject {
	public static void main(String[] args) {
		System.out.println ( " Enter number of employees : ") ;
		Scanner sc = new Scanner ( System .in ) ;
		int n = sc.nextInt() ;
		System.out.println ( " Enter Employee details one by one .. " ) ;
		employee employees [ ] = new employee [ n ] ;
		Scanner scemp = new Scanner ( System .in ) ;
		int eid , esal ;
		String enam ;
		for ( int i = 0 ; i < n ; i++ ){
			System.out.println ( "Enter " + i + " employee details.. " ) ;
			System.out.println ( "Enter employee id ( integer ) : " ) ;
			eid = scemp.nextInt() ;
			System.out.println ( "Enter employee name ( string ) : " ) ;
			String nam = scemp.next ( ) ;
			enam = new String (nam ) ;
			System.out.println ( "Enter employee salary ( integer ) : " ) ;
			esal = scemp.nextInt() ;
			employee emp = new employee ( eid , esal , enam ) ;
			employees [ i ] = emp ;}
		System.out.println ( "Employees are : \n " ) ;
		for ( employee y : employees )
			y . showData ( ) ;
		System.out.println ( "Enter employee number to search :  " ) ;
		int semp = sc.nextInt() ;
		boolean found = false ;
		for ( employee e : employees ){
			if ( semp == e .eNo ){
				found = true ;
				System.out.println ( " employee found " ) ;
				e . showData ( ) ;
				break ;}}
		if ( ! found )
			System.out.println ( " employee not found.. " ) ;
			}
		}
			
	