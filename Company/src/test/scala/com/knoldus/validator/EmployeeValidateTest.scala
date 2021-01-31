package com.knoldus.validator

import com.knoldus.db.EmployeeReadDto
import org.scalatest.FunSuite

class EmployeeValidateTest extends FunSuite {

  val employeeValidatorObject = new EmployeeValidator()
  val emailObject = new EmailValidator()
  val employeeObject = new EmployeeReadDto()
  test("Should return true if employee exists in database and emailID is valid") {
    assert(employeeValidatorObject.employeeIsValid(employeeObject.Employee1)===true && emailObject.emailIdIsValid(emailId = "arun.singh@knoldus.com")=== true)
  }
}