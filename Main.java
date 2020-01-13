class Encap
{
    private String username;
    private String password;
    public String getUname(){
        return username;
    }
    public String getPword(){
        return password;
    }
    public void setUname(String newUname){
        username = newUname;
    }
    public void setPword(String newPword){
        password = newPword;
    }
    
}
public class Main
{
    public static void main (String[] args)  
    { 
        Encap obj = new Encap(); 
        obj.setUname("nikitha"); 
        obj.setPword("n@21");
        System.out.println("username " + obj.getUname()); 
        System.out.println("password " + obj.getPword()); 
             
    } 

}
