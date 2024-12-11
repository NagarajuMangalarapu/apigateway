package com.spring.guestService;

import com.spring.GuestEntity.Guest;
import com.spring.GuestRepository.GuestRepository;
import com.spring.dto.GuestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GuestService {

    @Autowired
    private GuestRepository grepository;

    @Transactional
    public GuestDTO getGuest(int gid){
        Guest guest  = grepository.getReferenceById(gid);
        GuestDTO dto = new GuestDTO();
        if (guest != null){
            dto.setGid(guest.getGid());
            dto.setPgid(guest.getPgid());
            dto.setGname(guest.getGname());
            return dto;
        }
        return null;
    }
}
