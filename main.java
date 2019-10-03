import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class main {
  public static void main(String[] args) throws InterruptedException {
	monster bob = new monster();
	monster bobee = new monster();
    Scanner in = new Scanner(System.in);
    int speed = 100;
    int acc = 100;
    int strength = 100;
    String name = "";
    print("Enter name: ");
    name = in.nextLine();
    print("You can only spend 225 points. Chose wisely.");
    while(speed + acc + strength > 225){
      print("Enter speed out of 100: ");
      speed = in.nextInt();
      print("Enter strength out of 100: ");
      strength = in.nextInt();
      print("Enter accuracy out of 100: ");
      acc = in.nextInt();
    }
    player me = new player(name, speed, strength, acc);
    print("What do you want to improve? speed, strength or acc ");
    String choice = in.next();
    if (choice.equals("speed")){
      print("Is Usain Bolt good at cricket? (y or n) ");
      String answer = in.next();
      if(answer.equals("y")){
        print("Good job! You got to train with Mr. Bolt and got 10 speed.");
        addSpeed(me,10);
      }
    }
    if(choice.equals("acc")){
	    System.out.print("Where were swords in bronze first made? (Enter contry name) ");
	    String answer = in.next();
	    if(answer.toLowerCase().equals("egypt")){
	      print("Good job! You got to train with a sword and got 7 acc.");
	      addAcc(me,7);
	    }
	    else {
	    	print("No, thats wrong.");
	    }
    }
    if(choice.equals("strength")){
    	print("How many times did Schwarzenegger win Mr.Olympia? (enter an int)");
	    int answer = in.nextInt();
	    if(answer == 7){
	      print("Good job! You got to train with a Schwarzenegger and got 10 strength.");
	      addStrength(me,7);
	    }
	    else {
	    	print("No, thats wrong.");
	    }
    }
    int tally = 0;
    print("The monster BOB FRANKENMEIER appears. ");
    print("If you beat him in 2 or more out of 3 trials, you will win.");
    print("First trial, The accuracy test, see who is more accurate! For this we have archery.");
    print(me.accuracy);
    print("vs");
    print(bob.acc);
    if(me.accuracy > bob.acc) {
    	print("You were better than BOB. 1 point for you.");
    	tally = tally + 1;
    }
    else {
    	print("BOB bested you at archery, better luck next time!");
    	tally = tally - 1;
    }
    TimeUnit.SECONDS.sleep(4);
    print("Second trial, The speed test, see who is faster! For this we have a sprint.");
    print(me.speed);
    print("vs");
    print(bob.spd);
    if(me.speed > bob.spd) {
    	print("You were faster than BOB. 1 point for you.");
    	tally = tally + 1;
    }
    else {
    	print("BOB was way faster than you, better luck next time!");
    	tally = tally - 1;
    }
    TimeUnit.SECONDS.sleep(4);
    print("Third trial, The strength test, see who is stronger! For this we have weightlifting.");
    print(me.strength);
    print("vs");
    print(bob.str);
    if(me.strength > bob.str) {
    	print("You were stronger than BOB. 1 point for you.");
    	tally = tally + 1;
    }
    else {
    	print("BOB lifted 100lb whereas you only did 5!");
    	tally = tally - 1;
    }
    TimeUnit.SECONDS.sleep(1);
    print("The results just came in and ...");
    TimeUnit.SECONDS.sleep(2);
    if(tally >= 2) {
    	print("You WIN!");
    }
    else {
    	print("You lost.");
    }
    bob = null;
    print("The monster BOBEE FRANKENMEIER appears. ");
    print("If you beat him in 2 or more out of 3 trials, you will win.");
    print("First trial, The accuracy test, see who is more accurate! For this we have archery.");
    print(me.accuracy);
    print("vs");
    print(bobee.acc);
    if(me.accuracy > bobee.acc) {
    	print("You were better than BOBEE. 1 point for you.");
    	tally = tally + 1;
    }
    else {
    	print("BOBEE bested you at archery, better luck next time!");
    	tally = tally - 1;
    }
    TimeUnit.SECONDS.sleep(4);
    print("Second trial, The speed test, see who is faster! For this we have a sprint.");
    print(me.speed);
    print("vs");
    print(bobee.spd);
    if(me.speed > bobee.spd) {
    	print("You were faster than BOBEE. 1 point for you.");
    	tally = tally + 1;
    }
    else {
    	print("BOBEE was way faster than you, better luck next time!");
    	tally = tally - 1;
    }
    TimeUnit.SECONDS.sleep(4);
    print("Third trial, The strength test, see who is stronger! For this we have weightlifting.");
    print(me.strength);
    print("vs");
    print(bobee.str);
    if(me.strength > bobee.str) {
    	print("You were stronger than BOBEE. 1 point for you.");
    	tally = tally + 1;
    }
    else {
    	print("BOBEE lifted 100lb whereas you only did 5!");
    	tally = tally - 1;
    }
    TimeUnit.SECONDS.sleep(1);
    print("The results just came in and ...");
    TimeUnit.SECONDS.sleep(2);
    if(tally >= 2) {
    	print("You WIN!");
    }
    else {
    	print("You lost.");
    }
    in.close();
    
    
    
  }
  public static void print(String in){
    System.out.println(in);
  }
  public static void print(int in) {
	  System.out.println(in);
  }
  public static void addSpeed(player me, int toadd){
	  me.speed = me.speed + toadd;
  }
  public static void addAcc(player me, int toadd){
	  me.accuracy = me.accuracy + toadd;
  }
  public static void addStrength(player me, int toadd){
	  me.strength = me.strength + toadd;
  }
  
}