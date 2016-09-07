package project.sabuhi.com.countries;

import java.util.UUID;

/**
 * Created by Cavid on 4/30/2016.
 */
public class Olke {

    private UUID mId;
    private String mNameOlke;
    private String Paytaxt;

    public String getPaytaxt() {
        return Paytaxt;
    }

    public void setPaytaxt(String paytaxt) {
        Paytaxt = paytaxt;
    }

    public Olke(){

        mId=UUID.randomUUID();
    }
    @Override
    public String toString(){
        return mNameOlke;
    }





    public UUID getId() {
        return mId;
    }

    public String getNameOlke() {
        return mNameOlke;
    }

    public void setNameOlke(String NameOlke) {
        this.mNameOlke = NameOlke;
    }
}
