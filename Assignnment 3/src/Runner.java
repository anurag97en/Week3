import java.util.Scanner;

public class Runner {


           	public static void main(String[] args) {


                          	
                    Scanner sc = new Scanner(System.in);
           	
                     //Part1 Command_Line1
                    int length = Ob1.A.length;
                    int[] N = new int[length];
                    for(int i=0; i<length; i++) {
                            N[i] = Ob1.A[i];
                          	}
                    Command_Line1.calData(N);
                    Command_Line1.displayData();
                          	
                          	
                    //Part 2 KeyRead_Line2
           	    	KeyRead_Line2 Ob1 = new KeyRead_Line2();
           	    	Ob1.read();
           	    	Ob1.display();
           	    	Ob1.sortArray();
           	    	Ob1.display();
           	    	Ob1.find();
                    Ob1.display();
					
					//Part 3 numberToWords
					System.out.println("Enter number to be converted to words: ");     	
                    int num=sc.nextInt();
           	    	Fig_to_words  ob = new FigToWords();
           	    	String result=ob.numberToWords(num);
           	    	System.out.println(result);
                          	
                          	
                   
                          	
           	}


}
