package Q7

class ClosureExample {
    static void main(String[] s){
        List list = ["sankalp","jain"];

        Closure isContains = { a,b->
            b.each {
                if(it.equals(a)){
                    println(it+" Present in list "+ b );
                }
            }
        }

        isContains("sankalp",list)
    }
}

//Q) Write a closure which checks if a value is contained
// within a list where the closure accepts two parameters