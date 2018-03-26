package Q5

class HoursMinutes {
    HoursMinutes() {
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.format("HH").toInteger()
        int minute = calendar.format("mm").toInteger()
        println("Hour Before Increment "+hour+" "+minute)
        println("After Inrcement : ")
        println("Hour : "+hourIncrement(hour+48))
        println("Minute : "+minuteIncrement(minute+120))

    }

    int hourIncrement(int hour){

        if(hour>24){
            hour-=24;
            hourIncrement(hour)
        }
        else{
            hour++;
            return hour
        }

    }

    int minuteIncrement(int min){

        if(min>60){
            min-=60
            minuteIncrement(min)
        }
        else {
            min++;
            return min
        }
    }

    static void main(String[] args) {
        new HoursMinutes();
    }
}
