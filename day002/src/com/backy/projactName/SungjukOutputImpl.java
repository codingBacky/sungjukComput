package com.backy.projactName;

public class SungjukOutputImpl implements SungjukOutput {

	@Override
	public void dataOutput(SungjukVO vo) {//void 반환하지 않겠다.
		System.out.println(vo);
	}

}
