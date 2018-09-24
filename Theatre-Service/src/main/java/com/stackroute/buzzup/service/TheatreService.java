package com.stackroute.buzzup.service;

import com.stackroute.buzzup.exception.TheatreAlreadyExistsException;
import com.stackroute.buzzup.exception.TheatreNotFoundException;
import com.stackroute.buzzup.model.Theatre;

public interface TheatreService {

	/*
	 * Should not modify this interface. You have to implement these methods in
	 * corresponding Impl classes
	 */

    Theatre registerTheatre(Theatre theatre)throws TheatreAlreadyExistsException ;
    
    boolean deleteTheatre(String theaterId) throws TheatreNotFoundException;

    Theatre updateTheatre(String theaterId, Theatre theatre) throws TheatreNotFoundException;

    Theatre getTheatreByemailId(String emailId) throws TheatreNotFoundException;
    
    /*Theatre getTheatreByCity(String city) throws TheatreNotFoundException;*/
}
