package controllers;

import models.Products;
import play.*;
import play.api.templates.Html;
import play.mvc.*;
import scala.Product;
import views.html.*;
public class Application extends Controller {

    public static Result Showmain(Html Content) {
        return ok(main.render(Content));
    }

    public static Result index() {
        return Showmain(Home.render());
    }

    public static Result Pupat() {
        return Showmain(Pupat.render());
    }

    public static Result Profile() {
        return Showmain(Profile.render());
    }
    public static Result Showproduct(){
        Products guitar = new Products();
        Products drum = new Products();
        Products bass = new Products();
        Products eguitar = new Products();
        Products keyboard = new Products();
        Products mic = new Products();
        
            guitar.setId("001");
            guitar.setName("กีต้าโปร่ง");
            guitar.setBrand("gibson");
            guitar.setModel("J-45 Standard");
            guitar.setPrice(81000);
            guitar.setAmount(100);

            drum.setId("002");
            drum.setName("กลอง");
            drum.setBrand("yamaha");
            drum.setModel("tRydeen Drum Set with Hardware HW680 Set");
            drum.setPrice(23920);
            drum.setAmount(100);

            bass.setId("003");
            bass.setName("เบส");
            bass.setBrand("tSquier");
            bass.setModel("Deluxe Dimension Bass IV");
            bass.setPrice(13050);
            bass.setAmount(100);

            eguitar.setId("004");
            eguitar.setName("กีต้าไฟฟ้า");
            eguitar.setBrand("PRS SE");
            eguitar.setModel("Mark Tremonti Custom");
            eguitar.setPrice(23800);
            eguitar.setAmount(100);

            keyboard.setId("005");
            keyboard.setName("คีย์บอร์ด");
            keyboard.setBrand("Artesia");
            keyboard.setModel("PA-88H 88 Key Weighted Hammer Action Digital Piano");
            keyboard.setPrice(12900);
            keyboard.setAmount(100);

            mic.setId("006");
            mic.setName("ไมค์");
            mic.setBrand("AKG");
            mic.setModel("P4 Microphone");
            mic.setPrice(3750);
            mic.setAmount(100);
        
        return Showmain(Showproduct.render(guitar,drum,bass,eguitar,keyboard,mic));}
}