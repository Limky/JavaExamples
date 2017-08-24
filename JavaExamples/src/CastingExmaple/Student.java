package CastingExmaple;

class Student extends Person{
    String grade;
    String department;
    String id;

    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Student(String name){
       super(name);
      }
    
}