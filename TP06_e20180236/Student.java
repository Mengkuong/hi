
public class Student {

	private int id;
	private String name;
	private String dob;
	private String contact;
	
	public Student() {
		this(0,"","","");
	}
	public Student(int _id , String _name, String _dob , String _contact){
		    setId(_id);
		    setName(_name);
		    setDob(_dob);
		    setContact(_contact);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
}
