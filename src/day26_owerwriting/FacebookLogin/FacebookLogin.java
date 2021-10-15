package day26_owerwriting.FacebookLogin;

public class FacebookLogin {
    //try this with chrome , firefox , opera ,safari , edge
        //open browser
        //go to facebook url
        //pass credentials (usrenmae password) //(succesfully loged in)
        //close browser



    //methods : openBrowser , goToUrl , passingCredentials , closebrowser
    //variables : username , password

    private String username;
    private String password;
    //encapsulation
    //first hide the data from outside by using private keyword
    //second step is to create setter/getter methods to read and modify them

        //short cut to create encapsulation getter and setter method
        // right click - generate - getter setter


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
