/**
 * 
 * @author //Put your first and last name here
 * 
 * 
 * Assignment Instructions:
 * 	Write the following constructors and methods:
 * 	- You() : Sets all private global variables to your information
 * 	- String getFullName() : Returns a String of your first and last name with a space in between
 * 	- String setFavoriteAnimal(String animal) : Sets favoriteAnimal to animal and returns it 
 * 	- int happyBirthday() : Prints out "Happy Birthday!", increases age by 1, and returns it
 *
 * Submission Instructions:
 *  - Save your saved work on Eclipse - your workspace should be the file location of the cloned repo
 *  - In GitHub Desktop, add your summary and commit your changes
 *  - Then push your commits to GitHub
 *  - Check your repo on GitHub.com to make sure the files are as you intend
 *  - Add achiu-frhsd as a collaborator
 *
 */
public class You{

	private String firstName = "Michelle";
	private String lastName = "Hon";
	private String favoriteAnimal = "bunny";
	private int age = 15;

	// Write your code here
	public You(String firstName, String lastName, String favoriteAnimal, int age)
	{
		firstName = this.firstName;
		lastName = this.lastName;
		favoriteAnimal = this.favoriteAnimal;
		age = this.age;	
	}
	
	public String getFullName()
	{
		return firstName + lastName;
	}
	
	public String setFavoriteAnimal(String animal)
	{
		favoriteAnimal = animal;
		return favoriteAnimal;
	}
	
	public int happyBirthday()
	{
		System.out.println("H A P P Y  B I R T H D A Y!");
		return age++;
	}

}