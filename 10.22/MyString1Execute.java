
public class MyString1Execute {
//10.2 mystring execute
	
	public static void main(String[] args) {
		//mystring1
		MyString1 num = MyString1.valueOf(987654321L);
		System.out.println(num.toChars());
		MyString1 s = new MyString1("Test123");
		System.out.println(s.length());
		System.out.println(s.charAt(1));
		System.out.println(s.equals(new MyString1("Test123")));
		System.out.print(MyString1.valueOf(345).toChars());
	}
}
