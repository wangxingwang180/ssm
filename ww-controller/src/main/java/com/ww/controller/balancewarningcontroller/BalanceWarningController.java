package com.ww.controller.balancewarningcontroller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ww.model.balanceWarning.BalanceWarning;
import com.ww.persist.mybatis.service.transaction.BalanceWarningService;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by wangxingwang on 2017/1/19.
 */
@Controller
@RequestMapping(value = "warning")
public class BalanceWarningController {
    @Autowired
    private BalanceWarningService balanceWarningService;

    /**
     * 测试
     * @return String
     */
    @RequestMapping(value = "/list.do")
    @ResponseBody
    public String getList() {
        PageHelper.startPage(1, 3);
        PageHelper.orderBy("update_time");
        List<BalanceWarning> list = balanceWarningService.selectList();
        PageInfo<BalanceWarning> pageInfo = new PageInfo<BalanceWarning>(list);
        JSONArray jsonArray = JSONArray.fromObject(list);
        return JSON.toJSONString(list);
    }
}
