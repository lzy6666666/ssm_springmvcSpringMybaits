package com.tzhu.ssm.appcomm;

import com.tzhu.ssm.domain.GuanggaoExample;

import java.util.List;

/**
 * 工具类  ：想法，，，，
 */
public interface DAOExample {



    void setOrderByClause(String orderByClause);

    String getOrderByClause();

    void setDistinct(boolean distinct);

    boolean isDistinct();

    List<GuanggaoExample.Criteria> getOredCriteria();

    void or(GuanggaoExample.Criteria criteria);

    GuanggaoExample.Criteria or();

    GuanggaoExample.Criteria createCriteria();

    void clear();
}
