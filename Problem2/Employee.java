public class Employee {
	
	
	private int id;
	private String name;
	private long sal;
	private String loc;
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
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", loc=" + loc + "]";
	}
	public long getSal() {
		return sal;
	}
	public void setSal(long sal) {
		this.sal = sal;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public Employee(int id, String name, long sal, String loc) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.loc = loc;
	}

}
