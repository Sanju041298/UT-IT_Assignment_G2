package com.knoldus.request
import com.knoldus.models.{Company, Employee}
import com.knoldus.request.{CompanyImpl, EmployeeImpl}
import com.knoldus.validator.{CompanyValidator, EmailValidator, EmployeeValidator}
import org.mockito.MockitoSugar.{mock, when}

class UnitTestEmployee extends org.scalatest.AsyncFlatSpec {
  val emp= Employee("Bharat","patidar",25,80000,"System Engineer","Amazon","bharat.patidar@gmail.com")

  "An Employee's company name " should " present in database" in {
    val mockedEValidator = mock[EmployeeValidator]
    when(mockedEValidator.employeeIsValid(emp)) thenReturn true

    val empimpl = new EmployeeImpl(mockedEValidator)

    val res = empimpl.createEmployee(emp)
    assert(!(res.isEmpty))
  }
  "Employees email id " should "have a valid email address" in{
    val emailvalid=new EmailValidator
    assert(emailvalid.emailIdIsValid(emp.emailId))
  }
}
