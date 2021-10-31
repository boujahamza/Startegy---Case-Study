import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		int number;
		Context context;
		Scanner obj = new Scanner(System.in);
		System.out.print("Total number of elements: ");
		number = obj.nextInt();
		int[] array = new int[number];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < number; i++) {
			array[i] = obj.nextInt(); // reads elements from the user
		}
		System.out.println("Array elements you entered are: ");
		System.out.print("{");
		for (int i = 0; i < number; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println("}");
		int choix;
		System.out.println("Menu:");
		System.out.println("Choose a sorting type:" + "\n" + " 1-Insertion sort" + "\n" + " 2-Quick sort" + "\n"
				+ " 3-Bubble sort" + "\n" + " 4-Merge sort" + "\n" + " 5-Quit");
		choix = obj.nextInt();
		TableauTest tableau = new TableauTest(array);
		switch (choix) {
		case 1:
			context = new Context(new InsertSort());
			context.arrange(tableau);
			break;
		case 2:
			context = new Context(new QuickSort());
			context.arrange(tableau);
			break;
		case 3:
			context = new Context(new BubbleSort());
			context.arrange(tableau);
			break;
		case 4:
			context = new Context(new MergeSort());
			context.arrange(tableau);
			break;
		case 5:
			break;
		default:
			System.out.println("Invalid choice!");
		}

		obj.close();

	}

}