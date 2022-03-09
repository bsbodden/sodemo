package com.example.sodemo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonRootName(value = "books")
@JsonInclude(Include.NON_NULL)
public class Books implements Serializable {

  private static final long serialVersionUID = 1759477433483466736L;

  private String bookName = null;

  @JsonCreator
  public Books(@JsonProperty("bookName") String aBookName) {
    super();
    this.setBookName(aBookName);
  }

  public String getBookName() {
    return bookName;
  }

  private void setBookName(String aBookName) {
    this.bookName = aBookName;
  }

  public String toString() {
    return this.getBookName();
  }
}
