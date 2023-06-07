package com.training.bean.domain;

public class StudentUser {
   private String name;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   @Override
   public String toString() {
      return "StudentUser{" +
              "name='" + name + '\'' +
              '}';
   }
}
