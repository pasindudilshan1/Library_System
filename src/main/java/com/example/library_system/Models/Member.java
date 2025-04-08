package com.example.library_system.Models;
import java.lang.*;
public class Member
{
 private String Member_Id;
 private String F_Name;
 private String L_name;
 private String Email;
 private int Phone;
 private String Address;

 public Member (String member_Id, String f_name, String l_name,String email, int phone, String address){
     this.Member_Id=member_Id;
     this.F_Name=f_name;
     this.L_name=l_name;
     this.Email=email;
     this.Phone=phone;
     this.Address=address;
 }


    public String getMember_Id() {
        return Member_Id;
    }

    public void setMember_Id(String member_Id) {
        Member_Id = member_Id;
    }

    public String getF_Name() {
        return F_Name;
    }

    public void setF_Name(String f_Name) {
        F_Name = f_Name;
    }

    public String getL_name() {
        return L_name;
    }

    public void setL_name(String l_name) {
        L_name = l_name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}

