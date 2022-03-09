package com.example.sodemo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "studentInfo")
@JsonInclude(Include.NON_NULL)
public class StudentInfo implements Serializable {

  private static final long serialVersionUID = 6873987079436896955L;
  String stName = null;
  private Map<String, Set<Books>> stBooks = new HashMap<String, Set<Books>>();

  public StudentInfo() {}
  
  public StudentInfo(String stName) {
    super();
    this.setDealerCode(stName);
  }

  @JsonCreator
  public StudentInfo(@JsonProperty("stName") String aStName,
      @JsonProperty("stBooks") Map<String, Set<Books>> aStBooks) {
    super();
    this.setDealerCode(aStName);
    this.setStBooks(aStBooks);
  }

  private void setStBooks(Map<String, Set<Books>> aStBooks) {
    this.stBooks = aStBooks;
  }

  public Map<String, Set<Books>> getStBooks() {
    return this.stBooks;
  }

  private void setDealerCode(String astName) {
    this.stName = astName;
  }

  public String getStName() {
    return this.stName;
  }

  @Override
  public String toString() {
    return "Student [StudentName=" + stName + "]";
  }
}
