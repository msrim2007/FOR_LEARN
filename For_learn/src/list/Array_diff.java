/*
 * 배열이랑 리스트 확인용
 */

package list;

import java.util.ArrayList;
import java.util.List;

public class Array_diff {

	public static void main(String[] args) {
		// 배열
		int[] arr = new int[3];
		
		// 리스트
		List<Integer> list = new ArrayList<Integer>();
		
		System.out.println("배열 초기화");
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		for (int i: arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("리스트 초기화");
		list.add(1);
		list.add(2);
		list.add(3);
		for (int i: list) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("2 삭제");
		arr[1] = 0;
		list.remove(1);
		
		System.out.println("2번째 인덱스 출력");
		System.out.println("배열의 2번째 인덱스 : " + arr[1]);
		System.out.println("리스트의 2번째 인덱스 : " + list.get(1));
		// 배열은 값만 지워지고 공간은 그대로, 리스트는 공간이 지워지며 인덱스가 땅겨짐.
	}
}
