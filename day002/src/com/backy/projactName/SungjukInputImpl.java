package com.backy.projactName;

import java.util.Scanner;//java.util에 살고 있는 스캐너를 쓰려면 

public class SungjukInputImpl implements SungjukInput {
	Scanner scan = new Scanner(System.in);//필드변수. 메서드 모두가 쓸수있음. 사라질 타이밍 -> jvm이 판단하고 회수해감
	
	@Override
	public SungjukVO dataInput() {
		// TODO Auto-generated method stub
		SungjukVO sungjukVO = new SungjukVO();
		//키보드라는 장치를 준비
		//Scanner scan = new Scanner(System.in);
		sungjukVO.setHakbun( stringInput("학번") );
		sungjukVO.setIrum( stringInput("이름") );
		sungjukVO.setEng( intInput("영어점수") );
		sungjukVO.setKor( intInput("국어점수") );	
		int mat = intInput("수학점수");
		sungjukVO.setMat(mat);
		return sungjukVO;
	}
	private int intInput(String massage) {
//		Scanner scan = new Scanner(System.in);
		System.out.println(massage + "을[를] 입력하세요");
		return scan.nextInt();
	}
	private String stringInput(String massage) {
//		Scanner scan = new Scanner(System.in);
		String returnString = null;//참조형일 때 null, int 0, double 0.0 boolean false
		System.out.println(massage + "을[를] 입력하세요");
		returnString = scan.next();
		return returnString;
		
	}

}
