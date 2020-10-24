package Step03_BFS_DFS;

import java.util.*;

public class StackEx {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		
		// 삽입(5) - 삽입(2) - 삽입(3) - 삽입(7) - 삭제() - 삽입(1) - 삽입(4) - 삭제()
		s.push(5); 	// 5
		s.push(2); 	// 2 5
		s.push(3); 	// 3 2 5
		s.push(7); 	// 7 3 2 5
		s.pop();	// 3 2 5
		s.push(1);	// 1 3 2 5
		s.push(4);	// 4 1 3 2 5
		s.pop();	// 1 3 2 5 
		
		// 스택의 최상단 원소부터 출력
		while(!s.empty()) {
			System.out.print(s.peek() + "");
			s.pop();
		}
	}
}
