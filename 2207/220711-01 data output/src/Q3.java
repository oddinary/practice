import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

// 입력을 통한 파일 기록 목록, 1명 (번호로 선택해서) 1명 수정과 1명 삭제 하는 기능도 추가 해보자

class Info implements Serializable {
	private String name;
	private String phone;
	private String email;

	public Info(String name, String phone, String email) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Info [name=" + name + ", phone=" + phone + ", email=" + email + "]";
	}

}

public class Q3 {
	public static void main(String[] args) {
		Map<Integer, Info> map = new HashMap<>();
		File file = new File("d:\\jinho\\filetest\\info.txt");
		BufferedReader br = null;
		try {

			br = new BufferedReader(new FileReader(file));
			while (true) {
				int num = Integer.valueOf(br.readLine());
				String name = br.readLine();
				String phone = br.readLine();
				String email = br.readLine();

				Info s = new Info(name, phone, email);
				map.put(num, s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("1.정보 입력, 2.정보 출력, 3.정보 수정, 4.정보 삭제");
			int n = scan.nextInt();
			switch (n) {
			case 1: {
				System.out.println("정보입력");
				System.out.println("번호를 입력하세요");
				int num = scan.nextInt();
				if (map.containsKey(num))
					System.out.println("이미 있는 번호는 등록할 수 없어요");
				else {
					System.out.println("이름를 입력하세요");
					scan.nextLine();
					String name = scan.nextLine();
					System.out.println("전화번호를 입력하세요");
					String phone = scan.nextLine();
					System.out.println("이메일주소를 입력하세요");
					String email = scan.nextLine();
					map.put(num, new Info(name, phone, email));
					FileWriter fw = null;
					try {
						fw = new FileWriter(file, true);
						fw.write("\n");
						fw.write(num + "\n");
						fw.write(name + "\n");
						fw.write(phone + "\n");
						fw.write(email);
						fw.flush();
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						try {
							fw.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
				continue;
			}
			case 2: {

				System.out.println("정보출력");
				System.out.println("번호를 입력하세요");
				int num = scan.nextInt();
				System.out.println("전화번호는 : " + map.get(num).getPhone().toString());
				continue;
			}
			case 3: {
				System.out.println("정보수정");
				System.out.println("수정을 원하는 번호를 입력하세요");
				int num = scan.nextInt();
				System.out.println("이름를 입력하세요");
				scan.nextLine();
				String name = scan.nextLine();
				System.out.println("전화번호를 입력하세요");
				String phone = scan.nextLine();
				System.out.println("이메일주소를 입력하세요");
				String email = scan.nextLine();
				Info info = new Info(name, phone, email);
				map.put(num, info);

				try {
					FileWriter fw = new FileWriter(file);
					for (int i = 1; i <= map.size(); i++) {
						fw.write(i + "\n");
						fw.write(map.get(i).getName() + "\n");
						fw.write(map.get(i).getPhone() + "\n");
						fw.write(map.get(i).getEmail() + "\n");
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
				continue;
			}
			case 4: {
				System.out.println("정보삭제");
				System.out.println("번호를 입력하세요");
				int num = scan.nextInt();
				System.out.println(map.remove(num));
				try {
					FileWriter fw = new FileWriter(file);
					for (int i = 1; i < map.size(); i++) {
						fw.write(i + "\n");
						fw.write(map.get(i).getName() + "\n");
						fw.write(map.get(i).getPhone() + "\n");
						fw.write(map.get(i).getEmail() + "\n");
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
				continue;
			}
			case 5 : {
				for(int i = 1; i < map.size(); i++) {
					System.out.println(map.get(i).toString());
				}
				continue;
			}
			case 0: {
				System.out.println("종료합니다.");
				break;
			}
			default: {
				System.out.println("잘못 입력하셧습니다.");
				continue;
			}
			}
			break;
		}
	}
}
