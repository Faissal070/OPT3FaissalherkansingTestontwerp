import java.util.ArrayList;

public class Werkkracht {
    private String naam;
    private Integer code;
    private Integer bsn;
    private Integer telefoonnummer;
    ArrayList<String> personen = new ArrayList<>();



    Werkkracht(String naam, Integer bsn, Integer code, Integer telefoonnummer){
        this.naam = naam;
        this.code = code;
        this.bsn = bsn;
        this.telefoonnummer = telefoonnummer;
        personen.add(naam);


    }

    public String getNaam(){
        return null;

    }
    public Integer getCode(){
        return 0;

    }
    public Integer getBsn(){
        return 0;

    }
    public Integer getTelefoonnummer(){
        return 0;
    }
    public boolean checknaamArray(String naam){
        if(personen.contains(naam)){
            return true;
        }
        return false;
    }
    public boolean checkbsn(){
        return false;
    }
    public boolean checkCodegelijkaanNaam(){
        return false;
    }
}