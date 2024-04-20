public class Movil extends Articulo implements Funciones {
private String pais;
private String idCel;

    public Movil(String nombre, String modelo, String descripcion, float precio, String pais, String idCel) {
        super(nombre, modelo, descripcion, precio);
        this.pais = pais;
        this.idCel = idCel;
    }

    public Movil(Articulo articulo, String pais, String idCel) {
        super(articulo);
        this.pais = pais;
        this.idCel = idCel;
    }

    public Movil(String pais, String idCel) {
        this.pais = pais;
        this.idCel = idCel;
    }
    public Movil(){}

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getIdCel() {
        return idCel;
    }

    public void setIdCel(String idCel) {
        this.idCel = idCel;
    }

    @Override
    public float obtenerPrecio(float precio) {
        return precio;
    }

    @Override
    public void descripcionArticulos(String descripcion) {

    }
}
