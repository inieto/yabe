package controllers;
 
import play.*;
import play.mvc.*;

@Check("admin")
@With(Secure.class)
public class Posts extends CRUD {
	/* The convention is to pluralize the model object name to create the corresponding controller.
	 * This way, Play will automatically find the associated model object for each controller. 
	 * If you need to use a different name, you can still use the @CRUD.For annotation */
}