package Q11

class CopyImage {
    static void main(String[] args) {
        File image = new File("src/main/resources/DemoGroovy.jpeg")
        new File("src/main/resources/copyImage.jpeg").withOutputStream {out->
            out.write(image.readBytes())
        }
        println("Successful!!")
    }
}

//Q) Make copy of an image type file byte by byte