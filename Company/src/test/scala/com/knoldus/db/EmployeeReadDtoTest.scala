package com.knoldus.db

import com.knoldus.db.EmployeeReadDto
import org.scalatest.FunSuite

class EmployeeReadDtoTest extends FunSuite(){

  val employeeReadDtoObject = new EmployeeReadDto()

  test("Should return true if Arun exist"){
    assert(employeeReadDtoObject.getEmployeeByName("sanjay") != None)
  }

  test("Should return true if Vinayak exist"){
    assert(employeeReadDtoObject.getEmployeeByName("jeevan") != None)
  }

  test("Should return false if Samar does not exist"){
    assert(employeeReadDtoObject.getEmployeeByName("bharat") === None)
  }
}