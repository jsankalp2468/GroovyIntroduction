package Q6

class PrintTable {
    static void main(String[] args){
        (1..10).each {
            print(3*it)
        }

        println()

        Closure three ={n->
            11.times {
                print(n*it)
            }
        }

        three(3);

        println()

        myThree(three)
    }

    static void myThree(three){
        three(3)
    }
}

//Q) Print multiple of 3 upto 10 terms in at least three different ways using groovy special methods