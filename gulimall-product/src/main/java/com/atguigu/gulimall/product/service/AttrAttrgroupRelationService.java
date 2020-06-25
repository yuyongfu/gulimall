package com.atguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author yf
 * @email 2224283506@qq.com
 * @date 2020-06-14 11:59:49
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

