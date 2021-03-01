package ProjRome2Rio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		
		User sessionUser = null; // changes to the ID of the logged user
		Rome2Rio sessionRome2Rio = null;
		
		welcomeMenu(sessionUser, sessionRome2Rio);
	}




// option picker
public static int insertOption(){
	
	System.out.print("Enter option: ");
	
	Scanner sc = new Scanner(System.in); // object for scanner
	int option = sc.nextInt();
	
	return option;
}

//------------------------------------------------------------------
//---------------------------start menu---------------------------
//------------------------------------------------------------------

public static void welcomeMenu(User sessionUser, Rome2Rio sessionRome2Rio)
{

	System.out.println("##################################");
	System.out.println("##################################");
	System.out.println("#####                      #####");
	System.out.println("#####    --------------    #####");
	System.out.println("#####    Rome 2 Rio        #####");
	System.out.println("#####    --------------    #####");
	System.out.println("#####                      #####");
	System.out.println("##################################");
	System.out.println("####################################\n");

	System.out.println("\n#Options");
	System.out.println("  1. Create New Instance");
	System.out.println("  2. Load Demo Instance");

	int option = insertOption();

	switch (option) {
	case 1:
		Rome2Rio newRome2Rio = new Rome2Rio();
		sessionRome2Rio = newRome2Rio;
		logMenu(sessionUser, sessionRome2Rio);
		break;

	case 2:
		sessionRome2Rio = povoar();
		logMenu(sessionUser, povoar());
		break;

	default:
		System.err.println("Invalid option! Exiting!");
		break;
	}	
	
}

public static void logMenu(User sessionUser, Rome2Rio sessionRome2Rio)
{

	System.out.println("##################################");
	System.out.println("##################################");
	System.out.println("#####                      #####");
	System.out.println("#####    --------------    #####");
	System.out.println("#####        Log in        #####");
	System.out.println("#####    --------------    #####");
	System.out.println("#####                      #####");
	System.out.println("##################################");
	System.out.println("####################################\n");

	System.out.println("\n#Options");
	System.out.println("  1. Log in");
	System.out.println("  2. Create new user");

	int option = insertOption();

	switch (option) {
	case 1:
		Rome2Rio newRome2Rio = new Rome2Rio();
		sessionRome2Rio = newRome2Rio;
		mainMenu(sessionUser, sessionRome2Rio);
		break;

	case 2:
		sessionRome2Rio = povoar();
		mainMenu(sessionUser, povoar());
		break;

	default:
		System.err.println("Invalid option! Exiting!");
		break;
	}	
}


//------------------------------------------------------------------
//---------------------------main menu---------------------------
//------------------------------------------------------------------





public static void mainMenu(User sessionUser, Rome2Rio sessionRome2Rio)
{

	System.out.println("####################################");
	System.out.println("####################################");
	System.out.println("#######                      #######");
	System.out.println("#######    --------------    #######");
	System.out.println("####### 	  Main Menu      #######");
	System.out.println("#######    --------------    #######");
	System.out.println("#######                      #######");
	System.out.println("####################################");
	System.out.println("####################################\n");

	System.out.println("\n#Options");
	System.out.println("  1. Go to...");
	System.out.println("  2. AddTransports");
	System.out.println("  3. AddLocations");
	System.out.println("  5. Log Off");

	int option = insertOption();

	switch (option) {
	case 1:
		goMenu(sessionUser, sessionRome2Rio);
		break;

	case 2:
		addTransports(sessionUser, sessionRome2Rio);
		break;

	case 3:
		addLocation(sessionUser, sessionRome2Rio);
		break;

	case 4:
		logOff(sessionUser, sessionRome2Rio);
		break;
		
	default:
		System.err.println("Invalid option! Exiting!");
		break;
	}	
	
}

public static void goMenu(User sessionUser, Rome2Rio sessionRome2Rio)
{

	System.out.println("####################################");
	System.out.println("####################################");
	System.out.println("#######                      #######");
	System.out.println("#######    --------------    #######");
	System.out.println("####### 	  Go to...       #######");
	System.out.println("#######    --------------    #######");
	System.out.println("#######                      #######");
	System.out.println("####################################");
	System.out.println("  3. AddLocations");
	System.out.println("####################################\n");

	System.out.println("\n What is your location? \n");
	Scanner sc = new Scanner(System.in); // object for scanner
	String orgin = sc.nextLine();
	System.out.println("\n Where do you want to go? \n");
	Scanner sc2 = new Scanner(System.in); // object for scanner
	String desti = sc.nextLine();

	//TODO

	
	
}

