package com.stackroute.buzzup.test.repository;

import com.stackroute.buzzup.model.Theatre;
import com.stackroute.buzzup.repository.TheatreRepository;
import java.util.NoSuchElementException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@DataMongoTest
public class TheatreRepositoryTest {

	 @Autowired
	    private TheatreRepository theatreRepository;
	    private Theatre theatre;


	    @Before
	    public void setUp() throws Exception {
	        theatre = new Theatre();
	        String category[]= {};
	        String noOfSeats[]= {};
	        theatre.setEmailId("bunny114@gmail.com");
	        theatre.setTheaterId("Jhon123");
	        theatre.setTheaterName("Jhon Simon");
	        theatre.setTheaterCity("chennai");
	        theatre.setTheaterAddress("Johnson street");
	        theatre.setTheaterCategory(category);
	        theatre.setNoOfSeats(noOfSeats);
	        theatre.setNoOfScreen(4);
	    }

	    @After
	    public void tearDown() throws Exception {

	        theatreRepository.deleteAll();

	    }

	    @Test
	    public void registerTheatreTest() {

	        theatreRepository.insert(theatre);
	        Theatre fetchedtheatre = theatreRepository.findById("bunny114@gmail.com").get();
	        Assert.assertEquals(theatre.getTheaterId(), fetchedtheatre.getTheaterId());

	    }

	    @Test(expected = NoSuchElementException.class)
	    public void deleteTheatreTest() {
	        theatreRepository.insert(theatre);
	        Theatre fetchedtheatre = theatreRepository.findById("Jhon123").get();
	        Assert.assertEquals("123", fetchedtheatre.getTheaterId());
	        theatreRepository.delete(fetchedtheatre);
	        fetchedtheatre = theatreRepository.findById("123").get();

	    }

	    @Test
	    public void getTheatreByIdTest() {
	        theatreRepository.insert(theatre);
	        Theatre fetchedtheatre = theatreRepository.findById("bunny114@gmail.com").get();
	        Assert.assertEquals(theatre.getTheaterId(),fetchedtheatre.getTheaterId());

	    }
	}

