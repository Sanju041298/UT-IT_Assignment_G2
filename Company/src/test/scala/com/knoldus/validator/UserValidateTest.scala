package com.knoldus.validator

import com.knoldus.db.UserReadDto
import com.knoldus.validator.{CompanyValidator, EmailValidator,UserValidator}
import org.scalatest.FunSuite

class UserValidateTest extends FunSuite {

  val userValidatorObject = new UserValidator()
  val emailObject = new EmailValidator()
  val userObject = new UserReadDto()
  test("Should return true if company exists in database and emailID is valid") {
    assert(userValidatorObject.userIsValid(userObject.User1)===true && emailObject.emailIdIsValid(emailId = "knoldus@gmail.com")=== true)
  }
}