package com.wyx.test.study.Dao;

import com.wyx.test.study.Entity.MyRowMapper;
import com.wyx.test.study.Utils.ListUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class FyRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public Map<String,Object> getFyInfo(){
        String sql = "select fydm,fymc from fy_fyxx";
        List<Map<String,Object>> list =jdbcTemplate.query(sql,new MyRowMapper());
        return ListUtils.getMaps(list);
    }




}
