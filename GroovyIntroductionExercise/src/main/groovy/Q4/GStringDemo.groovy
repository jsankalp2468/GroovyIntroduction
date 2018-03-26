package Q4

import Q2.Employee

class GStringDemo {
    static void main(String[] args){
        Employee employee = new Employee();
        employee.setEname("Sankalp")
        employee.setEmpId(2814)
        println(employee)
    }
}

//Q) GString... override the toString() of the Person class to return something like...
// "Sachin is a man aged 24 who lives at Delhi.
// He works for Intelligrape with employee id 12 and draws $$$$$$$ lots of money !!!!."
