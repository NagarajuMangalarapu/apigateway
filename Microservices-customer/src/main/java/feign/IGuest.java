package feign;
import java.util.List;

//import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
	
	
	//@FeignClient(name="details", url = "http://localhost:9008")
	public interface IGuest {
	
		@GetMapping("/getguests")
		List getstudentdetails();
	}

