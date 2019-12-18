package dao;

public class Student {
	private String name;
	private String id;
	private String age;
	private String address;
    public Student() {
	}
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {

		this.id = id;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
		
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age  + ",address="+address+"]";
	}

}
