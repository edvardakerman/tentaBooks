
public class Author {
	private String name;
	private int age;
	
	
	public Author(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// multiple konstrukur
	public Author() {
		this.name = "anonym";
		this.age = 0;	
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	

}
