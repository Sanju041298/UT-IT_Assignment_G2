package com.knoldus.validator
import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Company

class CompanyValidator {
  val companyReadDtoOb =new CompanyReadDto()
  val emailValOb = new  EmailValidator()

  def companyIsValid(company: Company): Boolean = {
    if(emailValOb.emailIdIsValid(company.emailId)&& companyReadDtoOb.getCompanyByName(company.name)!= null)
      return true
    else
      return false
  }
}
