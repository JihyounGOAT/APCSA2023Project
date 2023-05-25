import java.util.Scanner;

public class Battleship {

		public int carrier;
		public int battleship;
		public int cruiser;
		public int submarine;
		public int destroyer;
		public static int[][] x;
		public static int[][] k;
		public static int count;
		public static int counts;
		
		public Battleship() {
			carrier = 1;
			battleship = 2;
			cruiser = 3;
			submarine = 4;
			destroyer = 5;
			count = 0;
			counts = 0;
		}


	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Hit as many ships as possible!");
	Battleship player1 = new Battleship();
	System.out.print("If player1, type in y: "); 
	String n = sc.nextLine();
	if(n.equals("y")) {
	System.out.println("player1:");
	player1.mapBoard();
	}
	System.out.print("\n \n \n \n");
	
	System.out.println("\n" + "player2:");
	Battleship player2 = new Battleship();
	System.out.print("If player2, type in j: "); 
	String k = sc.nextLine();
	if(k.equals("j")){
	player2.mapBoards();
	}
	System.out.print("\n \n \n \n \n \n");

	System.out.println("You both have 5 attempts to gain as many strikes as possible.");
	player1.earningPoints();
	System.out.println("Now it is player2's turn.");
	player2.earnPoints();
	if(count>counts) {
		System.out.println("PLayer 2 wins!");
	}
	else if(count<counts) {
		System.out.println("Player 1 wins!");
	}
	else {
		System.out.println("It is a tie");
	}
		
	}
public String getName(String theName) {
	return theName;
}
public int getCarrier(int carriers) {
	return carriers;
}
public int getCruiser(int cruisers) {			
	return cruisers;
}
public int getBattleShip(int battleships) {
	return battleships;
}
public int getSubmarine(int submarines) {
	return submarines;
}
public int getDestroyer(int destroyers) {
	return destroyers;
}


//code for board
public static void mapBoard() {
	Scanner sc = new Scanner(System.in);
	x = new int[7][7];
for(int row = 0; row < x.length; row++) {
	for(int col = 0; col<x[0].length; col++) {
		x[row][col] = 0;
		System.out.print(x[row][col]);
	}
			System.out.println();
}
	//carrier(number 1)
	System.out.println("What column do you want your carrier to be in 0-6?: ");
	int p = sc.nextInt();
	for(int i = 0; i<5; i++){
		x[p][i] = 1;
	}
	for(int row = 0; row < x.length; row++) {
	for(int col = 0; col<x[0].length; col++) {
		System.out.print(x[row][col]);
	}
			System.out.println();
}
//battleship(number 2)
System.out.println("What column do you want your battleship to be in instead of the input you put before 0-6: ");
int r = sc.nextInt();
for(int i = 0; i<4; i++){
		x[r][i] = 2;
	}
	for(int row = 0; row < x.length; row++) {
	for(int col = 0; col<x[0].length; col++) {
		System.out.print(x[row][col]);
	}
			System.out.println();
}
//cruiser(number 3)
System.out.println("What column do you want your cruiser to be in instead of the input you put before 0-6: ");
int d = sc.nextInt();
for(int i = 0; i<3; i++){
		x[d][i] = 3;
	}
	for(int row = 0; row < x.length; row++) {
	for(int col = 0; col<x[0].length; col++) {
		System.out.print(x[row][col]);
	}
			System.out.println();
}
//submarine(number 4)
System.out.println("What column do you want your submarine to be in instead of the input you put before 0-6: ");
int m = sc.nextInt();
for(int i = 0; i<2; i++){
		x[m][i] = 4;
	}
	for(int row = 0; row < x.length; row++) {
	for(int col = 0; col<x[0].length; col++) {
		System.out.print(x[row][col]);
	}
			System.out.println();
}
//destroyer(number 5)
System.out.println("What column do you want your destroyer to be in instead of the input you put before 0-6: ");
int w = sc.nextInt();
for(int i = 0; i<1; i++){
		x[w][i] = 5;
	}
	for(int row = 0; row < x.length; row++) {
	for(int col = 0; col<x[0].length; col++) {
		System.out.print(x[row][col]);
	}
			System.out.println();
}

	}
	public static void mapBoards() {
	Scanner sc = new Scanner(System.in);
	k = new int[7][7];
for(int rows = 0; rows < k.length; rows++) {
	for(int cols = 0; cols<k[0].length; cols++) {
		k[rows][cols] = 0;
		System.out.print(k[rows][cols]);
	}
			System.out.println();
}
	//carrier(number 1)
	System.out.println("What column do you want your carrier to be in 0-6?: ");
	int po = sc.nextInt();
	for(int t = 0; t<5; t++){
		k[po][t] = 1;
	}
	for(int rows = 0; rows < k.length; rows++) {
	for(int cols = 0; cols<k[0].length; cols++) {
		System.out.print(k[rows][cols]);
	}
			System.out.println();
}
//battleship(number 2)
System.out.println("What column do you want your battleship to be in instead of the input you put before 0-6: ");
int roar = sc.nextInt();
for(int lol = 0; lol<4; lol++){
		k[roar][lol] = 2;
	}
	for(int rows = 0; rows < k.length; rows++) {
	for(int cols = 0; cols<k[0].length; cols++) {
		System.out.print(k[rows][cols]);
	}
			System.out.println();
}
//cruiser(number 3)
System.out.println("What column do you want your cruiser to be in instead of the input you put before 0-6: ");
int doll = sc.nextInt();
for(int poll = 0; poll<3; poll++){
		k[doll][poll] = 3;
	}
	for(int rows = 0; rows < k.length; rows++) {
	for(int cols = 0; cols<k[0].length; cols++) {
		System.out.print(k[rows][cols]);
	}
			System.out.println();
}
//submarine(number 4)
System.out.println("What column do you want your submarine to be in instead of the input you put before 0-6: ");
int mo = sc.nextInt();
for(int iol = 0; iol<2; iol++){
		k[mo][iol] = 4;
	}
	for(int rows = 0; rows < k.length; rows++) {
	for(int cols = 0; cols<k[0].length; cols++) {
		System.out.print(k[rows][cols]);
	}
			System.out.println();
}
//destroyer(number 5)
System.out.println("What column do you want your destroyer to be in instead of the input you put before 0-6: ");
int win = sc.nextInt();
for(int won = 0; won<1; won++){
		k[win][won] = 5;
	}
	for(int rows = 0; rows < k.length; rows++) {
	for(int cols = 0; cols<k[0].length; cols++) {
		System.out.print(k[rows][cols]);
	}
			System.out.println();
}

	}
