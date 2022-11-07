package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class HeroRowMapper implements RowMapper<HeroProcResponse> {

  @Override
  public HeroProcResponse mapRow(ResultSet rs, int rowNum) throws SQLException {
    HeroProcResponse response = HeroProcResponse.builder().id(rs.getInt("id")).name(rs.getString("name")).build();
    System.out.println(response.toString());

    return response;
  }
}
