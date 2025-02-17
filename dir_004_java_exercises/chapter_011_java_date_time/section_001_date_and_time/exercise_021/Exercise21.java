import java.time.*;
public class Exercise21 {
   public static void main(String[] args)
    {
    ZoneId.SHORT_IDS.keySet().
    stream().forEach( 
    zoneKey ->System.out.println(" "+ ZoneId.of( ZoneId.SHORT_IDS.get( zoneKey ) ) +": "+ LocalDateTime.now(ZoneId.of(ZoneId.SHORT_IDS.get( zoneKey ) ) ) ) );
    }
}
