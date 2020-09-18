

public class Shain extends Person {
	private String companyName;

	Shain (String name, int age, String companyName){
		super(name,age);
		this.companyName = companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public void showProfile() {
		super.showProfile();
		System.out.println("会社名は" + companyName + "です。");
	}
}
