package entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Equipment {
  private Long id;
  private int numberOfSeats;
  private String description;
  private String tailNumber;
}
