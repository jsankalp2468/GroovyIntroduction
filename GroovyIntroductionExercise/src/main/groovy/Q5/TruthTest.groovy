package Q5

import java.awt.*

class TruthTest {
    static void main(String[] args) {
        if ('test'){
            println("'test' evaluted to true inside if")
        }
        if ("test"){
            println("\"test\" evaluted to true inside if")
        }
        if ("null"){
            println("\"null\" evaluted to true inside if")
        }
        if (null){
            println("null evaluated to true inside if")
        }
        if (100){
            println("100 evaluated to true inside if")
        }
        if (0){
            println("0 evaluated to true inside if")
        }
        List list = []
        if (list){
            println("empty list evaluated to true inside if")
        }
        list = ["sankalp","jain"]
        if (list){
            println("populated list evaluated true inside if")
        }
    }
}

// Q) Groovy Truth: if('test') { printlnn "test evaluated to true inside if" }
// try replacing test with various objects and observe its behaviour.

//"Test"
//'null'
//null
//100
//0
//empty list
//list with all vaues as null List list = new ArrayList()
//Write a class HourMinute where the class stores hours and minutes as separate fields. Overload + and - operator operator for this class
