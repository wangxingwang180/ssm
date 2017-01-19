package com.ww.persist.mybatis.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ww.model.customer.CustomerInfo;

@Repository
public interface CustomerInfoMapper {

	CustomerInfo selectByEmail();
	
	int insertSelective();
	
	int updateByEmail();
	
	CustomerInfo getCustomerInfoById();
	
	List<CustomerInfo> getCustomerInfoByIds();
} 
