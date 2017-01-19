package com.ww.persist.mybatis.mapper;

import org.springframework.stereotype.Repository;

import com.ww.model.balanceInfo.BalanceInfo;

@Repository
public interface BalanceInfoMapper {

	BalanceInfo selectByCustomerId();
	
	int insert();
}
