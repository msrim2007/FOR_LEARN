/*
 * �迭�̶� ����Ʈ Ȯ�ο�
 */

package list;

import java.util.ArrayList;
import java.util.List;

public class Array_diff {

	public static void main(String[] args) {
		// �迭
		int[] arr = new int[3];
		
		// ����Ʈ
		List<Integer> list = new ArrayList<Integer>();
		
		System.out.println("�迭 �ʱ�ȭ");
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		for (int i: arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("����Ʈ �ʱ�ȭ");
		list.add(1);
		list.add(2);
		list.add(3);
		for (int i: list) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("2 ����");
		arr[1] = 0;
		list.remove(1);
		
		System.out.println("2��° �ε��� ���");
		System.out.println("�迭�� 2��° �ε��� : " + arr[1]);
		System.out.println("����Ʈ�� 2��° �ε��� : " + list.get(1));
		// �迭�� ���� �������� ������ �״��, ����Ʈ�� ������ �������� �ε����� ������.
	}
}
