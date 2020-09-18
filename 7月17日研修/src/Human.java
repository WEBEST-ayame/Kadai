
class Human {
	private String name;
	private int height;
	private int weight;
	private int age;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	Human(String name,int height,int weight,int age){
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
	}
	public void introduce() {
		System.out.println("私の名前は" + name);
		System.out.println("身長" + height);
		System.out.println("体重" + weight);
		System.out.println("年齢" + age);
	}

}
