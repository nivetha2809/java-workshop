
import java.time.LocalTime;

public class RegistrationTimeLeft{
    public static void main(String[] args){
        LocalTime currenTime=LocalTime.now();
        LocalTime registrationEndTime = LocalTime.of(18, 59,59); 
        int hoursLeft = registrationEndTime.getHour() - currenTime.getHour();
        int minutesLeft = registrationEndTime.getMinute() - currenTime.getMinute();
        int secondsLeft = registrationEndTime.getSecond() - currenTime.getSecond();
        System.out.println("Time left for registration: " + hoursLeft + " hours, " + minutesLeft + " minutes, " + secondsLeft + " seconds");
    }
    }


    
    

