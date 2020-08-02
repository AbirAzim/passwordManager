import java.util.ArrayList;

public class PassworManagers {
       private ArrayList<PasswordManager> myList;

       public PassworManagers(){
           myList = new ArrayList<PasswordManager>();
       }

       public void addNew(PasswordManager newField){
           myList.add(newField);
       }

       public void changePassword(String website, String oldPassword, String newPassword) throws Exception {

           for(int i = 0; i < myList.size(); i++) {
                if(this.myList.get(i).getWebSiteName().contains(website)){
                   if(this.myList.get(i).getPassword().contains(oldPassword)){
                       if(this.myList.get(i).getPassword().contains(newPassword)){
                           throw new Exception("Old and new Password are same");
                       }
                       this.myList.get(i).setPassword(newPassword);
                       System.out.println("Password Updated!");
                   }
                   else {
                       throw new Exception("Password Didnot Match");
                   }
                }
                else {
                    throw new Exception("System can not found your website");
                }

           }
       }

       public void removeWebsite(String website) throws Exception {

           System.out.println(website);
           for(int i = 0; i < myList.size(); i++) {
               if(this.myList.get(i).getWebSiteName().contains(website)){
                   this.myList.remove(this.myList.get(i));
                   System.out.println("Website removed from the system!");
                   return;
               }
           }
           throw  new Exception("Website is not in the system!");
       }

       public ArrayList<PasswordManager> getList(){
           return myList;
       }

    @Override
    public String toString() {
        return "PassworManagers{" +
                "myList=" + myList +
                '}';
    }
}
