import java.sql.SQLException;
import java.util.Arrays;

public class TestRestaurantDao {
	public static void main(String[] args) {
		RestaurantDao dao = new RestaurantDaoImpl();
		
		try {
//			int result = dao.create("우유", "0511234567", "부산진구");
//			System.out.println(result == 1);
		RestaurantDaoImpl impl = (RestaurantDaoImpl) dao;
		int[] result = impl.create(Arrays.asList(
				new Restaurant("배치1", "10100202", "배치주소1")
				,new Restaurant("배치2", "20200202", "배치주소2")
				,new Restaurant("배치3", "30300202", "배치주소3")
				,new Restaurant("배치4", "40400202", "배치주소4")
				));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
