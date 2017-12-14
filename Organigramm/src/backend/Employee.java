/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.Date;

/**
 *
 * @author felix
 */
public class Employee {
    private final int id;
    private final int socialSecurityNumber;
    private String firstname;
    private String lastname;
    private Skills skills;
    private final Date birthdate;
    private String adress;
    private String town;
    private final char sex;
    private String email;
    private final int yearsAtCompany;
    

    public int getId() {
        return id;
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Skills getSkills() {
        return skills;
    }

    public void setSkills(Skills skills) {
        this.skills = skills;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public char getSex() {
        return sex;
    }

    public String getTown() {
        return town;
    }

    public String getEmail() {
        return email;
    }

    public int getYearsAtCompany() {
        return yearsAtCompany;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    public Employee(int id, int socialSecurityNumber, String firstname, String lastname, Skills skills, Date birthdate, String adress, String town, char sex, String email, int yearsAtCompany) {
        this.id = id;
        this.socialSecurityNumber = socialSecurityNumber;
        this.firstname = firstname;
        this.lastname = lastname;
        this.skills = skills;
        this.birthdate = birthdate;
        this.adress = adress;
        this.town = town;
        this.sex = sex;
        this.email = email;
        this.yearsAtCompany = yearsAtCompany;
    }

   
    
    
}
