//package dk.si.bpmn.service;
//
//import dk.si.bpmn.database.DatabaseClass;
//import dk.si.bpmn.model.Message;
//
//import java.util.*;
//
//public class MessageService {
//
//    private static Map<Long, Message> messages = DatabaseClass.getMessages();
//
//    public MessageService(){}
//
//    static {
//        messages.put(1L, new Message(1, "Hello World!", "Joerg"));
//        messages.put(2L, new Message(2, "Hello Europe!", "Steve"));
//    }
//
//    public List<Message> getAllMessages() {
//        return new ArrayList<Message>(messages.values());
//    }
//
//    public List<Message> getAllMessagesForYear(int year){
//        List<Message> messagesForYear = new ArrayList<>();
//        Calendar cal = Calendar.getInstance();
//        for(Message message : messages.values()) {
//            cal.setTime(message.getCreated());
//            if(cal.get(Calendar.YEAR) == year) {
//                messagesForYear.add(message);
//            }
//        }
//        return messagesForYear;
//    }
//
//    public List<Message> getAllMessagesPaginated(int start, int size) {
//        ArrayList<Message> list = new ArrayList<Message>(messages.values());
//        return list.subList(start, start + size);
//    }
//
//    public Message getMessage(long id) {
//        return messages.get(id);
//    }
//
//    public Message addMessage(Message message) {
//        message.setId(messages.size() + 1);
//        message.setCreated(new Date());
//        messages.put(message.getId(), message);
//        return message;
//    }
//
//    public Message updateMessage(Message message) {
//        if(message.getId() <= 0) {
//            return null;
//        }
//        messages.put(message.getId(), message);
//        return message;
//    }
//
//    public Message removeMessage(long id) {
//        return messages.remove(id);
//    }
//
//}
