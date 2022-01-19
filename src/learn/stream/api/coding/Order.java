package learn.stream.api.coding;

import java.time.LocalDate;
import java.util.Set;

public class Order {
	
	  private Long id;
	  private LocalDate orderDate;
	  private LocalDate deliveryDate;
	  private String status;
	  private Customer customer;
	  Set<Product> products;
}
