package com.example.sodemo;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@RedisHash(value = "StudentCache")
public class StudenCacheModel implements Serializable {
  private static final long serialVersionUID = 9174813592532123048L;

  @Id
  String userId;
  Student student;
}