public static void addTransports(User sessionUser, Rome2Rio sessionRome2Rio)
{

	System.out.println("####################################");
	System.out.println("####################################");
	System.out.println("#######                      #######");
	System.out.println("#######    --------------    #######");
	System.out.println("#######    Add Transports    #######");
	System.out.println("#######    --------------    #######");
	System.out.println("#######                      #######");
	System.out.println("####################################");
	System.out.println("####################################\n");

	System.out.println("\n#Options");
	System.out.println("  1. Add Buses");
	System.out.println("  2. Add Trains");
	System.out.println("  3. Add Planes");
	System.out.println("  4. Go Back");

	int option = insertOption();

	switch (option) {
	case 1:
		addBus(sessionUser, sessionRome2Rio);
		break;

	case 2:
		addTrain(sessionUser, sessionRome2Rio);
		break;

	case 3:
		addPlane(sessionUser, sessionRome2Rio);
		break;

	case 4:
		mainMenu(sessionUser, sessionRome2Rio);
		break;
		
	default:
		System.err.println("Invalid option! Exiting!");
		break;
	}	
	
}

public static void addLocation(User sessionUser, Rome2Rio sessionRome2Rio)
{

	System.out.println("####################################");
	System.out.println("####################################");
	System.out.println("#######                      #######");
	System.out.println("#######    --------------    #######");
	System.out.println("####### 	Add Location     #######");
	System.out.println("#######    --------------    #######");
	System.out.println("#######                      #######");
	System.out.println("####################################");
	System.out.println("####################################\n");

	System.out.println("\n What is the city of your location? \n");
	Scanner sc = new Scanner(System.in); // object for scanner
	String city = sc.nextLine();
	System.out.println("\n What is the country of your location? \n");
	Scanner sc2 = new Scanner(System.in); // object for scanner
	String country = sc.nextLine();


	//TODO
	
}

public static void addBus(User sessionUser, Rome2Rio sessionRome2Rio)
{

	System.out.println("####################################");
	System.out.println("####################################");
	System.out.println("#######                      #######");
	System.out.println("#######    --------------    #######");
	System.out.println("####### 	  Add Bus        #######");
	System.out.println("#######    --------------    #######");
	System.out.println("#######                      #######");
	System.out.println("####################################");
	System.out.println("####################################\n");

	System.out.println("\n What is the ID? \n");
	Scanner sc = new Scanner(System.in); // object for scanner
	String id = sc.nextLine();
	System.out.println("\n What is the origin station? \n");
	Scanner sc2 = new Scanner(System.in); // object for scanner
	String oriBus = sc.nextLine();
	System.out.println("\n What is the destination station? \n");
	Scanner sc3 = new Scanner(System.in); // object for scanner
	String desBus = sc.nextLine();
	
	//TODO
	
	Bus b = new Bus(id, oriBus, desBus);
	
	sessionRome2Rio.addBus(b);

	
	
}

public static void addTrain(User sessionUser, Rome2Rio sessionRome2Rio)
{

	System.out.println("####################################");
	System.out.println("####################################");
	System.out.println("#######                      #######");
	System.out.println("#######    --------------    #######");
	System.out.println("#######      Add Train       #######");
	System.out.println("#######    --------------    #######");
	System.out.println("#######                      #######");
	System.out.println("####################################");
	System.out.println("####################################\n");

	System.out.println("\n What is the ID? \n");
	Scanner sc = new Scanner(System.in); // object for scanner
	String id = sc.nextLine();
	System.out.println("\n What is the origin station? \n");
	Scanner sc2 = new Scanner(System.in); // object for scanner
	String oriTrain = sc.nextLine();
	System.out.println("\n What is the destination station? \n");
	Scanner sc3 = new Scanner(System.in); // object for scanner
	String desTrain = sc.nextLine();

	//TODO
	
	Train t = new Train(id, oriTrain, desTrain);
		
	sessionRome2Rio.addTrain(t);

	
	
}

public static void addPlane(User sessionUser, Rome2Rio sessionRome2Rio)
{

	System.out.println("####################################");
	System.out.println("####################################");
	System.out.println("#######                      #######");
	System.out.println("#######    --------------    #######");
	System.out.println("####### 	  Add Plane      #######");
	System.out.println("#######    --------------    #######");
	System.out.println("#######                      #######");
	System.out.println("####################################");
	System.out.println("####################################\n");

	System.out.println("\n What is the ID? \n");
	Scanner sc = new Scanner(System.in); // object for scanner
	String id = sc.nextLine();
	System.out.println("\n What is the origin airport? \n");
	Scanner sc2 = new Scanner(System.in); // object for scanner
	String oriAirport = sc.nextLine();
	System.out.println("\n What is the destination airport? \n");
	Scanner sc3 = new Scanner(System.in); // object for scanner
	String desAirport = sc.nextLine();

	//TODO
	
	Plane p = new Plane(id, oriAirport, desAirport);
		
	sessionRome2Rio.addPlane(p);

	
	
}



