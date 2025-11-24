package model.entities;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private Integer numeroQuarto;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(){}

    public Reservation(Integer numeroQuarto, Date checkIn, Date checkOut) throws Exception {
        if (!checkOut.after(checkIn)){
            throw new Exception("A data de check-out deve ser posterior à data de check-in.");
        }
        this.numeroQuarto = numeroQuarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(Integer numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duracao(){
        //COnverte a difereça das datas em millisecond e depois em dias
        long diferenca = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
    }

    public void atualizarDatas (Date checkIn, Date checkOut) throws Exception {
        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)) {
            throw new Exception("As datas de reserva para atualização devem ser datas futuras.");
        }
        if (!checkOut.after(checkIn)){
            throw new Exception("A data de check-out deve ser posterior à data de check-in.");
        }
                this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Quarto " + numeroQuarto
                + ", check-in: " + sdf.format(checkIn)
                + ", check-out: " + sdf.format(checkOut)
                + ", duração: " + duracao()
                + " noites.";
    }
}
