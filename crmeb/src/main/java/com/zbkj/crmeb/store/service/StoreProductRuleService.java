package com.zbkj.crmeb.store.service;

import com.common.PageParamRequest;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zbkj.crmeb.store.model.StoreProductRule;
import com.zbkj.crmeb.store.request.StoreProductRuleSearchRequest;

import java.util.List;

/**
* @author Mr.Zhang
* @description StoreProductRuleService 接口
* @date 2020-05-27
*/
public interface StoreProductRuleService extends IService<StoreProductRule> {

    List<StoreProductRule> getList(StoreProductRuleSearchRequest request, PageParamRequest pageParamRequest);
}
