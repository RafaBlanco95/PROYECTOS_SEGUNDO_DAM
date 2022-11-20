
package basededatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import swingkids.*;


public class GestorSwingKids {
    
   Connection conn1 = null;
   public GestorSwingKids() {
        // ABRE UNA CONEXIÓN A UNA BASE DE DATOS QUE SE SUPONE MYSQL Y QUE TIENE LAS TABLAS
       // Y LOS USUARIOS CREADOS SEGÚN ESTE EJEMPLO.
      
       try {
           //RECUERDA: PARA EJECUTAR ESTE CÓDIGO ES NECESARIO TENER mYSQL FUNCIONANDO Y LAS TABLAS Y USUARIOS CREADOS
           String url1 = "jdbc:mysql://localhost:3306/swingkids";
           String user = "root";
           String password = "";
           conn1 = DriverManager.getConnection(url1, user, password);
           if (conn1 != null) {
               System.out.println("Conectado a BBDD");
           }
       } catch (SQLException ex) {
           System.out.println("ERROR:La dirección no es válida o el usuario y clave");
       }
   }
   public GestorSwingKids(String a, String b, String c){
       try{
       conn1 = DriverManager.getConnection(a,b,c);
       if (conn1 != null) {
               System.out.println("Conectado a BBDD");
           }
       }catch(SQLException ex)
       {
           System.out.println("ERROR:La dirección no es válida o el usuario y clave");
       }
   }
   
     public void cerrar_Conexion(){
     //SE CIERRA LA CONEXIÓN
      try {
    
      conn1.close();
      System.out.println("Cerrada la conexión");
    
    } catch (SQLException ex) {
          System.out.println("ERROR: al cerrar la conexión");
    }
   

     }
     
     public Jugador leerJugador(String username ){
         Jugador player= new Jugador();
         try {         
          // CREA UNA CONSULTA SQL SELECT.
          ResultSet rs=null;
          PreparedStatement sta = conn1.prepareStatement("SELECT * FROM PLAYER WHERE USERNAME=? ");
          sta.setString(1, username);
       
          rs=sta.executeQuery();
          while (rs.next()) {
                player.setUserName(rs.getString("USERNAME"));
                player.setAge(rs.getInt("AGE"));
                player.setPassword(rs.getString("PASSWORD"));
                player.setMaxScore(rs.getInt("MAXSCORE"));
            }
          
          System.out.println("Sentencia realizada con éxito");
          
          sta.close();
          
         
      } catch (SQLException ex) {
          System.out.println("ERROR:al hacer un Insert");
                  System.out.println(ex.getMessage());
                  
        
      }
         return player;
     }
     public void insertarJugador(Jugador player){
      try {         
          // CREA UNA CONSULTA SQL INSERT.
          
          PreparedStatement sta = conn1.prepareStatement("INSERT INTO PLAYER(USERNAME, AGE, PASSWORD) VALUES (?,?,?)");
          sta.setString(1, player.getUserName());
          sta.setString(3, player.getPassword());
          sta.setInt(2, player.getAge());
          
          sta.executeUpdate();
          
          System.out.println("Sentencia realizada con éxito");
          sta.close();
      } catch (SQLException ex) {
          System.out.println("ERROR:al hacer un Insert");
                  System.out.println(ex.getMessage());
        
      }
  }
     
     public void actualizarPuntuacion(int maxScore){
         try {         
         
          
          PreparedStatement sta = conn1.prepareStatement("UPDATE PLAYER SET MAXSCORE=? WHERE USERNAME=?");
          sta.setInt(1, maxScore);
          sta.setString(2, MainView.userName);
          
          
          sta.executeUpdate();
          
          System.out.println("Sentencia realizada con éxito");
          sta.close();
      } catch (SQLException ex) {
          System.out.println("ERROR:al hacer un Insert");
                  System.out.println(ex.getMessage());
        
      }
     }
     public void insertarPuntuacion(String username, int score){
      try {         
          // CREA UNA CONSULTA SQL INSERT.
          
          PreparedStatement sta = conn1.prepareStatement("INSERT INTO SCORE(PLAYER, SCORE) VALUES (?,?)");
          sta.setString(1, username);
          sta.setInt(2, score);
          
          sta.executeUpdate();
          
          System.out.println("Sentencia realizada con éxito");
          sta.close();
      } catch (SQLException ex) {
          System.out.println("ERROR:al hacer un Insert");
                  System.out.println(ex.getMessage());
        
      }
  }
     
     public Partida getPuntuacionPorPosicionRanking(int pos){
         Partida p1=new Partida();
         Jugador j1=new Jugador();
         
         
         
         try {         
          // CREA UNA CONSULTA SQL INSERT.
          ResultSet rs=null;
          PreparedStatement sta = conn1.prepareStatement("SELECT SCORE,PLAYER FROM SCORE ORDER BY SCORE DESC LIMIT ?");
          sta.setInt(1, pos);
          
          rs=sta.executeQuery();
          
          int i=0;
          while(rs.next()) {
              i++;
             if(i==(pos)){
                 p1.setScore(rs.getInt("SCORE"));
                 p1.setJugador(j1);
                 j1.setUserName(rs.getString("PLAYER"));
             }
             
            }
          System.out.println("Sentencia realizada con éxito");
          
          sta.close();
          
         
      } catch (SQLException ex) {
          System.out.println("ERROR:al hacer un Insert");
                  System.out.println(ex.getMessage());
                  
        
      }
      return p1;
    }
     
     
    public boolean login(String playerUserName, String playerPassword){
        boolean flag=Boolean.FALSE;
        
      try {         
          // CREA UNA CONSULTA SQL INSERT.
          ResultSet rs=null;
          PreparedStatement sta = conn1.prepareStatement("SELECT * FROM PLAYER WHERE USERNAME=? AND PASSWORD=?");
          sta.setString(1, playerUserName);
          sta.setString(2, playerPassword);
          
          rs=sta.executeQuery();
          
          
          if(rs.next()) {
              flag=Boolean.TRUE;
            }
          System.out.println("Sentencia realizada con éxito");
          
          sta.close();
          
         
      } catch (SQLException ex) {
          System.out.println("ERROR:al hacer un Insert");
                  System.out.println(ex.getMessage());
                  
        
      }
      return flag;
    }

}