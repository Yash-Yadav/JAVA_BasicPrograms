import java.util.*;
import java.lang.*;

class aStack{
	public static void main(String args[])
	{
		//Create a stack
		Stack<String> StackOfCards = new Stack<>();
		//Push new item to the stack
		StackOfCards.push("FriendNames");
		StackOfCards.push("Yash");
		StackOfCards.push("Preet");
		StackOfCards.push("Pravesh");
		StackOfCards.push("Jogendar");
		StackOfCards.push("Aman");
		System.out.println("Stack => "+ StackOfCards);
		System.out.println();
		String CardAtTop = StackOfCards.pop();
		System.out.println("Stack.pop => "+ CardAtTop);
		System.out.println("CurrentStack => "+ StackOfCards);
		System.out.println();
		CardAtTop = StackOfCards.peek();
		System.out.println("Stack.peek => "+ CardAtTop);
		System.out.println("CurrentStack => "+ StackOfCards);
		StackOfCards.push("Dummie");
		CardAtTop = StackOfCards.pop();
		System.out.println("Stack.pop => "+ CardAtTop);
		System.out.println(StackOfCards);
	}
}
