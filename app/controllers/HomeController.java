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

         .   .=
       :\  > ~
      . ':  :  .-"  ^-. .~!
             ~            ~
     f                       /
    '                      >
    ~      .                \
    :   x^ ~                 ~
           '` ~'"            '
        '(  ' >` !
        '    4 ' '         :
        '" ~    ("(      :
        '            ""!
       ( .             '
        /               '
       4   ..:   .zMT!!!!?!+.
               !T!!!!!!!!!!!?T!!!!!!!!!!?T!+:.
            .!!!!!U!!!!!!!!!!!!!RX!!!!!!!!!!!!!!%.
           !!!!!!!!!M!!!!!!!!!!!!!R!!!!!!!!!!!!!!!!:
    .-.  :!!!!!!!!!!!M!!!!!!!!!!!!!?X!!!!!!!!!!!!!!!X
   >    R!!!!!!!!!!!!!!!!!!!!!!!!!!!!X!!!!!!!!!!!!!!UU
  ~ +!X!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!~  ^4!!!!!!XRX*"``-
 >/!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!x   '!!!!t!f  (    `
 T!!!!!!!!!!!!!!!!!!X!!!!!!!!!!!!!!!!!!!!?n  "XXR! '  )    >
t!!!!!!!!!!!!!!!!!HR!!!!!!!!!!!!!!!!!!!!!!!!!    '  .! ^~-~
!!!!!!!!!!!!!!!!M!!!!!!!!!!!!!!!!!!!!!!!!!!!!!     '  =---
'X!!!!!!!!!X*"  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
  "*XXX*""      'X!!!!!!!!!!!!!!!!!!XH@TTTTTTR:
                 ?!!!!!!!!!!!!!!!UT!!!!!!!!!!!!
                  "X!!!!!!!!!U@T!!!!!X@RMMMMMMML
                    'T*@@MT!!!!!!X@RMMMMMMMMMMMR
                     "X!!!!!XW@RMMMMMMMMMMMMMMMM
                       ?MMMMMMMMMMMMMMMMMMRMMMMM
                        9MMMMMMMMMMMMMMMM$MMMMMF
                        'MMMMMMMMMMMMMMM$MMMMM
                         4MMMMMMMMMMMMMMRMMMf      ..
                          MMMMMMMMMMMMMMRMMM    u!~:" `(
                          tMMMMMMMMMMMMMMMM :MM$F~~>    ':
                          'MMMMMMMMMMMMMM$RRMM$$X~~>      \
                           RMMMMMMMMMM@RMMMMMM$$B~~!       `
                           'MMMMMMMMRMMMMMMMMM$$$k~~L       ~
                            9MMMMMMMMMMMMMMMMMM$$$:~~>       :
                            M$MMMMMMMMMMMMMMMMM$$$$:~~:
                            MM$MMMMMMMMMMMMMMMMM$$$$L~~L      `
                           'MMMM$MMMMMMMMMMMMM**MM$$$k~~X
                           9MMMMMMRRRRf`          `"$$W~~!     `
                           @MMMMMMMMMM               "$$L~~\   '
                           MMMMMMMMMMM                  "*(::7"
                     u-. .'MMMMMMMMMME
                  z$$k>(9MMMMMMMMMMMM>
                 X#$$$$$@MMMMMMMMMMMM
                 '(?$$$$$BMMMMMMMMMMF
                   `(?$$$$$8MMMMMMMM
                     '(?R$$$$$$$$$$$
                        ~:~?#***#"~:

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
