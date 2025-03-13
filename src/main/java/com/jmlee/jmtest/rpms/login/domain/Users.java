package com.jmlee.jmtest.rpms.login.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Builder
@Getter
@Slf4j
public class Users {

	private String esntlId;				// 고유ID
	private String groupId;				// 그룹ID
	private String orgnztId;			// 조직ID
	private String emplyrId;			// 업무사용자ID
	private String userNm;				// 사용자명
	private String password;			// 비밀번호
	private String emplNo;				// 사원번호
	private String ihidnum;				// 주민등록번호
	private String sexdstnCode;			// 성별코드
	private String brthdy;				// 생일
	private String fxnum;				// 팩스번호
	private String houseAdres;			// 주택주소
	private String passwordHint;		// 비밀번호힌트
	private String passwordCnsr;		// 비밀번호정답
	private String houseEndTelno;		// 주택끝전화번호
	private String areaNo;				// 지역번호
	private String detailAdres;			// 상세주소
	private String zip;					// 우편번호
	private String offmTelno;			// 사무실전화번호
	private String mbtlnum;				// 이동전화번호
	private String emailAdres;			// 이메일주소
	private String ofcpsNm;				// 직위명
	private String clsfNm;				// 직급명
	private String houseMiddleTelno;	// 주택중간전화번호
	private String pstinstCode;			// 소속기관코드
	private String emplyrSttusCode;		// 사용자상태코드_COM013
	private String crtfcDnValue;		// 인증DN값
	private String sbscrbDe;			// 가입일자
	private String emplRegistSe;		// 사용자등록구분_CYL001
	private String passwordText;		// 비밀번호문구
	private String deptStopSyncYn;		// 부서 동기화 중단 여부
}