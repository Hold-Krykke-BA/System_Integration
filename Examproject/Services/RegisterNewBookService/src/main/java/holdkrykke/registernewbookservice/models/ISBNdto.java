package holdkrykke.registernewbookservice.models;

/**
 * DTO for handling ISBN returns
 */
public class ISBNdto {

    private String value;
    private boolean validity;

    public ISBNdto() {
    }

    public ISBNdto(String value, boolean validity) {
        this.value = value;
        this.validity = validity;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isValidity() {
        return validity;
    }

    public void setValidity(boolean validity) {
        this.validity = validity;
    }
}
