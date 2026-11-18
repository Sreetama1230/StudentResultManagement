
public class Student {

	private String name;
	private int studentClass;
	private float result;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(int studentClass) {
		this.studentClass = studentClass;
	}

	public float getResult() {
		return result;
	}

	public void setResult(float result) {
		this.result = result;
	}

	public Student() {
		super();
	}

	public Student(String s, int sClass) {
		
		super();
		this.name = s;
		this.studentClass = sClass;
		System.out.println("Added student: {" + s + "} to the roll of class: {" + sClass + "}");
	}

	public String publish(float res) {
		this.result = res;
		if (res >= 33.33f) {
			return "{" + this.getName() + "} has been promoted to class: {" + (this.getStudentClass() + 1) + "}";

		} else {
			return "{" + this.getName() + "} has been retained in class: {" + this.getStudentClass() + "}";
		}

	}

}
