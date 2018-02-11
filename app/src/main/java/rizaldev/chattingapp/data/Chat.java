package rizaldev.chattingapp.data;

import java.util.Date;

/**
 * Created by devel on 11/02/2018.
 */

public class Chat {
    private String id;
    private String name;
    private String isi;
    private Date date;


    public Chat(String id, String name, String isi, Date date) {
        this.id = id;
        this.name = name;
        this.isi = isi;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
