package com.backy.projactName;

public class SungjukMain {

	public static void main(String[] args) {//일을 시키는 client, caller 연산은 안해
		//자료입력
		SungjukInput input = new SungjukInputImpl();//구현하는 클래스Impl 
		SungjukVO vo = input.dataInput();
		SungjukCompute compute = new SungjukCompute();
		compute.avgCalcu(vo);
		SungjukOutput output = new SungjukOutputImpl();
		output.dataOutput(vo);
		
		
		
		
		
		
		
		/*
		SungjukInput input = new KeySungjukInput();//입력받을 놈을 데려와 일시킬 준비
		SungjukVO vo = input.dataInput();//데이터 받음
		SungjukCompute compute = new SungjukCompute();
		//compute.totalCalcu(vo);//계산해 리펙토링
		compute.avgCalcu(vo);//계산해
		
		SungjukOutput output = new ConsoleSungjukOutput();
		output.dataOutput(vo);*/
	}

}
