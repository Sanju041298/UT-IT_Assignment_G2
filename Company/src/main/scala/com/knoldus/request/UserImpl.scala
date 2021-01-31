package com.knoldus.request

import com.knoldus.models.User
import com.knoldus.validator.UserValidator


class UserImpl (uservalidator: UserValidator) {

  def createUser(user: User): Option[String]={
    if(uservalidator.userIsValid(user)) Option(user.emailId)
    else None
  }
}
