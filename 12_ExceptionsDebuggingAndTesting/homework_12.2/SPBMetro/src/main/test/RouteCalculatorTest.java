import java.util.Map;
import java.util.TreeSet;
import src.java.RouteCalculator;
import src.java.StationIndex;
import src.java.core.Line;
import src.java.core.Station;
import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;

public class RouteCalculatorTest extends TestCase {

  List<Station> route;
  RouteCalculator calculator;
  StationIndex stationIndex;
  Map<Station, TreeSet<Station>> connections;

  @Override
  protected void setUp() throws Exception {
    route = new ArrayList<>();
    stationIndex = new StationIndex();
    Line line1 = new Line(1, "Красная");
    Line line2 = new Line(2, "Синяя");
    Line line3 = new Line(3, "Желтая");

    route.add(new Station("Петровская", line1));
    route.add(new Station("Арбузная", line1));
    route.add(new Station("Морковная", line2));
    route.add(new Station("Яблочная", line2));

    stationIndex.addLine(line1);
    stationIndex.addLine(line2);
    stationIndex.addLine(line3);

    stationIndex.addStation(new Station("первая", line1));
    stationIndex.addStation(new Station("вторая", line1));
    stationIndex.addStation(new Station("третья", line1));
    stationIndex.addStation(new Station("четвертая", line1));
    stationIndex.addStation(new Station("пятая", line2));
    stationIndex.addStation(new Station("шестая", line2));
    stationIndex.addStation(new Station("седьмая", line2));
    stationIndex.addStation(new Station("восьмая", line2));
    stationIndex.addStation(new Station("девятая", line3));
    stationIndex.addStation(new Station("десятая", line3));
    stationIndex.addStation(new Station("одиннадцатая", line3));

  }

  public void testCalculateDuration() {
    double actual = RouteCalculator.calculateDuration(route);
    double expected = 8.5;
    assertEquals(expected, actual);
  }

  public void testGetShortestRoute() {

    //calculator.getShortestRoute(route.get(1), route.get(5));
  }

  @Override
  protected void tearDown() throws Exception {

  }
}
