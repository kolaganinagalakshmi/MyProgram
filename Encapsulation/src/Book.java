
public class Book {
	private String name;
	private Author auth;
	private Double price;
	private int qtyStock;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author getAuth() {
		return auth;
	}
	public void setAuth(Author auth) {
		this.auth = auth;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getQtyStock() {
		return qtyStock;
	}
	public void setQtyStock(int qtyStock) {
		this.qtyStock = qtyStock;
	}
	public static void main(String[] args) {
		Author auth=new Author();
		auth.setName("nagalakshmi");
		auth.setEmail("naga@gmail.com");
		auth.setGender('F');
		Book book=new Book();
		book.setName("JAVA");
		book.setAuth(auth);
		book.setPrice(100.50);
		book.setQtyStock(10);
		System.out.println("Author name: "+book.getAuth().getName()+"Book Name: "+book.getName());
	}

}
