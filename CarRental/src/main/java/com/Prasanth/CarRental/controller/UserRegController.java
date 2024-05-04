package com.Prasanth.CarRental.controller;

import com.Prasanth.CarRental.model.UserRegister;
import com.Prasanth.CarRental.service.UserRegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user_registration")
public class UserRegController {

    @Autowired
    UserRegService userRegService;

    public UserRegController(UserRegService userRegService) {
        this.userRegService = userRegService;
    }

    @GetMapping("{userId}")
    public  UserRegister getUserRegService(@PathVariable Long userId ) {
        return userRegService.readUser(userId);
    }

    @GetMapping
    public List<UserRegister> getAllUserRegService() {
        return userRegService.getAllUsers();
    }

    @PostMapping
   public String createNewVendor(@RequestBody UserRegister userRegister) {
        userRegService.createUser(userRegister);
       return "User created successfully";
    }

    @PutMapping
    public String updateUser(@RequestBody UserRegister userRegister) {
        userRegService.updateUser(userRegister);
        return "User updated successfully";
    }




//    @GetMapping("{vendorId}")
//    public ResponseEntity<Object> getVendorDetails(@PathVariable("vendorId") String vendorId){
//        return ResponseHandler.responseBulider("Request deatils", HttpStatus.OK,cloudVendorService.getCloudVendor(vendorId));
//    }
//    @GetMapping()
//    public List<CloudVendor> getAllVendorDetails(){
//        return cloudVendorService.getAllCloudVendors();
//    }
//
//    @PostMapping
//    public String createNewVendor(@RequestBody CloudVendor cloudVendor) {
//        cloudVendorService.createCloudVendor(cloudVendor);
//        return "Vendor created successfully";
//    }
//
//    @PutMapping
//    public String updateVendor(@RequestBody CloudVendor cloudVendor) {
//        cloudVendorService.updateCloudVendor(cloudVendor);
//        return "Vendor updated successfully";
//    }
//
//    @DeleteMapping("{vendorId}")
//    public String deleteVendor(@PathVariable("vendorId") String vendorId) {
//        cloudVendorService.deleteCloudVendor(vendorId);
//        return "Vendor deleted successfully";
//    }


}
