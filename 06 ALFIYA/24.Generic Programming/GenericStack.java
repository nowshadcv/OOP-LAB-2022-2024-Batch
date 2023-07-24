package Test;

public class GenericStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 {
			stack<Integer> s1 = new stack<Integer>(3);
			s1.push(10);
			s1.push(20);
			s1.push(30);
			System.out.println("s1 after pushing 10,20 and 30 :\n" + s1);
			s1.pop();
			System.out.println("s1 after pop :\n" + s1);
			stack<String> s2 = new stack<String>(3);
			s2.push("hello");
			s2.push("world");
			
			s2.push("java");
			System.out.println("\ns2 after pushing 3 elements :\n" + s2);
			System.out.println("s2 after pushing 4th element :");
			s2.push("GFG");
			
			stack<Float> s3 = new stack<Float>(2);
			s3.push(100.0f);
			s3.push(200.0f);
			System.out.println("\ns3 after pushing 2 elements :\n" + s3);
			System.out.println("top element of s3:\n"+ s3.top());
		

		}

	

	}

}
