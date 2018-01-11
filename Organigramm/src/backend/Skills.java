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
public class Skills {
    private final String elementarySchool;
    private final String secoundarySchool;
    private String college;
    private String educations;
    private double yearsOfWorkExperience;
    private String certificates;
    private String expireDate;

    public void setCollege(String college) {
        this.college = college;
    }

    public void setEducations(String educations) {
        this.educations = educations;
    }

    public void setYearsOfWorkExperience(double yearsOfWorkExperience) {
        this.yearsOfWorkExperience = yearsOfWorkExperience;
    }

    public void setCertifikates(String certifikates) {
        this.certificates = certifikates;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }



    
    
    public String getElementarySchool() {
        return elementarySchool;
    }

    public String getSecoundarySchool() {
        return secoundarySchool;
    }

    public String getCollege() {
        return college;
    }

    public String getEducations() {
        return educations;
    }

    public double getYearsOfWorkExperience() {
        return yearsOfWorkExperience;
    }

    public String getCertifikates() {
        return certificates;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public Skills(String elementarySchool, String secoundarySchool, String college, String educations, double yearsOfWorkExperience, String certifikates,String expireDate) {
        this.elementarySchool = elementarySchool;
        this.secoundarySchool = secoundarySchool;
        this.college = college;
        this.educations = educations;
        this.yearsOfWorkExperience = yearsOfWorkExperience;
        this.certificates = certifikates;
        this.expireDate = expireDate;
    }

    
    
}
