import java.util.Scanner;

public class logic_Q2 {

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Form :  (p O1 q) O2 r\nPossible choices are: and,or,xor,nand\nPlease enter O1:\n");
		String first_symbol = scanner.nextLine();
		System.out.println("Please enter O2");
		String second_symbol = scanner.nextLine();
		System.out.print("p\t|q\t|p "+ first_symbol +" q|r\t|(p "+ first_symbol +" q) "+ second_symbol + " r\n");
		//declare the integer value will be used in looping
		int pq;
		int pqr;
		//Start for looping the boolean value (0 is false,1 is true)
		for ( int p=0; p<=1; p++ ) 
			for ( int q=0; q<=1; q++ )
				for ( int r=0;r<=1;r++)
				{
					pq = 0;
					pqr =0;
					//set condition of pq
					if (first_symbol.equalsIgnoreCase("and") && p ==1 && q==1) 
						pq = 1;
					if (first_symbol.equalsIgnoreCase("or") && (p ==1 || q==1)) 
						pq = 1;
					if (first_symbol.equalsIgnoreCase("xor") && (p != q)) 
						pq = 1;
					if (first_symbol.equalsIgnoreCase("nand") && !(p*q == 1)) 
						pq =1;
					// set condition for the required form
					if (second_symbol.equalsIgnoreCase("and") && pq ==1 && r==1)
						pqr =1;
					if (second_symbol.equalsIgnoreCase("or") && (pq ==1 || r==1))
						pqr =1;
					if (second_symbol.equalsIgnoreCase("xor") && (pq != r))
						pqr =1;
					if (second_symbol.equalsIgnoreCase("nand") && !(pq*r == 1))
						pqr =1;
					// format the output as a formatted table
					if (first_symbol.length()==2)
						System.out.printf("%d\t|%d\t|%-6d|%d\t|%-16d\n",p,q,pq,r,pqr);
					if (first_symbol.length()==3)
						System.out.printf("%d\t|%d\t|%-7d|%d\t|%-16d\n",p,q,pq,r,pqr);
					if (first_symbol.length()==4)
						System.out.printf("%d\t|%d\t|%-8d|%d\t|%-16d\n",p,q,pq,r,pqr);
				}
	}

}
