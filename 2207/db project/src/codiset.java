
public class codiset {
	private int id;
	private String top;
	private String top2;
	private String bottom;
	private String shoes;
	private String bag;
	private String acc1;
	private String acc2;
	private String acc3;
	private String user_Id;
	private String tag_theme;

	public codiset(int id, String product1,  String product3, String product4, String product5, String product6,
			String user_id2, String tag_theme2) {
		super();
		this.id = id;
		this.top = product1;
		this.bottom = product3;
		this.shoes = product4;
		this.bag = product5;
		this.acc1 = product6;
		this.user_Id = user_id2;
		this.tag_theme = tag_theme2;
	}

	public codiset(int id, String product1, String product2, String product3, String product4, String product5, String product6,
			String product7, String product8, String user_id2, String tag_theme2) {
		super();
		this.id = id;
		this.top = product1;
		this.top2 = product2;
		this.bottom = product3;
		this.shoes = product4;
		this.bag = product5;
		this.acc1 = product6;
		this.acc2 = product7;
		this.acc3 = product7;
		this.user_Id = user_id2;
		this.tag_theme = tag_theme2;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBottom() {
		return bottom;
	}

	public void setBottom(String bottom) {
		this.bottom = bottom;
	}

	public String getShoes() {
		return shoes;
	}

	public void setShoes(String shoes) {
		this.shoes = shoes;
	}

	public String getBag() {
		return bag;
	}

	public void setBag(String bag) {
		this.bag = bag;
	}

	public String getAcc1() {
		return acc1;
	}

	public void setAcc1(String acc1) {
		this.acc1 = acc1;
	}

	public String getTag_theme() {
		return tag_theme;
	}

	public void setTag_theme(String tag_theme) {
		this.tag_theme = tag_theme;
	}

	@Override
	public String toString() {
		return "codiset [id=" + id + ", top=" + top + ", top2=" + top2 + ", bottom=" + bottom + ", shoes=" + shoes
				+ ", bag=" + bag + ", acc1=" + acc1 + ", acc2=" + acc2 + ", acc3=" + acc3 + ", user_Id=" + user_Id
				+ ", tag_theme=" + tag_theme + "]";
	}

}
