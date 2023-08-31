package model;

public class Sucursal {
    private Integer id;
    private String name;
    private String description;

    //CONSTRUCTORES


    public Sucursal(Integer id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Sucursal() {

    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override  //esto se llama anotacion
    public String toString() {
        return "Sucursal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
