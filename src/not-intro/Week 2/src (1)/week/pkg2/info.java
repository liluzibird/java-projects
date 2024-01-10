
package week.pkg2;


public class info extends getInfo
{
    String address, state, city, zipCode, grade;
    
    public info(String address, String state, String city, String zipCode, String grade)
    {
        this.address = address;
        this.state = state;
        this.city = city;
        this.zipCode = zipCode;
        this.grade = grade;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    public String getState()
    {
        return state;
    }
    
    public void setState(String state)
    {
        this.state = state;
    }
    
    public String getCity()
    {
        return city;
    }
    
    public void setCity(String city)
    {
        this.city = city;
    }
    
    public void setZipCode(String City)
    {
        this.city = City;
    }
    
        public String getZipCode()
    {
        return zipCode;
    }
    
    public String getGrade()
    {
        return grade;
    }
    
    public void setGrade(String grade)
    {
        this.grade = grade;
    }
}
