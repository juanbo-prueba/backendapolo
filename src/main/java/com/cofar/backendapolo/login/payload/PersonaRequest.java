package com.cofar.backendapolo.login.payload;

public class PersonaRequest {

    private int codPersona;

    public PersonaRequest() {
    }

    public PersonaRequest(int codPersona) {
        this.codPersona = codPersona;
    }

    public int getCodPersona() {
        return codPersona;
    }

    public void setCodPersona(int codPersona) {
        this.codPersona = codPersona;
    }
}
