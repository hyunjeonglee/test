package test;

import java.sql.Timestamp;

public class test5 {
	private String id; //ù���ڴ� ������ ����
	private String pw; //4�ڸ��̻�
	private String name; //���ڸ� �Է�(�����Է½� ����)
	private int age; //1���̻� 100������
	private Timestamp reg;
	//set ������
	public void setId(String id){
		char c = id.charAt(0); //ù��° �ڸ�
		if(c>=48 || c<=57){ //�ƽ�Ű�ڵ� Ȱ��
			System.out.println("���ڰ� ù�����Դϴ�.");
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
			System.out.println("4�ڸ� �����Դϴ�.");
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
			char c = name.charAt(i); //�� �ڸ��� ������
			try{
				int a = Integer.parseInt(c+"");
				result = "���ڸ� �Է��ϼ̽��ϴ�(�̸� ���� ����)";
			}catch(Exception e){ //���ܹ߻� �� ����
				this.name=name;
			}
		}
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		if(age<=0 || age>100){
			age=1; //����Ʈ��
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
