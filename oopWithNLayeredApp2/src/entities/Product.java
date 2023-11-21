package entities;

public class Product {
	private String software;
	private String course;
	private int coursePrice;
	public Product(String course,String software,int coursePrice) {
		this.course=course;
		this.software=software;
		this.coursePrice=coursePrice;
		
	}
	public String getSoftware() {
		return software;
	}
	public void setSoftware(String software) {
		this.software = software;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getCoursePrice() {
		return coursePrice;
	}
	public void setCoursePrice(int coursePrice) {
		this.coursePrice = coursePrice;
	}
}
