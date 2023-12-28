package com.example.pojo;

public class User {
  private Integer id;
  private Short age;
  private String name;
  private Short gender;
  private String phone;

  public User() {
  }

  public User(Integer id, String name, Short age, Short gender, String phone) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.phone = phone;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Short getAge() {
    return age;
  }

  public void setAge(Short age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String username) {
    this.name = username;
  }

  public Short getGender() {
    return gender;
  }

  public void setGender(Short gender) {
    this.gender = gender;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
}
