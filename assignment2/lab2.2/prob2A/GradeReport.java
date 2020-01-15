package prob2A;

public class GradeReport {
	
	private String grade;
	private Student student;	
	GradeReport(String grade, Student student){
		this.grade = grade;
		this.student = student;
	}
	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}

	@Override
	public String toString() {
		return "grade=" + grade ;
	}

	/**
	 * @return the student
	 */
	public Student getStudent() {
		return student;
	}

}
