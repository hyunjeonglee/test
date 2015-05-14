package jan06;

public class ArrayEx2 {

	public static void main(String[] args) {
		int sum=0; //총점
		float average=0f; //평균 //실수의 기본값은 double이라서 뒤에 f가 붙음
		
		int[] score = {100,88,100,100,90}; //5개의 방
		for(int i=0;i<score.length;i++){ //length => 방의 수
			sum += score[i];
		}
		average = sum / (float)score.length; //score가 int이기 때문에 float로 형변환
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+average);
	}

}
