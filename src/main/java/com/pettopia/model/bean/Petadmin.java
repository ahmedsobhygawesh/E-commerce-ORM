package com.pettopia.model.bean;
// Generated Mar 21, 2018 11:04:53 PM by Hibernate Tools 4.3.1



/**
 * Petadmin generated by hbm2java
 */
public class Petadmin  implements java.io.Serializable {


     private String adminemail;
     private String adminpassword;

    public Petadmin() {
    }

	
    public Petadmin(String adminemail) {
        this.adminemail = adminemail;
    }
    public Petadmin(String adminemail, String adminpassword) {
       this.adminemail = adminemail;
       this.adminpassword = adminpassword;
    }
   
    public String getAdminemail() {
        return this.adminemail;
    }
    
    public void setAdminemail(String adminemail) {
        this.adminemail = adminemail;
    }
    public String getAdminpassword() {
        return this.adminpassword;
    }
    
    public void setAdminpassword(String adminpassword) {
        this.adminpassword = adminpassword;
    }




}

