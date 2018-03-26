package Q8

class Copy {
    static void main(String[] args) {
        def file = new File("src/main/resources/baseDir");
        File file2 = new File("src/main/resources/baseDir/final.txt")
        file.eachFileMatch(~/.*\.txt/) {file1->
            file2<<file1.text
        }
        println(file2.text);
    }
}

//Q) Combine content of all the files in a specific directory to another new file
