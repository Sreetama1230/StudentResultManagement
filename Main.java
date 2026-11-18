
public class Main {

	public static void main(String[] args) {


		  Result student = new Result(
		            20, 30, 25, "John", 10
		        );

		        System.out.println(student.calculateResult());

		        System.out.println(
		            student.changeMarks(80, "subject3")
		        );
	}

}
