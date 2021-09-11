import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated;

    public Menu() {
        this.lastUpdated = new Date();
    }

    public ArrayList<MenuItem> getMenuItems() { return this.menuItems; }

    public void setMenuItems(ArrayList<MenuItem> menuItems) { this.menuItems = menuItems; }

    public Date getLastUpdated() { return this.lastUpdated; }

    public void setLastUpdated(Date lastUpdated) { this.lastUpdated = lastUpdated; }
}
