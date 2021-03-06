package com.rent.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.rent.domain.BuyVO;
import com.rent.domain.RentVO;

@Repository("com.rent.mapper.RentMapper")
public interface RentMapper {
	
	//차량 등록
	public int rentCarInsert(RentVO rent) throws Exception;
	
	//차량 수정
	public int rentCarUpdate(RentVO rent) throws Exception;
	
	//차량 삭제
	public int rentCarDelete(RentVO rent) throws Exception;
	
	//차량 전체 목록
	public List<RentVO> rentList() throws Exception;
	
	//차량 상세 조회
	public RentVO rentDetail(String rent_id) throws Exception;
	
	//차 조건 검색
	//public List<RentVO> rentSelect(String 검색할것들) throws Exception;
	
	//buy테이블에서 차량 구매한적 있는지 찾는다
	public List<BuyVO> buyList() throws Exception;
	
	//구매한 차량 정보들을 buy 테이블에 넣는다.
	public int buyInsert(BuyVO buy) throws Exception;
}
