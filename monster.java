import java.util.Random;
public class monster{
	String name = "Bob Frankenmeier";
	Random rand = new Random();
	int str = rand.nextInt(100);
	int acc = rand.nextInt(100);
	//coment
	int spd = rand.nextInt(100);{
		while((str + acc + spd) > 225 || (str + acc + spd) < 100) {
			int str = rand.nextInt(75);
			int acc = rand.nextInt(75);
			int spd = rand.nextInt(75);
		}
	
	}
}