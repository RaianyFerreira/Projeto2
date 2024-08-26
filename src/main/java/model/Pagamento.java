package model;

import java.util.Date;

public class Pagamento {

    @Override
    public String toString() {
        return "Pagamento{" +
                "id=" + id +
                ", data=" + data +
                ", valor=" + valor +
                '}';
    }

    private long id;
    private Date data;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    private float valor;
}