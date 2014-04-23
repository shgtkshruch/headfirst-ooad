import java.util.List;
import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;

public class Unit {

  private String type, name;
  private int id;
  private List weapons;
  private Map properties;

  public Unit(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getType() {
    return type;
  }
  
  public void setName() {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void addWeapon(Weapon weapon) {
    weapons.add(weapon);
  }

  public List getWeapons() {
    return weapons;
  }

  public Object getProperty(String property) {
    return  properties.get(property);
  }

  public void setProperty(String property, Object value) {
    if (properties == null) {
        properties = new HashMap();
    }
    properties.put(property, value);
  }
}
