/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package flightObjects;

/**
 *
 * @author Bruger
 */
public class FlightData {
    
    String startAirport;  // Start location
    String destAirport;   // End Location
    String liftoffDate;    //  Date of departure
    String arrivalDate;       // Date of arrival
    String carrier;      // Flight Company Name
    
    /**
     *
     * @param startAirport
     * @param destAirport
     * @param liftoffDate
     * @param arrivalDate
     * @param carrier
     */
    public FlightData(String startAirport, String destAirport, String liftoffDate, String arrivalDate, String carrier){
        
        this.startAirport = startAirport;
        this.destAirport = destAirport;
        this.liftoffDate = liftoffDate;
        this.arrivalDate = arrivalDate;
        this.carrier = carrier;
    }
    
    
    
}
