package exception;

public class Exception {
	public static void main(String[] args) {
		int a=5;
		try {
			int b=a/0;
		} catch (Throwable e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println("next");
			e.printStackTrace();
			
		}
	}

}
