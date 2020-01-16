package lab3.prob1;

public class PersonWithJob {
	private Person person;
	private double salary;

	public double getSalary() {
		return salary;
	}

	PersonWithJob(String name, double s) {
		this.person = new Person(name);
		salary = s;
	}

	@Override
	public boolean equals(Object aPerson) {
		if (aPerson == null)
			return false;
		if (!(aPerson instanceof PersonWithJob))
			return false;
		PersonWithJob p = (PersonWithJob) aPerson;
		boolean isEqual = this.getName().equals(p.getName()) && this.getSalary() == p.getSalary();
		return isEqual;
	}

	private String getName() {
		return this.person.getName();
	}

	public static void main(String[] args) {
		PersonWithJob p1 = new PersonWithJob("Joe", 30000);
		PersonWithJob p2 = new PersonWithJob("Joe", 30000);
		// As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
	}

}
