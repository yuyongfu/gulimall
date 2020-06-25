package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author yf
 * @email 2224283506@qq.com
 * @date 2020-06-14 11:59:49
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
