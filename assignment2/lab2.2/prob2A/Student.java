package prob2A;

public class Student {
	private String name;
	private GradeReport gradeReport;
	
	public Student(String name, String grade) {
		this.name = name;
		gradeReport = new GradeReport(grade,this);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the gradeReport
	 */
	public GradeReport getGradeReport() {
		return gradeReport;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gradeReport=" + gradeReport + "]";
	}
	
	

}
