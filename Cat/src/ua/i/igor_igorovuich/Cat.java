package ua.i.igor_igorovuich;

class Cat {
	private String name;
	private String color;
	private String breed;
	private double weight;
	private int age;

	public Cat(String name, String color, String breed, double weight, int age) {
		super();
		this.name = name;
		this.color = color;
		this.breed = breed;
		this.weight = weight;
		this.age = age;
	}

	public Cat() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void meow() {
		System.out.println("Meow! Meow!");
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", color=" + color + ", breed=" + breed + ", weight=" + weight + ", age=" + age
				+ "]";
	}

}
