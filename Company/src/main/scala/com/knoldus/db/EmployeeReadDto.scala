package com.knoldus.db
import com.knoldus.models.Employee

import scala.collection.immutable.HashMap

class EmployeeReadDto {

  val Employee1: Employee = Employee("sanjay","rathore", 22,20000, "Software Trainee","Knoldus","sanjay@knoludc.com")
  val Employee2: Employee = Employee("jeevan","patidar", 24,32000, "Assistant Manager","Philips","jeevanpatidar@gmail.com")
  val Employee3: Employee = Employee("bharat","patidar",25,80000,"System Engineer","FlytBase","bharat.patidar@gmail.com")
  val employees: HashMap[String, Employee] = HashMap("sanjay" ->Employee1, "jeevan" -> Employee2, "bharat" -> Employee3)


  def getEmployeeByName(name: String): Option[Employee] = employees.get(name)

}
