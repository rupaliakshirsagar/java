package moduleprogram;

import java.util.Stack;

public class PgmStack {

	public static void main(String[] args) {
		Stack st=new Stack();
		st.add("Java");
		st.push("Python");
		st.push("C++");
		System.out.println(st.peek());//Give us Last in firt out element and do not remove that from stack
		System.out.println(st);
		System.out.println(st.pop());//Give us Last in firt out element and remove it from stack
		System.out.println(st);

	}

}
