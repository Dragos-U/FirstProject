package Tutorials.basic;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Objects {
	public static void main(String[] args) {
		
		// create our window
		JFrame window = new JFrame(); // window variable that holds JFrame objects, and we're creating a new JFrame to
										// assign to our variable
		window.setTitle("My Window"); // we are calling methods on our Jframe object to configure it
		window.setSize(800,600); 
		window.setVisible(true);
		
		JLabel label = new JLabel();
		label.setText("My Label");
		
		window.add(label); // we are calling the add method of our JFrame object to add our label to the window
		
		String s = "hi"; // we have created a string object
		// typing s. gives you a list of what to do with the object.
	}
}
