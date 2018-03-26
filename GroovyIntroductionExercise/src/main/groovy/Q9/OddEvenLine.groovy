package Q9

class OddEvenLine {
    public static void main(String[] args) {
        int i
        new File("src/main/resources/baseDir/Q9").eachLine {line->
            i=(int)line.charAt(0)
            if (i%2!=0){
                println(line)
            }
        }
    }
}

//Q) Combine content of all the files in a specific directory to another new file
//Create a file which contains all the odd numbered lines of a given file.
// Each line should be numbered at the beginning of line viz : 1, 3, 5.....