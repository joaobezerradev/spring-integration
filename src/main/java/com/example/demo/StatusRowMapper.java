package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StatusRowMapper implements RowMapper<StatusProcResponse> {

  @Override
  public StatusProcResponse mapRow(ResultSet rs, int rowNum) throws SQLException {
    return StatusProcResponse.builder()
        .id(rs.getInt("id"))
        .heroId(rs.getInt("hero_id"))
        .nature(rs.getString("nature"))
        .power(rs.getInt("power"))
        .build();
  }
}
