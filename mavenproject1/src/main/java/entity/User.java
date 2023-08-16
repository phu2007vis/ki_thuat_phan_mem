/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;



public class User {
    private int id;
    private String userName;
    private String passWord;
    private String name;
    private int privilegeId;
    public int muc_canh_bao;

    // Constructor
    public User(int id, String userName, String passWord, String name,int muc_canh_bao, int privilegeId) {
        if(id<=0){
            
            throw new RuntimeException("Invalid id: Value must be non-negative.");
            
        }
        
         if(userName.length()==0){
            
            throw new RuntimeException("User name khong duoc de trong");
        
        }
        
        if(passWord.length()==0){
            
            throw new RuntimeException("Password khong duoc de trong");
        
        }
        if(muc_canh_bao<=0){
            
            throw new RuntimeException("Muc canh bao phai lon hon 0");
        
        }
        if(privilegeId<0){
            
            throw new RuntimeException("Invalid iprivilegeId: Value must be non-negative.");
            
        }
         
        
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.name = name;
        this.privilegeId = privilegeId;
        this.muc_canh_bao = muc_canh_bao;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getName() {
        return name;
    }


    public int getPrivilegeId() {
        return privilegeId;
    }

    public void setId(int id) {
        this.id = id;
        
        if(id<=0){
            
            throw new RuntimeException("Invalid id: Value must be non-negative.");
            
        }
    }

    public void setUserName(String userName) {
        if(userName.length()==0){
            
            throw new RuntimeException("User name khong duoc de trong");
        
        }
        
        this.userName = userName;
        
    }

    public void setPassWord(String passWord) {
        
         if(passWord.length()==0){
            
            throw new RuntimeException("passWard khong duoc de trong");
        
        }
        this.passWord = passWord;
    }

    public void setName(String name) { 
        
        if(name.length()==0){
            
            throw new RuntimeException("Ten khong duoc de trong");
        
        }
        this.name = name;
    }



    public void setPrivilegeId(int privilegeId) {
         if(privilegeId<=0){
            
            throw new RuntimeException("Invalid iprivilegeId: Value must be non-negative.");
            
        }
         
        this.privilegeId = privilegeId;
    }


}


