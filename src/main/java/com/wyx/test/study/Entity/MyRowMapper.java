package com.wyx.test.study.Entity;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class MyRowMapper implements RowMapper<Map<String,Object>> {
    @Override
    public Map<String,Object> mapRow(ResultSet resultSet, int i) throws SQLException {
        Map<String,Object> map = new HashMap<>();
        map.put(resultSet.getObject("fydm").toString(),resultSet.getObject("fymc"));
        return map;
    }
}
