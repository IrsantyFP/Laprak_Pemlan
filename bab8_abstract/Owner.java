package bab8_abstract;

// kelas Owner
public class Owner {
    private String name;

    Owner(String name){
      this.name = name;
    }

    Owner(){

    }
  
    // buat constructor
    // .....

    public void setName(String name){
      this.name = name;
    }
  
    public String getName(){
      return name;
    }
    // buat method getter untuk mendapatkan nilai name
    // .....
  }
