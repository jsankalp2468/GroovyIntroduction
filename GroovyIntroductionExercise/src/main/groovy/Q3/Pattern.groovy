package Q3

class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in)
        def n = sc.nextInt()
        def i=1;
        n.times {
            (i).times {
                print "*"
            }
            i=i*2
            println()
        }
    }
}

//Print this pattern using groovy:


//*
//**
//****
//********
