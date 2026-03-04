import java.util.Scanner;


public class Comms {

  public static String run(String[] args) {
    
    boolean encrypt = true;
    if( args[4].equals("decrypt") )
      encrypt = false;

    //Rotors
    int id1 = Integer.parseInt(args[0]);
    int id2 = Integer.parseInt(args[1]);
    int id3 = Integer.parseInt(args[2]);

    String message = args[5];

    Enigma enigma = new Enigma(id1, id2, id3, args[3]);

    //Encrypt or Decrypt
    if( encrypt )
      return enigma.encrypt(message);
    else
      return enigma.decrypt(message);
  }
}