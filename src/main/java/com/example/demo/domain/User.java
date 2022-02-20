package com.example.demo.domain;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "userList", schema = "public")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "username")
  private String name;

  private String email;

  @Column(name = "resource_manager")
  private String resourceManagerName;

  private String primarySkill;


  public User() {

  }

  public Integer getId() {

    return id;
  }

  public void setId(Integer id) {

    this.id = id;
  }

  public String getName() {

    return name;
  }

  public void setName(String name) {

    this.name = name;
  }

  public String getEmail() {

    return email;
  }

  public void setEmail(String email) {

    this.email = email;
  }

  public String getResourceManagerName() {

    return resourceManagerName;
  }

  public void setResourceManagerName(String resourceManagerName) {

    this.resourceManagerName = resourceManagerName;
  }

  public String getPrimarySkill() {

    return primarySkill;
  }

  public void setPrimarySkill(String primarySkill) {

    this.primarySkill = primarySkill;
  }

}
