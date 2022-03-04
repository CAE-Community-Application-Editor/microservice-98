package i5.las2peer.services.res;


import java.net.HttpURLConnection;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

import i5.las2peer.api.Context;
import i5.las2peer.api.ManualDeployment;
import i5.las2peer.api.ServiceException;
import i5.las2peer.api.logging.MonitoringEvent;
import i5.las2peer.restMapper.RESTService;
import i5.las2peer.restMapper.annotations.ServicePath;
import i5.las2peer.services.res.database.DatabaseManager;
import java.sql.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Contact;
import io.swagger.annotations.Info;
import io.swagger.annotations.License;
import io.swagger.annotations.SwaggerDefinition;
import org.json.simple.*;

import java.util.HashMap;
import java.util.Map;
 

/**
 *
 * 98
 *
 * This microservice was generated by the CAE (Community Application Editor). If you edit it, please
 * make sure to keep the general structure of the file and only add the body of the methods provided
 * in this main file. Private methods are also allowed, but any "deeper" functionality should be
 * outsourced to (imported) classes.
 *
 */
@ServicePath("music")
@ManualDeployment
public class Res extends RESTService {


  /*
   * Database configuration
   */
  private String jdbcDriverClassName;
  private String jdbcLogin;
  private String jdbcPass;
  private String jdbcUrl;
  private static DatabaseManager dbm;



  public Res() {
	super();
    // read and set properties values
    setFieldValues();
        // instantiate a database manager to handle database connection pooling and credentials
    dbm = new DatabaseManager(jdbcDriverClassName, jdbcLogin, jdbcPass, jdbcUrl);
  }

  @Override
  public void initResources() {
	getResourceConfig().register(RootResource.class);
  }

  // //////////////////////////////////////////////////////////////////////////////////////
  // REST methods
  // //////////////////////////////////////////////////////////////////////////////////////

  @Api
  @SwaggerDefinition(
      info = @Info(title = "98", version = "",
          description = "",
          termsOfService = "",
          contact = @Contact(name = "", email = "CAEAddress@gmail.com") ,
          license = @License(name = "BSD",
              url = "https://github.com/CAE-Community-Application-Editor/microservice-98/blob/master/LICENSE.txt") ) )
  @Path("/")
  public static class RootResource {

    private final Res service = (Res) Context.getCurrent().getService();

      /**
   * 
   * methodname
   *
   * 
   * @param pathparam_name  a String
   * @param jsonpayload_name  a JSONObject

   * 
   * @return Response 
   * 
   */
  @GET
  @Path("/methodpath")
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.TEXT_PLAIN)
  @ApiResponses(value = {
       @ApiResponse(code = HttpURLConnection.HTTP_OK, message = "ok_name"),
       @ApiResponse(code = HttpURLConnection.HTTP_UNAUTHORIZED, message = "unauth_name")
  })
  @ApiOperation(value = "methodname", notes = " ")
  public Response methodname(@PathParam("pathparam_name") String pathparam_name, String jsonpayload_name) {
    JSONObject jsonpayload_name_JSON = (JSONObject) JSONValue.parse(jsonpayload_name);




     
    // service method invocations

     




    // ok_name
    boolean ok_name_condition = true;
    if(ok_name_condition) {
      JSONObject ok_res_name = new JSONObject();

      

      return Response.status(HttpURLConnection.HTTP_OK).entity(ok_res_name.toJSONString()).build();
    }
    // unauth_name
    boolean unauth_name_condition = true;
    if(unauth_name_condition) {
      JSONObject unauth_res_name = new JSONObject();

      

      return Response.status(HttpURLConnection.HTTP_UNAUTHORIZED).entity(unauth_res_name.toJSONString()).build();
    }
    return null;
  }

  /**
   * 
   * getSongs
   *
   * 
   * @param pl  a JSONObject
   * 
   * @return Response 
   * 
   */
  @GET
  @Path("/songs")
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.TEXT_PLAIN)
  @ApiResponses(value = {
       @ApiResponse(code = HttpURLConnection.HTTP_BAD_REQUEST, message = "br_name")
  })
  @ApiOperation(value = "getSongs", notes = " ")
  public Response getSongs(String pl) {
    JSONObject pl_JSON = (JSONObject) JSONValue.parse(pl);




     
    // service method invocations

     




    // resp
    boolean resp_condition = true;
    if(resp_condition) {
      JSONObject result = new JSONObject(); 
      result.put("test", "hallo");
      

      return Response.status(HttpURLConnection.HTTP_OK).entity(result.toJSONString()).build();
    }
    return null;
  }



  }

  // //////////////////////////////////////////////////////////////////////////////////////
  // Service methods (for inter service calls)
  // //////////////////////////////////////////////////////////////////////////////////////
  
  

  // //////////////////////////////////////////////////////////////////////////////////////
  // Custom monitoring message descriptions (can be called via RMI)
  // //////////////////////////////////////////////////////////////////////////////////////

  public Map<String, String> getCustomMessageDescriptions() {
    Map<String, String> descriptions = new HashMap<>();
    
    return descriptions;
  }

}
