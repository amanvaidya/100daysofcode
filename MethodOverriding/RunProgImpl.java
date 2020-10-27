package MethodOverriding;
/**
 * 
 */

/**
 * @author Aman
 *
 */
public class RunProgImpl extends RunJProg{
	public static void main(String args[]) {
		RunProg run = new RunProg();
		run.display();
		RunProg run1 = new RunJProg();
		run1.display();
	}
}
