package controllers;

import play.mvc.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */

    public Result index() {
        return ok(index.render());
    }
    
    public Result about() {
        return ok(about.render());
    }
    
    public Result contact() {
        return ok(contact.render());
    }
    
    public Result account() {
        return ok(account.render());
    }
    
    public Result desktops() {
        return ok(desktops.render());
    }
    
    public Result laptops() {
        return ok(laptops.render());
    }
    
    public Result televisions() {
        return ok(televisions.render());
    }
    

}
