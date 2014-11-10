/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.dtu;

import flightObjects.FlightDataCreator;
import flightObjects.FlightListData;
import java.math.BigDecimal;
import java.util.Date;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import java.util.ArrayList;

/**
 *
 * @author Bruger
 */
// Halv pseudo / slam
@Path("Airline")
public class AirlineResource {

    static String name = "Flight Name";
    static ArrayList<FlightListData> mockData = FlightDataCreator.getFlightListData();

    @GET
    public String getFlight(String startAirport, String destAirport, Date liftoffDate) {

        // Husk at ændre return værdi
        return name;
    }

    @PUT
    public void bookFlight(String bookingNumber, int creditcardInfo) {
    }

    @DELETE
    public void cancelFlight(String bookingNumber, BigDecimal price, int creditcardInfo) {
    }
}
