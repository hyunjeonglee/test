package test;

import java.sql.Timestamp;

public class test5 {
	private String id; //첫글자는 무조건 문자
	private String pw; //4자리이상
	private String name; //문자만 입력(숫자입력시 오류)
	private int age; //1세이상 100세이하
	private Timestamp reg;
	//set 값저장
	public void setId(String id){
		char c = id.charAt(0); //첫번째 자리
		if(c>=48 || c<=57){ //아스키코드 활용
			System.out.println("숫자가 첫글자입니다.");
		}else{
			this.id=id;
		}
	}
	public String getId(){
		return id;
	}
	public void setPw(String pw){
		int size = pw.length();
		if(size < 4){
			System.out.println("4자리 이하입니다.");
		}else{
			this.pw=pw;
		}
	}
	public String getPw(){
		return pw;
	}
	public void setName(String name){
		String result="";
		for(int i=0; i<name.length(); i++){
			char c = name.charAt(i); //각 자릿수 꺼내기
			try{
				int a = Integer.parseInt(c+"");
				result = "숫자를 입력하셨습니다(이름 저장 오류)";
			}catch(Exception e){ //예외발생 시 정상
				this.name=name;
			}
		}
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		if(age<=0 || age>100){
			age=1; //디폴트값
		}else{
		this.age=age;
		}
	}
	public int getAge(){
		return age;
	}
	public void setReg(Timestamp reg){
		this.reg=reg;
	}
	public Timestamp getReg(){
		return reg;
	}
	
}
