import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main2 {
	public static void main(String[] args) throws JsonProcessingException {
		
		// 객체를 만들어서 불러오고 Json표현으로 나타낼 수 있다.
		Person hong = new Person("홍길동", 22);
		
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(hong);
		
		System.out.println(json);
		
		// 기본생성자가 있어야 이런식으로 나타 낼 수있다., 키 값과 객체의 필드이름이 같아야한다.
		String jsonString = "{\"name\":\"둘리\",\"age\":23}";
		Person dooli = mapper.readValue(jsonString,Person.class);
		
		System.out.println(dooli.getName());
		System.out.println(dooli.getAge());
	}
}
