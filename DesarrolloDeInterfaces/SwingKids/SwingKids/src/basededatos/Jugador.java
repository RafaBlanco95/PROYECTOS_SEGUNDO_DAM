
package basededatos;


public class Jugador {
    private String password;
    private int age;
    private String userName;
    private int maxScore;

    public Jugador(String password, int age, String userName) {
        this.password = password;
        this.age = age;
        this.userName = userName;
    }

    public int getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(int maxScore) {
        this.maxScore = maxScore;
    }
    
  
    
      public Jugador(){
          
      }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

  
            
}
