package jan06;

public class ArrayEx2 {

	public static void main(String[] args) {
		int sum=0; //����
		float average=0f; //��� //�Ǽ��� �⺻���� double�̶� �ڿ� f�� ����
		
		int[] score = {100,88,100,100,90}; //5���� ��
		for(int i=0;i<score.length;i++){ //length => ���� ��
			sum += score[i];
		}
		average = sum / (float)score.length; //score�� int�̱� ������ float�� ����ȯ
		System.out.println("���� : "+sum);
		System.out.println("��� : "+average);
	}

}
