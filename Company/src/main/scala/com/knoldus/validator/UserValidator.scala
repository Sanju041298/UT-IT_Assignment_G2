package com.knoldus.validator
import com.knoldus.db.CompanyReadDto
import com.knoldus.models.User

class UserValidator {
  val companyReadDtoOb =new CompanyReadDto()
  val emailValOb =new EmailValidator()

  def userIsValid(user: User): Boolean= {
    if (emailValOb.emailIdIsValid(user.emailId) && companyReadDtoOb.getCompanyByName(user.companyName)!= null)
      return true
    else
      return false
  }

}









