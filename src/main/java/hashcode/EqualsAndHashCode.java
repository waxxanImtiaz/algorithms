package hashcode;

import java.util.HashMap;

public class EqualsAndHashCode {
    private String name;
    private Integer id;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object object){
        if (!(object instanceof EqualsAndHashCode))
        {
            return false;
        }

        EqualsAndHashCode code = (EqualsAndHashCode)object;
        if (code.id == id)
            return true;
        return false;
    }

    @Override
    public int hashCode(){
        int hashCode = 0;
        hashCode += (id != 0 ? id.hashCode() : 0);

        return hashCode;
    }
    public static void main(String[] args) {
        EqualsAndHashCode equals1 = new EqualsAndHashCode();
        equals1.setId(1);
        equals1.setName("Imtiaz");

        EqualsAndHashCode equals2 = new EqualsAndHashCode();
        equals2.setName("Imtiaz");
        equals2.setId(1);

        System.out.println(equals2.equals(equals1));

        HashMap<EqualsAndHashCode,String> table = new HashMap<>();

        System.out.println(equals1.hashCode()+","+equals2.hashCode());
        table.put(equals1,"Imtiaz");
        table.put(equals2,"Imtiaz2");

        System.out.println(table.get(equals1));
    }
}