public static void mapPrintPlayer1() {
		for(int row = 0; row < x.length; row++) {
	for(int col = 0; col<x[0].length; col++) {
		if(x[row][col]<6 && x[row][col]>0) {
			System.out.print(0);
		}
		else{
		System.out.print(x[row][col]);
	}
	}
			System.out.println();

}
}


public static void mapPrintPlayer2() {
		for(int rows = 0; rows < k.length; rows++) {
	for(int cols = 0; cols<k[0].length; cols++) {
		if(k[rows][cols]<6 && k[rows][cols]>0) {
			System.out.print(0);
		}
		else{
		System.out.print(k[rows][cols]);
	}
	}
			System.out.println();

}
}

public static void earnPoints() {
	Scanner sc = new Scanner(System.in);
	int iop = 0;
	while(iop<5) {
	System.out.println("Player 2, which column do you wish to strike(0-6)?");
	int to = sc.nextInt();
	System.out.println("What row(0-6)?");
	int yo = sc.nextInt();
	iop++;
	if(x[to][yo] == 1 || x[to][yo] == 2 || x[to][yo] == 3 || x[to][yo] == 4 || x[to][yo] == 5) {
		x[to][yo] = 6;
	System.out.println("You hit it!");
	count++;
	}
	else {
		System.out.println("You missed.");
	}
		mapPrintPlayer1();
if(iop==5) {
	System.out.println("player 2 count is: " + count);
	break;
}
	}
}

public static void earningPoints() {
	Scanner sc = new Scanner(System.in);
	int io = 0;
	while(io<5) {
	System.out.println("Player 1, which column do you wish to strike(0-6)? ");
	int too = sc.nextInt();
	System.out.println("What row(0-6)?");
	int yoo = sc.nextInt();
	io++;
	if(k[too][yoo] == 1 || k[too][yoo] == 2 || k[too][yoo] == 3 || k[too][yoo] == 4 || k[too][yoo] == 5) {
		k[too][yoo] = 6;
	System.out.println("You hit it!");
	counts++;
	}
	else {
		System.out.println("You missed.");
	}
		mapPrintPlayer2();
if(io==5) {
	System.out.println("player 1 count is: " + counts);
	break;
}
	}
}	 
	
}




