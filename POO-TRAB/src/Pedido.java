import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Pedido {
	
	private double total;
	private int qt;
	
	private Date data;
	Cliente cliente;
	ItemPedido b;
	ItemPedido c;
	ItemPedido d;
	ItemPedido itempedido;
	
	/*
	 Contrutor com 1 item
	 	*/
public Pedido(ItemPedido itempedido,Cliente cliente){
		this.cliente=cliente;
		this.itempedido=itempedido;
		if(itempedido instanceof ItemPedido && cliente instanceof Cliente){
			
			this.total+=(this.itempedido.getQtd()*itempedido.itemcardapio.getPreco());		
			System.out.println("--------------------");
			}
		}

/*
Contrutor com 2 itens
	*/
public Pedido(ItemPedido itempedido,ItemPedido b,Cliente cliente){
	this.cliente=cliente;
	this.itempedido=itempedido;
	this.b=b;
	if(itempedido instanceof ItemPedido && b instanceof ItemPedido && cliente instanceof Cliente){
		
		this.total+=(this.itempedido.getQtd()*itempedido.itemcardapio.getPreco());
		this.total+=(this.b.getQtd()*b.itemcardapio.getPreco());
		System.out.println("--------------------");
		}
	}

/*
Contrutor com 3 itens
	*/

public Pedido(ItemPedido itempedido,ItemPedido b,ItemPedido c,Cliente cliente){
	this.cliente=cliente;
	this.itempedido=itempedido;
	this.b=b;
	this.c=c;
	if(itempedido instanceof ItemPedido && b instanceof ItemPedido &&
			c instanceof ItemPedido && cliente instanceof Cliente){
		
		this.total+=(this.itempedido.getQtd()*itempedido.itemcardapio.getPreco());
		this.total+=(this.b.getQtd()*b.itemcardapio.getPreco());
		this.total+=(this.c.getQtd()*c.itemcardapio.getPreco());
		System.out.println("--------------------");
		}
	}

/*
Construtor com 4 itens
	*/

public Pedido(ItemPedido itempedido,ItemPedido b,ItemPedido c,ItemPedido d,Cliente cliente){
	this.cliente=cliente;
	this.itempedido=itempedido;
	this.b=b;
	this.c=c;
	this.d=d;
	if(itempedido instanceof ItemPedido && b instanceof ItemPedido &&
			c instanceof ItemPedido && d instanceof ItemPedido && cliente instanceof Cliente){
		
		this.total+=(this.itempedido.getQtd()*itempedido.itemcardapio.getPreco());
		this.total+=(this.b.getQtd()*b.itemcardapio.getPreco());
		this.total+=(this.c.getQtd()*c.itemcardapio.getPreco());
		this.total+=(this.d.getQtd()*d.itemcardapio.getPreco());
	
		System.out.println("--------------------");
		}
	}

	double TotalDoPedido(){
	
	return this.total;

}
	void setTotal(double v){
		this.total=v;
	}
		

	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	
	
	
	
	
}
