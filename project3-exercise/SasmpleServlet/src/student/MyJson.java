package student;

public class MyJson {
	private Student[] data;
	private String message;
	public MyJson(Student[] data, String message) {
		this.data = data;
		this.message = message;
	}
	
	public Student[] getData() {
		return data;
	}
	public void setData(Student[] data) {
		this.data = data;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
