package com.spring.GuestController;

import com.spring.GuestEntity.Guest;
import com.spring.GuestRepository.GuestRepository;
import com.spring.dto.GuestDTO;
import com.spring.guestService.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/guests")
public class GuestController {

    @Autowired
    private GuestRepository grepository;

    @Autowired
    private GuestService service;


    @GetMapping("/getguests/{id}")
    public ResponseEntity<List<Guest>> getGeusts(@PathVariable int id) {

        List<Guest> listguests = grepository.findByPgid(id);
        return new ResponseEntity<>(listguests, org.springframework.http.HttpStatus.OK);
    }

    /*@GetMapping("/getguest/{gname}")
    public ResponseEntity<List<Guest>> getGuest(@PathVariable String gname){
        List<Guest> guest = grepository.findGByName(gname);
        return new ResponseEntity<>(guest, HttpStatus.OK);
    }
*/
    @GetMapping("/getguest/{gid}")
    public ResponseEntity<GuestDTO> getGuest(@PathVariable int gid){
        GuestDTO guest = service.getGuest(gid);
        if (guest != null) { return ResponseEntity.ok(guest); }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/addguests")
    public ResponseEntity<Guest> addGeust(@RequestBody Guest newGuest) {

        Guest newguest = grepository.save(newGuest);
        return new ResponseEntity<>(newguest, org.springframework.http.HttpStatus.OK);
    }

    //	@GetMapping("/sort/{field}")
//	public ResponseEntity<List<Guest>> guest(@PathVariable String field)
//	{
//	List<Guest> response=	grepository.findAll(Sort.by(Sort.Direction.ASC,field));
//		return new ResponseEntity<>(response,org.springframework.http.HttpStatus.OK);
//	}
    @GetMapping("/check")
    public String welCome(@RequestParam(value = "check", defaultValue = "hello"/*required = false*/) String check1) {
        return check1;
    }

}
