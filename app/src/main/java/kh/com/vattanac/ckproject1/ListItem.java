package kh.com.vattanac.ckproject1;

/**
 * Created by Vattanac on 5/13/2017.
 */

public class ListItem  {
    private  String title;
    private  String detail;

    public ListItem(String title, String detail) {
        this.title = title;
        this.detail = detail;
    }

    public String getTitle() {
        return title;
    }

    public String getDetail() {
        return detail;
    }
}
