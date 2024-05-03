package com.dao;

import com.entity.GongzuoshenpiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GongzuoshenpiView;

/**
 * 工作审批 Dao 接口
 *
 * @author 
 */
public interface GongzuoshenpiDao extends BaseMapper<GongzuoshenpiEntity> {

   List<GongzuoshenpiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
