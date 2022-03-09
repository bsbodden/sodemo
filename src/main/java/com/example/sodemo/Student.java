package com.example.sodemo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonRootName(value = "student")
@JsonInclude(Include.NON_NULL)
public class Student implements Serializable {

  private static final long serialVersionUID = -2421290151039598746L;
  private Map<String, StudentInfo> studentData = new HashMap<String, StudentInfo>();

  @JsonCreator
  public Student(@JsonProperty("studentData") Map<String, StudentInfo> studentData) {
    super();
    this.setStudentData(studentData);
  }

  public void studentData(String aId, StudentInfo studentData) {
    this.studentData.put(aId, studentData);
  }

  public Map<String, StudentInfo> getStudentData() {
    return this.studentData;
  }

  private void setStudentData(Map<String, StudentInfo> studentData) {
    this.studentData = studentData;
  }
}
