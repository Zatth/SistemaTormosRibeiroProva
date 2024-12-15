package bean;
// Generated 13/12/2024 19:27:56 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ProdutoZht generated by hbm2java
 */
@Entity
@Table(name="produto_zht"
    ,catalog="db_zahraa_tormos"
)
public class ProdutoZht  implements java.io.Serializable {


     private Byte idProdutoZht;
     private FornecedorZht fornecedorZht;
     private String nomeProdutoZht;
     private double precoProdutoZht;
     private int qtdEstoqueProdutoZht;
     private String fotoZht;
     private String categoriaProdutoZht;
     private String descricaoProdutoZht;


    public ProdutoZht() {
    }

	
    public ProdutoZht(FornecedorZht fornecedorZht, String nomeProdutoZht, double precoProdutoZht, int qtdEstoqueProdutoZht, String fotoZht, String categoriaProdutoZht, String descricaoProdutoZht) {
        this.fornecedorZht = fornecedorZht;
        this.nomeProdutoZht = nomeProdutoZht;
        this.precoProdutoZht = precoProdutoZht;
        this.qtdEstoqueProdutoZht = qtdEstoqueProdutoZht;
        this.fotoZht = fotoZht;
        this.categoriaProdutoZht = categoriaProdutoZht;
        this.descricaoProdutoZht = descricaoProdutoZht;
    }
    public ProdutoZht(FornecedorZht fornecedorZht, String nomeProdutoZht, double precoProdutoZht, int qtdEstoqueProdutoZht, String fotoZht, String categoriaProdutoZht, String descricaoProdutoZht, Set compraProdutoIars) {
       this.fornecedorZht = fornecedorZht;
       this.nomeProdutoZht = nomeProdutoZht;
       this.precoProdutoZht = precoProdutoZht;
       this.qtdEstoqueProdutoZht = qtdEstoqueProdutoZht;
       this.fotoZht = fotoZht;
       this.categoriaProdutoZht = categoriaProdutoZht;
       this.descricaoProdutoZht = descricaoProdutoZht;
     
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_produto_zht", unique=true, nullable=false)
    public Byte getIdProdutoZht() {
        return this.idProdutoZht;
    }
    
    public void setIdProdutoZht(Byte idProdutoZht) {
        this.idProdutoZht = idProdutoZht;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fk_fornecedor_zht", nullable=false)
    public FornecedorZht getFornecedorZht() {
        return this.fornecedorZht;
    }
    
    public void setFornecedorZht(FornecedorZht fornecedorZht) {
        this.fornecedorZht = fornecedorZht;
    }

    
    @Column(name="nome_produto_zht", nullable=false, length=50)
    public String getNomeProdutoZht() {
        return this.nomeProdutoZht;
    }
    
    public void setNomeProdutoZht(String nomeProdutoZht) {
        this.nomeProdutoZht = nomeProdutoZht;
    }

    
    @Column(name="preco_produto_zht", nullable=false, precision=6)
    public double getPrecoProdutoZht() {
        return this.precoProdutoZht;
    }
    
    public void setPrecoProdutoZht(double precoProdutoZht) {
        this.precoProdutoZht = precoProdutoZht;
    }

    
    @Column(name="qtd_estoque_produto_zht", nullable=false)
    public int getQtdEstoqueProdutoZht() {
        return this.qtdEstoqueProdutoZht;
    }
    
    public void setQtdEstoqueProdutoZht(int qtdEstoqueProdutoZht) {
        this.qtdEstoqueProdutoZht = qtdEstoqueProdutoZht;
    }

    
    @Column(name="foto_zht", nullable=false, length=300)
    public String getFotoZht() {
        return this.fotoZht;
    }
    
    public void setFotoZht(String fotoZht) {
        this.fotoZht = fotoZht;
    }

    
    @Column(name="categoria_produto_zht", nullable=false, length=30)
    public String getCategoriaProdutoZht() {
        return this.categoriaProdutoZht;
    }
    
    public void setCategoriaProdutoZht(String categoriaProdutoZht) {
        this.categoriaProdutoZht = categoriaProdutoZht;
    }

    
    @Column(name="descricao_produto_zht", nullable=false, length=230)
    public String getDescricaoProdutoZht() {
        return this.descricaoProdutoZht;
    }
    
    public void setDescricaoProdutoZht(String descricaoProdutoZht) {
        this.descricaoProdutoZht = descricaoProdutoZht;
    }

}