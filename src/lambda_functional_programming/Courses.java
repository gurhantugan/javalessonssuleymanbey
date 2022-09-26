package lambda_functional_programming;

public class Courses {
	
	private String season;
    private String courseName;
    private int averageScore;
    private int numberOfStudents;
    
    //1)Constructor without parameter
    public Courses() {
	}
    
    //2)Constructor with all parameters
    public Courses(String season, String courseName, int averageScore, int numberOfStudents) {
		this.season = season;
		this.courseName = courseName;
		this.averageScore = averageScore;
		this.numberOfStudents = numberOfStudents;
	}
    
    //3)getters() and setter()

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getAverageScore() {
		return averageScore;
	}

	public void setAverageScore(int averageScore) {
		this.averageScore = averageScore;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}
	
	//4)toString()
	@Override
	public String toString() {
		return "Course: Season=" + season + ", courseName=" + courseName + ", averageScore=" + averageScore
				+ ", numberOfStudents=" + numberOfStudents;
	}
}