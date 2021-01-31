package com.knoldus.db

import org.scalatest.FunSuite

class CompanyReadDtoTest extends FunSuite(){

  val companyReadDtoObject = new CompanyReadDto()

  test("Should return true if Knoldus exist"){
    assert(companyReadDtoObject.getCompanyByName("Knoldus") != None)
  }

  test("Should return true if Philips exist"){
    assert(companyReadDtoObject.getCompanyByName("Philips") != None)
  }

  test("Should return false if Lenovo does not exist"){
    assert(companyReadDtoObject.getCompanyByName("Lenovo") === None)
  }
}