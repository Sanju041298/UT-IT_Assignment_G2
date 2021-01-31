package com.knoldus.db

import com.knoldus.models.User

import scala.collection.immutable.HashMap

class UserReadDto {

  val User1: User = User("sanjay","rathore", 22,20000, "Software Trainee","Knoldus","sanjay.rathore@knoludc.com")
  val User2: User = User("jeevan","patidar", 24,32000, "Assistant Manager","Philips","jeevanpatidar@gmail.com")
  val User3: User = User("govind","Singh",25,80000,"System Engineer","Fyltbase","govindnagar@gmail.com")

  val users: HashMap[String, User] = HashMap("sanjay" -> User1, "jeevan" -> User2, "govind" -> User3)


  def getUserByName(name: String): Option[User] = users.get(name)


}

