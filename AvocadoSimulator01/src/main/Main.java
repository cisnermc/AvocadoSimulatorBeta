/*
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 */
package main;

import avocado.Avocado;
import avocado.Avocado.enumCondition;

/***
 * Exercise our Avocado classes
 * @author nicomp
 *
 */
public class Main {
	//enum myEnum {A,B,C,D};	// Demo of enumerated date type

	public static void main(String[] args) {
		// Declare and instantiate an avocado
		Avocado bob = new Avocado("Brownish-Green", Avocado.enumCondition.fresh, 10);
		
		
		//myEnum e = myEnum.A;
		//System.out.println(e.toString());

	}
}
