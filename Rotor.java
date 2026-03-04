public class Rotor {

    //the rotor string index 0 is on top
    private String rotorValues;
    //need this to know when weve done a full rotation
    private char startChar;
        
    public Rotor(String v, char c){
        this.rotorValues = new String(v);
        this.startChar = c;

        while (this.rotorValues.charAt(0) != this.startChar) {
            this.rotate();
        }
            
    }
    
    public boolean rotate(){
        this.rotorValues = this.rotorValues.charAt(this.rotorValues.length() - 1)
                + this.rotorValues.substring(0, this.rotorValues.length() - 1);

        return this.rotorValues.charAt(0) == this.startChar;
               
    }
    
    //find index of a char in the rotor
    public int indexOf(char c){
        return this.rotorValues.indexOf(c);
    }

    //get\tig char at index 
    public char charAt(int idx){
        return this.rotorValues.charAt(idx);
    }
}
    