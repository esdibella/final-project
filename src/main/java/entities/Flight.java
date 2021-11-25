package entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Flight {
  private Long id;
  private String departureDate;
  private String arrivalDate;
  private Long equipmentId;
  private Long depatureAirportId;
  private Long arrivalAirportId;
  private String description;
  
}
