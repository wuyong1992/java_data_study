package Ood3;

public abstract class Person {
	
	String name;
	Integer age;
	String occupation;
	
	public Person() {
		super();
		System.out.println("这是父类");
	}

	public abstract void talk();

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", occupation=" + occupation + "]";
	}

}
