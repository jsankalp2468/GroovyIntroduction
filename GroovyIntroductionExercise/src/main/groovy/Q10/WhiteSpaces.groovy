package Q10

class WhiteSpaces {
    static void main(String[] args) {
        String s;
        File file = new File("src/main/resources/baseDir/FinalQ10")
        new File("src/main/resources/baseDir/Q10").eachLine {line->
            //s=line
           file << line.replaceAll("\\s","")
        }

        file.eachLine {line->
            println(line);
        }
    }
}

//Q) Write a method which removes all the white spaces in a file
// and writes the output to another file.
// Suppose white space characters are Space, Tab and Enter