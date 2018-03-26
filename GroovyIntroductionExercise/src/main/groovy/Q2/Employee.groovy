package Q2

import Q1.Person


class Employee extends Person{
    String ename;
    int empId;
    String company;
    long salary;
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setEmpId(1);
        employee.setCompany("TTN")
        employee.setSalary(500000)

        println("*********************************")

        println "Throug Getters"

        println employee.getEmpId()
        println employee.getCompany()
        println employee.getSalary()

        println("*********************************")

        println "Throug Dot"

        println employee.empId
        println employee.company
        println employee.salary

        println("*********************************")

        println "Throug @Annotation"

        println employee.@empId
        println employee.@company
        println employee.@salary

    }


    @Override
    public String toString() {
        return "${ename} is a man with id ${empId} who" +
                " lives at Delhi. He works for" +
                " Intelligrape with employee id 12" +
                " and draws \$\$\$\$\$\$\$ lots of money !!!!.";
    }
}


//Q) Extend the Person class in Groovy Add following fields to it:
// empId, company, salary
// Access the fields in all known ways:
// like through getter , by dot operator, by @ operator.