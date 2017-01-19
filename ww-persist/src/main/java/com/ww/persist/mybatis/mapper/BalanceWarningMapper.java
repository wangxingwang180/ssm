package com.ww.persist.mybatis.mapper;

import com.ww.model.balanceWarning.BalanceWarning;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BalanceWarningMapper {

	BalanceWarning selectByCustomerId();
	
	int insert();
	
	List<BalanceWarning> selectList();
}
