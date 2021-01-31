package com.knoldus.validator
import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Employee

class EmployeeValidator {
  val companyReadDtoOb =new CompanyReadDto()
  val emailValOb = new  EmailValidator()

  def employeeIsValid(employee: Employee): Boolean = {
    if(emailValOb.emailIdIsValid(employee.emailId)&& companyReadDtoOb.getCompanyByName(employee.companyName)!= null)
      return true
    else
      return false

  }
}


