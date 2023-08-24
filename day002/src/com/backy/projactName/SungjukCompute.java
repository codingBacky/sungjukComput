package com.backy.projactName;

public class SungjukCompute {
	public void totalCalcu(SungjukVO vo) {
		int total = vo.getEng() + vo.getKor() + vo.getMat();
		vo.setTot(total);
	}
	
	public void avgCalcu(SungjukVO vo) {
		totalCalcu(vo);//리펙토링
		vo.setAvg( vo.getTot() / 3.0 );
		}
}
