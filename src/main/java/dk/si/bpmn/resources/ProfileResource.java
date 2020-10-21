//package dk.si.bpmn.resources;
//
//
//import dk.si.bpmn.model.Profile;
//import dk.si.bpmn.service.ProfileService;
//
//import javax.ws.rs.*;
//import javax.ws.rs.core.MediaType;
//import java.util.List;
//
//@Path("/profiles")
//@Consumes(MediaType.APPLICATION_JSON)
//@Produces(MediaType.APPLICATION_JSON)
//public class ProfileResource {
//
//    private ProfileService profileService = new ProfileService();
//
//    @GET
//    public List<Profile> getMessages() {
//        return profileService.getAllProfiles();
//    }
//
//    @GET
//    @Path("/{profileName}")
//    public Profile getProfile(@PathParam("profileName") String profileName) {
//        return profileService.getProfile(profileName);
//    }
//
//    @POST
//    public Profile addProfile(Profile profile) {
//        return profileService.addProfile(profile);
//    }
//
//    @PUT
//    @Path("/{profileName}")
//    public Profile updateProfile(@PathParam("profileName") String profileName, Profile profile) {
//        profile.setProfileName(profileName);
//        return profileService.updateProfile(profile);
//    }
//
//    @DELETE
//    @Path("/{profileName}")
//    public void deleteProfile(@PathParam("profileName") String profileName) {
//        profileService.removeProfile(profileName);
//    }
//}
