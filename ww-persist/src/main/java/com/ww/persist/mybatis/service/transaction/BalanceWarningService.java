package com.ww.persist.mybatis.service.transaction;

import com.ww.model.balanceWarning.BalanceWarning;
import com.ww.persist.mybatis.mapper.BalanceWarningMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wangxingwang on 2017/1/19.
 */
@Service
public class BalanceWarningService {
    @Autowired
    private BalanceWarningMapper balanceWarningMapper;

    public List<BalanceWarning> selectList() {
        List<BalanceWarning> list = balanceWarningMapper.selectList();
        return list;
    }
}
