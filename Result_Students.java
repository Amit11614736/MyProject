import java.util.Scanner;
public class Result_Students {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name=sc.nextLine();
		System.out.println("Enter RollNumber: ");
		int rollNo=sc.nextInt();
		System.out.println("Enter Maths Marks: ");
		double math=sc.nextDouble();
		System.out.println("Enter Science Marks: ");
		double science=sc.nextDouble();
		System.out.println("Enter English Marks: ");
		double english=sc.nextDouble();
		double total=math+science+english;
		double average=(total/3);
		
		System.out.println("Student name: "+name+"\nRoll number: "+rollNo+"\nTotal marks of the student is: "+total+"\nAverage of Maths "+math+" Science "+science+" English "+english+" is: "+average);
	}
}
