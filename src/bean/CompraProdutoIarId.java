package bean;
// Generated 06/02/2025 17:20:47 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CompraProdutoIarId generated by hbm2java
 */
@Embeddable
public class CompraProdutoIarId  implements java.io.Serializable {


     private int fkCompraIar;
     private int fkProdutoIar;

    public CompraProdutoIarId() {
    }

    public CompraProdutoIarId(int fkCompraIar, int fkProdutoIar) {
       this.fkCompraIar = fkCompraIar;
       this.fkProdutoIar = fkProdutoIar;
    }
   


    @Column(name="fk_compra_iar", nullable=false)
    public int getFkCompraIar() {
        return this.fkCompraIar;
    }
    
    public void setFkCompraIar(int fkCompraIar) {
        this.fkCompraIar = fkCompraIar;
    }


    @Column(name="fk_produto_iar", nullable=false)
    public int getFkProdutoIar() {
        return this.fkProdutoIar;
    }
    
    public void setFkProdutoIar(int fkProdutoIar) {
        this.fkProdutoIar = fkProdutoIar;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CompraProdutoIarId) ) return false;
		 CompraProdutoIarId castOther = ( CompraProdutoIarId ) other; 
         
		 return (this.getFkCompraIar()==castOther.getFkCompraIar())
 && (this.getFkProdutoIar()==castOther.getFkProdutoIar());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getFkCompraIar();
         result = 37 * result + this.getFkProdutoIar();
         return result;
   }   


}


