package com.resumeparser.model;

import com.fasterxml.jackson.databind.node.ArrayNode;

import lombok.Data;

@Data
public class Resume {
  private String name;
  private String email;
  private String phone;
  private ArrayNode skills;
  //private String image;
}
