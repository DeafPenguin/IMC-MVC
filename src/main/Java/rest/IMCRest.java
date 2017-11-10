package rest;
 
 import javax.ws.rs.GET;
 import javax.ws.rs.Path;
 import javax.ws.rs.Produces;
 import javax.ws.rs.QueryParam;
 
 @Path("/imcjaxrs")
 public class IMCRest {
 
 	@GET
 	@Path("/calcular")
 	@Produces("application/json")
 	public Calculo calcular(@QueryParam("peso") float peso, @QueryParam("altura") float altura) {
 	  Calculo c = new Calculo(peso, altura);
 	  c.calcular();
 	  return c;
 	}
 } 