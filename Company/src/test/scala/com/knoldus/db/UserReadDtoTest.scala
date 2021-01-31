package com.knoldus.db
import org.scalatest.FunSuite
class UserReadDtoTest  extends FunSuite {
  val userReadDtoObject = new UserReadDto()

  test("Should return true if Arun exist"){
    assert(userReadDtoObject.getUserByName("sanjay") != None)
  }

  test("Should return true if Vinayak exist"){
    assert(userReadDtoObject.getUserByName("jeevan") != None)
  }

  test("Should return false if Sam does not exist"){
    assert(userReadDtoObject.getUserByName("bharat") === None)
  }
}
