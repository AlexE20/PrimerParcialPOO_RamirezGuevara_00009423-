public class Laptop extends Articulo implements Funciones {
private String marca;
private String año;

    public Laptop(String nombre, String modelo, String descripcion, float precio, String marca, String año) {
        super(nombre, modelo, descripcion, precio);
        this.marca = marca;
        this.año = año;
    }

    public Laptop(Articulo articulo, String marca, String año) {
        super(articulo);
        this.marca = marca;
        this.año = año;
    }

    public Laptop(String marca, String año) {
        this.marca = marca;
        this.año = año;
    }

    public Laptop(){}

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    @Override
    public float obtenerPrecio(float precio){
        return precio;
    }

    @Override
    public void descripcionArticulos(String descripcion){

    }
}
