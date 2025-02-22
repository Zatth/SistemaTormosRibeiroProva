package bean;
// Generated 13/12/2024 19:27:56 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CompraFornecedorIarId generated by hbm2java
 */
@Embeddable
public class CompraFornecedorIarId  implements java.io.Serializable {


     private int fkCompraIar;
     private int fkFornecedorIar;

    public CompraFornecedorIarId() {
    }

    public CompraFornecedorIarId(int fkCompraIar, int fkFornecedorIar) {
       this.fkCompraIar = fkCompraIar;
       this.fkFornecedorIar = fkFornecedorIar;
    }
   


    @Column(name="fk_compra_iar", nullable=false)
    public int getFkCompraIar() {
        return this.fkCompraIar;
    }
    
    public void setFkCompraIar(int fkCompraIar) {
        this.fkCompraIar = fkCompraIar;
    }


    @Column(name="fk_fornecedor_iar", nullable=false)
    public int getFkFornecedorIar() {
        return this.fkFornecedorIar;
    }
    
    public void setFkFornecedorIar(int fkFornecedorIar) {
        this.fkFornecedorIar = fkFornecedorIar;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CompraFornecedorIarId) ) return false;
		 CompraFornecedorIarId castOther = ( CompraFornecedorIarId ) other; 
         
		 return (this.getFkCompraIar()==castOther.getFkCompraIar())
 && (this.getFkFornecedorIar()==castOther.getFkFornecedorIar());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getFkCompraIar();
         result = 37 * result + this.getFkFornecedorIar();
         return result;
   }   


}


