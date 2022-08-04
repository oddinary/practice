import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

/*
 *  레스토랑 테이블에 대한 db엑세스를 수행하는 객체를 작성해 봅시다 작성 후 테스트!
 * 
 * 	메소드(입력값) : 반환값
 * 
 * 	C(상호명, 전화번호, 주소) throws SQLException
 *  R() : List<음식점>
 *  R(id) : 음식점
 *  U (id, 새 상호명, 새 전화번호, 새 주소) 행갯수 
 *  D (id) 행 갯수
 * 
 * ---------------------------------------------
 * 여러행의 음식점 추가
 * */
public class Drill {
	private RestaurantManage RM;

	public Drill(RestaurantManage RM) {
		this.RM = RM;
	}

	public void menu() {
		while (true) {
			System.out.println("식당관리 프로그램");
			System.out.println("1.목록, 2.검색 , 3.추가, 4.수정, 5.삭제, 0.종료");
			Scanner scan = new Scanner(System.in);

			int num = scan.nextInt();
			switch (num) {
			case 1:
				list();
				continue;
			case 2:
				search();
				continue;
			case 3:
				add();
				continue;
			case 4:
				update();
				continue;
			case 5:
				delete();
				continue;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			System.out.println("프로그램 종료");
			break;
		}
	}

	private void list() {
		try {
			List<Restaurant> list = RM.list();

			if (list.size() > 0) {
				for (Restaurant r : list) {
					System.out.println(r);
				}
			} else {
				System.out.println("음식점 데이터가 없습니다.");
			}
		} catch (SQLException e) {
			System.out.println("데이터를 읽어오는데 실패했습니다. 다시 시도해 보세요");
		}
	}

	private void search() {
		System.out.println("찾으려는 식당의 이름을 입력하세요");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();

		List<Restaurant> restaurants;

		try {
			restaurants = RM.select(name);
			if (restaurants.size() > 0) {
				for (Restaurant r : restaurants) {
					System.out.println(r);
				}
			} else {
				System.out.println("음식점 데이터가 없습니다.");
			}
		} catch (SQLException e) {
			System.out.println("데이터를 읽어오는데 실패했습니다. 다시 시도해 보세요");
		}
	}

	private void add() {
		System.out.println("추가하려는 식당의 갯수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		scan.nextLine();
		int count = 0;
		try {
			while (count < input) {
				System.out.println("추가하려는 식당의 이름, 전화번호, 주소를 순서대로 입력하세요");
				String name = scan.nextLine();
				String phone = scan.nextLine();
				String address = scan.nextLine();

				int result = RM.add(new Restaurant(name, phone, address));
				System.out.println(result + "개의 식당이 추가 되었습니다.");
				count++;
			}
			System.out.println("총 " + count + "개의 식당이 추가 되었습니다.");
		} catch (SQLException e) {
			System.out.println("데이터를 읽어오는데 실패했습니다. 다시 시도해 보세요");
			e.printStackTrace();
		}
	}

	private void update() {
		list();
		System.out.println("수정할 식당의 번호를 입력하세요.");
		Scanner scan = new Scanner(System.in);

		int id = scan.nextInt();
		scan.nextLine();
		System.out.println("수정할 이름을 입력하세요.");
		String name = scan.nextLine();
		System.out.println("수정할 번호를 입력하세요.");
		String phone = scan.nextLine();
		System.out.println("수정할 주소를 입력하세요.");
		String address = scan.nextLine();

		int result;
		try {
			result = RM.update(new Restaurant(id, name, phone, address));
			System.out.println(result + "행 수정완료");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public int delete() {
		list();
		System.out.println("삭제할 식당의 번호를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int id = scan.nextInt();
		try {
			int result = RM.delete(id);
			if (result > 0) {
				System.out.println(result + "개의 식당이 삭제 되었습니다.");
			} else {
				System.out.println("없는 번호입니다.");
			}
		} catch (SQLException e) {
			System.out.println("데이터를 읽어오는 과정이 실패했습니다. 다시 시도해주세요.");
		}
		return id;
	}

	public static void main(String[] args) {
		Drill app = new Drill(new RestaurantManage());
		app.menu();
	}
}
