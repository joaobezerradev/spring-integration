package com.example.demo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ResponseDTO {
  private Integer id;
  private List<HeroProcResponse> heroes;
  private List<StatusProcResponse> statuses;
}



