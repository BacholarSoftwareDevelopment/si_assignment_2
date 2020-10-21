//package dk.si.bpmn.resources;
//
//import dk.si.bpmn.model.Message;
//import dk.si.bpmn.service.MessageService;
//
//import javax.ws.rs.*;
//import javax.ws.rs.core.MediaType;
//import java.util.List;
//
//@Path("/messages")
//@Consumes(MediaType.APPLICATION_JSON)
//@Produces(MediaType.APPLICATION_JSON)
//public class MessageResource {
//
//    MessageService messageService = new MessageService();
//
//    @GET
//    public List<Message> getMessages()
//    {
//        return messageService.getAllMessages();
//    }
//
//    @GET
//    @Path("/{messageId}")
//    public Message getMessage(@PathParam("messageId") long messageId) {
//        return messageService.getMessage(messageId);
//    }
//
//    @GET
//    @Path("/year/{year}")
//    public List<Message> getMessagesByYear(@PathParam("year") int year)
//    {
//        System.out.println(year);
//        return messageService.getAllMessagesForYear(year);
//    }
//
//    @GET
//    @Path("/{start}/{size}")
//    public List<Message> getMessagesBySize(@PathParam("start") int start, @PathParam("size") int size)
//    {
//        return messageService.getAllMessagesPaginated(start, size);
//    }
//
//
//    @POST
//    public Message addMessage(Message message) {
//        return messageService.addMessage(message);
//    }
//
//    @PUT
//    @Path("/{messageId}")
//    public Message updateMessage(@PathParam("messageId") long messageId, Message message) {
//        message.setId(messageId);
//        return messageService.updateMessage(message);
//    }
//
//    @DELETE
//    @Path("/{messageId}")
//    public void deleteMessage(@PathParam("messageId") long messageId) {
//        messageService.removeMessage(messageId);
//    }
//
//}
