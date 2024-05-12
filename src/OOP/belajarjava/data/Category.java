package OOP.belajarjava.data;

public class Category {
    // Getter and Setter Method
    /* TipeData       Getter Method             Setter Method

      boolean  =         isXxx()      |      setXxx(boolean value)
      primitif =        getXxx()      |      setXxx(primitif value)
      Object   =        getXxx()      |      setXxx(Object value)

    **/

    private String id;
//    public String id;
    private boolean expensive;

    // Menu Code => Generate => Getter and Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(id != null) {
            this.id = id;
        }
    }

    public boolean isExpensive() {
        return expensive;
    }

    public void setExpensive(boolean expensive) {
        this.expensive = expensive;
    }
}
