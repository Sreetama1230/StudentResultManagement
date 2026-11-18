
public class Result extends Student {
	private Integer subject1;
	private Integer subject2;
	private Integer subject3;

	public Integer getSubject1() {
		return subject1;
	}

	public void setSubject1(Integer subject1) {
		this.subject1 = subject1;
	}

	public Integer getSubject2() {
		return subject2;
	}

	public void setSubject2(Integer subject2) {
		this.subject2 = subject2;
	}

	public Integer getSubject3() {
		return subject3;
	}

	public void setSubject3(Integer subject3) {
		this.subject3 = subject3;
	}

	public Result() {
		super();
	}

	public Result(int a, int b, int c, String s, int sClass) {
		super(s, sClass);
		this.subject1 = a;
		this.subject2 = b;
		this.subject3 = c;
		System.out.println("{" + s + "} obtained {" + a + "} marks in subject1");
		System.out.println("{" + s + "} obtained {" + b + "} marks in subject2");
		System.out.println("{" + s + "} obtained {" + c + "} marks in subject3");

	}

	public String calculateResult() {
		float result = (subject1 + subject2 + subject3) / 3.0f;
		return publish(result);
	}

	public String changeMarks(int newMarks, String subject) {
		String str = "";

		if (subject.equals("subject1")) {
			this.subject1 = newMarks;
			str = "{" + super.getName() + "} has ordered a recheck in {subject1}";
		}

		if (subject.equals("subject2")) {
			this.subject2 = newMarks;
			str = "{" + super.getName() + "} has ordered a recheck in {subject2}";

		}

		if (subject.equals("subject3")) {
			this.subject3 = newMarks;
			str = "{" + super.getName() + "} has ordered a recheck in {subject3}";

		}
		System.out.println(str);

		return "Following is the new result: " + calculateResult();
	}
}