//#############################################
//            HELPER FUNCTIONS
//############################################



public static User CreateUserAndAdd(Rome2Rio rome2Rio)
{
	System.out.println("\n What is your mail? \n");
	Scanner sc = new Scanner(System.in); // object for scanner
	String mail = sc.nextLine();
	System.out.println("\n What is your name? \n");
	Scanner sc2 = new Scanner(System.in); // object for scanner
	String name = sc.nextLine();
	System.out.println("\n What is your password? \n");
	Scanner sc3 = new Scanner(System.in); // object for scanner
	String pw = sc.nextLine();
	User user = new User(mail, name, pw); 
	rome2Rio.addUser(user);
	return user;
}

public static User logIn(Rome2Rio rome2Rio)
{
	System.out.println("\n What is your mail? \n");
	Scanner sc = new Scanner(System.in); // object for scanner
	String mail = sc.nextLine();
	System.out.println("\n What is your password? \n");
	Scanner sc2 = new Scanner(System.in); // object for scanner
	String pw = sc.nextLine();
	
	Iterator<User> iterator = rome2Rio.getUsers().iterator();
	while(iterator.hasNext()){
		User setElement = iterator.next();
		if(setElement.getEmail().equals(mail) && setElement.getPassword().equals(pw)) {
			return setElement;
		}
	}
	System.out.println("Invalid option! Exiting to welcome menu!");
	welcomeMenu(null, null);
	return null;
}



public static void logOff(User sessionUser, Rome2Rio sessionRome2Rio)
{
	sessionUser = null;
	sessionRome2Rio = null;
	welcomeMenu(sessionUser, sessionRome2Rio);
}
public static Rome2Rio povoar()
{
	Rome2Rio rome2RioDemo = new Rome2Rio();
	User demo = new User ("Demo@gmail.com", "demo", "bla");
	User demo2 = new User ("Demo2@gmail.com", "demo2", "bla");
	User demo3 = new User ("Demo3@gmail.com", "demo3", "bla");
	   Location l1 = new Location("Porto", "Portugal");
	   Location l2 = new Location("Madrid", "Spain");
	   Location l3 = new Location("Aveiro", "Portugal");
	   TrainStation ts1 = new TrainStation("Campanha", l1);
	   TrainStation ts2 = new TrainStation("Espinho", l2);
	   TrainStation ts3 = new TrainStation("Trindade", l1);
	   TrainStation ts4 = new TrainStation("Estarreja", l2);
	   Airport a1 = new Airport("Aeroporto do Porto", l1);
	   Airport a2 = new Airport("Aeroporto de Madrid", l2);
	   BusStation bs1 = new BusStation("Aliados", l1);
	   BusStation bs2 = new BusStation("IPO", l1);
	   BusStation bs3 = new BusStation("Santa Catarina", l1);
	   BusStation bs4 = new BusStation("Trindade", l1);
	   Bus b1 = new Bus(105L, bs1, bs2);
	   Bus b2 = new Bus(205L, bs3, bs4);
	   DateTime d1 = new DateTime(2018L, 12L, 30L, 20L, 30L);
	   DateTime d2 = new DateTime(2018L, 10L, 30L, 20L, 30L);
	   DateTime d3 = new DateTime(2018L, 12L, 30L, 21L, 30L);
	   Plane p1 = new Plane(101L, a1, a2);
	   Plane p2 = new Plane(100L, a2, a1);
	   User u1 = new User("danjoao@gmail.com", "Malhoa", "123");
	   User u2 = new User("diogohp@gmail.com", "Palhas", "simples");
	   Transport tr1 = new Transport(105L);
	   Transport tr2 = new Transport(101L);
	   Train t1 = new Train(76L, ts1, ts2);
	   Train t2 = new Train(66L, ts3, ts4);	
	
	rome2RioDemo.addUser(demo);
	rome2RioDemo.addUser(demo2);
	rome2RioDemo.addUser(demo3);
	rome2RioDemo.addBus(b1);
	rome2RioDemo.addBus(b2);
	rome2RioDemo.addPlane(p1);
	rome2RioDemo.addPlane(p2);
	rome2RioDemo.addTrain(t1);
	rome2RioDemo.addTrain(t2);
	rome2RioDemo.addUser(u1);;
	rome2RioDemo.addUser(u2);
	
	

	System.out.println("Please log in with user name: Demo \n)");
	return rome2RioDemo;
}
}