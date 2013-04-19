/**
 * The package is the namespace of this class
 * any classes in the com.sjs.carddeck namespace are automatically imported
 * Any package protected methods or properties are also available to the ObjectAnatomy class
 */
package com.sjs.carddeck;


/**
 * The class statement is the begining to any class
 * A class is a defenition of what an object is and what an object can do.
 * 
 * Lets break down the class statement
 * public - This is called an access modifier.
 * 	The available access modifiers are
 *  public - the entire system can see this class, import it, and utilize its methods
 *  protected - only classes within the com.sjs.carddeck package and classes that extend this can use the code in here
 *  ommited - if you leave off the access modifier, the access to the method or class is package-private
 *  package-private - this means that only classes in this package can utilize the private code. Subclasses
 *     cannot.
 *  private - only this class can see the properties and methods labeled private. No external source can access them
 * 
 *  the class statmenet tells the compiler what the name of this class is
 *  the fully qualified name of an object is the package.name
 *  in ObjectAnatomy's example, its fully qualified name is com.sjs.cardddeck.ObjectAnatomy
 */
public class ObjectAnatomy {

	/**
	 * Generally its good practice to put properties at the top of your class file
	 * properties are variables that represent the object. Our object needs a name, so lets give it the name property
	 * 
	 */
	
	private String _name;
	
	/**
	 * now that we have a name property, we need the ability to set the name.
	 * I prefer to set the name on construction time. Classes can always have constructors
	 * 
	 * You build a constructor by providing an access modifier and a method with the exact name
	 * as the class name. So in our case, since we want to be built by anyone we want, we are going to make
	 * a public constructor that can be fed a string. we are going to call the incoming string "name"
	 * 
	 * so that the programmer building our object, knows what the string represents.
	 * 
	 * public ObjectAnatomy(String name)
	 */
	
	public ObjectAnatomy(String name){
		//now we have a null property and an incoming name
		//that the user wants to assign to this object
		//lets go ahead and assign name to the property _name.
		_name = name;
	}
	
	/**
	 * Well, now we have an object called ObjectAnatomy that has a name, and the name can be assigned
	 * at construction time.
	 * 
	 * But, we dont have any publicly exposed way for the user to get the name. So we must make a method
	 * that publicly accessable that returns the name given to this object.
	 * public String getName()
	 */
	
	public String getName(){
		return _name;
	}
	
}
