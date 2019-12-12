package techgeeknext.rate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class RateController {
	
	@LoadBalanced
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/dashboard")
	public String GetTicketRate(@RequestParam int stationId, Model m) {
		
		TicketRate tr = restTemplate.getForObject("http://techgeeknext-rate-service/rate/" + stationId, TicketRate.class);
		m.addAttribute("rate", tr.getCurrentRate());
		return "dashboard";
	}
}
