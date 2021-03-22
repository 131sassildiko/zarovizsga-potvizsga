package hu.nive.ujratervezes.zarovizsga.cleaning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CleaningService {


    List<Cleanable> cleanables = new ArrayList<>();


    public List<Cleanable> getCleanables() {
        return cleanables;
    }

    public void add(Cleanable cleanable) {
        cleanables.add(cleanable);
    }



    public int cleanAll() {
        int result= 0;
        for (Cleanable cleanable : cleanables) {
            cleanable.clean();
            result += clean;
        }
        return result;
    }

    public int cleanOnlyOffices() {
        for (Cleanable cleanable : cleanables) {
            if (cleanable.getClass().equals(Office)) {
                return cleanable.clean();
            }
        }
    }

    public List<Cleanable> findByAddressPart(String address) {
        List<Cleanable> list = new ArrayList<>();
        for (Cleanable cleanable : cleanables) {
            if ( cleanable.getAddress().contains(address);
            list.add(cleanable);
        } return list;
    }

    public String getAddresses() {
        for (Cleanable cleanable : cleanables) {

        return cleanables.getAddress.toString};
    }
}
