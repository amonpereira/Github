
public class Bebida extends ItemCardapio{
	
private int qtd;
	
public Bebida(String nome, double preco) {
		super(nome, preco);
	}
public void Estocar(int qtd){
	this.qtd=qtd;
}
void diminuirDoEstoque(int qtd){
	if(estoque_vazio()){
		System.out.println("estoque vazio");
		return;
	}
		else if(qtd>this.qtd){
			System.out.println("estoque insuficiente");
			return;
		}
	
	this.qtd-=qtd;
}
boolean estoque_vazio(){
	if(this.qtd==0){
	return true;
	}else{
		return false;
	}
}
int getEstoque(){
	return this.qtd;
}
public  void retornarAoEstoque(int q){
	this.qtd+=q;
}

}
