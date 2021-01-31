package com.knoldus.request
import com.knoldus.models.Company
import com.knoldus.request.CompanyImpl
import com.knoldus.validator.{CompanyValidator, EmailValidator}
import org.mockito.MockitoSugar.{mock, when}

class UnitTestCompany extends org.scalatest.AsyncFlatSpec {
  val comp= Company("Knoldus", "knoldus@gmail.com", "Noida")

  "A company " should " not already exist in database" in {
    val mockedCValidator = mock[CompanyValidator]
    when(mockedCValidator.companyIsValid(comp)) thenReturn true

    val compimpl = new CompanyImpl(mockedCValidator)

    val res = compimpl.createCompany(comp)
    assert(!(res.isEmpty))
  }
  it should "have a valid email id" in{
    val emailvalid=new EmailValidator
    assert(emailvalid.emailIdIsValid(comp.emailId))
  }
}