import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import com.skillbox.airport.Flight.Type;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {

    System.out.println(findPlanesLeavingInTheNextTwoHours(Airport.getInstance()));

  }

  public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {
    //TODO Метод должден вернуть список рейсов вылетающих в ближайшие два часа.
    LocalTime currentTime = LocalTime.now();
    return airport.getTerminals().stream()
        .flatMap(terminal -> terminal.getFlights().stream())
        //.sorted(Comparator.comparing(Flight::getDate))
        .filter(flight -> flight.getType() == Type.DEPARTURE)
        .filter(flight -> flight.getDate().toInstant().atZone(ZoneId.systemDefault())
            .toLocalTime().isBefore(currentTime.plusHours(2)))
        .collect(Collectors.toList());
  }

}