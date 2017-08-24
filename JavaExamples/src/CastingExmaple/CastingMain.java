package CastingExmaple;

public class CastingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Person p = new Student("학생 임경호");
         System.out.println(p.name); //오류없음
         
        // Student s = (Student) new Person("사람");
         
         
        // ((Student)p).grade = "A";
         
      
         // p.grade="A"; //오류 grade는 person의 멤버가 아니기 때문.
         // p.department="com"; //오류
         
       
         
	}

}
