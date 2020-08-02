public class Main {
    public static void main(String[] args) {
        PassworManagers pms = new PassworManagers();

        PasswordManager pm = new PasswordManager("google.com", "bk@gmail.com", "234");
        PasswordManager pm2 = new PasswordManager("facebook.com", "iwildoit", "iwilldoit");

        pms.addNew(pm);
        pms.addNew(pm2);


//        try{
//            pms.changePassword("facebook.com", "iwilldoit", "Bk007");
//        } catch (Exception e){
//            System.out.println(e.getMessage());
//        }

        try {
            pms.removeWebsite("facebook.com");
            System.out.println(pms.getList());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
