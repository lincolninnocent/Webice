//
// Created by Lincoln on: 2018.05.15 at 12:39:22 AM CEST
//

package models;

import utilities.Utils;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Objects;


/**
 * <p>Java class for recruiter complex type.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recruiter", propOrder = {"forename", "surname", "email", "password"})
public class Recruiter {

    @XmlElement(required = true)
    protected String forename;
    @XmlElement(required = true)
    protected String surname;
    @XmlElement(required = true)
    protected String email;
    @XmlElement(required = true)
    protected String password;

    /**
     * Gets the value of the forename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForename() {
        return forename;
    }

    /**
     * Sets the value of the forename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForename(String value) {
        this.forename = value;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    
    /**
     * Gets the value of the fullname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullname() {
    	return(forename + " " + surname);
    }
    
    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = Utils.hash(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Recruiter)) return false;
        Recruiter recruiter = (Recruiter) o;
        return Objects.equals(forename, recruiter.forename) &&
                Objects.equals(surname, recruiter.surname) &&
                Objects.equals(email, recruiter.email) &&
                Objects.equals(password, recruiter.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(forename, surname, email, password);
    }

    @Override
    public String toString() {
        return "Recruiter{" +
                "forename='" + forename + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
