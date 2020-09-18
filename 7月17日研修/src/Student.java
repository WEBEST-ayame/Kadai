
public class Student extends Human {
	private String birth;
	private String school;

	Student (String name,int height,int weight,int age, String birth, String school){
		super(name,height,weight,age);
		this.birth = birth;
		this.school = school;
	}


	public void setBirth(String birth) {
		this.birth = birth;
	}


	public void setSchool(String school) {
		this.school = school;
	}

	@Override
	public void introduce() {
		super.introduce();
		System.out.println("生年月日は" + birth + "です。");
		System.out.println("学校名は" + school + "です。");
	}

}
