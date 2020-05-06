import java.util.Arrays;
import java.util.Scanner;
//java class to read n numbers from key board and display all the numbers, sort the number, and do  search.
public class KeyRead_Line2

{

	Scanner sc = new Scanner(System.in);
	int no;
	int A[];
	int n;

	void read()

	{

		System.out.println("How many numbers to be entered");

		n = sc.nextInt();

		A = new int[n];

		System.out.println("Read the numbers into array");

		for (int i = 0; i < n; i++)

		{

			A[i] = sc.nextInt();

		}

	}

	void display()

	{

		System.out.println("Entered numbers into array");

		for (int i = 0; i < n; i++)

		{

			System.out.println(A[i]);

		}

	}

	void sortArray()

	{

		Arrays.sort(A);

	}

	void find()

	{

		System.out.println("Enter the number to be searched");

		int num = sc.nextInt();

		int flag = 0;

		for (int i = 0; i < n; i++)

		{

			if (A[i] == num)

			{

				flag = 1;

			}

		}

		if (flag == 0)

		{

			System.out.println("Number is not found");

		}

		else {

			System.out.println("Number is found");

		}

	}

}
