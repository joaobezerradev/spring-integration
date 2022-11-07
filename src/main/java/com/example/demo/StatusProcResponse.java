package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@AllArgsConstructor
@ToString
public class StatusProcResponse {
  private Integer id;
	private Integer heroId;
	private Integer power;
	private String nature;
}
