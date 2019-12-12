package techgeeknext.rate;

import java.math.BigDecimal;
import java.time.Instant;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketRateController {
	
	@RequestMapping("/rate/{stationId}")
	public TicketRate GetTicketRate(@PathVariable int stationId) {
		
		TicketRate ticketRate;
		
		System.out.println("Station Id : " + stationId);
		
		switch(stationId) {
		case 1:
			ticketRate = new TicketRate(stationId, new BigDecimal("0.32"), Instant.now().toString());
			break;
		case 2:
			ticketRate = new TicketRate(stationId, new BigDecimal("1.02"), Instant.now().toString());
			break;
		case 3:
			ticketRate = new TicketRate(stationId, new BigDecimal("0.40"), Instant.now().toString());
			break;
		default:
			ticketRate = new TicketRate(stationId, new BigDecimal("1.00"), Instant.now().toString());
			break;
		}
		
		return ticketRate;
	}
}