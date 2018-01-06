
package model;

public class Empresas {
    
    private String nomeFantasia;
    private String razaoSoc;
    private String cnpj;
    private String ramo;
    private String email;
    private String site;
    
    public String getNomeFantasia() {
        return nomeFantasia;
    }
    
    public void setNomeFantasia(String nome) {
        this.nomeFantasia = nome;
    }
    
    public String getRazaoSoc() {
        return razaoSoc;
    }
    
    public void setRazaoSoc(String razao) {
        this.razaoSoc = razao;
    }
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return this.nomeFantasia+" CNPJ: "+this.cnpj;
    }
}
