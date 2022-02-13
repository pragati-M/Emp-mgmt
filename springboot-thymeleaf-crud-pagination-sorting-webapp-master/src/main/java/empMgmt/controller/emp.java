package empMgmt.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class emp {

@RequestMapping("/getname")

public String getName()
{
	return "Hello";

}

}


/*

import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation. RestController;


@RestController

controller

public class PersonController {

@RequestMapping"/getname")

public String getName() {


return "Kousik";

}
*/