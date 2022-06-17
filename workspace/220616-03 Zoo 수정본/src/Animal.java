
public class Animal {
	private String species;
	private int age;
	private int weight;
	private String meals;
	
	public Animal(String species, int age, int weight, String meals) {
		this.species = species;
		this.age = age;
		this.weight = weight;
		this.meals = meals;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getMeals() {
		return meals;
	}

	public void setMeals(String meals) {
		this.meals = meals;
	}

	@Override
	public String toString() {
		return "동물 [종 =" + species + ", 나이 =" + age + ", 몸무게 =" + weight + ", 주식 =" + meals + "]";
	}

	
	
}
// 어차피 종이라는 필드를 가지고 있기 때문에 이런 클래스는 굳이 필요없다.
//
//class Elephent extends Animal implements IHerbivores{
//
//	public Elephent(String species, int age, int weight) {
//		super(species, age, weight);
//	}
//}
//class Rabbit extends Animal implements IHerbivores{
//	
//	public Rabbit(String species, int age, int weight) {
//		super(species, age, weight);
//	}
//}
//
//class Lion extends Animal implements ICarnivores{
//
//	public Lion(String species, int age, int weight) {
//		super(species, age, weight);
//	}
//
//}
//class Wolf extends Animal implements ICarnivores{
//	
//	public Wolf(String species, int age, int weight) {
//		super(species, age, weight);
//	}
//	
//}
//
