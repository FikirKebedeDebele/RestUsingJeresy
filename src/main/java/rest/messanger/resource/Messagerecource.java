package rest.messanger.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import rest.messanger.model.Message;
import rest.messanger.service.MessageService;

@Path("/messages")
public class Messagerecource {
	MessageService messageservice = new MessageService();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages(@QueryParam("year") int year,
									@QueryParam("start") int start,
									@QueryParam("size") int size){
		if(year > 0)
			return messageservice.getAllMessageForYear(year);
		if(start >= 0 && size > 0)
			return messageservice.getAllMessagePagenated(start, size);
		return messageservice.getAllMessage();
	}
	@GET
	@Path("/{messageid}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("messageid")long messageid){
		return messageservice.getMessage(messageid);
	}
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message addMessage(Message message){
		return messageservice.addMessage(message);
	}
	@PUT
	@Path("/{messageid}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message uppdateMessage(@PathParam("messageid")long messageid, Message message){
		message.setId(messageid);
		return messageservice.uppdateMessage(message);
	}
	@DELETE
	@Path("/{messageid}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteMessage(@PathParam("messageid")long messageid){
		messageservice.removeMessage(messageid);
	}
}
