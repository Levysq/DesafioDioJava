package dio.gof;

import dio.gof.Singleton.SingletonEager;
import dio.gof.Singleton.SingletonLazy;
import dio.gof.Singleton.SingletonLazyHolder;
import dio.gof.Strategy.Comportamento;
import dio.gof.Strategy.ComportamentoAgressivo;
import dio.gof.Strategy.ComportamentoDefensivo;
import dio.gof.Strategy.ComportamentoNormal;
import dio.gof.Strategy.Robo;
import dio.gof.facade.Facade;

public class teste {

	public static void main(String[] args) {
		//======= Singleton=======//
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		//=======Strategy=======//
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		//=======Facade=======//
		
		Facade facade = new Facade();
		facade.migrarCliente("Levy", "60841535");
		
	}

}
