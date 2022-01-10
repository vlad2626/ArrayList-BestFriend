/*
 *6159250
Title : Best Friend array
Semester : Cop 3337 - fall 2019
Lectures Name : Maria Charters
Description: Phone book for bbfs
 */
package bestfriendarraylist;
import java.util.Objects;

/**
 *
 * @author valmi
 */

// this creates the best friend class. i stored the cell phone number as string so the users can add dashed or anything they want to store the number as with extensions of needed.
public class BestFriend {
    private String fName;
    private String lName;
    private String nName;
    private String cPhone;
    private String email;
    private boolean find1;
    
    private String fName1, lName1,nName1;

    public BestFriend(String fName, String lName, String nName, String cPhone, String email) {
        this.fName = fName;
        this.lName = lName;
        this.nName = nName;
        this.cPhone = cPhone;
        this.email = email;
    }

    public BestFriend(String fName1, String lName1, String nName1) {
        this.fName1 = fName1;
        this.lName1 = lName1;
        this.nName1 = nName1;
    }
    
    

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getnName() {
        return nName;
    }

    public void setnName(String nName) {
        this.nName = nName;
    }

    public String getcPhone() {
        return cPhone;
    }

    public void setcPhone(String cPhone) {
        this.cPhone = cPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getfName1() {
        return fName1;
    }

    public void setfName1(String fName1) {
        this.fName1 = fName1;
    }

    public String getlName1() {
        return lName1;
    }

    public void setlName1(String lName1) {
        this.lName1 = lName1;
    }

    public String getnName1() {
        return nName1;
    }

    public void setnName1(String nName1) {
        this.nName1 = nName1;
    }
    
    

    @Override
    public String toString() {
        return "Best Friend : First Name " + fName + " ,Last name " + lName + " , NickName : " + nName  +" ,CellNumber " + cPhone + " ,Email : " + email;
    }
    
    
//    public String find()
//    {
//        if(fName1.equalsIgnoreCase(fName) && (nName1.equalsIgnoreCase(nName) && (lName1.equalsIgnoreCase(lName))))
//        {
//            System.out.println(toString());
//        }
//        else
//        {
//            find1=false;
//        }
//        
//        
//        return " ";       
//        
//    }
//    
    
}
